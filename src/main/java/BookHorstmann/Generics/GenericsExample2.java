package BookHorstmann.Generics;

import java.time.LocalDate;

//8.4 page 401
public class GenericsExample2 {
    public static void main(String[] args) {
        LocalDate[] birhdays = {
                LocalDate.of(1906, 12, 9),
                LocalDate.of(1815, 12, 10),
                LocalDate.of(1903, 12, 3),
                LocalDate.of(1910, 6, 22),
                LocalDate.of(1610, 6, 22),
                LocalDate.of(2610, 6, 22)
        };
        GenericsExample.Pair<LocalDate> localDatePair = ArrayAlg.minMax(birhdays);
        System.out.println("min = " + localDatePair.getFirst());
        System.out.println("max = " + localDatePair.getSecond());
    }

    class ArrayAlg {
        /* Переменная типа <T> (<T extends Comparable>) вводится после модификаторов доступа и (GenericsExample.Pair<T>) перед возвращаемым значением
        Далее идет название метода и параметры, которые идут на вход: T[] array - массив объектов типа <T> */

        public static <T extends Comparable> GenericsExample.Pair<T> minMax(T[] array) {
            T min = array[0];
            T max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (min.compareTo(array[i]) > 0) min = array[i];
                if (max.compareTo(array[i]) < 0) max = array[i];
            }
            return new GenericsExample.Pair<>(min, max);
        }
    }
}
