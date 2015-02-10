package nao.cycledev.ocpjavase7.c11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ExceptionTest {

    public static void zipFiles(String input, String output){

        byte[] buffer = new byte[1024];
        try(ZipOutputStream zipFile = new ZipOutputStream(new FileOutputStream(output));
            FileInputStream file = new FileInputStream(input)){

            zipFile.putNextEntry(new ZipEntry(input));
            int lenRead = 0;

            while((lenRead = file.read(buffer))>0){
                zipFile.write(buffer, 0, lenRead);
            }
        }
        catch(Exception e){

            for(Throwable ex: e.getSuppressed())
                System.out.println(ex);
        }



    }
}
