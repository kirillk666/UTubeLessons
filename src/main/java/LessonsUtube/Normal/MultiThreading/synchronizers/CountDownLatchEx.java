package LessonsUtube.Normal.MultiThreading.synchronizers;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    /* CountDownLatch - синхронизатор (готовое решение, что не писать локи и синхронизацию самому),
    позволяющий любому кол-ву потоков ждать, пока не завершится заданное кол-во операций.
    В конструктор CountDownLatch нужно передавать кол-во операций, которые должны завершиться, что потоки продолжили свою работу.
    */

    static CountDownLatch countDownLatch = new CountDownLatch(3);

    public static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDawnLatch = " + countDownLatch.getCount());
    }

    public static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let's open market");
        countDownLatch.countDown();
        System.out.println("countDawnLatch = " + countDownLatch.getCount());
    }

    public static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("countDawnLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Kirill", countDownLatch);
        new Friend("Kir", countDownLatch);
        new Friend("Rill", countDownLatch);
        new Friend("Lira", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }

    static class Friend extends Thread {
        String name;
        private CountDownLatch countDownLatch;

        public Friend(String name, CountDownLatch countDownLatch) {
            this.name = name;
            this.countDownLatch = countDownLatch;
            this.start();
        }

        public void run() {
             try {
                 countDownLatch.await();
                 System.out.println(name + " start buying things");
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
        }
    }
}