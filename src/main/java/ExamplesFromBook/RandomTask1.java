package ExamplesFromBook;

import java.util.Random;

public class RandomTask1 {
    public static void main(String[] args) {

        StringBuilder arrows = new StringBuilder("<>-");
        String rightArrow = ">-->>";
        String leftArrow = "<--<<";

        Random rn = new Random();
        while(arrows.length() < 106) {
            int randomNum = rn.nextInt((arrows.length() -1) - 1 + 1) + 1;
            arrows.append(arrows.charAt(randomNum));
        }
        System.out.println("arrows.lenght = " + arrows.length() + "\narrows: " + arrows);

        int amount = 0;
        int indexOfRightArrow = arrows.indexOf(rightArrow);


        while(indexOfRightArrow + rightArrow.length() <= arrows.length() && indexOfRightArrow >= 0) {
            indexOfRightArrow = arrows.indexOf(rightArrow, indexOfRightArrow + 1);
            amount++;
        }
        System.out.println("Total rightArrows = " + amount);

        int amount2 = 0;
        int indexOfRightArrow2 = 0;

        while (indexOfRightArrow2 >= 0) {
            if(indexOfRightArrow2 <= arrows.length()) {
            indexOfRightArrow2 = arrows.indexOf(rightArrow);
            StringBuilder ex2 = arrows.delete(indexOfRightArrow2, indexOfRightArrow2 + rightArrow.length());
            amount2++;
        }
        System.out.println("Total rightArrows= " + amount2);
    }
}
    }
