package nao.cycledev.ocpjavase7.c7.stringprocessing;

public class SplitStr {

    public static void splitString(String str, String delimiter){
        String[] words = str.split(delimiter);
        for (String word:words){
            System.out.println(word);
        }
    }
}
