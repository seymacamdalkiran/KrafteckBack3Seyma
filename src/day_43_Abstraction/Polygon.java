package day_43_Abstraction;

public abstract class Polygon extends Geometri{

    double side;

    public Polygon(String nameOfShape,double side) {
        super(nameOfShape);
        this.side=side;
    }

    @Override
    double calculateArea() {
        return Math.pow(side, 2);
    }
    abstract void getInfo();

 //   @Override
//    String info() {
  //          return "Name of shape is "+nameOfShape+" , area is "+calculateArea();
    //    }

}
class Square extends Polygon{
    public Square(String nameOfShape, double side) {
        super(nameOfShape, side);
    }

    @Override
    void getInfo() {
        System.out.println(info());
    }

}
