package day_18_MethotsCont;
import java.util.*;
public class Methots_Cont_2 {
    public static void main(String[] args) {


        // kiloToOkka();
        // conventer();
     //  message(5);
       // message(46);
        //calculate(2022);
        // usluSayı(3,4);
      // sayı(18,3);
//        parametre(90,2,"/");
    }
    public static void conventer(){
        kiloToOkka();
        conventer();

    }
    public static void kiloToOkka(){
        Scanner scan=new Scanner(System.in);
        System.out.println("okkaya çevirmek istediğiniz değeri girin.");
        double kl=scan.nextDouble();
        System.out.println(kl/1.283+" okkadır.");


      //parametreli methodlar
    }
    public static void message(int a){
        System.out.println(a+" is here ");
        System.out.println(a+" + 10 = "+(a+10)+" eder. ");
    }
    public static void calculate (int a){
        System.out.println("Doğduğunuz yılı yazın");
        Scanner scan=new Scanner(System.in);
        int yıl=scan.nextInt();
        System.out.println("Yaşınız = "+(a-yıl));
     //   LocalDate currentYear = LocalDate.now();       System.out.println(currentYear.getYear() - born);
    }
    public static void usluSayı(int a,int b){
     /*   int sonuc=1;
        for (int i = 1; i <= a; i++) {
            sonuc=b*sonuc;
        }
        System.out.println(sonuc);
      */
        System.out.println((int)Math.pow(b,a));

    }
    public static void sayı(int a,int b){
        System.out.println("Toplama =>      "+a+" + "+b+" = "+(a+b));
        System.out.println("Çıkarma =>      "+a+" - "+b+" = "+(a-b));
        System.out.println("Çarpma  =>      "+a+" * "+b+" = "+(a*b));
     if(b!=0){   System.out.println("Bölme   =>      "+a+" / "+b+" = "+(a/b));}
     else{System.out.println("Bölme işleminin paydası 0 olamaz");}
    }
    public static void parametre(int a,int b,String c){
       if(c.equals("+")){
            System.out.println("Toplama => "+a+" + "+b+" = "+(a+b));
       } else if(c.equals("-")) {
           System.out.println("Çıkarma => " + a + " - " + b + " = " + (a - b));
       }else if(c.equals("*")) {
           System.out.println("Çarpma  => " + a + " * " + b + " = " + (a * b));
       }else if(c.equals("/")) {
           if(b!=0){   System.out.println("Bölme   => "+a+" / "+b+" = "+(a/b));}
            else{System.out.println("Bölme işleminin paydası 0 olamaz");}}
       else{
           System.out.println("Uygun bir işlem seçmediniz");
       }


    }







}
