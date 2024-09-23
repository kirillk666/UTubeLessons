package LessonsUtube.Normal.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethod8Count {
    public static void main(String[] args) {

        /** count() - Подсчет кол-ва элементов в стриме. Терминальный.
         * Возвращает long.
         * Все методы stream не меняют массив или коллекцию, на которой они были вызваны.
         */
        List<String> strings = new ArrayList<>();
        strings.add("Aina");
        strings.add("Jenna");
        strings.add("Jenifer");
        strings.add("Jenifer");

        long uniqueCount = strings.stream().distinct().count();
        System.out.println(uniqueCount);


        Stream<Integer> integerStream = Stream.of(1, 4, 5, 1, 2, 4, 56, 7, 7, 5, 5, 5);
        integerStream.distinct().forEach(System.out::println);

        //В данном примере будет выброшено исключение, т.к. стрим нельзя переиспользовать
        //System.out.println(integerStream.count());
    }
}
