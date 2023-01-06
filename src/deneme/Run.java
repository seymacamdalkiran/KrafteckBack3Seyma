package deneme;

import java.sql.SQLOutput;

public class Run {
    public static void main(String[] args) {
        System.out.println("----KARE-----");
        Kare kare1=new Kare(5);

        System.out.println("---DİKDÖRTGEN---");
        Dikdörtgen dikdörtgen1=new Dikdörtgen(3,5);
        //Dikdörtgen abstrack class olursa nesne üretilemez.

        System.out.println("----DAİRE---");
        Cember cember1=new Cember(5);

    }
}
