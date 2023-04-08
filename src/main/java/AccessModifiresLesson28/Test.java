package AccessModifiresLesson28;
/*
public - везде
protected - внутри пакета и при наследовании
private - только внтури класса
default - только внутри пакета

Классы создаются public или default. В java файле может быть только 1 публичный класс, который совпадает с названием файла.
Вспомогательные классы создаются как default.
 */

import AccessModifiresLesson28.Package1.Person;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(7,6);
        person1.getAge();
        person1.getId();

        person1.setAge(18);
        person1.getAge();
    }
}
