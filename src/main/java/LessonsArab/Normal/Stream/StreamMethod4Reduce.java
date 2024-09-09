package LessonsArab.Normal.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethod4Reduce {
    public static void main(String[] args) {

        /**
         * stream().reduce()
         */

        //Если делать так, то лист будет unmodifiableList
        List<Integer> integerList = Stream.of(2, 3, 4, 5, 666, 777).toList();
        // integerList.add(4); - Exception in thread "main" java.lang.UnsupportedOperationException

        //Если нужен модифицируемый list, то нужно делать так:
        List<Integer> integerArrayList;
        integerArrayList = Stream.of(2, 3, 4, 5, 666, 777).collect(Collectors.toList());
        integerArrayList.add(4);
        System.out.println(integerArrayList);
        System.out.println("_________________________________________________________________________________________");

        //Метод reduce() перемножает все элементы коллекции.
        /**
         * Все методы stream не меняют массив или коллекцию, на которой они были вызваны.
         * Метод reduce() возвращает объект типа Optional.
         * Optional может содержать null и not null значения.
         * Optional - обертка в нашем примере int значения. Чтобы достать из Optional значение, используется get.
         */
        int result = integerArrayList.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        //List [2, 3, 4, 5, 666, 777, 4]
        //accumulator = 2; 6; 24; 120; 79920; 62097840; 248391360;
        //element =     3; 4; 5;  666; 777;   4;
        System.out.println("Result: " + result);

        //Включая проверку isPresent
        Optional<Integer> o = integerArrayList.stream().reduce((accumulator, element) ->
                accumulator * element);
        //accumulator = 2; 6; 24; 120; 79920; 62097840; 248391360;
        //element =     3; 4; 5;  666; 777;   4;
        int result0 = 0;
        if (o.isPresent()) {
            result0 = o.get();
        }
        System.out.println("Result.isPresent: " + result0);
        System.out.println("_________________________________________________________________________________________");


        //В данном примере первый аккумулятор всегда не null и будет = 1, а значит оборачивать с помощью Optional уже не нужно
        //и .get() для преобразования также не нужен;
        int result2 = integerArrayList.stream().reduce(1, (accumulator, element) ->
                accumulator * element);
        //accumulator = 1; 2; 6; 24; 120; 79920; 62097840; 248391360;
        //element =     2; 3; 4; 5;  666; 777;   4;
        System.out.println("Result with initial accumulator = 1: " + result2);

        List<Integer> emptyList = new ArrayList<>();
        int emptyResult = emptyList.stream().reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println("Empty list result with initial accumulator = 1: " + emptyResult);
        System.out.println("_________________________________________________________________________________________");

        //Можно использовать метод reduce() со String
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

        String resultString = strings.stream().reduce((accumulator, element) -> accumulator + " " + element).get();
        System.out.println(resultString);
    }
}
