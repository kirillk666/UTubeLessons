package RandomTasks.SingletonPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()) {
            getRotateSpeed(scanner.next());
        }
    }

        public static void getRotateSpeed(String ps) {
            if (ps.equals(PlanetType.EARTH.nameEn) || ps.equals(PlanetType.EARTH.nameRu)) {
                Earth.getInstance().rotate();
            } else if (ps.equals(PlanetType.SUN.nameEn) || ps.equals(PlanetType.SUN.nameRu)) {
                Sun.getInstance().rotate();
            } else if (ps.equals(PlanetType.MOON.nameEn) || ps.equals(PlanetType.MOON.nameRu)) {
                Moon.getInstance().rotate();
            } else {
                System.out.println("Wrong planet name.");
            }
        }
}
