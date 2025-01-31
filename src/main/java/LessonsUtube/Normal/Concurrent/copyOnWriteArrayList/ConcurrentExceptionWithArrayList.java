package LessonsUtube.Normal.Concurrent.copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentExceptionWithArrayList {

    /**
     * {@link java.util.concurrent.CopyOnWriteArrayList} implements {@link List}
     * Используется в многопоточном программировании, когда небольшое кол-во операций по изменению элементов, но большое по чтению
     */
    public static void main(String[] args) throws InterruptedException {
        List<String> arrayList = new ArrayList<>(List.of("dog1", "dog2", "dog3", "dog4", "dog5"));
        System.out.println(arrayList);

        Runnable runnable1 = () -> {
            for(String element : arrayList) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(element);
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            arrayList.remove(4);
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
