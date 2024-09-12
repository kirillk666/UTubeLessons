package LessonsArab.Normal.MultyThreading.Creating;

public class ImplementsRunnable {
    public static void main(String[] args) { //Это тоже поток. Основной поток. Суммарно тут программа работает в 3-х потоках.
        //В данном примере мы никак не контролируем последовательность выполнения потоков. Они не синхронизованы.
        Thread thread1 = new Thread(new Thread3());
        Thread thread2 = new Thread(new Thread4());
        thread1.start();
        thread2.start();
    }
}

class Thread3 implements Runnable {
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class Thread4 implements Runnable {
    public void run() {
        for (int i = 1000; i > 1; i--) {
            System.out.println(i);
        }
    }
}
