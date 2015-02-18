package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    public static void test(){

        Semaphore machines = new Semaphore(2);

        new Person("Ivan", machines);
        new Person("Petro", machines);
        new Person("Nazar", machines);
        new Person("Oksana", machines);
        new Person("Luida", machines);

    }

}
