package nao.cycledev.ocpjavase7.c1.javaclassdesign;

public class JavaClassDesing {

    public static Circle displayCircle1() {
        return new Circle();
    }

    public static Circle displayCircle2() {
        return new Circle(2, 2);
    }

    public static Circle displayCircle3() {
        return new Circle(3, 3, 3);
    }

}

class Shape{

    protected void draw(){

    }

    protected void fillColor() {

    }
}

class Circle extends Shape {

    int xPos, yPos, radius;

    Circle() {
        xPos = 1;
        yPos = 1;
        radius = 1;
    }

    Circle(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    Circle(int xPos, int yPos, int radius) {
        xPos = xPos;
        yPos = yPos;
        radius = radius;
    }



    public String toString() {
        return "center: (" + xPos + ", " + yPos + "); radius: " + radius;
    }
}

