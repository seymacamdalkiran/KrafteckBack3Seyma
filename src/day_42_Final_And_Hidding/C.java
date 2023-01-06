package day_42_Final_And_Hidding;

public class C extends B {

    int x=30;
    C(){
        System.out.println("ContructurCCC çalıştı");

    }
    {
        System.out.println("İnstanceCC metot çalıştı");
    }

    public void cMetodu(){
        A a=new A();
        System.out.println(a.x);
    }


}
