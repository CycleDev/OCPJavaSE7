package nao.cycledev.ocpjavase7.c8.javaiofundamentals;

import java.io.IOException;

public class IOTest {

    public static void testCopyPDFTime() throws IOException {
        long start = System.currentTimeMillis();
        FileOperations.copyPDFFile("E:\\temp\\source.pdf", "E:\\temp\\dest.pdf");
        long end = System.currentTimeMillis();
        System.out.println("Copy pdf file takes: " + (end-start));


        start = System.currentTimeMillis();
        FileOperations.copyPDFFileBuffered("E:\\temp\\source.pdf", "E:\\temp\\dest.pdf");
        end = System.currentTimeMillis();
        System.out.println("Copy pdf file buffered takes: " + (end-start));
    }
}
