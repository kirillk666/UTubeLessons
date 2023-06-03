package Lessons.Collection;

import Helpers.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        /**
         * Принцип работы binary search:
         ** Ищем символ х = 19 в отсортированном массиве;
         ** Массив делится пополам;
         ** Смотрим на символ m = 5, который оказывается посередине;
         ** Если x > m, то продолжаем поиск по втором массиве, в котором все символы > m, если x < m - в левом;
         ** Массив снова делится пополам, m сравнивается c x и так до тех пор, пока m = x.
         */

        Employee emp1 = new Employee("Richard", 76572);
        Employee emp2 = new Employee("Oleg", 83684);
        Employee emp3 = new Employee("Raya", 65423);
        Employee emp4 = new Employee("George", 65543);
        Employee emp5 = new Employee("Oksana", 102368);
        Employee emp6 = new Employee("Maria", 19985);
        Employee emp7 = new Employee("Richard", 76572);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);

        Collections.sort(employeeList);
        System.out.println(employeeList);

        int index = Collections.binarySearch(employeeList, emp1);
        System.out.println("Index of " + emp1 + " = " + index);


        System.out.println("_____________________________");
        int[] intArray = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19, -1, -2, -666};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        int indexInArrayExample = Arrays.binarySearch(intArray, -3);
        System.out.println("Index of \"-3\" = " + indexInArrayExample);

    }
}
