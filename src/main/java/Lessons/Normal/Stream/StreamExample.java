package Lessons.Normal.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        /** Interface {@link java.util.stream.Stream}
         * Последовательность элементов, поддерживающая параллельные и последовательные операции.
         * Позволяют писать код в функциональном стиле.
         *
         */

        List<String> strings = new ArrayList<>();
        strings.add("Who");
        strings.add("am");
        strings.add("i");
        strings.add("is");
        strings.add("not");
        strings.add("of");
        strings.add("your");
        strings.add("business");
        System.out.println(strings);

        //Преобразуем массив в поток значений, над которым производим какие-то действия, описанные с помощью лямбды в методе map,
        //поэлементно и результат присваивается значению.
        //Чтобы записать полученный результат в массив, нужно использовать метод collect.
        //Методы stream, map и т.д. не меняют массив или коллекцию, на которой они были вызваны.
        List<Integer> integers = strings.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(integers);
        System.out.println("_________________________________________________________________________________________");


        int[] array = {3, 5, 6, 7, 9};
        System.out.println(Arrays.toString(array));
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            } else {
                element = 0;
            }
            return element;
        }).toArray();

        System.out.println(Arrays.toString(array));
        System.out.println("_________________________________________________________________________________________");


        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Who");
        stringSet.add("am");
        stringSet.add("i");
        stringSet.add("is");
        stringSet.add("not");
        stringSet.add("of");
        stringSet.add("your");
        stringSet.add("business");
        System.out.println(stringSet);

        List<Integer> integerSet = stringSet.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(integerSet);
    }
}
