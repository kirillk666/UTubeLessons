package LessonsUtube.Normal.MultiThreading.userThreads.WhyNotRunUsingMethodRun;

public class RunExample_Wrong implements Runnable {
    @Override
    public void run() {
        System.out.println("Method run. Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunExample_Wrong());
        thread.run(); //Оба вызова выполняются в одном потоке. Так делать неправильно. Нужно делать .start()

        System.out.println("Method main. Thread name = " + Thread.currentThread().getName());
    }
}
