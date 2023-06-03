package Lessons.AnonimClasses;

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

interface AbleToEat {
    void eat();
}

class Animal2 implements AbleToEat {
    @Override
    public void eat() {
        System.out.println("implementing animal is eating");
    }
}

public class Test {
    public static void main(String[] args) {

        /* Пример использования анонимного класса.
        Создается объект класса Animal, который сразу переопределяет метод eat().
        Это используется, когда нужно создать единожды такой объект... */
        Animal animal = new Animal() {
            public void eat() {
                System.out.println("Other animal is eating");
            }
        };
        animal.eat();

        /* Аналогичный пример с интерфейсом:
        У интерфейса нет реализации метода, если нам нужно единожды сделать реализацию, отличную от
        реализации, описанной в классе, который имплементит интерфейс, то можно создать анонимный класс.
        */

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating");
            }
        };
        ableToEat.eat();
    }
}
