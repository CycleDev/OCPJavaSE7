package nao.cycledev.ocpjavase7.c13.threads;

class Counter {
   static int count = 0;

   public static void increment(){

       synchronized (Counter.class) {
           count++;
           System.out.print(Counter.count + " ");
       }
   }

}

public class SyncTest implements Runnable {

    @Override
    public void run() {

        Counter.increment();

    }
}
