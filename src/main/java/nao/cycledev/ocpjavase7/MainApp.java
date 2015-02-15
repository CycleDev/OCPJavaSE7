package nao.cycledev.ocpjavase7;

import nao.cycledev.ocpjavase7.c10.jdbc.TestCon;
import nao.cycledev.ocpjavase7.c12.localization.LocalizationTest;
import nao.cycledev.ocpjavase7.c13.threads.MyThread;
import nao.cycledev.ocpjavase7.c13.threads.SyncTest;
import nao.cycledev.ocpjavase7.c13.threads.TimeBomb;
import nao.cycledev.ocpjavase7.c9.javaionao2.PathTest;

public class MainApp {

    public static void main(String[] args) {


        Thread myThread = new Thread(new SyncTest());
        Thread myThread1 = new Thread(new SyncTest());
        Thread myThread2 = new Thread(new SyncTest());
        myThread.start();
        myThread1.start();
        myThread2.start();


    }
}
