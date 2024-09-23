package LessonsUtube.Normal.Collection.SynchronizedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample {

    public static void main(String[] args) throws InterruptedException {

        /** SynchronizedCollections - получаются из традиционных коллекций путем их обертывания.
         * Используются локи для всех методов, т.е. один поток начинает работать с коллекцией и ставит лок до тех пор, пока не закончит.
         * Из-за локов страдает производительность.
         */

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integers.add(i);
        }

        //В данном примере двумя потоками заполняется массив result элементами массива integers
        //Проблема этого примера в том, что результат непредсказуем, непонятно, какой поток когда закончит и будут ли они конфликтовать.
        ArrayList<Integer> result = new ArrayList<>();
        Runnable runnable = () -> result.addAll(integers);

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join(); //join вызывается, чтобы главный поток main дождался окончания потоков thread1 и thread2.
        thread2.join();

        System.out.println(result);

        //В этом примере поток thread4 начнет заполнять syncResult только после того, как закончит thread3. Или наоборот. В зависимости от того,
        //какой поток сработал первым. Результат предсказуемый.
        List<Integer> syncResult = Collections.synchronizedList(new ArrayList<>()); //Synchronized view для ArrayList
        Runnable runnableSync = () -> syncResult.addAll(integers);

        Thread thread3 = new Thread(runnableSync);
        Thread thread4 = new Thread(runnableSync);
        thread3.start();
        thread4.start();
        thread3.join(); //join вызывается, чтобы главный поток main дождался окончания потоков thread1 и thread2.
        thread4.join();

        System.out.println(syncResult);
    }
}
