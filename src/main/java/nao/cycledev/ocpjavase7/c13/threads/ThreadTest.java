package nao.cycledev.ocpjavase7.c13.threads;

public class ThreadTest {

    public static void testTimeBomb(){
        TimeBomb timeBomb = new TimeBomb();
        timeBomb.start();
    }

}
