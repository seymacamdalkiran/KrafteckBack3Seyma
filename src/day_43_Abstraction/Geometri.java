package day_43_Abstraction;

public abstract class Geometri {

    String nameOfShape;

    public Geometri(String nameOfShape){
        this.nameOfShape=nameOfShape;
    }

    abstract double calculateArea();


 //   abstract String info();

    String getNameOfShape(){
        return nameOfShape;
    }

    String info(){
        return "Name of shape is "+nameOfShape+" , area is "+calculateArea();

    }

}
class run{
    public static void main(String[] args) {
        Circle circle=new Circle("circle",3);
        System.out.println("circle.info() = " + circle.info());

  //      Polygon square=new Polygon("square",4);
  //      System.out.println("square.info() = " + square.info());

        Square aSquare=new Square("square",4);
        System.out.println("aSquare.info() = " + aSquare.info());
        aSquare.getInfo();

    }
}
