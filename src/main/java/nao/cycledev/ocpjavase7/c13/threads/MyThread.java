package nao.cycledev.ocpjavase7.c13.threads;

import static java.lang.Thread.sleep;

public class MyThread implements Runnable {


    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}
