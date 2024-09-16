package LessonsArab.Normal.MultiThreading.userThreads.Creating;

public class ThreadUsingAnonymousClass {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous");
            }
        });

        thread.start();

        Thread thread2 = new Thread(() -> System.out.println("anonymous2"));
        thread2.start();
    }
}
