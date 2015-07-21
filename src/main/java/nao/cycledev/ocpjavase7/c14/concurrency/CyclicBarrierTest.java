package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    public static void test(){

        CyclicBarrier barrier = new CyclicBarrier(4, new MixedDoubleTennisGame());

        new Player(barrier, "Ivan");
        new Player(barrier, "Oleh");
        new Player(barrier, "Vasyl");
        new Player(barrier, "Petro");
    }

}
