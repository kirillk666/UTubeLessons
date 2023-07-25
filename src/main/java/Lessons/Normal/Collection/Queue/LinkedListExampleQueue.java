package Lessons.Normal.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExampleQueue {
    public static void main(String[] args) {

        /** {@link Queue} наследует/расширяет (extends) {@link java.util.Collection}
         * Queue - коллекция, хранящая последовательность элементов. Добавляет элемент в конец очереди, использует из начала очереди - правило FIFO (first in first out).
         * Элемент можно, например, удалить и из середины очереди. Но если есть необходимость часто так делать, то теряется смысл использования Queue.
         * Not synchronized.
         * {@link java.util.LinkedList} реализует(implements) интерфейс Deque, который в свою очередь реализует(implements) интерфейс Queue.
         */

        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("Kirill");
        stringQueue.add("Maria");

        //Методы add/remove/element выбрасывают exception, если элемента не оказалось или очередь уже заполнена
        //Если бы очередь была ограничена 2мя строками, то добавление строки 3 через add выбросило бы exception и не прошло
        stringQueue.add("Olga");
        System.out.println("stringQueue: " + stringQueue);

        stringQueue.remove(); //Если бы мы удаляли подряд 3 раза, а элемента только два, то выбросилось бы NoSuchElementException
        System.out.println("Удаляется первый элемент очереди stringQueue: " + stringQueue);

        System.out.println("Выводит первый элемент очереди stringQueue: " + stringQueue.element() + "\n");

        //Методы offer/poll/peek не выбрасывают exception, если элемента не оказалось или очередь уже заполнена
        //Если бы очередь была ограничена 2мя строками, то добавление строки 3 через offer НЕ выбросило бы exception, но и НЕ прошло
        stringQueue.offer("Nadya");
        System.out.println("stringQueue: " + stringQueue);

        stringQueue.poll(); //Если бы мы удаляли подряд 3 раза, а элемента только два, то ошибки бы не было, но и удаление бы не прошло
        System.out.println("Удаляется первый элемент очереди stringQueue: " + stringQueue);

        System.out.println("Выводит первый элемент очереди stringQueue: " +  stringQueue.peek());
    }
}
