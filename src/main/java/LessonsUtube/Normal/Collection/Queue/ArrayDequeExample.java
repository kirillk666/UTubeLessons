package LessonsUtube.Normal.Collection.Queue;

import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args) {

        /** Deque and ArrayDeque
         * {@link ArrayDeque} наследует/расширяет extends {@link AbstractCollection}, реализует(implements) {@link Deque}
         * Deque - double ended queue (двунаправленная очередь).
         * В {@link Queue} элементы используются согласно FIFO, в Deque работает и FIFO, и LIFO(last in first out).
         В такой очереди элементы могут использоваться с обоих концов.
         */

        Deque<Integer> integerDeque = new ArrayDeque<>();
        integerDeque.add(4);
        integerDeque.addFirst(3);
        integerDeque.addLast(11);
        integerDeque.add(1);
        integerDeque.offerFirst(9);
        integerDeque.offerLast(666);

        System.out.println("integerDeque не отсортирован изначально, хранит последовательность добавления: " + integerDeque);

        integerDeque.removeFirst();
        System.out.println("integerDeque: " + integerDeque);
        integerDeque.removeLast();
        System.out.println("integerDeque: " + integerDeque);
        integerDeque.pollFirst();
        System.out.println("integerDeque: " + integerDeque);
        integerDeque.pollLast();
        System.out.println("integerDeque: " + integerDeque);

        //Вместо element/peek из Queue, в Deque используется get/peek аналогичным образом.
    }
}
