package LessonsArab.Normal.MultyThreading.Creating;

//Основные цели: производительность и многозадачность (concurrency)

public class ExtendsThread {
    public static void main(String[] args) { //Это тоже поток. Основной поток. Суммарно тут программа работает в 3-х потоках.
        //В данном примере мы никак не контролируем последовательность выполнения потоков. Они не синхронизованы.
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1000; i > 1; i--) {
            System.out.println(i);
        }
    }
}