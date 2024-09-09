package BookHorstmann.OtherExamples;

import java.util.Scanner;

public class Lesson_3_8_0_LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        /*
        Вычислить биноминальный коэфф. по формуле
        n * (n-1) * (n-2) * .... * (n-k+1)/(1*2*3*...*k)
         */
        int lotteryOdds = 1;
        for(int i = 1; i<=k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;

            System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
        }
    }
}
