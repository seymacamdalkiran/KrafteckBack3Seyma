package day_41_inheritanceAndAccesModifier;

import day_41_inheritanceAndAccesModifier.ornek_1.Automobile;
import day_41_inheritanceAndAccesModifier.ornek_1.Motorcycle;
import day_41_inheritanceAndAccesModifier.ornek_1.Vehicle;

public class Main {
    public static void main(String[] args) {

    //    A a_objesi=new A();
    //    a_objesi.metotA();  //parents class dan child metotları görünmez

    //    B b_objesi=new B(); //child class parent clasın izin
    //    b_objesi.metotA();  //verdiği ölçüde metotlarını görür.
    //    b_objesi.metotB();  //private yazanları göremez

        // arka planda child classda oluşturulan boş constructur da
        // parent clası çağırır.

    //    B bobjesi=new B("A harfi","B harfi",89);

    //    ParentClass.x=15;
    //    System.out.println(ChildClass.x);

    //    ChildClass childClass=new ChildClass();

    //    Vehicle vehicle_1=new Vehicle("Honda");
    //    Motorcycle motor=new Motorcycle("Mercedes");
        Automobile car=new Automobile("Nissan");
        car.start();
    //    car.stop();

     //   motor.changeCcHp(400);
     //   motor.start();



    }
}
