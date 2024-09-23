package LessonsUtube.Easy.WriteToFile.Serialisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream personFileStream = new FileInputStream("Person.bin");
        ObjectInputStream personObjectStream = new ObjectInputStream(personFileStream);

        /* Создание объектов класса Person из файла people.bin - де-сериализация          */
        Person person1 = (Person) personObjectStream.readObject();
        Person person2 = (Person) personObjectStream.readObject();

        // В ПОТОК personObjectStream НЕЛЬЗЯ ПЕРЕДАТЬ МАССИВ ОБЪЕКТОВ Person[], Т.К. МЫ СДЕЛАЛИ DOWN-CASTING ДО ОБЪЕКТА ТИПА Person
        System.out.println("Reading from: Person.bin " + person1 + ", " + person2);


        FileInputStream peopleFileStream = new FileInputStream("people.bin");
        ObjectInputStream peopleObjectStream = new ObjectInputStream(peopleFileStream);

        /* Создание инт переменной и инициализация этой переменной значением из файла people.bin */
        int personCount = peopleObjectStream.readInt();

        // Де-сериализация массива из файла в цикле
        Person[] people = new Person[personCount];
        for(int i = 0; i<personCount; i++) {
            people[i] = (Person) peopleObjectStream.readObject();
        }
        //Либо можно считать массив в виде объекта
        Person[] people2 = (Person[]) peopleObjectStream.readObject();

        System.out.println("Reading from: people.bin " + Arrays.toString(people) + ", " + Arrays.toString(people2));


        FileInputStream peopleFileStream2 = new FileInputStream("people2.bin");
        ObjectInputStream peopleObjectStream2 = new ObjectInputStream(peopleFileStream2);

        // НО В ПОТОК peopleObjectStream2 МОЖНО ПЕРЕДАТЬ ОБЪЕКТ КЛАССА Person, Т.К. СДЕЛАН DOWN-CASTING ДО МАССИВА ОБЪЕКТОВ Person[]
        //Либо можно считать массив в виде объекта
        Person[] people3 = (Person[]) peopleObjectStream2.readObject();
        Person person3 = (Person) peopleObjectStream2.readObject();
        System.out.println("Reading from: people2.bin " + Arrays.toString(people3) + ", " + person3);
    }
}
