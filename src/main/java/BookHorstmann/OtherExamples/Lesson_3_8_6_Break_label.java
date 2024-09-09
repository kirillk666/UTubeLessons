package BookHorstmann.OtherExamples;

import java.util.Random;
import java.util.Scanner;

public class Lesson_3_8_6_Break_label {
    public static void main(String[] args) {

        int count = 0;

        /**
         * break прерывает выполнение программы
         * break label нужен, чтобы прервать вложенный цикл и вернуться в начало предыдущего цикла
         */
        System.out.println("Надо отработать 66 часов");
        checkNumbers:
        while (count < 66) {
            for (int i = 0; i < 8; i++) {
                count += 1;
                if (count == 66) {
                    System.out.println("Молодец, отработал 66 часов!");
                    break checkNumbers;
                }
            }
            System.out.println("Осталось отработать " + (66 - count));
        }
        System.out.println("_______________________________________");

        /**
         * continue перебрасывает в начало текущего вложенного цикла
         */
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        Random rn = new Random();
        int x = rn.nextInt(10 - 1 + 1) + 1;

        while (x != number) {
            System.out.println("Угадай целое число от 1 до 10");
            number = scanner.nextInt();

            if (x == number) continue; // Перебрасывается в начало оператора while, который не выполнится, т.к. false
            System.out.println("Неверно!"); // не выполняется, если x == number
        }
        System.out.println("Верно!");
        System.out.println("_______________________________________");


        for (int i = 1; i < 1000; i++) {
            System.out.println("Введи 0, чтобы выйти из меню ввода:");
            int n = scanner.nextInt();
            if (n == 0) continue; // Перебрасывается в начало счетчика, который будет идти до 1000, поэтому тут некорректен
            System.out.println("Попыток = " + i); // не выполняется, если n == 0
        }
    }
}
