package LessonsUtube.Normal.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMethod1Map {
    public static void main(String[] args) {

        /** Interface {@link java.util.stream.Stream} - последовательность элементов, поддерживающая параллельные и последовательные операции.
         * Позволяют писать код в функциональном стиле.
         * Все методы stream не меняют массив или коллекцию, на которой они были вызваны.
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

        /*
        1. map() - промежуточный.
        Цель: Преобразует каждый элемент потока в другой элемент, создавая новый поток.
        Функция: Принимает функцию, которая преобразует элементы из одного типа в другой (или даже в тот же тип, но с изменениями).
        Тип результата: Возвращает новый поток, состоящий из преобразованных элементов.
        Применение: Используется для того, чтобы выполнить маппинг (трансформацию) одного типа данных в другой.

         В примере преобразуем массив в поток значений, для каждой стринги получаем ее длину, описано с помощью лямбды в методе map,
         и сохраняем в коллекцию int.
         */
        List<Integer> integers = strings.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(integers);
        System.out.println("_________________________________________________________________________________________");

        List<String> names = new ArrayList<>();
        names.add("Aina");
        names.add("Jenna");
        names.add("Jenifer");
        names.add("Jenifer");

        List<String> namesUpperCase = names.stream().map(String::toUpperCase).toList();
        System.out.println(namesUpperCase);
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

        Set<Integer> integerSet = stringSet.stream().map(element -> element.length()).collect(Collectors.toSet());
        System.out.println(integerSet); //Преобразует в TreeSet (упорядоченный)

        List<Integer> integerList = stringSet.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
