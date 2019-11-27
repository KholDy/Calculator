package xyz.kholdy;

public class Division extends Operations {
    private double x1, x2;

    public Division(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public String run() {
        double div = x1 / x2;
        return "" + div;
    }
}
