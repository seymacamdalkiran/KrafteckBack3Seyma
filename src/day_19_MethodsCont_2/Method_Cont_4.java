package day_19_MethodsCont_2;
import java.util.*;
public class Method_Cont_4 {
    public static void main(String[] args) {

        //asal(0);
        // bir(30,40);
        // System.out.println(bir(31,70));
        // System.out.println(mutlak(-7));
        // System.out.println( ortalama(50,80,30));
        // buyukSayı(1,2,3);
        System.out.println(bigOfThree());
    }

    public static boolean asal(int a) {
        boolean asal=true;
        if(a==0||a==1) {
            asal = false;
        }else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    asal = false;
                }
            }
        } System.out.println(a+" sayısı asal sayı mı ?  =>  " + asal);

        return asal;
    }
    public static boolean bir(int a,int b){
        return a%10==b%10;

    }
    public static int mutlak(int a){
        return (a<0)?-a:a;
       // return Math.abs(a);
    }
    public static char ortalama(double a,double b,double c){
        char harf='a';
        double ort=(a+b+c)/3;
        if(ort>75&&ort<100){
            harf='A';
        }else if(ort>50&&ort<=75){
            harf='B';}
        else if(ort>=0&&ort<=50){
            harf='C';}
        else{
            System.out.println("Böyle bir not ortalaması olamaz");
        }
        return harf;
    }
    public static int buyukSayı(int a,int b,int c){
        int enBuyuk=a;
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir a sayısı yazın ");
        a=scan.nextInt();
        System.out.println("Bir b sayısı yazın ");
        b=scan.nextInt();
        System.out.println("Bir c sayısı yazın ");
        c=scan.nextInt();
        if(b>a&&b>c){enBuyuk=b;}
        else if(c>a&&c>b){enBuyuk=c;}
        else{enBuyuk=a;
        }
        System.out.println("En büyük sayı =>  "+enBuyuk);

        return enBuyuk;
    }
    public static int bigOfThree(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Üç sayı yazın ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        return a>b? (a>c? a:c) : (b>c? b:c);



    }
    public static int bigOfThree2(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Üç sayı yazın ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        return a>b? (a>c? a:c) : (b>c? b:c);
       //BURAYI BİR DAHA DİNLE
    }






}
