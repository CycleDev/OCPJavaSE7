package nao.cycledev.ocpjavase7.c13.threads;

public class CounterThread implements Runnable {

    @Override
    public synchronized void run() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }
}
