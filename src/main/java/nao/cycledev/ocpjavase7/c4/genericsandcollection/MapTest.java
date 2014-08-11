package nao.cycledev.ocpjavase7.c4.genericsandcollection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public void spellCheckers(String str){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("tri", "tree");
        dictionary.put("calendor", "calendar");
        dictionary.put("finee", "fine");
        dictionary.put("tooo", "too");

        System.out.println("Phrase: " + str);
        for (String item:str.split("\\W+")){
            if (dictionary.containsKey(item)){
                System.out.println("For word: " + item + " correct is " + dictionary.get(item));
            }
        }
    }
}
