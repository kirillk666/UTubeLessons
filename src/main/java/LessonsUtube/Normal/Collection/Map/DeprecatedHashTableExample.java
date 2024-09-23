package LessonsUtube.Normal.Collection.Map;

import LessonsUtube.Helpers.Student;

import java.util.Hashtable;

@SuppressWarnings("unused")
public class DeprecatedHashTableExample {
    public static void main(String[] args) {

        /** {@link Hashtable} - УСТАРЕВШИЙ - Deprecated; Вместо него в документации рекомендуют использовать {@link java.util.concurrent.ConcurrentHashMap};
         * Работает по тем же принципам, что и HashMap;
         * HashMap - synchronised, можно использовать в многопоточном программировании
         */

        Hashtable<Double, Student> doubleStudentHashtable = new Hashtable<>();
    }
}
