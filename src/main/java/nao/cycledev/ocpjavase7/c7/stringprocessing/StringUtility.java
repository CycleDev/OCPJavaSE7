package nao.cycledev.ocpjavase7.c7.stringprocessing;

public class StringUtility {

    public static void indexOfTest(String str, String substr){

        int index = 0;
        while(str.indexOf(substr, index) >- 1){
            index = str.indexOf(substr, index);
            System.out.println("Index position: " + index);
            ++index;
        }
    }

    public static void lastIndexOf(String str, String substr){

        System.out.println("Last index: " + str.lastIndexOf(substr, 18));
    }

    public static void startWithTest(String str, String substr){

        System.out.println("Start with: " + str.startsWith(substr, 7));
    }

    public static void matchStr(String str, String substr){

        int index = str.indexOf('\n');
        boolean match = false;
        if (index > -1){
            match = str.regionMatches(index + 1, substr, 0, substr.length());
        }

        System.out.println("Position: " + index + "; Match: " + match);

    }

}
