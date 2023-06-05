package Lessons.Easy.Extends25Lesson;

public class Dog extends Animal {
    protected void bark() {
        System.out.println("I'm barking");
    }

    @Override
    protected void eat() {
        System.out.println("Dog is eating");
    }

    protected void showName() {
        System.out.println(name);
    }
}
