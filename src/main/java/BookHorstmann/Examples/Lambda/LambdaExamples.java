package BookHorstmann.Examples.Lambda;

import java.awt.*;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

import javax.swing.*;

//6.2.2 page 299
public class LambdaExamples {
    public static void main(String[] args) {
        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn"};

        System.out.println(Arrays.toString(planets) + "\n");

        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets) + "\n");

        /** Пример из {@link BookHorstmann.Examples.Interface.ComparatorExample} с легкостью заменяется
            лямбда выражениями без создания доп. классов.
          */
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> (first.length() - second.length()));
        System.out.println(Arrays.toString(planets) + "\n");

        /** Пример из {@link BookHorstmann.Examples.Callback.TimePrinter} с легкостью заменяется
         лямбда выражениями без создания доп. классов.
         */
        Timer timer = new Timer(1000, event -> {
            System.out.println("The time is " + new Date());
            Toolkit.getDefaultToolkit().beep();
        });
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
