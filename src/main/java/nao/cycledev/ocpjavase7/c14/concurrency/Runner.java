package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.CountDownLatch;

public class Runner extends Thread {

    CountDownLatch timer;

    public Runner(CountDownLatch timer, String name) {
        this.timer = timer;
        this.setName(name);
        System.out.println(this.getName() + " ready and waiting for the count down to start.");
        this.start();
    }

    @Override
    public void run() {
        try {
            timer.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " started running.");
    }
}
