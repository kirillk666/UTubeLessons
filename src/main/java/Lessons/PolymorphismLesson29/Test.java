package Lessons.PolymorphismLesson29;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Dog dog = new Dog(1);
        Cat cat = new Cat(1);

        dog.eat();
        dog.barking();
        animal.eat();

        /* upcasting - восходящее преобразование (явное) - всегда безопасно
        Преобразование объекта класса наследника в объект класса родителя

        Создан объект класса Dog, унаследованного от класса Animal.
        Такой объект не сможет вызвать специфичные методы класса Dog, однако методы класса Animal, переопределенные в
        классе Dog, будут так же переопределены в animalDog
         */
        Animal animalDog = new Dog(1);
        animalDog.eat();

        /* down-casting - нисходящее (неявное) - может вызывать exception
        Преобразование объекта класса родителя  в объект класса наследника
        dog2.barking() вызвался, т.к. animalDog был создан с upcasting из класса Dog
         */
        Dog dog2 = (Dog) animalDog;
        System.out.println();
        dog2.barking();
        /* dog3.barking() не вызвался и вызвал exception, т.к. в классе Animal нет метода barking();
         */
        Animal a = new Animal(1);
        Dog dog3 = (Dog) a;
        dog3.barking();

       /* Таким образом, полиморфизм позволяет использовать один и тот же метод на объектах разных классов,
       которые наследуются от одного и того же класса
        */
        System.out.println();
        cat.eat();
        dog.eat();
        animal.eat();
        animalDog.eat();
    }

    public void test(Animal animal) {
        animal.eat();
    }
}
