package nao.cycledev.ocpjavase7.c3.oodprinciples;

public abstract class Shape {
    public abstract double area();

    private Shape parentShape;

    public Shape getParentShape() {
        return parentShape;
    }

    public void setParentShape(Shape parentShape) {
        this.parentShape = parentShape;
    }
}

class Circle extends Shape implements Rotable{
    public double area(){
        return 0;
    }

    public void rotate(int degree){
        System.out.println("Rotate: " + degree);
    }
}

class Squre extends Shape implements Rollable{

    public double area(){
        return 0;
    }

    public void roll(int degree){
        System.out.println("Roll: " + degree);
    }
}

