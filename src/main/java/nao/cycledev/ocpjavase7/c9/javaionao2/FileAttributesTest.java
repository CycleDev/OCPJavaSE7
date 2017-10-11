package nao.cycledev.ocpjavase7.c9.javaionao2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class FileAttributesTest {

    private static final String fileName = "E:\\HotSchedules\\Tasks\\Logbook_Read_Write\\R_W.txt";

    public static void getFileAttributes() throws IOException {

        Path path = Paths.get(fileName);

        DosFileAttributes dosAttrs = Files.readAttributes(path, DosFileAttributes.class);

        System.out.println("isReadOnly: " + dosAttrs.isReadOnly());
        System.out.println("isArchive: " + dosAttrs.isArchive());
        System.out.println("isSystem: " + dosAttrs.isSystem());
        System.out.println("creationTime: " + dosAttrs.creationTime());
        System.out.println("lastModifiedTime: " + dosAttrs.lastModifiedTime());
    }

    public static void setFileAttributes() throws IOException {
        Path path = Paths.get(fileName);

        DosFileAttributeView dosView = Files.getFileAttributeView(path, DosFileAttributeView.class);

        dosView.setReadOnly(false);
    }
}
