package LessonsUtube.Easy.ReadFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        // путь до файла
        String pathToColorsText = "C:\\0.My\\JavaProjects\\YouTubeLessons\\UTubeLessons\\src\\main\\java\\LessonsArab\\Easy\\ReadFromFile\\text_colors";
        File fileWithColors = new File(pathToColorsText);

        Scanner scanner = new Scanner(fileWithColors);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();

        // либо сам файл, если он в проекте
        File fileWithNumbers = new File("text_numbers");

        // в файле строка, нужно вывести посимвольно, символы в файле разделены пробелом
        Scanner scanner1 = new Scanner(fileWithNumbers);
        String line = scanner1.nextLine();

        // если хотим вывести элемент с индексом 1
        String charAt = line.split(" ")[1];
        System.out.println(charAt);

        // весь массив строк
        String[] numbersStr = line.split(" ");

        // весь массив, переделав в int
        int[] numbers = new int[3];
        int counter = 0;
        for (String number : numbersStr) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbersStr));
        System.out.println(Arrays.toString(numbers));

        scanner.close();

        //считать из файла набор символов, привести к виду "1 2 3"
        File fileWithNumbersAndLetters = new File("text_numbers_letters");
        Scanner scanner2 = new Scanner(fileWithNumbersAndLetters);
        String lineKS = scanner2.nextLine();
        System.out.println(lineKS.replaceAll("[^\\d\\s]", "").replaceAll("\\s+", " "));

        scanner.close();
    }
}
