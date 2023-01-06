package day_44_Interface;

public interface Geometri {

    double getArea();

    default double getPrimeter(double... sides){
        int sum=0;
        for (int i = 0; i < sides.length; i++) {
            sum+=sides[i];
        }return sum;
    }

}
class Square implements Geometri{
    double a;

    public Square(double a){
        this.a=a;
        System.out.println("Alan = " + getArea());
        System.out.println("Cevre = " + getPrimeter(this.a, this.a, this.a, this.a));
    }

    @Override
    public double getArea() {
        return Math.pow(a,2);
    }

}
