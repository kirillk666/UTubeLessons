package LessonsArab.Normal.Stream;

import java.util.stream.Stream;

public class StreamMethod6Concat {
    public static void main(String[] args) {

        /** concat() - объединяет стримы. Не является терминальным или промежуточным.
         * Все методы stream не меняют массив или коллекцию, на которой они были вызваны.
         */

        Stream<Integer> integerStream = Stream.of(1, 4, 5);
        Stream<Integer> integerStream2 = Stream.of(6, 7, 333);
        Stream<Integer> integerStream3 = Stream.concat(integerStream, integerStream2);
        integerStream3.forEach(System.out::println);
    }
}
