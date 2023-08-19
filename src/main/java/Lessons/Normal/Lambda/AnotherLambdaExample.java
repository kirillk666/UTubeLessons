package Lessons.Normal.Lambda;

public class AnotherLambdaExample {

    interface I {
        int abc(String s); //Есть метод abc, он принимает String, но мы не знаем, как он работает и что делает...
    }

    static void def(I i){
        System.out.println(i.abc("Hi!"));//Есть метод def, который принимает на вход объект, имплементирующий
        //интерфейс I и вызывающий на этом объекте метод abc c параметром String "Hi!" и выводящий результат на экран.
    }

    static class Ii implements I {

        @Override
        public int abc(String s) {
            return s.length();
        }
    }

    public static void main(String[] args) {
        def((String string) -> string.length()); //Тут мы объясняем, что делает метод. Он берет String и возвращает его длину (int).
        //Результат выводится на экран.

        //А это то же самое, но через класс, который имплементирует интерфейс и сразу переопределяет его единственный метод.
        def(new Ii());
    }
}
