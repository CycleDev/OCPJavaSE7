package nao.cycledev.ocpjavase7.c2.advancedclassdesign;

abstract class Shape {

    abstract public double area();

}

public class Circle extends Shape {

    public double area(){
        return 10;
    }

}
