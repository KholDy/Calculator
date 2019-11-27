package xyz.kholdy;

public class Plus extends Operations {
    private double x1, x2;

    public Plus(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public String run() {
       double sum = x1 + x2;
       return ""+ sum;
    }
}
