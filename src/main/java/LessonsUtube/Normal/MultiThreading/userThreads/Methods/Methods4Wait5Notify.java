package LessonsUtube.Normal.MultiThreading.userThreads.Methods;

import LessonsUtube.Helpers.market.Consumer;
import LessonsUtube.Helpers.market.Market;
import LessonsUtube.Helpers.market.Producer;

public class Methods4Wait5Notify {
    public static void main(String[] args) {

        /*
        wait() - освобождает монитор и переводит вызывающий поток в состояние ожидания, пока другой поток
                не вызовет метод notify().
        notify() - НЕ освобождает монитор и будет поток, у которого ранее был вызван wait().
        notifyAll() - аналогично для всех потоков.
        */

        Market market = new Market();

        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread pThread = new Thread(producer);
        pThread.start();

        Thread cThread = new Thread(consumer);
        cThread.start();
    }
}
