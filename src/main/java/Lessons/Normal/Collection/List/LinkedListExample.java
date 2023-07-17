package Lessons.Normal.Collection.List;

import Helpers.Student;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        /** class LinkedList - реализует(implements) интерфейс List, который в свою очередь реализует(implements) интерфейс Collection.
         * Реализует(implements) интерфейс Deque, который в свою очередь реализует(implements) интерфейс Queue.
         * Все элементы хранят в себе данные и ссылки на предыдущий и последующий элемент цепочки.
         * В основе лежит не массив, а цепочка. Последний и первый элементы ссылаются на null.
         * Когда идет обращение к элементу цепочки .get(5), то идет последовательный опрос всех элементов, пока не дойдем до 5-го, т.е. по цепочке.
         * Бывают doubly и singly linked list. Элементы в singly хранят ссылки только на последующий элемент коллекции. По дефолту создается doubly.
         * В linked list при добавлении элемента меняются только ссылки на соседние элементы, в листе(массиве) все другие элементы сдвигаются, т.е. выполняется гораздо больше операций.
         * Таким образом: если планируется работать с элементами коллекции, например, обращаться к ним .get(), то лучше использовать Array List, т.к. обращение
         к элементу происходит практически мгновенно, т.к. в основе лежит массив. В linked list же будет происходить проход по всем элементам коллекции, пока не дойдем до нужного элемента.
         Это может занимать много времени.
         Если же обращения к элементам коллекции не частые, а частые добавления/удаления элементов коллекции НА НУЛЕВОЙ ИНДЕКС И НА ПОСЛЕДНИЙ ИНДЕКС, то лучше использовать Linked list,
         т.к. эти команды происходят гораздо быстрее, чем в array list.
         В array list:
         * При добавлении элемента с индексом 5 создается новый массив на 5 элементов и туда кладутся 4 других элемента, далее добавляется пятый
         * При удалении/добавлении элементов элементы сдвигаются, чем больше элементов, тем больше выполняется действий
         */

        Student studentKirill = new Student("Kirill", 'M', 28, 4.23);
        Student studentKatya = new Student("Katya", 'F', 29, 3.23);
        Student studentDesdemona = new Student("Desdemona", 'F', 15, 3.23);

        LinkedList<Student> studentsLinkedList = new LinkedList<>();
        studentsLinkedList.add(studentKirill);
        studentsLinkedList.add(studentKatya);
        studentsLinkedList.add(studentDesdemona);

        System.out.println(studentsLinkedList);
    }
}
