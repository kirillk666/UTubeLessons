package LessonsArab.Easy.NestedClasses;

public class Electrocar {
    private int id;
    private static String battery;

    /* Вложенный нестатический. Используется, когда объект основного класса сложный, комплексный.
    Логичнее тогда разделить на блоки.
    Имеют доступ к полям основного объекта. Обычно такие классы private.
     */
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting...");
        }
    }

    /* Вложенный статический. Практически ничем не связан с основным классом. В данном примере, просто логически сгруппирован с основным классом.
    Такие классы public. Т.к. обычно используются из вне.
    Не имеют доступ к обычным полям основного объекта.  Только к статическим полям основного класса.
     */

    public static class Battery {
        public void charge() {
            battery = "70%";
            System.out.println("Battery is starting..." + battery);
        }
    }
    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        int y = 2;

        /* Классы внутри метода. Используется крайне редко.
        Могут использовать поля метода, но только final.
        Могут использовать поля основного класса.
         */
        final int X = 1;
        class SomeClass {
            public void SomeMethod() {
                System.out.println(X);
                System.out.println(id);
                System.out.println(y);
            }
        }

        SomeClass someObject = new SomeClass();

        System.out.println("Electrocar " + id + " is starting...");
    }

    private void test(Object obj) {
        // сюда можно передать someObject
    }
}
