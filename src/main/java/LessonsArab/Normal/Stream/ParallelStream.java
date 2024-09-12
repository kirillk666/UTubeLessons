package LessonsArab.Normal.Stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {

        /**
         * .parallelStream() - выполнение частей задания в разных потоках (на разных ядрах процессора), потом объединение р-та.
         */

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.0);
        doubleList.add(5.0);
        doubleList.add(1.0);
        doubleList.add(0.25);

        //Хорошо подходит для каких-то агрегирующих действий
        double sumResult = doubleList.stream()
                .reduce(Double::sum).get();
        System.out.println("sumResult = " + sumResult);

        double sumResultParallel = doubleList.parallelStream()
                .reduce(Double::sum).get();
        System.out.println("sumResultParallel = " + sumResultParallel);

        //Не подходит, когда важна последовательность.
        double divisionResult = doubleList.stream()
                .reduce((accumulator, element) -> accumulator / element).get();
        System.out.println("divisionResult = " + divisionResult);

        double divisionResultParallel = doubleList.parallelStream()
                .reduce((accumulator, element) -> accumulator / element).get();
        System.out.println("divisionResultParallel = " + divisionResultParallel);
    }
}