package nao.cycledev.ocpjavase7.c3.oodprinciples;

public class Point {
    private int xPos, yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "" + xPos + ", " + yPos;
    }
}
