package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    public static void test(){

        CountDownLatch timer = new CountDownLatch(5);

        new Runner(timer, "Oleh");
        new Runner(timer, "Olia");
        new Runner(timer, "Vasyl");

        System.out.println("Starting the countdown.");
        long count = timer.getCount();
        while (count > 0){
            try {
                Thread.sleep(1000);
                System.out.println(count);
                if(count == 1){
                    System.out.println("Start");
                }
                timer.countDown();
                count = timer.getCount();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
