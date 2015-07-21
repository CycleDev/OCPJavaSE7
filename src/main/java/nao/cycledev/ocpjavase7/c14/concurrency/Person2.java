package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.locks.Lock;

public class Person2 extends Thread {

    Lock lock;

    public Person2(Lock lock, String name) {
        this.lock = lock;
        this.setName(name);
        this.start();
    }

    @Override
    public void run() {
        try{
            System.out.println(getName() + " waiting to access an ATM machine.");
            lock.lock();
            System.out.println(getName() + " is accessing an ATM machine.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(getName() + " is done using the ATM machine.");
            lock.unlock();
        }
    }
}
