package day_41_inheritanceAndAccesModifier.ornek_1;

public class Motorcycle extends Vehicle {

    int cc;

//  Bir field yada metot static olursa clasa aittir objeye değil.
// yani clası direk çağırabiliriz
// yani burda yapılan değişiklikler projenin tamamında değişir
    //Mesela model static olmamalı çünkü arabada başka motorda başka.
    //ama kredi faizi static olabilir.

    public void changeCcHp(int cc){
        this.cc=cc;
        System.out.println(getModel());
}

public Motorcycle(String model){
        super(model);
}
    public void start(){
    System.out.println("Otomobil çalıştı");
}   //overriding yaptı.


}
