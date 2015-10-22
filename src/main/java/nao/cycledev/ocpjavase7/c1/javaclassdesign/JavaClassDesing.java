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

    public void circleEqual() {
        Object circle1 = new Circle(10, 20);
        Object circle2 = new Circle(100, 200);
        Object circle3 = new Circle(10, 20);

        System.out.println("Equal: " + circle1.equals(circle2));
        System.out.println("Equal: " + circle1.equals(circle3));
    }

    public void circle3D() {
        Circle3D circle3d = new Circle3D(10, 20, 30);

        System.out.println("Circle3D: " + circle3d.toString());
    }

}

class Shape{

    protected void draw(){

    }

    protected void fillColor() {

    }
}

class Circle extends Shape{

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
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object object){
        if (object == null)
            return false;

        if (object instanceof Circle) {
            Circle circle = (Circle)object;
            if ((circle.xPos == xPos) && (circle.yPos == yPos))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "center: (" + xPos + ", " + yPos + "); radius: " + radius;
    }
}

class Circle3D extends  Circle {

    private int zPos;

    public Circle3D(int xPos, int yPos, int zPos) {
        super(xPos, yPos);
        this.zPos = zPos;
    }

    @Override
    public String toString() {
        return super.toString() + " , " + zPos;
    }
}

