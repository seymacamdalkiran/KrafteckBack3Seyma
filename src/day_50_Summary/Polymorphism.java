package day_50_Summary;

import java.util.Scanner;

public class Polymorphism {


    public static void main(String[] args) {
        int x=5; //32 bit
        double y=10; //64 bit
        //parent child
        x=(int)y;

        A obje=new B();
        obje.metotA();
        A obje2=new B();
        //   obje2.metotA();
        obje.a=20;

        B copyObje=(B)obje;

        System.out.println(copyObje.a);
        copyObje.metodB();
        // ArrayList<A> list=new ArrayList<>();


    }

}
