package nao.cycledev.ocpjavase7.c7.stringprocessing;

public class StringProcessing {

    public static final String testStr = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone, " +
            "Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, " +
            "Big bank post office, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.net.";

    public static void SplitTest(){
        SplitStr.splitString("Never lend books-nobody ever returns them!", " ");
    }

    public static void findEmails(){
        Regex.findEmail(testStr);
    }

    public static void findZipCode(){
        Regex.findZipCode(testStr);
    }

    public static void splitWords(){
        Regex.splitWords(testStr);
    }

    public static void replacePhoneTest(){
        Regex.replacePhoneNumber(testStr);
    }

    public static void findStartStr(){
        Regex.findStartStr(testStr, "d");
    }
}
