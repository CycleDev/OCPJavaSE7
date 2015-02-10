package nao.cycledev.ocpjavase7.c9.javaionao2;

import java.io.IOException;
import java.nio.file.*;

public class FileChangesTracking {

    public void trackFile(String str){
        Path path = Paths.get(str);

        WatchService watchService = null;
        try {
            watchService = path.getFileSystem().newWatchService();

            path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(;;){
            WatchKey key = null;

            try {
                key = watchService.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for(WatchEvent<?> event:key.pollEvents()){
                switch (event.kind().name()){
                    case "OVERFLOW":
                        System.out.println("We lost some events!");
                        break;
                    case "ENTRY_MODIFY":
                        System.out.println("File " + event.context() + " is changed.");
                        break;
                }
            }
            key.reset();
        }
    }

}
