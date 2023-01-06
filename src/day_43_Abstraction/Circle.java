package day_43_Abstraction;

public class Circle extends Geometri{

    double radius;

    public Circle(String nameOfShape, double radius) {
        super(nameOfShape);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    //  info metodu polygon ve circle class ları için genel bir işlemi yaptığından
    //Parent class ta genel bir metot olarak yeniden tasarladık

  //  @Override
  //  String info() {
   //    return "Name of shape is "+nameOfShape+" , area is "+calculateArea();
    //}
}
