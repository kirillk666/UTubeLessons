package BookHorstmann.Examples.Interface;

import java.util.Arrays;
import java.util.Comparator;

//6.1.8 page 289
public class ComparatorExample {
    public static void main(String[] args) {
        var comparator = new ComparatorForStringsLength();
        String first = "theFirst";
        String second = "second";

        if (comparator.compare(first, second) > 0) {
            System.out.println(first);
        }

        //Сортировка массива через кастомный компаратор
        String[] strings = new String[]{"one", "two", "three", "four", "five", "theLargest"};
        Arrays.sort(strings, comparator);
        System.out.println(Arrays.toString(strings));
    }
}

class ComparatorForStringsLength implements Comparator<String> {
    /*Сортировка в порядке увеличения длины строк.
    Данный класс имплементирует интерфейс Comparator, реализует метод compare.
     */
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}
