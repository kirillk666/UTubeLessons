package RandomTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ReplaceStringInString {
    public static void main(String[] args) {
        String st1 = "123";
        String st2 = "1234561236664123rrr";

        String st3 = (st2.replaceAll(st1, " "));
        System.out.println(st3);

        char[] charArray = st3.toCharArray();
        System.out.println(Arrays.toString(charArray));

        List<Character> charList = new ArrayList<>();
        for (char c : charArray) {
            charList.add(c);
        }
        assertEquals(st3.length(), charList.size());

        StringBuilder stringBuilder = new StringBuilder();

        Iterator<Character> characterIterator = charList.iterator();
        while (characterIterator.hasNext()) {
            if (!characterIterator.next().equals(' ')) {
                stringBuilder.append('+');
            } else {
                stringBuilder.append(st1);
            }
        }

        System.out.println(stringBuilder);
    }
}
