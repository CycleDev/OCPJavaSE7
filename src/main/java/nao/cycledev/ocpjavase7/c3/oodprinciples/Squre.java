package nao.cycledev.ocpjavase7.c3.oodprinciples;

public class Squre extends Shape implements Rollable{

    int w, h;

    public Squre(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public double area(){
        return w * h;
    }

    public void roll(int degree){
        System.out.println("Roll: " + degree);
    }

    @Override
    public String toString() {
        return "Squre{" +
                "w=" + w +
                ", h=" + h +
                '}';
    }
}
