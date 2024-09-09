package LessonsArab.Normal.Collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        /** class {@link LinkedHashSet} реализует(implements) интерфейс {@link java.util.Set}, который наследует/расширяет(extends) interface {@link java.util.Collection}.
         LinkedHashSet наследует/расширяет(extends) class {@link java.util.HashSet}
         * Хранит информацию о порядке добавления элементов.
         * Производительность ниже, чем HashSet
         * В основе LinkedHashSet лежит HashMap<E,Object>, где Object - какая-то константа-заглушка, которую HashSet полностью игнорирует и никогда не использует.
         Объект <E> - ключ в HashMap;
         * В отличие от LinkedHashMap, НЕТ возможности запоминать последовательность элементов в зависимости от их последнего использования.
         * По сути используем, когда нужен HashSet, но нужно запоминать порядок добавления элементов.
         */

        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();
        integerLinkedHashSet.add(3);
        integerLinkedHashSet.add(4);
        integerLinkedHashSet.add(1);
        integerLinkedHashSet.add(8);
        integerLinkedHashSet.add(10);
        System.out.println("\nLinkedHashSet сохраняет последовательность добавления элементов " + integerLinkedHashSet);
        System.out.println("_________________________________________________________________________________________");
    }
}
