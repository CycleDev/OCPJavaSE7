package nao.cycledev.ocpjavase7;

import nao.cycledev.ocpjavase7.c13.threads.MyThread;

public class MainApp {

    public static void main(String[] args) {

        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.start();
        t2.start();
        System.out.println(t1.getName() + ": " + t1.getState());
        System.out.println(t2.getName() + ": " + t2.getState());

    }

}
