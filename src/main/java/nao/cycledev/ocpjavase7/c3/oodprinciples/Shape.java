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



