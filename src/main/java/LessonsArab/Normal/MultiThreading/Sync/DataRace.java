package LessonsArab.Normal.MultiThreading.Sync;

import java.util.Arrays;
import java.util.List;

public class DataRace {
    /*
    В данном примере 3 разных потока инкрементируют переменную count и выводят ее на экран.
    Из-за того, что каждый поток имеет разную скорость, то каждый поток будет выводить свое значение, а не ожидаемое.
    Когда два или более потоков меняют и обращаются к переменной запросто можно столкнуться с гонкой данных - Data Race.
     */
    public static void main(String[] args) throws InterruptedException {
        DataRaceImpl myRunnableImpl1 = new DataRaceImpl();
        Thread thread1 = new Thread(myRunnableImpl1);
        Thread thread2 = new Thread(myRunnableImpl1);
        Thread thread3 = new Thread(myRunnableImpl1);

        List<Thread> threads = Arrays.asList(thread1, thread2, thread3);
        for (Thread thread : threads) {
            thread.start();
            thread.join();
        }

        //При этом из-за Data Race итоговый результат в переменной count может отличаться от ожидаемого.
        System.out.println(DataRaceCounter.count);
    }
}

class DataRaceCounter {
    static int count = 0;
}

//Однако если добавить synchronized к методу, то каждый раз будет ставиться Lock на метод,
//когда он занят каким-то потоком и сниматься будет только после завершения выполнения этого метода.
class DataRaceImpl implements Runnable {
    public synchronized void increment() {
        DataRaceCounter.count++;
        System.out.println(DataRaceCounter.count);
    }

    @Override
    public void run() {
        for (int i = 0; i < 30000; i++) {
            increment();
        }
    }
}
