package xyz.kholdy;

public class Difference extends Operations {
    private double x1, x2;

    public Difference(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public String run() {
        double dif = x1 - x2;
        return "" + dif;
    }
}
