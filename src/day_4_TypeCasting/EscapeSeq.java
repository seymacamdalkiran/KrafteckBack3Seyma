package day_4_TypeCasting;

public class EscapeSeq {
    public static void main(String[] args){

     /*
     \t tab
     \b konulduğu yerden backspace yapıyor
     \n yeni satıra geçer yani alt satır
     \r satırbaşı yaptırır
     \' ' ekler
     \" "ekler
     \\ \ ekler
      */

        System.out.println("\tHello world");    // paragraf başı gibi yazdırdı yani başa boşluk bıraktı
        System.out.println("Hello \bworld");    // kendinden önceki bir karakteri yazdırmıyor
        System.out.println("\nHello world");    // bir alt satıra geçerek yazar
        System.out.println("Hello\rHello world");// r den öncekini yazdırmıyor.
        System.out.println("\"Hello\" world");  // helloyu tırnak içinde yazdırdı
        System.out.println("\\Hello\\ world");  // helloyu / içine aldı


        System.out.println("----------");
        System.out.print("merhaba\b sevgili\b dostlar\n");
        System.out.print("Hoşgeldiniz \ndostlar\n");

        System.out.println("--------");

        //concationation
        String str= "hello";
        String str2 ="world";
        String str3= str+" "+str2;   // bu yapı çok kullanılacak
        System.out.println("str3 = " + str3);

        System.out.println(str+100);        //100 string olmuş ama string neydi ki; concat etmişiz.

        String str4 = str+100;
        System.out.println("str4 = " + str4);

        int i= 50;
        String str5= str+i;
        System.out.println("str5 = " + str5);

        //-----------
        int y= 75;
        System.out.println(str+i+y); // string deyince harf gelsin aklına 50 ile 75 i toplayıp 125 gelmesin. 5075 demek

        System.out.println(i+y+str); // burda 50 ile 75 i topladı; string görmediği için aritmetik işlem yaptı.

        //conkatinete birleştir demek

        String str6 = i+y+str;
        System.out.println("str6 = " + str6);  //125 hello

        System.out.println(""+i+y+str);
        // "" empty string demek. yani karakter olarak boş karakter demek.
        // başa "" koyulursa ifade stringleşiyor.

        int sum = i+y;
        System.out.println(str+sum);

        System.out.println("--------");

        // empty string vs null string
        //string s1; de null string demek yani boş demek. yani henüz birşey assing edilmemiş

        String s = ""; //
        String s1;
        s1=null;
        System.out.println(s1);

       // System.out.println(i+y+str+i+y);    string kendisinden önceki int sayıları aritmetik toplar
       // kendinden sonraki int sayıları string şeklinde yazar.
        //System.out.println(i+y);







    }
    }

