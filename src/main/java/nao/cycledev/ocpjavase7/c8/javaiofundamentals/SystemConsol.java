package nao.cycledev.ocpjavase7.c8.javaiofundamentals;

import java.io.Console;

public class SystemConsol {

    public static void readLineFromConsole(){

        Console console = System.console();
        if (console == null){
            System.out.println("Console doesn't exist.");
        } else {
            System.out.println(console.readLine());
        }
    }

    public static void printString(){

        String str = "å, ä, and ö";
        System.out.println(str);
        System.out.printf(str);

    }

}
