package Lessons.Easy.Exceptions37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsPart1 { // если может в блоке программы может упасть exception, то добавляется throws....
    // В таком случае выполнение программы прерывается на этапе, в котором падает ошибка.
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("noFile");
        Scanner scanner = new Scanner(file);
    }
}

class Ex2 {
    public static void main(String[] args) {
        File file = new File("noFile");

        /* Проблемное место оборачивается блоком try-catch.
        В блок try помещается "проблемная часть кода". В catch создается объект класса Exception, задаются определенные
        действия на случай возникновения исключения.
        Если в блоке try возникает исключение, то выполнение этого блока прекращается. Выполняется блок catch, после этого
        программа продолжит выполнение.
        */

        /* Если метод может генерировать несколько разных exceptions, то нужно их все перечислить после throws
        или сделать несколько блоков catch
         */
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("После исключения");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        }
        System.out.println("Продолжение кода");
    }
}

class Ex3 { // Если в методе возникает исключение, то нужно обрабатывать везде, где используется этот метод
    public static void main(String[] args) throws FileNotFoundException {
        readFromFile(new File("file"));
    }

    public static void readFromFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
    }
}