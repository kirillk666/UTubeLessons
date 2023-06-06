package Lessons.Normal.Collection.Map;

import Helpers.Student;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

        /** HashMap
         * Элементами HashMap являются пары Key Value;
         * HashMap не запоминает порядок добавления элементов;
         * Методы работают очень быстро O(1);
         * Key должен быть уникален, может быть null;
         * Value могут повторяться, могут быть null;
         * HashMap - not synchronised, ее не нужно использовать в многопоточном программировании
         */

        Map<Integer, String> map1 = new java.util.HashMap<>();
        map1.put(1000, "Igor Ivanov");
        map1.put(1412, "Denis Ivanov");
        map1.put(3245, "Semen Ivanov");
        map1.put(1124, "Arina Vlasova");
        map1.put(6353, "Alina Petrova");
        //noinspection OverwrittenKey
        map1.put(63534, "Alina Petrova");
        //noinspection OverwrittenKey
        map1.put(63534, "Alina Petrovishna"); //Key совпадает с предыдущей парой, в таком случае Key остается, а значение перезаписывается из новой пары.
        map1.put(null, "Key Null");
        map1.put(666, null);
        map1.put(null, null); // Перезаписал пару map1.put(null, "Key Null");

        map1.putIfAbsent(1000, "Igor Ivanov2"); //Добавляет, если пары с таким Key нет

        System.out.println(map1);
        System.out.println("_________________________________________________________________________________________");


        System.out.println(map1.get(1000)); // Получить значение по ключу
        System.out.println("_________________________________________________________________________________________");


        map1.remove(6353);
        System.out.println(map1);
        System.out.println("_________________________________________________________________________________________");

        if(map1.containsKey(1000) && map1.containsValue("Arina Vlasova")) {
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
        System.out.println("_________________________________________________________________________________________");

        System.out.println(map1.keySet()); // Выводит множество keys
        System.out.println(map1.values()); // Выводит множество values
        System.out.println("_________________________________________________________________________________________");

        //Для простоты понимания, в основе hashMap лежит массив, элементами массива являются структуры LinkedList, которые заполняются элементами, которые мы добавляем в hashMap.
        //Если у элементов будет одинаковый hashCode (коллизия), то они будут находиться в одной структуре LinkedList внутри ячейки массива.
        // Но если будет много элементов в таком LinkedList, то операции .set()/.get() уже будут выполняться не с O(1), а с O(n), как в обычном листе.
        // Для избежания этого, начиная с java 8, при большом кол-ве коллизий структура меняется с LinkedList на Tree, тогда скорость становится O(logn)
        //Если Key будет одинаковый, то структура LinkedList будет перезаписана
        for(Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("_________________________________________________________________________________________");

        //При создании HashMap можно задать 2 параметра, которые сильно влияют на производительность.
        //Initial capacity
        //Load factor - коэффициент того, насколько массив должен быть заполнен, после чего его размер будет увеличен вдвое
        Map<Student, Integer> studentsMarksForPoetry = new java.util.HashMap<>(16, 0.75F); //16 * 0.75 = 12, т.е. после того, как массив будет заполнен на 12 элементов,
        // емкость будет увеличена вдвое, и все элементы будут перехешированы заново.
        Student studentKirill = new Student("Kirill", 'M', 28, 4.23);
        Student studentKatya = new Student("Katya", 'F', 29, 3.23);
        Student studentDesdemona = new Student("Desdemona", 'F', 15, 3.23);

        studentsMarksForPoetry.put(studentKirill, 4);
        studentsMarksForPoetry.put(studentKatya, 3);
        studentsMarksForPoetry.put(studentDesdemona, 5);

        //Рекомендуется, чтобы Key был неизменяемый(immutable), т.е. если речь идет об объекте, то все его поля должны быть final
        //Иначе, объект может измениться, следовательно, изменится его hashCode, а следовательно, ключа с таким hashCode уже не будет в hashMap
        System.out.println("Содержит: " + studentsMarksForPoetry.containsKey(studentKatya));
        studentKatya.setAge(30);
        System.out.println("Содержит: " + studentsMarksForPoetry.containsKey(studentKatya));
    }
}
