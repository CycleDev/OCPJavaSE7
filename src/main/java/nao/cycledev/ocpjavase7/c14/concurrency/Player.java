package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Player extends Thread {

    private CyclicBarrier point;

    public Player(CyclicBarrier point, String name) {
        this.point = point;
        this.setName(name);
        this.start();
    }

    @Override
    public void run() {
        System.out.println("Player " + getName() + " is ready.");

        try {
            point.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
