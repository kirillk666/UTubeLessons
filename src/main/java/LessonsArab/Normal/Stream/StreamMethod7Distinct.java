package LessonsArab.Normal.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethod7Distinct {
    public static void main(String[] args) {

        /** distinct() - возвращает стрим уникальных элементов. Промежуточный.
         * Проверяет элементы с помощью equals().
         * Все методы stream не меняют массив или коллекцию, на которой они были вызваны.
         */

        Stream<Integer> integerStream = Stream.of(1, 4, 5, 1, 2, 4, 56, 7, 7, 5, 5, 5);
        integerStream.distinct().forEach(System.out::println);

        List<String> strings = new ArrayList<>();
        strings.add("Aina");
        strings.add("Jenna");
        strings.add("Jenifer");
        strings.add("Jenifer");
        List<String> unique = strings.stream().distinct().toList();
        System.out.println(unique);

        String[] stringsArray = {"Aina", "Jenna", "Jenifer", "Jenifer"};
        List<String> strings2 = new ArrayList<>(Arrays.stream(stringsArray).distinct().toList());
        strings2.add("Kate");
        System.out.println(strings2);
    }
}