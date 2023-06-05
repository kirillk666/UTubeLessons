package Lessons.Easy.Interfaces26Lesson;


public class Human implements Info {
    public String name;

    public Human(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println(name);
    }
}
