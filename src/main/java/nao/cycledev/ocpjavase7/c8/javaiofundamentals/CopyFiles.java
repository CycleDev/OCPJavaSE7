package nao.cycledev.ocpjavase7.c8.javaiofundamentals;

import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CopyFiles {

    public static void copyFiles(String targetFile, String destFile){
        try (BufferedReader input = new BufferedReader(new FileReader(targetFile));
             BufferedWriter output = new BufferedWriter(new FileWriter(destFile)))
        {
            int ch = 0;
            while ((ch = input.read()) != -1){
                output.write((char)ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void tokenizeStr(String fileName){
        try (Scanner scanner = new Scanner(new FileReader(fileName))){

            scanner.useDelimiter("\\W");
            Set<String> words = new TreeSet<>();
            while (scanner.hasNext()){
                words.add(scanner.next().toLowerCase());
            }

            for (String word: words){
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
