package LessonsUtube.Normal;

import LessonsUtube.Helpers.Worker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {

        /** binarySearch - метод класса {@link Collections}
         * Принцип работы binary search:
         ** Ищем символ х = 19 в отсортированном массиве;
         ** Массив делится пополам;
         ** Смотрим на символ m = 5, который оказывается посередине;
         ** Если x > m, то продолжаем поиск по втором массиве, в котором все символы > m, если x < m - в левом;
         ** Массив снова делится пополам, m сравнивается c x и так до тех пор, пока m = x.
         */

        Worker emp1 = new Worker("Richard", 76572);
        Worker emp2 = new Worker("Oleg", 83684);
        Worker emp3 = new Worker("Raya", 65423);
        Worker emp4 = new Worker("George", 65543);
        Worker emp5 = new Worker("Oksana", 102368);
        Worker emp6 = new Worker("Maria", 19985);
        Worker emp7 = new Worker("Richard", 76572);

        List<Worker> workerList = new ArrayList<>();
        workerList.add(emp1);
        workerList.add(emp2);
        workerList.add(emp3);
        workerList.add(emp4);
        workerList.add(emp5);
        workerList.add(emp6);
        workerList.add(emp7);

        Collections.sort(workerList);
        System.out.println(workerList);

        int index = Collections.binarySearch(workerList, emp1);
        System.out.println("Index of " + emp1 + " = " + index);


        System.out.println("_____________________________");
        int[] intArray = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19, -1, -2, -666};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        int indexInArrayExample = Arrays.binarySearch(intArray, -3);
        System.out.println("Index of \"-3\" = " + indexInArrayExample);

    }
}
