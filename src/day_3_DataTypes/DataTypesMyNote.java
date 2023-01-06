package day_3_DataTypes;

import java.sql.SQLOutput;

public class DataTypesMyNote {
    /*
    buraya yazdığım kısımlar koddan sayılmıyor.
    burda kurstan nasıl daha fazla verim alınır o anlatıldı
    / ve * yanyana yazılırsa aradaki yazıların hiçbiri koddan sayılmıyor
    // yapılırsa sadece bu satır koddan sayılmıyor
     */

    public static void main(String [] args) {
        System.out.println("hello");
        //main methot java programlarını yürütmenin başlangıç noktası
        // class ların en az birinde main methot olmak zorunda yoksa java jvm yi execute etmez

        //declaration yani bildirim
        int number1;
        String sayMyName;

        //initialize or assigning

        number1 = 10;
        sayMyName = "Adnan ";

        //Declaration and assigning
        int number2 = 20;
        String sayMySurname = "Buyuk";

        int i1, i2;
        int i3 = 40, i4 = 50;
        int i5, i6 = 60;

        System.out.println(i3);

        /* System.out.println in içine tırnak işareti yaparsan içinde yazanı olduğu gibi
        execute eder, tırnak içinde yazmazsan değişiklik anlamına gelir  */

        System.out.println(number1);
        System.out.println(number1 + number2);
        System.out.println(sayMyName);
        System.out.println(sayMyName + sayMySurname);

        // hepsini seçip kapatmayı MUTLAKA SOR. normalde ctrl ve numlock ın
        // üzerindeki slaşa basılacak ama bende o tuş yok.

        System.out.println(sayMyName + "=" + number2);

        //DataTypes
        //primitive types        memory used        range of values
        byte b;//                  1 byte           -128 to 127
        short s;//                 2 bytes          -32768 to 32767
        int i;//                   4 bytes          -2147....
        long l;//                  8 bytes          ............ to ....

        float f;//                 4 bytes
        double d;//                8 bytes

        char c;// karakter demek yani string yani harf   2 bytes
        boolean bl;//  sadece true false değerini alır   1 bit

        // NEDEN BYTE taki B BEYAZ DEĞİL DE GRİ

        b = 127;
        // longa sayı ataması yaparken int diye kabul ettiği için int değerlerinden daha büyük
        // bir değer verilirse sonuna l harfi koyulmalı, yoksa hata verir.
        System.out.println(b);
        // long intten büyük bir değer aldığında sonuna l koyulması gerekir.
        l = 122324569827L;
        System.out.println(l);
        s=-3234;
        i=537665;
        System.out.println("s= "+ s);
        System.out.println("i="+i);

        System.out.println("-----------");
        // floating point number yani ondalık sayılar default olarak double dır.
        //float and double
        //expressing currency yani banka hesaplarının gösterimi gibi
        //float 4 bytes double 8 bytes
        //float için f koymak zorundasın ama double için d koyma zorunluluğu yok

        f=1.12341239F;
        d=1.12345671234567;
        System.out.println("f ="+f);
        System.out.println("d="    + d);

        System.out.println("-----------");

        // char için yani harf ya da karakter için tek tırnakta atama yapabiliyoruz.
        //https://unicode-table.com/en/#basic-latin
        char ch= 'A';
        System.out.println("ch"); //a

        int ascii=ch;
        System.out.println("ascii =" + ascii);

        // int x = 65

        char chA = 65;
        System.out.println("chA=" + chA);
        char cha= 97;
        System.out.println("cha= " +cha);
        char chZ= 90;
        System.out.println("chZ=" + chZ);
        char chz= 122;
        System.out.println("chz=" + chz);
        char cht=121;
        System.out.println("cht=" +cht);

        System.out.println("----------");
        // String A= ters slaş yapamadım burda, sor.
        System.out.println("----------");

        bl= true;
        bl= false;
        System.out.println("bl= " +bl);

        int a =10;
        int t =10;
        boolean bln= a==t;
        System.out.println("bln= " + bln);

        int z = 30;
        bln = z == a+t;
        System.out.println("bln= " + bln);






    }
    }

