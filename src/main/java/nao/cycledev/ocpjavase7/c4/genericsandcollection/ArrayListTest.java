package nao.cycledev.ocpjavase7.c4.genericsandcollection;

import java.util.*;

public class ArrayListTest {

    public static void printArrayList(){
        List<String> strings = new ArrayList<>();
        strings.add("111");
        strings.add("222");
        strings.add("333");
        for (String item: strings) {
            System.out.println(item);
        }

        System.out.println("-----------------------------------------------");
        for (Iterator<String> items = strings.iterator(); items.hasNext();){
            String item = items.next();
            System.out.println(item);
        }
    }

    public static void queueTest() {
        List<String> queue = new ArrayList<>();
        queue.add("111");
        queue.add("222");
        queue.add("333");
        queue.add("444");
        queue.add(null);

        System.out.println(": " + queue);

    }
}
