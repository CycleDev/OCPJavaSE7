package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.Semaphore;

public class Person extends Thread {

    private Semaphore machines;

    public Person(String name, Semaphore machines) {
        this.machines = machines;
        this.setName(name);
        this.start();
    }

    @Override
    public void run() {

        try {
            System.out.println(getName() + " waiting to access an ATM machine.");
            machines.acquire();
            System.out.println(getName() + " is accessing an ATM machine.");
            Thread.sleep(1000);
            System.out.println(getName() + " is done using the ATM machine.");
            machines.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
