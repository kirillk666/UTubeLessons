package LessonsUtube.Normal.MultiThreading.userThreads.Sync;

import java.util.Arrays;
import java.util.List;

public class SynchronizedBlockStatic {
    /* см. DataRace., SynchronizedBlock
    Монитор - механизм для достижения корректной работы при синхронизации (свободен/занят).
            У каждого класса или объекта есть монитор.

    Поскольку тут метод increment() static, то монитором блока не может являться сам метод (this),
            поэтому монитором будет класс.
     */

    static int counter = 0;

    public static void increment() {
        synchronized (SynchronizedBlockStatic.class) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new SynchronizedBlockStaticImpl());
        Thread thread2 = new Thread(new SynchronizedBlockStaticImpl());
        Thread thread3 = new Thread(new SynchronizedBlockStaticImpl());

        List<Thread> threads = Arrays.asList(thread1, thread2, thread3);

        for (Thread thread : threads) {
            thread.start();
            thread.join();
        }

        System.out.println(counter);
    }
}

class SynchronizedBlockStaticImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30000; i++) {
            SynchronizedBlockStatic.increment();
            System.out.println(SynchronizedBlockStatic.counter);
        }
    }
}
