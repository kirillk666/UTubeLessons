package LessonsUtube.Normal.MultiThreading.userThreads.WhyNotRunUsingMethodRun;

public class StartExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Method run. Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new StartExample());
        thread.start();

        System.out.println("Method main. Thread name = " + Thread.currentThread().getName());
    }
}
