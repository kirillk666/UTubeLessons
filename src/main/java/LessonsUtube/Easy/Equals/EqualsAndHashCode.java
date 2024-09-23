package LessonsUtube.Easy.Equals;

import LessonsUtube.Helpers.Student;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCode {
    public static void main(String[] args) {

        /**
         * Метод hashCode получает на вход какой-то объект, а на выходе имеет int, который получается путем преобразования.
         * Метод hashCode определен в классе Object. Возвращает int в р-те конвертации внутреннего адреса объекта в число.
         * Если не переопределять hashCode, то при использовании HashMap будет много ошибок.
         * Если переопределяем equals, то следует переопределить и hashCode.
         * Если, согласно методу equals, два объекта равны, то и hashCode данных объектов ВСЕГДА ДОЛЖЕН быть равен.
         * Если, согласно методу equals, два объекта НЕ равны, то hashCode данных объектов ИНОГДА может быть равен. Такое называется Коллизией.
            Это ошибка и вызвана либо плохо переопределенным hashCode методом, либо когда слишком много объектов и int для hashCode закончился и начал повторяться. Редкий кейс.
         */

        Map<Student, Integer> studentsMarksForPoetry = new HashMap<>();
        Student studentKirill = new Student("Kirill", 'M', 28, 4.23);
        Student studentKatya = new Student("Katya", 'F', 29, 3.23);
        Student studentDesdemona = new Student("Desdemona", 'F', 15, 3.23);

        Student studentDesdemonaWasCloned = new Student("Desdemona", 'F', 15, 3.23);
        Student studentAlakir = new Student("Alakir", 'M', 28, 4.23);

        studentsMarksForPoetry.put(studentKirill, 4);
        studentsMarksForPoetry.put(studentKatya, 3);
        studentsMarksForPoetry.put(studentDesdemona, 5);
        System.out.println(studentsMarksForPoetry);

        //В классе Student переопределен метод equals. Если не переопределить метод hashCode, то result вернет false, если переопределить, то вернет true.
        //Если переопределить метод hashCode, но не переопределить метод equals, то result вернет false,
        // т.к. в HashMap сначала идет сравнение на уникальность ключей через hashCode (так быстрее), а потом через equals.
        boolean result = studentsMarksForPoetry.containsKey(studentDesdemonaWasCloned);
        System.out.println("studentDesdemonaWasCloned is not in HashMap, but is equal to studentDesdemona who is in HashMap: " + result);
        System.out.println("_________________________________________________________________________________________");

        //Коллизия в hashCode — это ситуация, в которой два разных объекта имеют одинаковое значение hashCode.
        //studentDesdemona и studentDesdemonaWasCloned имеют одинаковый hashCode, т.к. это одинаковые/равные объекты.
        //Если раскомментировать пример некорректного переопределения метода hashCode класса Student, то для studentKirill и для studentAlakir возникнет коллизия,
        //т.е. их hashCode будут равны, при том, что сами объекты не равны
        System.out.println("studentDesdemona hash code = " + studentDesdemona.hashCode());
        System.out.println("studentDesdemonaWasCloned hash code = " + studentDesdemonaWasCloned.hashCode());
        System.out.println("studentKirill hash code = " + studentKirill.hashCode());
        System.out.println("studentAlakir hash code = " + studentAlakir.hashCode());
        System.out.println("_________________________________________________________________________________________");

    }
}
