package LessonsArab.Normal.MultiThreading.userThreads.Methods;

public class Method2Sleep {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();

        /* Сначала выводится строка, а потом идет цикл в потоке.
        Так происходит т.к. main поток запускает поток thread и дальше продолжает выполнять код, который ниже.
        Цикл выводится в другом потоке и поток main его не ждет.
         */
        System.out.println("The end");

    }
}
