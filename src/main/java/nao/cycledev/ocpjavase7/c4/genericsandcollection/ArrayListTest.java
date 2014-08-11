package nao.cycledev.ocpjavase7.c4.genericsandcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public void printArrayList(){
        ArrayList<String> strings = new ArrayList<>();
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
}
