package LessonsUtube.Easy.AbstactClasses;

public class Dog extends Animal implements AbleToMakeSound{
    @Override
    public void makeSound() {
        System.out.println("gav");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
