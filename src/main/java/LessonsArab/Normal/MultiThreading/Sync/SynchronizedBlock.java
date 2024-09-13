package LessonsArab.Normal.MultiThreading.Sync;

import java.util.Arrays;
import java.util.List;

public class SynchronizedBlock {
    /* см. DataRace.
    Монитор - механизм для достижения корректной работы при синхронизации (свободен/занят).
            У каждого класса или объекта есть монитор.
     */
    public static void main(String[] args) throws InterruptedException {
        SynchronizedBlockCounterImpl myRunnableImpl1 = new SynchronizedBlockCounterImpl();
        Thread thread1 = new Thread(myRunnableImpl1);
        Thread thread2 = new Thread(myRunnableImpl1);
        Thread thread3 = new Thread(myRunnableImpl1);

        List<Thread> threads = Arrays.asList(thread1, thread2, thread3);
        for (Thread thread : threads) {
            thread.start();
            thread.join();
        }

        System.out.println(SynchronizedBlockCounter.count);
    }
}

class SynchronizedBlockCounter {
    static int count = 0;
}

//Так же код можно синхронизировать блоком synchronized(тут указывается объект монитора)
//Главное преимущество такого подхода - можно синхронизировать не весь метод, а его часть.
class SynchronizedBlockCounterImpl implements Runnable {
    private void increment() {
        //Теперь в конечном выводе эта часть может повторяться и идти не последовательно.
        System.out.println("not sync part of method");

        synchronized (this) {
            SynchronizedBlockCounter.count++;
            System.out.println(SynchronizedBlockCounter.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 30000; i++) {
            increment();
        }
    }
}
