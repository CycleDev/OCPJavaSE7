package nao.cycledev.ocpjavase7.c4.genericsandcollection;

import java.util.List;

public class UtilitiesTest {

    public static <T> void fill(List<T> list, T val ){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, val);
        }
    }

    public static void printList(List<? extends Number> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
    }
}
