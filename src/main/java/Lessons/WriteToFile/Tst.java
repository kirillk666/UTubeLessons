package Lessons.WriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Tst {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("writeToFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("some text2");
        pw.close();

    }
}
