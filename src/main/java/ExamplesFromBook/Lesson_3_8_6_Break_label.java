package ExamplesFromBook;

import java.util.Random;
import java.util.Scanner;

public class Lesson_3_8_6_Break_label {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Надо отработать 66 часов");
        checkNumbers:
        while (count < 66) {
            for(int i = 0; i<8; i++) { //break label нужен, чтобы прервать вложенный цикл, хз какой придумать
                count += 1;
                if(count == 66){
                   System.out.println("Молодец, отработал 66 часов!");
                   break checkNumbers;
               }
            }
            System.out.println("Осталось отработать " + (66 - count));
        }
        System.out.println("_______________________________________");


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
    }
}
