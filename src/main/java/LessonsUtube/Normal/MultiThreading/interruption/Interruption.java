package LessonsUtube.Normal.MultiThreading.interruption;

import lombok.SneakyThrows;

public class Interruption {

    /*
    Тут демонстрируется возможность послать сигнал потоку, что его хотят прервать (.interrupt()).
    Далее в самом потоке можно проверить, хотят ли его прервать (isInterrupted).
    Что делать, если проверка показала, что поток хотят прервать, должен решать сам программист.
     */

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println("main starts");
        InterruptionThread interruptionThread = new InterruptionThread();
        interruptionThread.start(); //запускается поток interruptionThread

        /*
        Если сюда поставить interruptionThread.join(); то основной поток сначала дождется завершения interruptionThread,
            а потом будет пытаться прервать его, хотя поток interruptionThread уже будет завершен.
         */

        Thread.sleep(2000); //основной поток ждет 2 секунды, все то время работает interruptionThread
        interruptionThread.interrupt(); //передается в interruptionThread информация, что поток хотят прервать

        interruptionThread.join(); //основной поток ждет завершения interruptionThread
        System.out.println("main ends");
    }
}

class InterruptionThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 0; i <= 1000000000; i++) {
            if (isInterrupted()) { //проверяется, была ли передана информация, что поток хотят прервать.
                System.out.println("thread is interrupted, current sum = " + sqrtSum);
                return; //если да, то прерываем
            }
            sqrtSum += Math.sqrt(i);

//            try {
//                sleep(100);//поток спит 0.1 сек
//            } catch (InterruptedException e) { //во время сна происходит попытка прервать поток, выбрасывается исключение
//                System.out.println("Поток пытаются прервать во время сна, current sum = " + sqrtSum);
//                e.printStackTrace();
//                return;
//            }
        }
        System.out.println("show if is not interrupted " + sqrtSum);
    }
}