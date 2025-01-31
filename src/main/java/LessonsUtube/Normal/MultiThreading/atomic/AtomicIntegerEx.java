package LessonsUtube.Normal.MultiThreading.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
    /* AtomicInteger - класс, который позволяет работать с int, используя атомарные операции.

    Атомарные операции в Java — это операции, которые выполняются целиком и неделимо, без возможности прерывания другими потоками.

    int a = 5;              // это атомарная операция
    a = 10;                 // тоже атомарная
    counter = counter + 1;  // операция не атомарна, так как включает три шага:
                                                    - Чтение текущего значения.
                                                    - Увеличение на единицу.
                                                    - Запись нового значения.
    Если два потока выполнят её одновременно, можно получить неправильный результат.

   Как сделать операции атомарными?
    - Использовать synchronized.
    - Применять классы из java.util.concurrent.atomic.
   */
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
        counter.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new counterIml());
        Thread thread2 = new Thread(new counterIml());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }

    static class counterIml implements Runnable {
        @Override
        public void run() {
            for(int i = 0; i<100; i++) {
                increment();
            }
        }
    }
}