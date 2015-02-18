package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.Exchanger;

public class ExchangerTest {

    public static void test(){

        Exchanger<String> ex = new Exchanger<>();

        new DukeExchanger(ex).start();
        new JoneExchanger(ex).start();

    }

}
