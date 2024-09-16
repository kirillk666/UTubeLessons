package LessonsArab.Normal.MultiThreading.userThreads.Methods;

public class Method3Join {
    public static void main(String[] args) throws InterruptedException {
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
        System.out.println("Thread state: " + thread.getState());

        thread.start();
        System.out.println("Thread state: " + thread.getState());

        /* Поток, В котором вызывается join (в данном примере - это main) будет ждать поток,
        НА котором вызывается join (в данном примере - это thread).
         */
        thread.join();
        System.out.println("Thread state: " + thread.getState());

        System.out.println("The end");
    }
}
