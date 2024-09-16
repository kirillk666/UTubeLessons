package LessonsArab.Normal.MultiThreading.userThreads.locks;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
В этом примере используется lock.tryLock() - boolean.
В примере проверяется, что если не удалось поставить лок, монитор занят (банкомат занят), то сразу выполняется
    переход в блок else (работник уходит, не хочет ждать).
Таким образом, если ресурсов нет, поток не выполняется.
 */
public class LockAndReentrantLockATM_ex2_tryLock {
    @SneakyThrows
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new EmployeeTryLockATM("Dima", lock);
        new EmployeeTryLockATM("Kirill", lock);
        new EmployeeTryLockATM("Fedor", lock);
        Thread.sleep(5000); //нужен, чтобы монитор лока был точно свободен (Петр точно пришел к пустому банкомату).
        new EmployeeTryLockATM("Petr", lock);
        new EmployeeTryLockATM("Oleg", lock);
    }
}

class EmployeeTryLockATM extends Thread {
    String name;
    private final Lock LOCK;

    EmployeeTryLockATM(String name, Lock LOCK) {
        this.name = name;
        this.LOCK = LOCK;
        this.start();
    }

    @Override
    public void run() {
        if(LOCK.tryLock()) {
            try {
                System.out.println(name + " using ATM.");
                Thread.sleep(2000);
                System.out.println(name + " finished business.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                LOCK.unlock();
            }
        } else {
            System.out.println(name + " doesn't want to wait!");
        }
    }
}
