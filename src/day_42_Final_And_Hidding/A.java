package day_42_Final_And_Hidding;

public class A {

    int x=10;
    static {
        System.out.println("StaticA metot çalıştı");
    }
    {
        System.out.println("İnstanceAA metot çalıştı");
    }
A(){
    System.out.println("ContructurAAA çalıştı");
}

}
