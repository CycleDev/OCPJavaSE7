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

    public static void findZipCode(String str){
        Pattern pattern = Pattern.compile("\\b\\d{5}\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static void splitWords(String str){
        Pattern pattern = Pattern.compile("[A-Z]\\w+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.start() + " - " + matcher.end() + ": " + matcher.group());
        }
    }

    public static void splitUppercaseWords(String str){
        Pattern pattern = Pattern.compile("[A-Z]\\w{1}\\w+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static void replacePhoneNumber(String str){
        Pattern pattern = Pattern.compile("(\\b)(\\d{3})(\\d{7}(\\b))");
        Matcher matcher = pattern.matcher(str);
        String newStr = matcher.replaceAll("$1$2-$3$4");
        System.out.println(newStr);
    }

    public static void findStartStr(String str, String start){
        Pattern pattern = Pattern.compile("(?i)\\b"+start+"\\S*");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
