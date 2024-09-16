package LessonsArab.Normal.MultiThreading.userThreads.locks;

public class Deadlock {
    public static final Object LOCK_1 = new Object();
    public static final Object LOCK_2 = new Object();

    public static void main(String[] args) {

        /*
        Deadlock - ситуация, когда 2 или более потоков залочены навсегда, ожидают друг друга и ничего не делают.
        Программ выполняется бесконечно.
        Если сделать порядки локов одинаковыми, то дедлоков не будет.
        В этом классе пример deadlock.

        LiveLock - ситуация, когда 2 или более потоков залочены навсегда, ожидают друг друга,
            проделывают какую-то работу, но без какого-либо прогресса.
        Программа выполняется бесконечно.
        Если сделать порядки локов одинаковыми, то дедлоков не будет.

        Lock starvation - ситуация, когда менее приоритетные потоки ждут долгое время или все время,
            чтобы смогли запуститься.
         */

        Thread deadLockThread = new DeadlockThread();
        deadLockThread.start();

        Thread deadLockThread2 = new DeadlockThread2();
        deadLockThread2.start();
    }

     static class DeadlockThread extends Thread{
        @Override
        public void run() {
            System.out.println("DeadlockThread tries to capture monitor of LOCK_1 object");
            synchronized (LOCK_1) {
                System.out.println("DeadlockThread captured monitor of LOCK_1 object");

                System.out.println("DeadlockThread tries to capture monitor of LOCK_2 object");
                synchronized (LOCK_2) {
                    System.out.println("DeadlockThread captured monitors of LOCK_1 and LOCK_2 objects");

                }
            }
        }
    }


    static class DeadlockThread2 extends Thread{
        @Override
        public void run() {
            System.out.println("DeadlockThread2 tries to capture monitor of LOCK_2 object");
            synchronized (LOCK_2) {
                System.out.println("DeadlockThread2 captured monitor of LOCK_2 object");

                System.out.println("DeadlockThread2 tries to capture monitor of LOCK_1 object");
                synchronized (LOCK_1) {
                    System.out.println("DeadlockThread2 captured monitors of LOCK_1 and LOCK_2 objects");

                }
            }
        }
    }
}
