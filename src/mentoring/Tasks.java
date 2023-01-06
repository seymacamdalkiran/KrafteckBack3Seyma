package mentoring;
import java.util.*;
public class Tasks {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        //kullanıcının isim ve soyismini konsola yazdıran kodu yazınız
        /*

        System.out.print("isminiz = ");
        String isim=scan.nextLine();

        System.out.print("Soyisminiz = ");
        String soyIsim=scan.nextLine();

        System.out.println("Adınız Soyadınız = "+isim+"  "+soyIsim);


        System.out.print("isminizi yazıp \"enter\" a basınız. ");
        String isim=scan.nextLine();

        System.out.print("Soyisminizi yazıp \"enter\" a basınız. ");
        String soyIsim=scan.nextLine();

        System.out.println("\""+isim+"  "+soyIsim+ "\""+" kursa kaydınız alınmıştır.");

        //Kullanıcının isminin ilk harfini konsola yazdıran kodu yazdırin
        //output: isminiz merve
        //isminizin ilk harfi m

        System.out.print("isminizi yazın. ");
        String name= scan.nextLine();
        char ilkHarf=name.charAt(0);
        System.out.println("İsminiz  "+name+"  İsminizin ilk harfi = "+ilkHarf);


         */

        /*2 tane variable tan mlay n z : num1=1, num2=1
//      Ard ndan "increment"   kullanarak  arp m tablosunu yazd r n
//      Note: ++ kulland   n z zaman +1 olarak art   yapar
//      A a  daki  arp m tablosunu yazd r:
//      =========
Scanner scan = new Scanner (System.in);

        System.out.print("Lütfen 5 basamaklı bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int ilk2 = sayi/1000;
        int son2 = sayi%100;
        int ilk2toplam = (ilk2/10) + (ilk2%10);
        System.out.println("ilk2toplam = " + ilk2toplam);
        System.out.println("ilk2 = " + ilk2);
        System.out.println("son2 = " + son2);
        int son2toplam = (son2/10) + (son2%10);
        System.out.println("son2toplam = " + son2toplam);

        int num1=1;
        int num2=1;
        System.out.println(num1 + "x" + num2 + " = " + num1*num2);
        System.out.println(num1 + "x" + ++num2 + " = " + num1*num2);
        System.out.println(num1 + "x" + ++num2 + " = " + num1*num2);
        System.out.println(num1 + "x" + ++num2 + " = " + num1*num2);
        System.out.println(num1 + "x" + ++num2 + " = " + num1*num2);
        System.out.println(num1 + "x" + ++num2 + " = " + num1*num2);
        System.out.println(num1 + "x" + ++num2 + " = " + num1*num2);
        System.out.println(num1 + "x" + ++num2 + " = " + num1*num2);
        System.out.println(num1 + "x" + ++num2 + " = " + num1*num2);
        System.out.println(num1 + "x" + ++num2 + " = " + num1*num2);


        System.out.println("lütfen bir sayı yazın = ");
        int s1=scan.nextInt();
        System.out.println("lütfen bir sayı yazın = ");
        int s2=scan.nextInt();

        System.out.println("Sayıların toplamı =" + (s1+s2));
        System.out.println("Sayıların farkı = "+ (s1-s2));
        System.out.println("Sayıların çaroımı = "+(s1*s2));
        System.out.println("sayıların bölümü = "+ (s1/s2));

        * primitive data types boolean, char,byte,short,integer,long, float, double
		 * byte, short, integer,long, double, float veri tiplerinin max ve min de erlerini yazdıralım.
         */

        byte m1= Byte.MIN_VALUE;
        short m2= Short.MIN_VALUE;
        int m3= Integer.MIN_VALUE;
        long m4= Long.MIN_VALUE;
        float m5= Float.MIN_VALUE;
        double m6=Double.MIN_VALUE;
        boolean m7= Boolean.FALSE;
        char m8=Character.MAX_VALUE;
        System.out.println("m1 = "+m1);
        System.out.println("m2 = "+m2);
        System.out.println("m3 = "+m3);
        System.out.println("m4 = "+m4);
        System.out.println("m5 = "+m5);
        System.out.println("m6 = "+m6);
        System.out.println("m7 = "+m7);
        System.out.println("m8 = "+m8);





    }
}
