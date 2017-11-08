package nao.cycledev.ocpjavase7.c7.stringprocessing;

import java.util.StringTokenizer;

public class StringFormatting {

    private static double doubleValue = 123.45618;

    public static void testPrintf(){
        System.out.printf("Value: " + doubleValue + "; Result double: %010.2f", doubleValue);

    }

    public static void testStringTokenizer(){
        StringTokenizer st = new StringTokenizer("this is a test", "is");
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
