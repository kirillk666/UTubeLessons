package Lessons.WriteToFile.Serialisation;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        // Создание объектов класса Person для дальнейшей передачи.
         Person person1 = new Person(1, "Bob");
         Person person2 = new Person(2, "Mike");
         Person person3 = new Person(2, "MikeForArrayTest");

         FileOutputStream personFileStream = new FileOutputStream("Person.bin");  // Предназначен для побайтовой записи файла. Любого файла.
         ObjectOutputStream personObjectStream = new ObjectOutputStream(personFileStream); // Предназначен исключительно для записи объектов в файлы.

         /* Запись объектов класса Person в файл Person.bin - сериализация */
        personObjectStream.writeObject(person1);
        personObjectStream.writeObject(person2);


        FileOutputStream peopleFileStream = new FileOutputStream("people.bin");
        ObjectOutputStream peopleObjectStream = new ObjectOutputStream(peopleFileStream);

//        /* Запись длины массива и запись массива в цикле по элементам в файл.
        Person[] people = {new Person(1, "Bob"), new Person(2, "Jess"), new Person(3, "Garry")};
        peopleObjectStream.writeInt(people.length); // записываем переменную int, равную длине массива
        for(Person person : people) {
          peopleObjectStream.writeObject(person);
        }

        //Либо можно передать массив в виде объекта
        peopleObjectStream.writeObject(people);



        FileOutputStream peopleFileStream2 = new FileOutputStream("people2.bin");
        ObjectOutputStream peopleObjectStream2 = new ObjectOutputStream(peopleFileStream2);

        peopleObjectStream2.writeObject(people);
        peopleObjectStream2.writeObject(person3);

        personFileStream.close(); // Обязательно закрываем поток
        peopleFileStream.close();
        peopleFileStream2.close();

    }
}
