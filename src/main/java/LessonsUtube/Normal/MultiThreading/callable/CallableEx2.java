package LessonsUtube.Normal.MultiThreading.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableEx2 {

    //Тут расчет суммы чисел от 1 до 1ккк в 10 потоках

    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        long valueDividedBy10 = value / 10;
        List<Future<Long>> futures = new ArrayList<>();

        for(int i = 0; i<10; i++) {
            long from = valueDividedBy10 * i + 1;
            long to = valueDividedBy10 * (i + 1);
            PartialSum partialSum = new PartialSum(from, to);
            Future<Long> futurePartSum = executorService.submit(partialSum);
            futures.add(futurePartSum);
        }

        for(Future<Long> future : futures) {
            sum += future.get();
        }

        System.out.println("Total sum = " + sum);
        executorService.shutdown();
    }
}

class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {
        for(long i = from; i<=to; i++) {
            localSum += i;
        }
        System.out.println("localSum in " + Thread.currentThread().getName() + " = " + localSum);
        return localSum;
    }
}