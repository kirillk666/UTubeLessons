package Lessons.Easy.AbstactClasses;

public class Cat extends Animal implements AbleToMakeSound {

    @Override
    public void makeSound() {
        System.out.println("mao");
    }
}
