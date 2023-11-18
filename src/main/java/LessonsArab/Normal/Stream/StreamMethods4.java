package LessonsArab.Normal.Stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods4 {
    public static void main(String[] args) {

        /**
         * stream().reduce()
         */

        //Если делать так, то лист будет unmodifiableList
        List<Integer> integerList = Stream.of(2, 3, 4, 5, 666, 777).toList();
        // integerList.add(4); - Exception in thread "main" java.lang.UnsupportedOperationException

        //Правильно так:
        List<Integer> integerArrayList;
        integerArrayList = Stream.of(2, 3, 4, 5, 666, 777).collect(Collectors.toList());
        integerArrayList.add(4);
        System.out.println(integerArrayList);

        //С помощью потока и метода reduce() посчитаем произведение всех элементов коллекции
        /**
         * Метод reduce() возвращает объект типа Optional.
         * Optional может содержать null и not null значения.
         * Optional - обертка в нашем примере int значения. Чтобы достать из Optional значение, используется get.
         */
        int result = integerArrayList.stream().reduce((accumulator, element) ->
                accumulator*element).get();
        //accumulator = 2; 6; 24; 120; 79920; 62097840; 248391360;
        //element =     3; 4; 5;  666; 777;   4;
        System.out.println("Result = " + result);

        //Включая проверку isPresent
        Optional<Integer> o = integerArrayList.stream().reduce((accumulator, element) ->
                accumulator*element);
        //accumulator = 2; 6; 24; 120; 79920; 62097840; 248391360;
        //element =     3; 4; 5;  666; 777;   4;
        int result0 = 0;
        if (o.isPresent()) {
            result0 = o.get();
        }
        System.out.println("Result.isPresent = " + result0);


        //В данном примере первый аккумулятор всегда не null и будет = 1, а значит оборачивать с помощью Optional уже не нужно
        //и .get() для преобразования также не нужен;
        int result2 = integerArrayList.stream().reduce(1, (accumulator, element) ->
                accumulator*element);
        //accumulator = 1; 2; 6; 24; 120; 79920; 62097840; 248391360;
        //element =     2; 3; 4; 5;  666; 777;   4;
        System.out.println("Result = " + result2);
    }
}
