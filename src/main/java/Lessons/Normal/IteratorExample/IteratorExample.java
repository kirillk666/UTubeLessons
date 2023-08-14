package Lessons.Normal.IteratorExample;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    /** interface {@link Iterator} - member of the Java Collections Framework
     */
    public static void main(String[] args) {
        ArrayList<String> arrayForIteratorExample = new ArrayList<>();
        arrayForIteratorExample.add("example1");
        arrayForIteratorExample.add("example2");
        arrayForIteratorExample.add("example3");
        arrayForIteratorExample.add("example4");

        Iterator<String> iterator = arrayForIteratorExample.iterator();
        //noinspection WhileLoopReplaceableByForEach
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("_________________________________________________________________________________________");

        Iterator<String> iterator2 = arrayForIteratorExample.iterator();
        while (iterator2.hasNext()) {
            iterator2.next(); // Если не выполнить эту строку, то на строке удаления будет исключение
            System.out.println(arrayForIteratorExample);
            iterator2.remove();
        }
        System.out.println("_________________________________________________________________________________________");
    }
}
