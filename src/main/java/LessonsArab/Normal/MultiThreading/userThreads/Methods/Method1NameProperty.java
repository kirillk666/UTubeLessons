package LessonsArab.Normal.MultiThreading.userThreads.Methods;

public class Method1NameProperty {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("anonymous"));
        System.out.println("Name of thread: " + thread.getName()
                + "; Priority of thread: " + thread.getPriority());

        thread.setName("My_name");
        thread.setPriority(3);
        System.out.println("Name of thread: " + thread.getName()
                + "; Priority of thread: " + thread.getPriority());

        Thread thread2 = new Thread(() -> System.out.println("anonymous"));
        System.out.println("Name of thread: " + thread2.getName()
                + "; Priority of thread: " + thread2.getPriority());

        thread2.setName("My_name_2");
        thread2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of thread: " + thread2.getName()
                + "; Priority of thread: " + thread2.getPriority());
    }
}
