package LessonsArab.Normal.Collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        /** {@link java.util.PriorityQueue}
         * Очередь, в которой есть СОРТИРОВКА.
         * Нужно описывать сортировку с Comparable или Comparator для самописных объектов.
         */

        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(4);
        integerQueue.add(3);
        integerQueue.add(11);
        integerQueue.add(1);

        System.out.println("integerQueue отсортирован изначально хз как: " + integerQueue);
        for(int i=0; i<4; i++) {
            System.out.println("Удаляется по дефолту первый элемент, который уже правильно отсортирован: " + integerQueue.remove());
        }
    }
}
