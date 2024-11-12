package LessonsUtube.Normal.MultiThreading.threadPool;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    /**
     * ScheduledExecutorService
     * Используется, когда надо установить расписание на запуск потоков из пула.
     */
    @SneakyThrows
    public static void main(String[] args) {

        //Задание передается в ExecutorService и выполняется через 3 секунды.
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.schedule(new ThreadPoolRunEx2(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();

        /** тут initialDelay - время между началом запуска задач, который начинается через 3 сек.
         Если задача выполняется дольше, чем initialDelay, то выполняется сразу, без ожидания, т.к. запуск уже был

         Например: была задержка 5 сек на старте, она сойдет на нет и работа вернется к базовому интервалу только когда выровняется по времени.
         Задержка 5 секунд при старте задачи (например, первая задача выполняется 5 секунд).
         После завершения первой задачи, следующая задача начнётся сразу, не дожидаясь интервала.
         Это означает, что задачи начинают выполняться сразу после завершения предыдущей.
         Если задачи выполняются быстро, то интервал между задачами будет сокращаться, пока выполнение задач не выровняется с интервалом.
         Интервал возвращается к базовому интервалу (1 секунда) только после того, как все предыдущие задержки будут "перенесены"
         и задачи начнут запускаться в установленное время, т.е. после того, как выполнение всех предыдущих задач завершится.
         Таким образом, если первая задача занимает 5 секунд, то все последующие задачи будут выполнять за меньшее время,
         и выровняются с интервалом только после того, как задачи будут запускаться с нужной периодичностью.
         */
        ScheduledExecutorService scheduledExecutorService2 = Executors.newScheduledThreadPool(1);
        scheduledExecutorService2.scheduleAtFixedRate(new ThreadPoolRunEx2(), 3, 1, TimeUnit.SECONDS);

        Thread.sleep(10000);
        scheduledExecutorService2.shutdown();

        //Тут выдерживается ровно одна секунда с конца выполнения первой задачи до начала второй и т.д.
        ScheduledExecutorService scheduledExecutorService3 = Executors.newScheduledThreadPool(1);
        scheduledExecutorService3.scheduleAtFixedRate(new ThreadPoolRunEx2(), 3, 1, TimeUnit.SECONDS);

        Thread.sleep(10000);
        scheduledExecutorService3.shutdown();

        //CachedThreadPool может создавать внутри себя потоки, если существующего кол-ва потоков не хватает для выполнения всех задач.
        //Если через 60 сек новосозданный поток больше не используется, то он удаляется.
        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}

class ThreadPoolRunEx2 implements Runnable {

    @SneakyThrows
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
