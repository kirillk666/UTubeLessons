package Lessons.Easy.Generics33;

import Lessons.Easy.PolymorphismLesson29.Animal;
import Lessons.Easy.PolymorphismLesson29.Dog;

import java.util.ArrayList;
import java.util.List;

public class WildCardsGenerics {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(1));
        animalList.add(new Animal(2));

        test(animalList);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog(1));
        dogList.add(new Dog(2));

      //  test(dogList); - не выполнится
        test2(dogList);
        test2(animalList);
    }

    private static void test(List<Animal> list) {
        for(Animal animal : list) {
            System.out.println(animal);
        }
    }
    public static void test2(List<? extends Animal> list) { //тут ? означает Wildcard - может быть любой объект,
        // а extends говорит о том, что только Animal или унаследованный от Animal
        for (Animal animal : list) {
            System.out.println(animal);
            animal.eat();
        }
    }
}
