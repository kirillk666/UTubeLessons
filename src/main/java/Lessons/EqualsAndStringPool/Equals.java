package Lessons.EqualsAndStringPool;

import Lessons.AbstactClasses.Cat;
import Lessons.PolymorphismLesson29.Dog;

public class Equals {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //cat - является указателем на объект класса Cat - объекта ссылочного типа. Указывает, где хранится в памяти объект этого класса.
        Cat cat2 = new Cat();
        System.out.println(cat2.equals(cat) + "\n");
        // Сравниваем объекты как ссылки. Поэтому возвращает false. Ссылки указывают на разные объекты одного класса.
        Cat cat3 = cat;
        System.out.println(cat3.equals(cat) + "\n");

        Dog dog = new Dog(1, "ovcharka");
        Dog dog2 = new Dog(1, "ovcharka");
        Dog dog3 = new Dog(3, "ovcharka");
        Dog dog4 = new Dog(666, "ovcharka");

        System.out.println(dog2.equals(dog) + "\n");
        System.out.println(dog3.equals(dog4) + "\n");
        // В PolymorphismLesson29.Animal мы переопределили метод equals таким образом, что он сравнивает поля id объектов класса
        System.out.println(dog.getBreed().equals(dog2.getBreed()));
        // тут сравниваются поля объектов класса - String breed

        /* String pool
        Если созданы две строки с одинаковым содержимым, то java ссылается не для каждой строки на свое содержимое, а на строку с таким же
        содержанием. Таким образом, java экономит место.
        Например:
        String aa = "aa"; aa ссылается на "aa"
        String bb = "aa"; aa ссылается на bb, а не на "aa"

        Поэтому, для стрингов иногда работает == вместо equals
         */



    }
}
