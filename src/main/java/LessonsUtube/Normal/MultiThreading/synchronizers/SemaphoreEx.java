package LessonsUtube.Normal.MultiThreading.synchronizers;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    /* Semaphore - синхронизатор (готовое решение, что не писать локи и синхронизацию самому),
    позволяющий ограничить доступ к какому-то ресурсу.
    В конструктор Semaphore нужно передавать кол-во потоков, которым Semaphore будет разрешать одновременно использовать этот ресурс.

    Если в Semaphore передан 1 поток, то будет работать как Reentrant lock.
     */
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Oleg", callBox);
        new Person("Oleg2", callBox);
        new Person("Oleg3", callBox);
        new Person("Oleg4", callBox);
        new Person("Oleg5", callBox);
        new Person("Oleg6", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + "is waiting call box");
            callBox.acquire(); //acquire() - попытка получить разрешение потоку от Semaphore выполнить действие
            System.out.println(name + "is using call box");
            sleep(2000);
            System.out.println(name + "finished using call box");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release(); //release() - уменьшает счетчик permits на 1, высвобождает доступ к ресурсу новому потоку
        }
    }
}