package LessonsArab.Easy.NestedClasses;
/* Вложенные классы
3 типа вложенных классов
1) Нестатический - non static
 */
public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        Electrocar.Battery battery = new Electrocar.Battery();
        battery.charge();
    }
}
