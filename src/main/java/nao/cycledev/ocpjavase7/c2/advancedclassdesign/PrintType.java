package nao.cycledev.ocpjavase7.c2.advancedclassdesign;

public enum PrintType {

    LAZAR(5), WHITEBLACK(10), TESTTYPE(20);

    private int printType;

    private PrintType(int printType) {
        this.printType = printType;
    }

    public int getPrintType(){
        return printType;
    }
}
