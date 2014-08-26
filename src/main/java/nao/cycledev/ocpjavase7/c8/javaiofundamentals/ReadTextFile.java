package nao.cycledev.ocpjavase7.c8.javaiofundamentals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

    public static void readTextFile(String fileName){
        try (FileReader file = new FileReader(fileName)){
            int c = 0;
            while((c = file.read()) != -1){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
