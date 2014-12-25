package nao.cycledev.ocpjavase7;


import nao.cycledev.ocpjavase7.c3.oodprinciples.designpatterns.observer.Archive;
import nao.cycledev.ocpjavase7.c3.oodprinciples.designpatterns.observer.Canvas;
import nao.cycledev.ocpjavase7.c3.oodprinciples.designpatterns.observer.Circle;
import nao.cycledev.ocpjavase7.c3.oodprinciples.designpatterns.observer.Point;

public class MainApp {

    public static void main(String[] args) {

        Circle circle = new Circle(4, 8, 10);
        System.out.println(circle);
        circle.addObserver(new Canvas());
        circle.addObserver(new Archive());
        circle.setPoint(new Point(3, 3));
        circle.ssetRadious(13);

    }
}
