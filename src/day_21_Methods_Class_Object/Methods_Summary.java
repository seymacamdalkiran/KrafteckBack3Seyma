package day_21_Methods_Class_Object;
import java.util.*;
public class Methods_Summary {
    public static void main(String[] args) {
       // System.out.println("Fonksiyon = "+f(5)*2);
       // System.out.println("Fonksiyon = "+m(5));
       // System.out.println("Faktoriyel = "+fakt(5)/4);
       // System.out.println("Üslü sayı = "+us(2,-3));
       // System.out.println("basamak = "+basamak(12543));
       // System.out.println("Mukemmel sayı mı? "+mukSayı());
       // ekok();
        System.out.println(binary(101131010));
    }
    public static int f(int x){
        return 2*x+5;
    }
    public static int m(int x){
        return f(x)+25;
    }
    public static double fakt(double x){
        int fak=1;
        for (int i = 1; i <=x ; i++) {
            fak=fak*i;
        }return fak;
    }
    public static double us(double taban,double us) {
        double result = 1;
        if (us == 0) {
            return 1;
        } else if(us>0){
            for (int i = 1; i <= us; i++) {
                result = result * taban;
                  }
        }else{
            for (int i = 1; i <= -us; i++) {
                result=result/taban;
            }
        }return result;
    }
    public static int basamak(int x){
        int sayac=0;
       while(x>0){
           x/=10;
           sayac++;
       }return sayac;
    }
    public static boolean mukSayı() {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı yazın");
        int x=scan.nextInt();
        int result=0;
        System.out.println("Sayının bölenleri => ");
            for (int i = 1; i <x ; i++) {
          if(x%i==0) {result=result+i;
              System.out.print(i+" ");
            }}
            System.out.print("\nBölenlerinin toplamı = "+result+"\n");
            boolean sonuc=result==x;
        return sonuc;
    }
    public static int ekok(){
        Scanner scan =new Scanner(System.in);
        System.out.println("EBOB ve EKOK unu almak istediğiniz iki sayıyı yazın.");
        int x=scan.nextInt();
        int y=scan.nextInt();
        int ekok=1;
        int ebob=1;
        int z=Math.min(x,y);
        for (int i = 1; i <=z ; i++) {
            if(x%i==0&&y%i==0){
                ebob= i;
            }
        }System.out.println("Bu sayıların EBOB u => "+ebob);
        ekok=(x*y)/ebob;
        System.out.println("Bu sayıların EKOK u => "+ekok);
        return ekok;
    }
    public static boolean binary(int x){
        boolean bin=true;
        while(x>0){
            if(x%10>1){
                return false;
            }x=x/10;
        }return bin;
    }




}
