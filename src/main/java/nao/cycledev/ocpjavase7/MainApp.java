package nao.cycledev.ocpjavase7;

import nao.cycledev.ocpjavase7.c9.javaionao2.FileChangesTracking;
import nao.cycledev.ocpjavase7.c9.javaionao2.PathTest;

public class MainApp {

    public static void main(String[] args) {

        String strFile = "E:\\Temp";
        String strdest = "E:\\testdoc";

        FileChangesTracking tracking = new FileChangesTracking();
        tracking.trackFile(strFile);

    }
}
