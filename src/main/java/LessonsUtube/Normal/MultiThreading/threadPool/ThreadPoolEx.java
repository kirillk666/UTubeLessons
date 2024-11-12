package LessonsUtube.Normal.MultiThreading.threadPool;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx {
    /**
     * Множество потоков.
     * Внутри себя определяет какой поток будет выполнять конкретную задачу.
     * В Java с ThreadPool удобнее всего работать с помощью ExecutorService.
     * ThreadPool удобнее всего создавать используя factory методы класса Executors:
     * Executors.newFixedThreadPool(int count) - создаст pool с 5 потоками.
     * Executors.newSingleThreadExecutor() - создаст pool с 1 потоком.
     */
    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            executorService.execute(new ThreadPoolRunEx1()); // .execute передает задание в ExecutorService, где оно выполняется одним из потоков.
        }
        executorService.shutdown(); //Прекращает работу.

        //В данном случае main поток будет ждать 5 сек или пока закончится выполнение заданий из ExecutorService.
        //Вернет false, если не успеет закончиться за 5 сек.
        if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
            System.out.println("Not in time!. Do smth...");
        }


        ExecutorService executorServiceSingle = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorServiceSingle.execute(new ThreadPoolRunEx1()); // .execute передает задание в ExecutorService, где оно выполняется одним потоком.
        }

        System.out.println("Main ends");
        executorServiceSingle.shutdown();
    }
}

class ThreadPoolRunEx1 implements Runnable {

    @SneakyThrows
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(500);
    }
}
