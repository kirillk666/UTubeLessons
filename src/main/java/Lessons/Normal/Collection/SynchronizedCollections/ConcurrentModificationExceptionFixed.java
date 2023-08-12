package Lessons.Normal.Collection.SynchronizedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionFixed {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            integers.add(i);
        }

        //В итоге с такой реализацией сначала полностью выполняется итератор, а потом уже удаление элемента. Т.е. ставится лок, пока не закончится работа
        //с ArrayList
        //Правда хз зачем тогда вообще нужна тут многопоточность
        List<Integer> syncIntegers = Collections.synchronizedList(integers);

        Runnable runnable = () -> {
            synchronized (syncIntegers) {
                Iterator<Integer> iterator = syncIntegers.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };

        Runnable runnable2 = () -> syncIntegers.remove(10);

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);

        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println(syncIntegers);
    }
}
