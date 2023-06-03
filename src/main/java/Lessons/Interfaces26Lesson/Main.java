package Lessons.Interfaces26Lesson;


public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Human human = new Human("Anna");
        animal.sleep();
        human.sayHello();

        animal.showInfo();
        human.showInfo();

        Info info = new Animal(1);
        info.showInfo();

        outputInfo(info);
        outputInfo(animal);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
