package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    public static void test(){

        Lock machine = new ReentrantLock();

        new Person2(machine, "Mickey");
        new Person2(machine, "Donald");
        new Person2(machine, "Tom");
        new Person2(machine, "Jerry");
        new Person2(machine, "Casper");
    }
}
