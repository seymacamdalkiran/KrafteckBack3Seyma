package day_38_Static.staticBlock;

import static java.lang.Math.*;
import static day_38_Static.staticBlock.StaticInit.*;

public class StaticImport {
    public static void main(String[] args) {
        System.out.println("Math.sqrt(16) = " + Math.sqrt(16));
        System.out.println((int)Math.PI);

        Math.sqrt(64);      //Statik olduğunu klasın ismiyle çağırabildiğimiz için anlıyoruz
        double pi=Math.PI;

        sqrt(9);        //import yapmazsak hata veriyor.

        System.out.println(PI+4);


        counter++;  //Static Init clasından bir değişken

    }
}
