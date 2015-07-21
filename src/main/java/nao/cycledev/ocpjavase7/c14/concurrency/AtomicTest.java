package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    static Integer integerVal = new Integer(0);
    static AtomicInteger atomicInteger = new AtomicInteger(0);

    static class IntegerInc extends Thread {
        @Override
        public void run() {
            System.out.println("Integer: " + ++integerVal);
        }
    };

    static class AtomicInc extends Thread{
        @Override
        public void run() {
            System.out.println("Atomic: " + atomicInteger.incrementAndGet());
        }
    }

    public static void test(){

        for (int i = 0; i < 5 ; i++) {

            new IntegerInc().start();
            new AtomicInc().start();
        }
    }
}
