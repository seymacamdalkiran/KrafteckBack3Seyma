package day_42_Final_And_Hidding;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

      //  C cObjesi=new C();
     //   cObjesi.cMetodu();

/* A B ve C metodlarında aynı field ya da metod varsa;
    C den çağırdığımız nesnede this kullanırsak c dekini
    super dersek B dekini çağırır. A dakini direk çağıramaz

    Eğer Bdekinin ismi farklı ise super deyince A dakine
    ulaştığını zannederiz. çünkü A daki field B ye arka planda
    ulaşmıştır. Aslında biz yine Bye ulaşırız
 */
/*
        C cObjesi_1=new C();
        System.out.println("-----------");
        C cObjesi_2=new C();
        System.out.println("-----------");
        C cObjesi_3=new C();
 */

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int kaymaMiktarı=2;

        ArrayList<Integer> kayanArr= arr;
        for (int i = 0; i < kaymaMiktarı; i++) {
            arr.add(arr.remove(0));
        }
        System.out.println("arr = "+arr);
        for (int i = 0; i <kaymaMiktarı ; i++) {
            kayanArr.add(0,kayanArr.remove(kayanArr.size()-1));
        }
        System.out.println("kayanArr = " + kayanArr);
    }



}
