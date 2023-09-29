package ExamplesFromBook;

public class Lesson_3_8_6_Break_label {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Надо отработать 666 часов");
        checkNumbers:
        while (count < 666) {
            for(int i = 0; i<8; i++) { //break label нужен, чтобы прервать вложенный цикл, хз какой придумать
                count += 1;
                if(count == 666){
                   System.out.println("Молодец, отработал 666 часов!");
                   break checkNumbers;
               }
            }
            System.out.println("Осталось отработать " + (666 - count));
        }
    }
}
