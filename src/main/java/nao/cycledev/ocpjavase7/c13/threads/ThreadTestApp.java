package nao.cycledev.ocpjavase7.c13.threads;

import static java.lang.Thread.sleep;

public class ThreadTestApp {

    public void singAndDanceTest() throws InterruptedException {
        Thread sing = new Thread(new SingTread());
        sing.start();
        //sleep(1000);
        System.out.println("Dancing .........");
    }

}
