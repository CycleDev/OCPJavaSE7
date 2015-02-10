package nao.cycledev.ocpjavase7.c9.javaionao2;

import java.io.IOException;
import java.nio.file.*;

public class PathTest {

    public static void GetPathInfo(String fileName){

        Path path = Paths.get(fileName);

        System.out.println("File system name: " + path.getFileSystem());
        System.out.println("File name: " + path.getFileName());
        System.out.println("File root: " + path.getRoot());
        System.out.println("File parent: " + path.getParent());

        for (Path element:path){
            System.out.println("\telement: " + element);
        }
    }

    public static void fileType(String filePath){

        Path path = Paths.get(filePath);
        System.out.println("Readible: " + Files.isReadable(path) + ", Writable: " + Files.isWritable(path) +
            ", Executable: "+ Files.isExecutable(path));
    }

    public static void fileIsFolder(String file){
        Path path = Paths.get(file);
        if (Files.exists(path)){
            if(Files.isDirectory(path)){
                System.out.println("File is directory");
            }
            else
            {
                System.out.println("File is file");
            }
        }
    }

    public static void fileInfo(String file){
        Path path = Paths.get(file);
        try {
            Object createTime = Files.getAttribute(path, "creationTime");
            Object lastModifiedTime = Files.getAttribute(path, "lastModifiedTime");
            Object size = Files.getAttribute(path, "size", LinkOption.NOFOLLOW_LINKS);
            System.out.println("createTime: " + createTime + "\nlastModifiedTime: " + lastModifiedTime + "\nsize: " + size);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copy(String source, String dest){
        Path pathSource = Paths.get(source);
        Path pathDesc = Paths.get(dest);

        try {
            Files.copy(pathSource, pathDesc, StandardCopyOption.REPLACE_EXISTING);
            System.out.printf("File %s is copied.", pathSource.getFileName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void delete(String source){
        Path pathSource = Paths.get(source);

        try {
            Files.deleteIfExists(pathSource);
            System.out.printf("File %s is deleted.", pathSource.getFileName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void walkFiles(String str, String pattern){

        Path path = Paths.get(str);

        try {
            Files.walkFileTree(path, new MyFileVisitor(pattern));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void copyFiles(String source, String dest){

        Path sourcePath = Paths.get(source);
        Path destPath = Paths.get(dest);

        try {
            Files.walkFileTree(sourcePath, new MyCopyFileVisitor(sourcePath, destPath));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
