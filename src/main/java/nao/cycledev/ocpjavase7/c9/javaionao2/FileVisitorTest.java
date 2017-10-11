package nao.cycledev.ocpjavase7.c9.javaionao2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorTest {

    public static void test() throws IOException {

        Path path = Paths.get("E:\\HotSchedules");
        Files.walkFileTree(path, new ListFileNames());
    }
}

class ListFileNames extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {


        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.{java,txt}");

        if (matcher.matches(file.getFileName())) {
            System.out.println("    " + file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println(dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}
