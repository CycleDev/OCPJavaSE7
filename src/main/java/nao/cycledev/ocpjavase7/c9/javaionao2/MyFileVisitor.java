package nao.cycledev.ocpjavase7.c9.javaionao2;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {

    private PathMatcher pathMatcher;

    public MyFileVisitor(String pattern) {
        pathMatcher = FileSystems.getDefault().getPathMatcher(pattern);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        find(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("----------------Directory: " + dir + "----------------------------------------");
        find(dir);
        return FileVisitResult.CONTINUE;
    }

    private void find(Path path){
        Path name = path.getFileName();

        if (pathMatcher.matches(name)){
            System.out.println("Matching file: " + name);
        }
    }


}
