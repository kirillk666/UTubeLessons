package ExamplesFromBook;

import java.util.Scanner;

public class RandomTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        String searchedString = sc.nextLine();
        StringBuilder newString = new StringBuilder();
        StringBuilder newStringWithSpaces = new StringBuilder();


        for (Character alphabetLetter : alphabet.toCharArray()) {
            for (Character searchedStringLetter : searchedString.toCharArray()) {
                if (searchedStringLetter == alphabetLetter) {
                    newString.append(alphabetLetter);
                }
            }
        }
        System.out.println(newString);

        int increment = 0;
        for (int i = 0; i < searchedString.length(); i++) {
            if (Character.isWhitespace(searchedString.charAt(i))) {
                newStringWithSpaces.append(' ');
            } else {
                newStringWithSpaces.append(newString.toString().charAt(increment));
                increment++;
            }
        }

        System.out.println(newStringWithSpaces);
    }
}
