package nao.cycledev.ocpjavase7.c3.oodprinciples;


public class Circle extends Shape implements Rotable{
    private Point point;
    private int r;

    public Circle(int x, int y, int r) {
        this.point = new Point(x, y);
        this.r = r;
    }

    public double area(){
        return Math.PI * r * r;
    }

    public void rotate(int degree){
        System.out.println("Rotate: " + degree);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", r=" + r +
                '}';
    }
}