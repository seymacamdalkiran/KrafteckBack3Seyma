package odevler;
import java.util.Scanner;
public class Kasım_11 {
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);

        /*
        // YUMURTALAR CİVCİV OLUR MU?

        System.out.print("Hava Sıcaklığı = ");
        double ısı=scan.nextDouble();
        System.out.print("Nem = ");
        double nem=scan.nextDouble();

        boolean civciv=ısı>37.8 && (nem>55 && nem<60);
        System.out.println("Yumurtalar civciv olur mu? 👉👉👉👉 "+civciv);

        System.out.println("-----------------");

         // ASKERE ALINIR MISIN?

        System.out.print("Yaş kaç? ");
        int age=scan.nextInt();
        System.out.print("Sağlıklı isen \"healty\""+"\nSağlık problemin varsa başka bir şey yazınız. \n");
        String saglık=scan.next();

        boolean isSoldier= !(age<20) && (saglık.equals("healty"));
        System.out.println("Askere alınır mısın? 👉👉👉👉 "+isSoldier);



        // SAYI 3 E VE 5 E BÖLÜNÜYOR MU?

        System.out.print("Bir sayı yazın. ");
        int x=scan.nextInt();
        boolean bolum=( (x%3==0) && (x%5==0)) || ( (x%3 != 0) && !(x%3 == 0));
        System.out.println("Verdiğin sayı 3'e ve 5'e aynı anda bölünür ya da ikisine de bölünemez. 👩🏻"+bolum);


        // BOY KİLO 👩🏻‍🎤

        System.out.println("Boy : ");
        int boy=scan.nextInt();
        System.out.println("Kilo : ");
        int kilo=scan.nextInt();
        int boy2=boy%100;
        boolean boyKilo= ( boy2>kilo-10 ) && ( boy2<kilo+5 ) ;
        System.out.println(boyKilo);

        // HOŞ GELDİNİZ
*/
        System.out.println(" 🥳 HOŞ GELDİNİZ 🥰 ");
        System.out.print("Yasadığın şehrin nüsü kaç? ");
        int nüfus = scan.nextInt();
        boolean nufus= nüfus>1500000 && nüfus<10000000;
        System.out.print("Konuştuğunuz dil türkçe ise \"turkce\", değilse konuştuğunuz dili yazın. ");
        String dil=scan.next();
        boolean dıl=dil.equals("turkce");
        boolean livelnTur=nufus&&dıl;
        System.out.println("You live in Turkey true ? "+livelnTur);


    }
}
