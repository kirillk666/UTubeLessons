package Lessons.Normal.Collection.Map;

import Helpers.Student;

import java.util.Hashtable;

@SuppressWarnings("unused")
public class HashTableExample {
    public static void main(String[] args) {

        /** HashTable - УСТАРЕВШИЙ - Deprecated; Вместо него в документации рекомендуют использовать ConcurrentHashMap;
         * Работает по тем же принципам, что и HashMap;
         * HashMap - synchronised, можно использовать в многопоточном программировании
         */

        Hashtable<Double, Student> doubleStudentHashtable = new Hashtable<>();
    }
}
