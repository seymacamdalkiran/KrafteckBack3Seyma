package mentoring;

import java.util.Scanner;

public class Kasım_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.println(bolme());
        //  System.out.println(tablo());
        //  System.out.println(sayiTersi(1234));
       /* for (int i = 1; i <10 ; i++) {
             if(i%2==1) {
                 for (int j = 0; j < 6; j++) {
                 System.out.print("* ");
             }}else{
                 for (int j = 0; j < 5; j++) {
                     System.out.print(" *");
                 }
             } if(i%2==1) {System.out.print("================================");}
             else{System.out.print("  ================================");}
            System.out.println("");
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("============================================");
        }


       while(true) {
           System.out.println("Bir sayı yazınız. ");
           int a=scan.nextInt();
           if(a==1){break;}
           if (a != 1 && a % 2 == 0 && a % 3 == 0 && a % 5 == 0) {
               System.out.println(a + "  => Bu sayı ugly sayısı değildir.");
           }else{
           System.out.println(a + "  => Bu sayı ugly sayısıdır.");}

    }

        int x=1;
        int toplam=0;
        int crpm=1;
        while(x<=15){
            toplam=x+toplam;
            crpm=x*crpm;
            x++;}
            System.out.println("toplam = "+toplam);
            System.out.println("Çarpım = "+crpm);*/
        //ters();
        int value=9;
        long result=square(value);
        System.out.println(result);
    }
    public static int bolme(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Bölünen sayıyı yazın ");
        int blnn=scan.nextInt();
        System.out.println("Bölen sayıyı yazın ");
        int bln=scan.nextInt();
        int blm=0;
        while(blnn>=bln){
            blnn=blnn-bln;
        blm++;}
        return blm;
    }
    public static int tablo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi sayının çarpım tablosunu öğrenmek istersin");
        int x = scan.nextInt();
        System.out.println("ÇARPIM TABLOSU");
        int carpım=1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
            carpım=x*i;
        }return carpım;
        }
        public static int ters(){
        Scanner scan=new Scanner(System.in);
            System.out.println("Tersini almak istediğiniz sayı nedir?");
            int x=scan.nextInt();
            int y;
            int tersi=0;
            while(x>0){
                y=x%10;
                x=x/10;
                tersi=y+y*10;
            }System.out.println(tersi);
            return tersi;
    }
    public static long square(int x){
        long y =x*(long)x;
        x=-1;
        return y;
    }


}



