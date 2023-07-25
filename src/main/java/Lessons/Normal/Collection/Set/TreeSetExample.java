package Lessons.Normal.Collection.Set;

import Helpers.Student;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        /** {@link TreeSet} - смесь {@link java.util.HashSet} и {@link java.util.TreeMap}
         * В основе TreeSet, как и в HashSet, лежит TreeMap<E,Object>, где Object - какая-то константа-заглушка,
         которую TreeSet полностью игнорирует и никогда не использует. Объект <E> - ключ в TreeSet;
         * Элементы хранятся в отсортированном виде в порядке возрастания Key;
         * Key должны быть уникальны;
         * !!! Для TreeSet, как и для TreeMap, не нужно переопределять методы equals и hashCode, т.к. все сравнения идут основываясь на метод
         compareTo для Key, но все равно рекомендуется переопределять;
         * В основе TreeSet лежит Red Black Tree, как и в TreeMap;
         * null нельзя хранить, аналогично TreeMap, где Key не может быть null;
         */

        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(1);
        integerTreeSet.add(2);
        integerTreeSet.add(3);
        integerTreeSet.add(4);
        integerTreeSet.add(5);
//      integerTreeSet.add(null); NPE - null нельзя хранить

        //Основные базовые методы работают, как в HashSet
        System.out.println("\nintegerTreeSet отсортирован по возрастанию: " + integerTreeSet);
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Элемент с Key 4 удален = " + integerTreeSet.remove(4) + "; Итоговый вид: " + integerTreeSet);
        System.out.println("Элементов стало после удаления = " + integerTreeSet.size());
        System.out.println("_________________________________________________________________________________________");

        if(integerTreeSet.contains(4)) {
            System.out.println("HashSet integerTreeSet содержит Key = 4");
        } else {
            System.out.println("HashSet integerTreeSet не содержит Key = 4");
        }
        System.out.println("_________________________________________________________________________________________");

        //метод TreeSet<E>.first(); делает то же самое, что и метод TreeMap<K,V>.firstEntry();
        System.out.println("Вывод первого элемента, т.е. с самым маленьким значением Key = " + integerTreeSet.first());
        //метод TreeSet<E>.last(); делает то же самое, что и метод TreeMap<K,V>.lastEntry();
        System.out.println("Вывод последнего элемента, т.е. с самым большим значением Key = " + integerTreeSet.last());
        System.out.println("_________________________________________________________________________________________");

        //метод TreeSet<E>.headSet(); делает то же самое, что и метод TreeMap<K,V>.headMap();
        System.out.println("Вывод элементов с Key до 3 = " + integerTreeSet.headSet(3));
        //Аналогично можно использовать TreeSet<E>.headSet(); для элементов, которые подходят под тип ключа, но которых нет в TreeSet.
        System.out.println("Вывод элементов с Key до 5 (хотя 5 нет в TreeSet) = " + integerTreeSet.headSet(5));
        System.out.println("_________________________________________________________________________________________");

        //метод TreeSet<E>.tailSet(); делает то же самое, что и метод TreeMap<K,V>.tailMap();
        System.out.println("Вывод элементов с Key после или РАВНЫЙ 3 = " + integerTreeSet.tailSet(3));
        //Аналогично можно использовать TreeSet<E>.tailSet(); для элементов, которые подходят под тип ключа, но которых нет в TreeSet.
        System.out.println("Вывод элементов с Key после 4 (хотя 4 нет в TreeSet) = " + integerTreeSet.tailSet(5));
        System.out.println("_________________________________________________________________________________________");


        TreeSet<Student> studentTreeSetSet = new TreeSet<>();

        Student Kirill = new Student("Kirill", 'M', 28, 4.23);
        Student Katya = new Student("Katya", 'F', 29, 3.23);
        Student Desdemona = new Student("Desdemona", 'F', 15, 4.13);
        Student Desdemona2 = new Student("Desdemona", 'F', 15, 4.13); //Копия

        //Равны по баллам и возрасту
        Student Gena = new Student("Gena", 'M', 28, 2.53);
        Student Lena = new Student("Lena", 'F', 28, 2.53);

        //Равны кроме пола
        Student SashaFemale = new Student("Sasha", 'F', 28, 3.50);
        Student SashaMale = new Student("Sasha", 'M', 28, 3.50);

        studentTreeSetSet.add(Kirill);
        studentTreeSetSet.add(Katya);
        studentTreeSetSet.add(Desdemona);
        studentTreeSetSet.add(Desdemona2); // Полностью похожий объект(копия) не добавляется
        studentTreeSetSet.add(Gena);
        studentTreeSetSet.add(Lena);
        studentTreeSetSet.add(SashaFemale);
        studentTreeSetSet.add(SashaMale);

        System.out.println("\nstudentTreeSetSet отсортирован согласно методу compareTo в классе Student: " + studentTreeSetSet);
        System.out.println("_________________________________________________________________________________________");

        Student Student4 = new Student("Gena", 'M', 28, 4.00);
        Student Student5 = new Student("Gena", 'M', 28, 5.00);
        System.out.println("Вывести студентов, у которых averageGrade между 4 и 5, т.е. между Student4.averageGrade и Student5.averageGrade:\n            "
                + studentTreeSetSet.subSet(Student4, Student5));
        System.out.println("_________________________________________________________________________________________");

    }
}
