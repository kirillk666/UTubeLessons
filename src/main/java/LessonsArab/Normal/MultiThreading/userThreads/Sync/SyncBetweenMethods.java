package LessonsArab.Normal.MultiThreading.userThreads.Sync;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.List;

/*
В данном примере нужно сделать так, чтобы три звонка с разных приложений (потоков) не начинались одновременно,
    а только по завершению другого активного звонка (потока).

Если пометить каждый из методов mobileCall, skypeCall, telegramCall как synchronized, то по умолчанию будет
    использоваться синхронизация на монитор this.
Это ничего не даст, т.к. this будет у всех разный, соответственно и мониторы тоже разные

Это можно решить, если сделать синхронизацию одному любому общему объекту (монитору).
Например, создать class Monitor.
 */

public class SyncBetweenMethods {

    static final Object LOCK = new Object();

    public void mobileCall() {
        synchronized (LOCK) {
            System.out.println(this);

            System.out.println("Mobile call is started");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call is ended");
        }
    }

    @SneakyThrows
    public void skypeCall() {
        synchronized (LOCK) {
            System.out.println(this);

            System.out.println("Skype call is started");
            Thread.sleep(3000);
            System.out.println("Skype call is ended");
        }
    }

    @SneakyThrows
    public void telegramCall() {
        synchronized (LOCK) {

            System.out.println(this);

            System.out.println("Telegram call is started");
            Thread.sleep(3000);
            System.out.println("Telegram call is ended");
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        Thread mobileThread = new Thread(new MobileCallImpl());
        Thread skypeThread = new Thread(new SkypeCallImpl());
        Thread telegramThread = new Thread(new TelegramCallImpl());

        List<Thread> threads = Arrays.asList(mobileThread, skypeThread, telegramThread);
        for (Thread thread : threads) {
            thread.start();
//            thread.join();
        }
    }
}

class MobileCallImpl implements Runnable {
    @Override
    public void run() {
        new SyncBetweenMethods().mobileCall();
    }
}

class SkypeCallImpl implements Runnable {
    @Override
    public void run() {
        new SyncBetweenMethods().skypeCall();
    }
}

class TelegramCallImpl implements Runnable {
    @Override
    public void run() {
        new SyncBetweenMethods().telegramCall();
    }
}