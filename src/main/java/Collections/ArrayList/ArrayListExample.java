package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListExample {
    public static void main(String[] args) {
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

        printStudentsArray(example5);
        System.out.println("_________________________________________________________________________________________");

        example5.remove(studentKitty); // Тут удаляется первое вхождение элемента studentKitty в example5, студент studentKitty_2 не был удален, т.к. до него не дошли.
        printStudentsArray(example5);
        System.out.println("_________________________________________________________________________________________");

        example5.add(1, studentKitty); // Вернули
        Student studentKittyNotInArrayButEquals =  new Student("Kitty", 'F', 25, 4.33); // Новый студент, которого нет в example5,
        // но который, благодаря переопределенному в классе student методу equals класса Object, равен studentKitty
        example5.remove(studentKittyNotInArrayButEquals); // Аналогично удаляется первое вхождение элемента studentKitty в example5, студент studentKitty_2 не был удален, т.к. до него не дошли.
        printStudentsArray(example5);
        System.out.println("_________________________________________________________________________________________");

        example5.add(1, studentKitty); // Вернули
        example5.removeIf(s -> s.equals(studentKittyNotInArrayButEquals)); // После удаления этого нового студента таким способом, удалились все равные ему студенты.
        printStudentsArray(example5);
        System.out.println("_________________________________________________________________________________________");
    }

    public static class Student {
        String name;
        Character sex;
        Integer age;
        Double averageGrade;
        public Student(String name, char sex, int age, Double avaragrGrade){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.averageGrade = avaragrGrade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", sex=" + sex +
                    ", age=" + age +
                    ", averageGrade=" + averageGrade +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(sex, student.sex) && Objects.equals(age, student.age) && Objects.equals(averageGrade, student.averageGrade);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, sex, age, averageGrade);
        }
    }

    public static void printArray(ArrayList<String> arraylist) {
        for(String s : arraylist) {
            System.out.println(s);
        }
    }

    public static void printStudentsArray(ArrayList<Student> arraylist) {
        for(Student s : arraylist) {
            System.out.println(s);
        }
    }
}
