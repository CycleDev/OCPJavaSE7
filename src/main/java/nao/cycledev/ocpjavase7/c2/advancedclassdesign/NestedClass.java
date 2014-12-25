package nao.cycledev.ocpjavase7.c2.advancedclassdesign;

public class NestedClass {

    public void display(){
        Circle1 circle1 = new Circle1(10, 10, 30);
        System.out.println(circle1);
    }

}

class Circle1{
    Point center;
    int radious;

    Circle1(int x, int y, int radious) {
        this.center = this.new Point(x, y);
        this.radious = radious;
    }

    @Override
    public String toString(){
        return "Center: " + center + " radious: " + radious;
    }

    class Point{
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString(){
            return "x: " + x + " y: " + y;
        }
    }
}
