package day_6_type_casting_aritmetic_operators;

public class Example {
    public static void main(String[] args){


        int s4= 1990;
        int s5= 2022;
        System.out.println(s5-s4);
        System.out.println("--------");

        int year=2022;
        int ali=1990;
        int aliYaş= year-ali;
        int ahmetYaş=aliYaş-5;
        System.out.println("Ahmetin yaşı = "+ahmetYaş);
        System.out.println("Ahmetin yaşı = "+(aliYaş+-5));//aliYaş-5 i parantez içinde yazmazsan stringleşir.325 olur

        System.out.println("-----------");

        double r=2;
        double pi=3.14;
        double alan=pi*r*r;
        double çevre=2*pi*r;
        System.out.println("alan = "+alan);
        System.out.println("çevre = "+çevre);

        System.out.println("------------");

        int f= 300;
        double c= (f-32)/1.8;
        System.out.println("300⁰F = "+c+ " ⁰C dir" );

        System.out.println("------------");


        double C= 32;
        double F= 1.8*C+32;
        System.out.println(C+"⁰C= " + F + "⁰F dir");

        System.out.println("------------");

        int fzk= 92;
        int kmy=55;
        int mat=89;
        double ort= (fzk+kmy+mat)/3;
        boolean sonuç=ort>80;
        System.out.println("ortalama = "+ort);
        System.out.println(sonuç);

        System.out.println("----------");

        int sıra=15;
        int koltuk=12;
        int kişi= 113;
        int kapasite= sıra*koltuk;
        int boşKoltuk=kapasite-kişi;
        double oturulanSıra= (double)kişi/koltuk;
        int boşSıra=boşKoltuk/koltuk;
        double tamBoşSıra=(double) boşKoltuk/koltuk;
        int boşSıradakiKoltuk=(sıra-boşSıra)*koltuk%kişi;

        System.out.println("1. Toplantı salonunun kapasitesi = "+kapasite);
        System.out.println("2. Boş koltuk sayısı = "+boşKoltuk);
        System.out.println("3. Oturulan sıra sayısı = "+oturulanSıra); // bunu 10 yapmanın bi yolu olmalı
        System.out.println("Boş sıra sayısı = "+boşSıra);
        System.out.println("4. Tam boş sıra sayısı = "+tamBoşSıra);
        System.out.println("5. Oturulan sıralardaki boş koltuk sayısı = "+boşSıradakiKoltuk);

        System.out.println("3. Oturulan sıra sayısı = "+Math.ceil(oturulanSıra));    //3.sorunun cevabı böyle yapılıyormuş

        System.out.println("--------------");

        int sn=31502;
        int dk=sn/60;
        int saat=dk/60;
        int kalanSn=sn%60;
        int kalanDk= dk%60;


        System.out.println(sn+ " saniye = "+ saat +" saat " +kalanDk+" dakika "+kalanSn+" saniyedir");









    }
}
