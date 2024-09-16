package LessonsArab.Normal.MultiThreading.userThreads.Creating;

//В данном примере мы никак не контролируем последовательность выполнения потоков. Они не синхронизованы.

public class ImplementsThreadUsingMainAsThread implements Runnable {
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) { //Это тоже поток. Основной поток. Суммарно тут программа работает в 2-х потоках.
        Thread thread = new Thread(new ImplementsThreadUsingMainAsThread());
        thread.start();

        for (int i = 1000; i > 1; i--) {
            System.out.println(i);
        }
    }
}
