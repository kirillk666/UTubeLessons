package LessonsArab.Normal.Lambda;

public class AnotherLambdaExample {

    interface I {
        int abc(String s); //Есть метод abc, он принимает String, но мы не знаем, как он работает и что делает...
    }

    interface I2 {
        int abc2();
    }

    static void printABC(I i) {
        System.out.println("Length of statement = " + i.abc("Hi!"));
        //Есть метод printABC, который принимает на вход объект, имплементирующий
        //интерфейс I и вызывающий на этом объекте метод abc c параметром String "Hi!" и выводящий результат на экран.
    }

    static void printABC(String someString, I i) {
        System.out.println("Length of statement: " + someString + " = " + i.abc(someString));
    }

    static void printEmptyABC(I2 i2) {
        System.out.println(i2.abc2());
    }

    public static void main(String[] args) {
        printABC(string -> string.length()); //Тут мы объясняем, что делает метод. Он берет String и возвращает его длину (int).
        //Результат выводится на экран.

        printABC("how long is this statement?", string -> string.length());
        printABC("how long is this statement now?", string -> string.length());

        //А это то же самое, но через класс, который имплементирует интерфейс и сразу переопределяет его единственный метод.
        printABC(new Ii_implements_I());

        //Если в интерфейсе не указан входной параметр
        printEmptyABC(() -> 18);

        /** Про видимость переменных внутри и вне лямбды
         * Нельзя использовать s вне лямбды, так не работает.
         * Нельзя задать переменную int i = 3, использовать ее в лямбде, а потом изменить i = 4.
         Даже если задать переменную int i = 3, изменить i = 4, использовать в лямбде - будет такая же ошибка. Так делать нельзя.
         Поэтому используем константы для таких целей.
         Если хотим, чтобы была возможность изменять значение i, то тогда создаем сразу как effectively final.
         */
        final int HELL_CONST = 663;
        printABC(s -> s.length() + HELL_CONST);

        int i = 1;
        int finalI = i;
        printABC(s -> s.length() + finalI);
        i = 2;
        System.out.println(i);

    }

    static class Ii_implements_I implements I {

        @Override
        public int abc(String s) {
            return s.length();
        }
    }
}
