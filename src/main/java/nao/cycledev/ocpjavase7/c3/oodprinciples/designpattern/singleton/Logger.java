package nao.cycledev.ocpjavase7.c3.oodprinciples.designpattern.singleton;

public class Logger {

    private static Logger logger;

    private Logger() {
    }

    private static class LoggerHolder{
        public static Logger logger = new Logger();
    }

    public static Logger getLogger(){
        return LoggerHolder.logger;
    }

    public void logError(String error){
        System.err.println("Error: " + error);
    }

    public void logInfo(String info){
        System.out.println("Info: " + info);
    }
}
