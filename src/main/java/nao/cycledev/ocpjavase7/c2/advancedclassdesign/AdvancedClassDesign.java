package nao.cycledev.ocpjavase7.c2.advancedclassdesign;


public class AdvancedClassDesign {

    public void abstractClassTest() {

        Shape circle = new Circle();

        System.out.println(circle.area());

    }

    class PrinterTest{
        PrintType printType;

        PrinterTest(PrintType printType) {
            this.printType = printType;
        }

        public void display() {
            switch (printType) {
                case LAZAR:
                    System.out.println("Printer lazer");
                    break;
                case WHITEBLACK:
                    System.out.println("Printer whiteblack");
                    break;
                case TESTTYPE:
                    System.out.println("Printer testtype");
                    break;
            }
            System.out.println(printType.getPrintType());
        }
    }

    public void enumTest() {

        PrinterTest printerTest1 = new PrinterTest(PrintType.WHITEBLACK);
        printerTest1.display();
        PrinterTest printerTest2 = new PrinterTest(PrintType.LAZAR);
        printerTest2.display();
        PrinterTest printerTest3 = new PrinterTest(PrintType.TESTTYPE);
        printerTest3.display();
    }
}
