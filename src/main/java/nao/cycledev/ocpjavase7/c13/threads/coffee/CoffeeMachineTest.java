package nao.cycledev.ocpjavase7.c13.threads.coffee;

public class CoffeeMachineTest {

    public static void test() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Waiter waiter = new Waiter();
        coffeeMachine.start();
        waiter.start();
    }


}
