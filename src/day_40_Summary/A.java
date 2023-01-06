package day_40_Summary;

public class A {

    public int x;
    public static int count=0;

    {
        System.out.println("instance block çalıştı");
        count++;
    }

    static{
        System.out.println("static block çalıştı");
    }
    public A(){
        System.out.println("boş constructor çalıştı");
    }
    public A(int x){
        this.x=x;
    }
    public static void staticMethod(){
        System.out.println("static method çalıştı");
    }


}
