package nao.cycledev.ocpjavase7.c9.javaionao2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyCopyFileVisitor extends SimpleFileVisitor<Path> {

    private Path source, destination;

    public MyCopyFileVisitor(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newPath = destination.resolve(source.relativize(dir));

        Files.copy(dir, newPath, StandardCopyOption.REPLACE_EXISTING);

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newPath = destination.resolve(source.relativize(file));

        Files.copy(file, newPath, StandardCopyOption.REPLACE_EXISTING);

        return FileVisitResult.CONTINUE;
    }
}
