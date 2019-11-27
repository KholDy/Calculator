package xyz.kholdy;

public class Multiplication extends Operations {
    private double x1, x2;

    public Multiplication(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public String run() {
        double mult = x1 * x2;
        return "" + mult;
    }
}
