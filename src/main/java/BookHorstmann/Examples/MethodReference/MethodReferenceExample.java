package BookHorstmann.Examples.MethodReference;

import java.util.Arrays;

//6.2.4 page 302
public class MethodReferenceExample {
    public static void main(String[] args) {
        //1
        //Построить таймер, вызывающий приемник событий каждую секунду
        var timer = new javax.swing.Timer(1000, System.out::println);
        var timer2 = new javax.swing.Timer(1000, event -> System.out.println(event));
        timer.start();
        timer2.start();

        //2
        String[] planets = new String[] {"Mercury", "venus", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "aaa", "Aaa",
            "Aba", "ACC"};
        System.out.println("Planets: " + Arrays.toString(planets) + "\n");

        Arrays.sort(planets);
        System.out.println("Sorted planets: " + Arrays.toString(planets) + "\n");

        System.out.println("Sorted ignoring case (method reference):");
        Arrays.sort(planets, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(planets) + "\n");

        System.out.println("Sorted ignoring case (lambda):");
        Arrays.sort(planets, (x, y) -> x.compareToIgnoreCase(y));
        System.out.println(Arrays.toString(planets) + "\n");

        //3 - ?

    }
}
