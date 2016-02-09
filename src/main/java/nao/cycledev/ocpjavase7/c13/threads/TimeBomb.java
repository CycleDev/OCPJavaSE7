package nao.cycledev.ocpjavase7.c13.threads;

public class TimeBomb extends Thread {

    private static final int[] count = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Override
    public void run() {
        for (int i = count.length - 1; i>=0; i--){
            try {
                System.out.println(count[i]);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Booooooooommmmmmmmmmmmmmm!!!!");
    }
}
