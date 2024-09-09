package BookHorstmann.Examples.Collection.Set;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//9.3.3 page 461
public class HashSetExample {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> words = new HashSet<>();
        long totalTime = 0;

        File file = new File("C:\\0.My\\JavaProjects\\YouTubeLessons\\UTubeLessons\\src\\main\\java\\BookHorstmann\\Examples\\Collection\\Set\\alice.txt");
        Scanner in = new Scanner(file);

        while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

//        Iterator<String> iterator = words.iterator();
//        for(int i=1; i<20 && iterator.hasNext(); i++) {
//            System.out.println(iterator.next());
//            System.out.println(". . .");
//            System.out.println(words.size() + ": distinct words. Total time: + " + totalTime + "milliseconds." );
//        }
        System.out.println(words.size() + ": distinct words. Total time: + " + totalTime + "milliseconds.");
    }
}
