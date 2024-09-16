package LessonsArab.Normal.MultiThreading.userThreads.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
В этом примере используется lock(), unlock().
В примере проверяется, что если поставить лок, монитор занят (банкомат занят), то другой поток будет ждать unlock()
    (пока освободится банкомат).
 */

public class LockAndReentrantLockATM_ex {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new EmployeeATM("Dima", lock);
        new EmployeeATM("Kirill", lock);
        new EmployeeATM("Fedor", lock);
        new EmployeeATM("Petr", lock);
        new EmployeeATM("Oleg", lock);
    }
}

class EmployeeATM extends Thread {
    String name;
    private final Lock LOCK;

    EmployeeATM(String name, Lock lock) {
        this.name = name;
        this.LOCK = lock;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " waiting...");
            LOCK.lock();

            System.out.println(name + " using ATM");
            Thread.sleep(2000);

            System.out.println(name + " finished business");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            LOCK.unlock();
        }
    }
}
