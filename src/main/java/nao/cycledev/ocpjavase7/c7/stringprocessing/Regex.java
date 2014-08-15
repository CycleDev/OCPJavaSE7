package nao.cycledev.ocpjavase7.c7.stringprocessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void findEmail(String str){

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
