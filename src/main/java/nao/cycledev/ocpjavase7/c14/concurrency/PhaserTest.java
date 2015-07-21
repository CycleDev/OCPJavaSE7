package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.Phaser;

public class PhaserTest {

    public static void test() {

        Phaser phaser = new Phaser(1);

        System.out.println("Starting to process the delivery order.");
        new Worker(phaser, "Cook");
        new Worker(phaser, "Helper");
        new Worker(phaser, "Attendant");

        for (int i = 1; i <= 3 ; i++) {
            phaser.arriveAndAwaitAdvance();
            System.out.println("Deliver food item no. " + i);
        }

        phaser.arriveAndDeregister();
        System.out.println("Delivery order completed... give it to the customer");

    }

}
