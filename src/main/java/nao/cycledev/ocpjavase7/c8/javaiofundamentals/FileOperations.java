package nao.cycledev.ocpjavase7.c8.javaiofundamentals;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FileOperations {

    public static void readTextFile(String fileName){
        try (BufferedReader file = new BufferedReader(new FileReader(fileName))){
            int c;
            while((c = file.read()) != -1){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFiles(String targetFile, String destFile){
        try (BufferedReader input = new BufferedReader(new FileReader(targetFile));
             BufferedWriter output = new BufferedWriter(new FileWriter(destFile)))
        {
            int ch;
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

            scanner.useDelimiter("\\W+");
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

    public static long countFilesInDirectory(String directory) {
        return countFilesInDirectory(new File(directory));

    }

    public static long countFilesInDirectory(File directory) {
        if (!directory.isDirectory() || directory.listFiles() == null) {
            return 0;
        }

        return Arrays.stream(directory.listFiles())
                .filter(File::isFile)
                .count();
    }

    public static void createDirectory(String path) {
         File file = new File(path);
        file.mkdirs();
    }

    public static void createFile(String path) throws IOException {
         File file = new File(path);
        file.createNewFile();
    }

    public static void copyPDFFile(String source, String dest) throws IOException {

        try (FileInputStream is = new FileInputStream(source);
             FileOutputStream os = new FileOutputStream(dest)) {

            int data;

            while ( (data = is.read()) != -1 ) {
                os.write(data);
            }
        }
    }

    public static void copyPDFFileBuffered(String source, String dest) throws IOException {

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream(dest))) {

            int data;

            while ( (data = bis.read()) != -1 ) {
                bos.write(data);
            }
        }
    }

}
