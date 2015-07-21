package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.Exchanger;

public class JoneExchanger extends Thread {

    private Exchanger<String> sillyTalk;

    public JoneExchanger(Exchanger<String> sillyTalk) {
        this.sillyTalk = sillyTalk;
    }

    @Override
    public void run() {
        String resp;

        try {
            resp = sillyTalk.exchange("Hey!!!");
            System.out.println("Duke: " + resp);


            resp = sillyTalk.exchange("What is your name?");
            System.out.println("Duke: " + resp);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
