package nao.cycledev.ocpjavase7.c11.excaptions;

public class AssertionExample {

    public static int valuePositive(){
        int value = Integer.MIN_VALUE;
        if(value<0)
            value = -value;

        System.out.println("value: " + value);

        assert (value<0) : "value is negative";

        return value;

    }

}
