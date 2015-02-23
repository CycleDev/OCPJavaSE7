package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.Phaser;

public class Worker extends Thread {

    Phaser deliveryOrder;

    public Worker(Phaser deliveryOrder, String name) {
        this.deliveryOrder = deliveryOrder;
        this.setName(name);
        deliveryOrder.register();
        this.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {

            System.out.println("\t" + getName() + " doing his work for order no. " + i);
            if (i == 3){
                deliveryOrder.arriveAndDeregister();
            }else
            {
                deliveryOrder.arriveAndAwaitAdvance();
            }
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
