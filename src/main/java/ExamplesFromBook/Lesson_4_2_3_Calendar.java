package ExamplesFromBook;

import java.time.LocalDate;

public class Lesson_4_2_3_Calendar {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1); //set 1st day of month

        int valueOfTheWeekDay = date.getDayOfWeek().getValue(); //1 = monday....7 = sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < valueOfTheWeekDay; i++) {
            System.out.print(" ");
        }

        while (date.getDayOfMonth() < date.lengthOfMonth()) {
            printDate(date.getDayOfMonth(), today);
            date = date.plusDays(1);

            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        printDate(date.getDayOfMonth(), today);
        System.out.println();
    }

    static void printDate(int dayOfMonth, int today) {
        System.out.printf("%3d", dayOfMonth);
        if (dayOfMonth == today) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
}
