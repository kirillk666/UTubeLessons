package Lessons.Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        /**
         * В отличие от iterator есть возможность двигаться в обратном направлении.
         */
        //Проверяем, является ли строка палиндромом (читается одинаково в обе стороны)
        String palindrome = "madam";
        LinkedList<Character> linkedList = new LinkedList<>();

        for(char ch : palindrome.toCharArray()) {
           linkedList.add(ch);
        }

        ListIterator<Character> listIterator = linkedList.listIterator();
        ListIterator<Character> reverseListIterator = linkedList.listIterator(linkedList.size());
        boolean isPalindrome = true;
        while(listIterator.hasNext() && reverseListIterator.hasPrevious()) {
            if(listIterator.next() != reverseListIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(palindrome + " is palindrome? " + isPalindrome);
    }
}
