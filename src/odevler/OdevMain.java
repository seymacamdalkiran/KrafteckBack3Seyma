package odevler;

public class OdevMain {
    public static void main(String[] args) {
   /*     Square kare1=new Square();
        kare1.sideLenght=3;
        System.out.println("kare1.calculatePrimeter() = " + kare1.calculatePrimeter());
        System.out.println("kare1.calculateArea() = " + kare1.calculateArea());
    */
        /*
        Pencil pen1=new Pencil();
        pen1.write("anlamak zorundasın hadi bi gayret et");
        System.out.println("pen1.str = " + pen1.str);

        pen1.delete("et");
        System.out.println("pen1.str = " + pen1.str);
         */
            /*
        Cat cat1=new Cat();
        cat1.isPet=true;
        cat1.isFat=false;
        cat1.eyeColor="blue";

        cat1.food();
        cat1.run();
        cat1.sleep();

        Cat cat2=new Cat("brown","??",true,false);
        cat2.sleep();

        System.out.println("cat1.eyeColor = " + cat1.eyeColor);
        System.out.println("cat2.eyeColor = " + cat2.eyeColor);

         */
        KraftBank nur=new KraftBank(19882023,"Nur Cam",true);
        System.out.println("nur.getCustomerToken() = " + nur.getCustomerToken());

        nur.addMoney(500);
        nur.addMoney(750);
        nur.addMoney(800);
        System.out.println("nur.customerAccount = " + nur.customerAccount);


    }


}
