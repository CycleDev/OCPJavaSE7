package nao.cycledev.ocpjavase7.c3.oodprinciples.factory;

import nao.cycledev.ocpjavase7.c3.oodprinciples.*;

public class ShapeFactory {

    public static Shape getShape(String sourceType){
        switch (sourceType){
            case "Circle": return new Circle(4, 5, 8);
            case "Squre": return new Squre(6, 8);
            default: return null;
        }


    }

}
