package nao.cycledev.ocpjavase7.c7.stringprocessing;

public class Filename {

    private String fullPath;
    private String pathSep;
    private String extSep;

    public Filename(String fullPath, String pathSep, String extSep) {
        this.fullPath = fullPath;
        this.pathSep = pathSep;
        this.extSep = extSep;
    }

    public String path() {
        int sep = fullPath.lastIndexOf(pathSep);
        return fullPath.substring(0, sep);
    }

    public String file() {
        int sep = fullPath.lastIndexOf(pathSep);
        int dot = fullPath.lastIndexOf(extSep);

        return fullPath.substring(sep + 1, dot);
    }

    public String extention() {
        int dot = fullPath.lastIndexOf(extSep);
        return fullPath.substring(dot + 1, fullPath.length());
    }

    public static void test() {
        final String FPATH = "/home/user/index.html";
        Filename myHomePage = new Filename(FPATH, "/", ".");
        System.out.println("Extension = " + myHomePage.extention());
        System.out.println("Filename = " + myHomePage.file());
        System.out.println("Path = " + myHomePage.path());
    }
}
