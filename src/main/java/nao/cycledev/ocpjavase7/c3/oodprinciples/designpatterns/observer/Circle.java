package nao.cycledev.ocpjavase7.c3.oodprinciples.designpatterns.observer;


import java.util.Observable;

public class Circle extends Observable {

    private Point center;
    private int radious;

    public Circle(int x, int y, int radious) {
        this.center = new Point(x, y);
        this.radious = radious;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radious=" + radious +
                '}';
    }

    public void setPoint(Point point){
        center = point;
        setChanged();
        notifyObservers();
    }

    public void ssetRadious(int radious){
        this.radious = radious;
        setChanged();
        notifyObservers();
    }

}
