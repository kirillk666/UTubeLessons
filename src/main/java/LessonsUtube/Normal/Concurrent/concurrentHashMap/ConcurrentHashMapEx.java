package LessonsUtube.Normal.Concurrent.concurrentHashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

    /**
     * {@link java.util.concurrent.ConcurrentHashMap} implements {@link java.util.concurrent.ConcurrentMap}, который extends {@link java.util.Map}}
     * В ConcurrentHashMap хранимые элементы делятся на сегменты. Т.е. имеется несколько (сегментов или bucket), по которым распределены данные.
     * Потоки могут обращаться к сегменту, только если он не занят другим потоком в этот момент времени.
     * Пока поток взаимодействует с сегментом, выставляется на этот сегмент segment locking или bucket locking.
     *
     * Key должен быть уникален, может быть null;
     * Value могут повторяться, могут быть null;
     */

    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> hashmap = new ConcurrentHashMap<>();
        hashmap.put(1, "Dog1");
        hashmap.put(2, "Dog2");
        hashmap.put(3, "Dog3");
        hashmap.put(4, "Dog4");
        hashmap.put(5, "Dog5");

        System.out.println(hashmap);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = hashmap.keySet().iterator();

            while (iterator.hasNext()) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                Integer i = iterator.next();
                System.out.println("Key: " + i + ", value: " + hashmap.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hashmap.put(6, "dog6");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
