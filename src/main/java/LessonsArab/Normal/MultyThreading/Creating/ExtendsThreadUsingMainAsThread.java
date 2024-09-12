package LessonsArab.Normal.MultyThreading.Creating;

//В данном примере мы никак не контролируем последовательность выполнения потоков. Они не синхронизованы.

public class ExtendsThreadUsingMainAsThread extends Thread {
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) { //Это тоже поток. Основной поток. Суммарно тут программа работает в 2-х потоках.
        Thread thread = new ExtendsThreadUsingMainAsThread();
        thread.start();

        for (int i = 1000; i > 1; i--) {
            System.out.println(i);
        }
    }
}
