package LessonsUtube.Easy.Generics33;

import java.util.List;
import java.util.ArrayList;

// Введение в параметризацию (Generics)
public class Generics {
    public static void main(String[] args) {
        // До Java 5 не было generics
        List animals =  new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(333);

        String animalsStr = (String) animals.get(1);
        /* Поскольку, до появления generics, list был не параметризован, то ArrayList мог возвращать только объекты Object.
        Чтобы вернуть строку, нужно было сделать down-casting

        Без параметризации в animals могут храниться объекты любого типа
        */

        /* После появления Generics - создание параметризованных ArrayList
        C параметризацией в animals могут храниться только объекты заданного типа
        */
        List<String> animals2 = new ArrayList<>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animals2_Str = animals2.get(1);
    }
}
