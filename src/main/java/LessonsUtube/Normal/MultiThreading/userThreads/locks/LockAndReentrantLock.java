package LessonsUtube.Normal.MultiThreading.userThreads.locks;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockAndReentrantLock {
    /*
    Lock - interface. Implemented by ReentrantLock.
    lock(), unlock().
    */

    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Call call = new Call();

        //Создание потока используя анонимный класс
        Thread mThread = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });

        //Создание потока используя лямбду
        Thread sThread = new Thread(() -> call.skypeCall());

        //Создание потока используя метод референс
        Thread tThread = new Thread(call::telegramCall);

        List<Thread> threads = Arrays.asList(mThread, sThread, tThread);
        for (Thread thread : threads) {
            thread.start();
        }

    }

    static class Call {
        public void skypeCall() {
            lock.lock();
            try {
                System.out.println("Skype call is started");
                Thread.sleep(3000);
                System.out.println("Skype call is ended");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public void mobileCall() {
            lock.lock();
            try {
                System.out.println("Mobile call is started");
                Thread.sleep(3000);
                System.out.println("Mobile call is ended");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public void telegramCall() {
            lock.lock();
            try {
                System.out.println("Telegram call is started");
                Thread.sleep(3000);
                System.out.println("Telegram call is ended");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}