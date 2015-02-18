package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.Exchanger;

public class DukeExchanger extends Thread {

    private Exchanger<String> sillyTalk;

    public DukeExchanger(Exchanger<String> sillyTalk) {
        this.sillyTalk = sillyTalk;
    }

    @Override
    public void run() {

        String rep;
        try {
            rep = sillyTalk.exchange("Hello");

            System.out.println("Jone: " + rep);

            rep = sillyTalk.exchange("My name is Duke?");

            System.out.println("Jone: " + rep);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
