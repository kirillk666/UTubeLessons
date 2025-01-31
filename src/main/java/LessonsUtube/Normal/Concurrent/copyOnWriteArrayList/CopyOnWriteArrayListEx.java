package LessonsUtube.Normal.Concurrent.copyOnWriteArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {

    /**
     * {@link java.util.concurrent.CopyOnWriteArrayList} implements {@link List}
     * Используется в многопоточном программировании, когда небольшое кол-во операций по изменению элементов, но большое по чтению
     * При каждом изменении списка (добавление, удаление, обновление элементов) создается новая копия внутреннего массива.
     * Чтение из списка происходит очень быстро, так как оно не требует блокировок. Все операции чтения используют текущую неизменяемую копию массива.
     * Любая операция изменения (add(), set(), remove()) создает новую копию массива и обновляет ссылку на неё. Это делает запись дорогой по времени и памяти.
     */
    public static void main(String[] args) throws InterruptedException {
        List<String> arrayList = new CopyOnWriteArrayList<>(List.of("dog1", "dog2", "dog3", "dog4", "dog5"));
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

        System.out.println(arrayList);
    }
}
