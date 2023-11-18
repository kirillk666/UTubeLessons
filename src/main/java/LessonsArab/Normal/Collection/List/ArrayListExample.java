package LessonsArab.Normal.Collection.List;

import LessonsArab.Helpers.Student;
import LessonsArab.Helpers.StudentHelper;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        /** {@link ArrayList} - реализует(implements) интерфейс {@link List}, который в свою очередь реализует(implements) интерфейс {@link java.util.Collection};
         * Т.к. ArrayList реализует интерфейс List, то у него должны быть все методы List плюс (возможно) какие-то другие.
         * Отсюда внешняя схожесть. При этом в List эти методы вообще никак не реализованы и невозможно создать объект командой new List().
        **/

        ArrayList<String> example1 = new ArrayList<>();
        example1.add("something1");
        example1.add("something2");
        System.out.println(example1 + "\n____________________________________________________________________________");

        ArrayList<String> example2 = new ArrayList<>(); // Тип (generic) достаточно писать только слева
        example2.add("something2.1");
        example2.add("something2.2");
        ArrayListExample.printArray(example2);
        System.out.println("_________________________________________________________________________________________");

        ArrayList<String> example3 = new ArrayList<>(25); // Был массив без изначальной размерности
        example3.add("something3.1"); // Добавили something1 => массив стал размером 1 с элементом 1.
        example3.add("something3.2"); // Добавили something2 => скопировали элементы массива (в данном случае something1) и добавили новый элемент something2
        // Таким образом, при добавлении нового элемента копируется полностью старый массив и добавляется новый элемент.
        // Если изначально задать initial Capacity, то копирования не будет и заполнение будет происходить быстрее
        ArrayListExample.printArray(example3);
        System.out.println("_________________________________________________________________________________________");

        ArrayList<String> example4 = new ArrayList<>(example1); // Задали ссылку на arrayList example1, т.е. взяли за основу example1
        //noinspection NewObjectEquality
        System.out.println(example4 == example1); // example1 и example4 - это разные объекты класса String. Через == сравнивается ссылка на объект, а не содержимое.
        System.out.println(example4.equals(example1)); // С одинаковым содержимым. Их корректно сравнить через equals, т.к. String неизменяемый
        example4.add("something4.1");
        example4.add("something4.2");
        ArrayListExample.printArray(example4);
        System.out.println("_________________________________________________________________________________________");

        Student studentKirill = new Student("Kirill", 'M', 28, 4.23);
        Student studentKatya = new Student("Katya", 'F', 29, 3.23);
        Student studentDesdemona = new Student("Desdemona", 'F', 15, 3.23);
        Student studentKitty = new Student("Kitty", 'F', 25, 4.33);
        Student studentKitty_2 = new Student("Kitty", 'F', 25, 4.33);
        Student studentGena = new Student("Gena", 'M', 28, 2.53);
        Student studentGenaWasCloned = new Student("GenaWasCloned", 'M', 28, 2.53);
        ArrayList<Student> example5 = new ArrayList<>();

        example5.add(studentKatya);
        example5.add(studentKitty);
        example5.add(studentKitty_2);
        example5.add(studentGena);
        example5.add(3, studentKirill); // Можно добавлять элемент в определенный индекс, если ячейка изначально создана в initialCapacity
        // либо если ячейка была создана в р-те добавления элемента
        example5.add(studentDesdemona);


        example5.set(4, studentGenaWasCloned); // Заменить элемент массива

        System.out.println("Сравнение одинаковых объектов: " + studentKitty.equals(studentKitty_2)); // false без @override equals сравнивает ссылки (выполняется ==), true - c @override
        System.out.println("Сравнение одинаковых элементов массива: " + example5.get(1).equals(example5.get(2))); // false без @override equals, true - c @override

        StudentHelper.printStudentsArray(example5);
        System.out.println("_________________________________________________________________________________________");

        example5.remove(studentKitty); // Тут удаляется первое вхождение элемента studentKitty в example5, студент studentKitty_2 не был удален, т.к. до него не дошли.
        StudentHelper.printStudentsArray(example5);
        System.out.println("_________________________________________________________________________________________");

        example5.add(1, studentKitty); // Вернули
        Student studentKittyNotInArrayButEquals =  new Student("Kitty", 'F', 25, 4.33); // Новый студент, которого нет в example5,
        // но который, благодаря переопределенному в классе student методу equals класса Object, равен studentKitty
        example5.remove(studentKittyNotInArrayButEquals); // Аналогично удаляется первое вхождение элемента studentKitty в example5, студент studentKitty_2 не был удален, т.к. до него не дошли.
        StudentHelper.printStudentsArray(example5);
        System.out.println("_________________________________________________________________________________________");

        example5.add(1, studentKitty); // Вернули
        example5.removeIf(s -> s.equals(studentKittyNotInArrayButEquals)); // После удаления этого нового студента таким способом, удалились все равные ему студенты.
        StudentHelper.printStudentsArray(example5);
        System.out.println("_________________________________________________________________________________________");

        ArrayList<Student> example6 = new ArrayList<>();
        Student studentJeka = new Student("Jeka", 'M',18,4.55);
        example6.add(studentJeka);
        example6.add(studentKitty);
        example6.addAll(1, example5);
        if(example6.contains(studentKirill)) {
            StudentHelper.printStudentsArray(example6);
            System.out.println("index of studentKitty = " + example6.indexOf(studentKittyNotInArrayButEquals)); // studentKittyNotInArrayButEquals не в example6, но из-за переопределенного метода equals
            // studentKittyNotInArrayButEquals == studentKitty, выводится индекс studentKitty
        }
        System.out.println("_________________________________________________________________________________________");

        //Некоторые общие методы класса Collections
        ArrayList<String> example7 = new ArrayList<>();
        example7.add("One");
        example7.add("Two");
        example7.add("Three");
        example7.add("Four");
        example7.add("Five");
        example7.add("Six");

        ArrayList<String> example8 = new ArrayList<>();
        example8.add("One");
        example8.add("Two");
        example8.add("Three");

        example7.removeAll(example8);
        printArray(example7);
        System.out.println();

        example7.addAll(0, example8);
        printArray(example7);
        System.out.println();

        example7.retainAll(example8); // Оставит в example7 только те элементы, что есть в example8
        printArray(example7);
        System.out.println();

        if (example7.containsAll(example8)) {
            System.out.println("example7 содержит все элементы example8");
        }
        System.out.println("_________________________________________________________________________________________");

        ArrayList<String> example9 = new ArrayList<>();
        example9.add("One");
        example9.add("Two");
        example9.add("Three");
        example9.add("Four");
        example9.add("Five");
        example9.add("Six");

        // Создание subList из ArrayList example9. Диапазон указывается не включительно, т.е. 0 - 4 только 3 элемента. Как в subString.
        // subList не существует по отдельности от example9, он лишь является его представлением (view).
        List<String> subList = example9.subList(0, 4);
        System.out.println(subList);

        example9.set(0, "OneOne");
        System.out.println(subList);

        subList.add("Seven");
        System.out.println("subList = " + subList + ", example9 = " + example9);

        subList.remove(2);
        System.out.println("subList = " + subList + ", example9 = " + example9);

        //Если добавить элемент в диапазоне example9, выбранном для создания view subList и дальше как-то пытаться взаимодействовать с subList,
        // то получим ConcurrentModificationException
        example9.add(0, "Zero");
        // System.out.println("subList = " + subList + ", example9 = " + example9); - Exception
        // При этом вывод просто example9 работает
        System.out.println(example9 + " = example9");
    }

    public static void printArray(java.util.ArrayList<String> arraylist) {
        for(String s : arraylist) {
            System.out.println(s);
        }
    }
}
