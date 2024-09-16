package LessonsArab.Normal.MultiThreading.daemon;

public class daemonThreads {
    public static void main(String[] args) {
        /*
        Daemon threads предназначены для выполнения фоновых задач и оказания различных сервисов user threads.
        При завершении последнего user thread программа завершает свое выполнение.
            Не выполняется ожидание окончания работы daemon потока.

         В данном примере демон поток не оказывает никаких сервисов. Просто демонстрация завершения работы демон потока досрочно.
         */

        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user_thread");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_thread");
        daemonThread.setDaemon(true); //Поток назначается демоном после определения и до старта.

        userThread.start();
        daemonThread.start();

        System.out.println("Main thread ends");
    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is Daemon? " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println("Letter: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is Daemon? " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println("Number: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
