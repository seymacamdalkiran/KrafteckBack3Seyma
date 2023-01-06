package day_22_Class_and_Object;

public class MyFirstClass {
    public static void main(String[] args) {

      //  Person kullanici_1=new Person();
      //  kullanici_1.play();
/*
        Car car_1=new Car();
        Car car_2=new Car();
        Car car_3=new Car();
        car_1.brand="Honda";
        car_1.color="Sarı";
        car_1.model="CRV";
        car_1.speed=360;

        car_2.brand="Mercedes";
        car_2.color="Siyah";
        car_2.model="c200d";
        car_2.speed=400;

        car_3.brand="Tofas";
        car_3.color="Beyaz";
        car_3.model="Sahin";
        car_3.speed=180;

        System.out.println(car_1.speed);
        Daire daire_1=new Daire();
        System.out.println(daire_1.pi);


        Person person=new Person();
        System.out.println(person.age);
        System.out.println(person.name);
        System.out.println(person.gender);
        System.out.println(person.isLisans);
        System.out.println(person.bankAccount);

        Daire daire_1=new Daire();
        daire_1.yariCap=5;
        System.out.println(daire_1.alanHesapla());
        System.out.println(daire_1.cevreHesapla());
       // System.out.println(Daire.alanHesapla(5));
        Daire daire_2=new Daire();
        daire_2.yariCap=3;
        System.out.println(daire_2.cevreHesapla()*15);
        System.out.println(Daire.cevreHesapla(5));
 */
        System.out.println(Daire.alanHesapla(10));
        Daire da=new Daire();
        da.yariCap=10;
        System.out.println(da.cevreHesapla());


    }
}
