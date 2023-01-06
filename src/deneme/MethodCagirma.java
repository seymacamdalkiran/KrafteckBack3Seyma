package deneme;
import java.util.*;
public class MethodCagirma {
    public static void main(String[] args) {
        //  ortalama();
        //  buyukSayı();
        //  okka(90);
        //  yas(1987);
        //  usluSayi(5,-3);
        //  dortIslem(5,9,"/");
        //  sonRakam(23,45);
        //  asal(97);
        //  System.out.println(mutlak());
        not();
    }
    public static void ortalama(){
        int a,b,c;
        System.out.println("Sisteme 3 sayı girin ");
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        double ort=((double)(a+b+c)/3);
        System.out.println("Ortalama =>   " + ort);
    }
    public static void buyukSayı(){
        int a,b;
        System.out.println("Sisteme 2 sayı girin ");
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        if(a<b) {
            System.out.println("Büyük olan sayınız =>  " + b);
        }else{   System.out.println("Büyük olan sayınız =>  "+a);
        }

    }
    public static void okka(int a){
        System.out.println("kilo değerini yazın.");
        // Scanner scan=new Scanner(System.in);
        // int a=scan.nextInt();

        System.out.println(a+" kilo = "+(a/1.282)+" okka eder.");
    }
    public static void yas(int a){


        System.out.println("Yaşınız =>  "+(2022-a));
    }
    public static void usluSayi(int a,int b){
       /* int c=1;
        for (int i = 1; i <=a ; i++) {
            c = b * c;
        }   System.out.println(c);  */

        //double us=Math.pow(b,a);
        System.out.println("Sayının sonucu =>  "+Math.pow(b,a));
        System.out.println("Sayının sonucu =>  "+(int)Math.pow(b,a));
        }
    public static void dortIslem(int a,int b,String c){
     if(c.equals("+")) {  System.out.println("Toplama  =>       "+a+" + "+b+" = "+(a+b));}
     else if(c.equals("-")) {  System.out.println("Çıkarma  =>       "+a+" - "+b+" = "+(a-b));}
     else if(c.equals("*")) {   System.out.println("Çarpma   =>       "+a+" * "+b+" = "+(a*b));}
     else if(c.equals("/")) {
         if(b!=0){  System.out.println("Bölme    =>       "+a+" / "+b+" = "+((double)a/b));}
         else       {System.out.println("Bölme işleminde payda 0 olamaz.");
     }}
     else{
         System.out.println("Doğru işlemi seçin");
     }
        }
        public static boolean sonRakam(int a,int b) {
            boolean sonRakam = a % 10 == b % 10;
            System.out.println(sonRakam);
            return sonRakam;
        }
        public static boolean asal(int a){
        boolean as=true;
            for (int i = 2; i <a ; i++) {
                if(a%i==0){as=false;}
            }
            System.out.println("Asal sayı mıdır? "+as);
        return as;
        }
        public static double mutlak(){
        Scanner scan=new Scanner(System.in);
            System.out.println("Mutlak değerinin alınmasını istediğiniz sayıyı yazın");
            double x=scan.nextDouble();
            if(x<0){x=-x;}
            return x;
        }
        public static char not() {          //Bu sorunun çözümünü dinle
            Scanner scan = new Scanner(System.in);
            System.out.println("Sınav notunuz");
            char c='x';
            double not = scan.nextDouble();
            if ((int) not >= 76 && not <= 100) {
                System.out.println("aldığın değer =  " + (char) 65);
            } else if ((int) not >= 51 && not <= 75) {
                System.out.println("aldığın değer =  " + (char) 66);
            } else if ((int) not >= 0 && not <= 51) {
                System.out.println("aldığın değer =  " + (char) 67);
            }else {
                System.out.println("Böyle bir not alman mümkün değil");
            }
            return c;
        }






}
