package Lessons.Exceptions37;

import java.util.Arrays;

public class ExceptionsPart3 {
    /* Checked Exception (Compile time exception) - все разобранные ранее случаи. Исключительные случаи в работе программы.
    Надо обрабатывать.
    Unchecked (Runtime exception) - ошибки в р-те программы (не нужно обрабатывать, нужно исправлять)
     */
    public static void main(String[] args) {
        // int n = 1 / 0; // Arithmetic ex
        String name = null;
        // System.out.println(name.toUpperCase()); // NPE
        int[] arr = new int[2];
        System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
    }
}
