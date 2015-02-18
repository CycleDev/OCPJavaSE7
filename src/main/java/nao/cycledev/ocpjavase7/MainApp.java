package nao.cycledev.ocpjavase7;

<<<<<<< HEAD
import nao.cycledev.ocpjavase7.c11.AssertionExample;
import nao.cycledev.ocpjavase7.c12.localization.LocalizationTest;
=======
import nao.cycledev.ocpjavase7.c10.jdbc.TestCon;
import nao.cycledev.ocpjavase7.c12.localization.LocalizationTest;
import nao.cycledev.ocpjavase7.c13.threads.MyThread;
import nao.cycledev.ocpjavase7.c13.threads.SyncTest;
import nao.cycledev.ocpjavase7.c13.threads.TimeBomb;
import nao.cycledev.ocpjavase7.c9.javaionao2.PathTest;
>>>>>>> 283dacc6658ad72dc6df8e25c5af15c3a9a84e16

public class MainApp {

    public static void main(String[] args) {

<<<<<<< HEAD
        LocalizationTest.resourceBundleTest();
=======

        Thread myThread = new Thread(new SyncTest());
        Thread myThread1 = new Thread(new SyncTest());
        Thread myThread2 = new Thread(new SyncTest());
        myThread.start();
        myThread1.start();
        myThread2.start();


>>>>>>> 283dacc6658ad72dc6df8e25c5af15c3a9a84e16
    }
}
