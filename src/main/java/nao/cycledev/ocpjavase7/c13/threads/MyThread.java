package nao.cycledev.ocpjavase7.c13.threads;

public class MyThread extends Thread {

    @Override
    synchronized public void run() {

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       // notify();
    }
}
