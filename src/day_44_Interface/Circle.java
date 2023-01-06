package day_44_Interface;

public class Circle extends Square implements Geometri {
    public Circle(double a) {
        super(a);
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(a,2);
    }

    @Override
    public double getPrimeter(double... sides) {
        return 2*Math.PI*sides[0];
    }
}
