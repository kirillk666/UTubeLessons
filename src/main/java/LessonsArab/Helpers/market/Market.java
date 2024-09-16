package LessonsArab.Helpers.market;

import lombok.SneakyThrows;

public class Market {
    private int breadCount = 0;

    /*
    По условию продавец должен докладывать на прилавок хлеб, когда его становится меньше 5.
    Покупатель ждет, если хлеба нет.
    Потоки синхронизированы по монитору объекта this (объект Market).
     */

    @SneakyThrows
    public synchronized void sellBread() {
        /* Тут используется while, а не if, т.к. в рандомных редких случаях поток может проснуться без notify().
        В таком случае условие будет еще раз проверено и выставлен wait() снова. С if условие бы не проверилось еще раз.
        Это рекомендация из документации javadoc.
         */
        while (breadCount < 1) {
            wait(); //this.wait() - вызывается метод на объекте, который является монитором
            //wait(1000) - может ждать заданный интервал времени, а не по notify
        }
        breadCount--;
        System.out.println("Customer bought 1 bread. Total bread = " + breadCount);
        notify(); //this.notify() - вызывается метод на объекте, который является монитором
    }


    @SneakyThrows
    public synchronized void addBread() {
        while (breadCount >= 5) {
            wait(); //this.wait() - вызывается метод на объекте, который является монитором
        }
        breadCount++;
        System.out.println("Bread was added. Total bread = " + breadCount);
        notify(); //this.notify() - вызывается метод на объекте, который является монитором
    }
}
