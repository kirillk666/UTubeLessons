package LessonsArab.Normal.Collection.SynchronizedCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            integers.add(i);
        }

        //В примере первый поток выполняет iterator.hasNext(), а второй поток удаляет этот элемент
        Runnable runnable = () -> {
            Iterator<Integer> iterator = integers.iterator(); //iterator изначально не предназначен для многопоточности
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        };


        Runnable runnable2 = () -> integers.remove(10);

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);

        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
    }
}
