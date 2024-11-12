package LessonsUtube.Normal.MultiThreading.callable;

import java.util.concurrent.*;

public class CallableEx {
    static int factorialRes;

    /* Callable, как и Runnable = определенное задание, которое выполняется потоком.
    В отличии от Runnable:
        return type != void;
        может выбрасывать Exception.
        может использоваться только с Executor service. Нельзя поместить в Thread.
     */

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //submit передает задание в Executor service для выполнения потоком и возвращает Future.
        Future<Integer> integerFuture = executorService.submit((new Factorial(7)));

        try {
            //Получить из Future хранимое значение. Метод get ожидает получение результата по итогам выполнения всего задания.
            //Поэтому не нужно ждать завершения потока. Get блокирует поток, пока все задание не будет выполнено.
            System.out.println("integerFuture.isDone()? " + integerFuture.isDone());
            factorialRes = integerFuture.get();
            System.out.println("integerFuture.isDone()? " + integerFuture.isDone());
        } catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
        } catch (ExecutionException executionException) {
            System.out.println(executionException.getCause());
        } finally {
            executorService.shutdown();
        }

        System.out.println(factorialRes);
    }
}

class Factorial implements Callable<Integer> {
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws IllegalArgumentException {
        if(f<0) {
            throw new IllegalArgumentException("Wrong number! Should be more than zero!");
        }
        int result = 1;
        for(int i=1; i<=f; i++) {
            result *= i;
        }
        return result;
    }
}