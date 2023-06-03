package Lessons.Exceptions37;

import java.util.Scanner;

public class ExceptionsPart2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(scanner.nextLine());
            if(x != 0) {
                throw new ScannerException("wrong number0");
            }
        }
    }
}

class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(scanner.nextLine());
            if(x != 0) {
                try {
                    throw new ScannerException("wrong number0");
                } catch (ScannerException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}