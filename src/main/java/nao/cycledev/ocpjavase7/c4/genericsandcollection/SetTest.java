package nao.cycledev.ocpjavase7.c4.genericsandcollection;

import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static String removeWordDuplicate(String str){
        Set<String> words = new TreeSet<>();
        for(String item: str.split("\\W+")){
            words.add(item);
        }
        return words.toString();
    }
}
