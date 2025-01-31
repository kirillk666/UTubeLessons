package LessonsUtube.Normal.Concurrent.concurrentHashMap;

import java.util.HashMap;
import java.util.Map;

public class ConcurrentExceptionWithHashMap {
    public static void main(String[] args) throws InterruptedException {


        Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Dog1");
        hashmap.put(2, "Dog2");
        hashmap.put(3, "Dog3");
        hashmap.put(4, "Dog4");
        hashmap.put(5, "Dog5");

        System.out.println(hashmap);

        Runnable runnable1 = () -> {

            for (Integer integer : hashmap.keySet()) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Key: " + integer + ", value: " + hashmap.get(integer));
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
