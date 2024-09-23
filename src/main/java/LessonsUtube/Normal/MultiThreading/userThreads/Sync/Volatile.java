package LessonsUtube.Normal.MultiThreading.userThreads.Sync;

public class Volatile extends Thread { //Изменчивый, непостоянный
    /*
    В данном примере два потока: thread + main.
    Переменная класса boolean b объявлена = true (допустим, не volatile).
    В потоке thread происходит инкрементация, закончится, когда b станет = false.

    Изначально у потоков общий пул кеша, в котором b = true. И у каждого персональный, в которых также b = true.

    Когда в потоке main присваивается b = false, то это значение меняется только в кеше потока main.
    Однако в кеше потока thread осталось значение b = true и цикл будет идти практически бесконечно.

    Когда мы хотим, чтобы переменная не хранилась в кеше для каждого потока, а была только в общем и в нем же и менялась,
        то нужно использовать volatile.
     */

    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Volatile thread = new Volatile();
        thread.start();

        Thread.sleep(3000); //sleep на потоке main

        System.out.println("After 3 sec it is time to wake up");

        thread.b = false;
        thread.join();
        System.out.println("The end");
    }
}
