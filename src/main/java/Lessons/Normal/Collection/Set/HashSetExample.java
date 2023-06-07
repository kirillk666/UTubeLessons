package Lessons.Normal.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        /** class HashSet реализует(implements) интерфейс Set, который наследует/расширяет(extends) interface Collection
         * Set(множество) - коллекция, хранящая уникальные элементы;
         * В основе HashSet лежит HashMap<E,Object>, где Object - какая-то константа-заглушка, которую HashSet полностью игнорирует и никогда не использует.
            Объект <E> - ключ в HashMap;
         * Методы данной коллекции очень быстрые O(1);
         * HashSet не запоминает порядок добавления элементов, порядок формируется по hashCode, как в HashMap;
         * HashSet - not synchronised, не нужно использовать в многопоточном программировании;
         * Важно переопределять метод equals и hashcode для <E>, если это самописные объекты;
         */

        Set<String> stringHashSet = new HashSet<>();

        stringHashSet.add("Red");
        stringHashSet.add("Green");
        stringHashSet.add("Blue");
        //noinspection OverwrittenKey
        stringHashSet.add("Purple");
        //noinspection OverwrittenKey
        stringHashSet.add("Purple"); //Дубликат перезаписывается
        stringHashSet.add(null); //Можно добавить null

        System.out.println("\nHashSet stringHashSet порядок по hashCode = " + stringHashSet);
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Элемент с Key Purple удален = " + stringHashSet.remove("Purple"));
        System.out.println("Элементов стало после удаления = " + stringHashSet.size());
        System.out.println("_________________________________________________________________________________________");

        if(stringHashSet.contains("Arina Vlasova")) {
            System.out.println("HashSet stringHashSet содержит Key = Arina Vlasova");
        } else {
            System.out.println("HashSet stringHashSet не содержит Key = Arina Vlasova");
        }
        System.out.println("_________________________________________________________________________________________");

        Set<Integer> integerHashSet1 = new HashSet<>();

        integerHashSet1.add(5);
        integerHashSet1.add(2);
        integerHashSet1.add(3);
        integerHashSet1.add(1);
        integerHashSet1.add(8);

        System.out.println("HashSet integerHashSet1 порядок по hashCode = " + integerHashSet1);

        Set<Integer> integerHashSet2 = new HashSet<>();

        integerHashSet2.add(7);
        integerHashSet2.add(4);
        integerHashSet2.add(3);
        integerHashSet2.add(5);
        integerHashSet2.add(8);

        System.out.println("HashSet integerHashSet2 порядок по hashCode = " + integerHashSet2);

        HashSet<Integer> integerHashSetUnion = new HashSet<>(integerHashSet1);
        System.out.println("HashSet integerHashSetUnion скопирован из integerHashSet1 = " + integerHashSetUnion);

        integerHashSetUnion.addAll(integerHashSet2);
        //Объединение(union) - повторные элементы перезаписались, все элементы остались в одном экземпляре.
        System.out.println("В HashSet integerHashSetUnion помещены все элементы из integerHashSet1 и integerHashSet2 = " + integerHashSetUnion);
        System.out.println("_________________________________________________________________________________________");

        HashSet<Integer> integerHashSetIntersect = new HashSet<>(integerHashSet1);
        integerHashSetIntersect.retainAll(integerHashSet2);
        //Оставить только пересечение элементов из двух HashSet(intersect) - уникальные элементы не вошли, остались только пересечения.
        System.out.println("В HashSet integerHashSetIntersect помещены все элементы из пересечения integerHashSet1 и integerHashSet2 = " + integerHashSetIntersect);
        System.out.println("_________________________________________________________________________________________");

        HashSet<Integer> integerHashSetSubtract = new HashSet<>(integerHashSet1);
        integerHashSetSubtract.removeAll(integerHashSet2);
        //Оставить только разность элементов из двух HashSet(subtract) - из integerHashSet1 удалили все элементы integerHashSet2.
        System.out.println("В HashSet integerHashSetSubtract помещены все элементы из integerHashSet1, которых нет в integerHashSet2 = " + integerHashSetSubtract);
        System.out.println("_________________________________________________________________________________________");
    }
}
