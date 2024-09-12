package LessonsArab.Normal.Stream;


import java.util.ArrayList;
import java.util.List;

public class StreamMethod11FindFirst {
    public static void main(String[] args) {

        /**
         * stream().findFirst() - возвращает первый элемент потока в виде Optional.
         * Терминальный.
         * Все методы stream не меняют массив или коллекцию, на которой они были вызваны.
         */

        List<String> strings = new ArrayList<>();
        strings.add("Aina");
        strings.add("Jenna");
        strings.add("Jenifer");
        strings.add("Jenifer");

        String person = strings.stream().distinct().findFirst().get();
        System.out.println(person);
    }
}
