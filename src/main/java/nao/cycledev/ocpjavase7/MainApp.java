package nao.cycledev.ocpjavase7;

import nao.cycledev.ocpjavase7.c3.oodprinciples.*;
import nao.cycledev.ocpjavase7.c3.oodprinciples.factory.ShapeFactory;
import nao.cycledev.ocpjavase7.c4.genericsandcollection.ArrayListTest;
import nao.cycledev.ocpjavase7.c7.stringprocessing.SplitStr;
import nao.cycledev.ocpjavase7.c7.stringprocessing.StringProcessing;
import nao.cycledev.ocpjavase7.c7.stringprocessing.StringUtility;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        /*List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(ShapeFactory.getShape("Circle"));
        shapes.add(ShapeFactory.getShape("Squre"));

        for(Shape shape : shapes){
            System.out.println(shape);
        }*/

        //ArrayListTest.printArrayList();

        StringProcessing.replacePhoneTest();
    }
}
