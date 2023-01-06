package day_12_Control_Flaow_Statement_swich;
import java.util.*;
public class Summary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        int x=7;
        System.out.println("Program başladı ");

        if(x>6){
            System.out.println("Sayımız 6 dan büyüktür. ");
        }else{
            System.out.println("Sayımız 6 dan küçük veya eşittir. ");
        }

        System.out.println("Program sonlandı. ");


        System.out.println("Bir sayı yazın ");
        int x=scan.nextInt();
        if(x%2==0 && x%5==0){
            System.out.println("Sayı 2 ye ve 5 e tam bölünür. ");
        }else{
            System.out.println("Sayı bölünemez. ");
        }

        System.out.println("Bir sayı yazın ");
        int x = scan.nextInt();
        if (x > 0) {
            System.out.println("sayı pozitiftir.");}
             else if (x == 0) {
            System.out.println("sayı 0 a eşittir. ");}
             else {
            System.out.println("sayı negatiftir. ");}


        System.out.println("Bir x sayısı yazın ");
        int x = scan.nextInt();
        System.out.println("Bir y sayısı yazın ");
        int y = scan.nextInt();
        System.out.println("Bir z sayısı yazın ");
        int z = scan.nextInt();

        if(x>y && x>z){
            System.out.println("En büyük sayı x "+x+" tir.");}
        else if(y>x && y>z){
            System.out.println("En büyük sayı y= "+y+" dir. ");
        }
        else if(z>x && z>y){
            System.out.println("En büyük sayı z"+z+" dir.");
        }

        System.out.println("Bir x sayısı yazın ");
        int x = scan.nextInt();
        System.out.println("Bir y sayısı yazın ");
        int y = scan.nextInt();
        System.out.println("Bir z sayısı yazın ");
        int z = scan.nextInt();

        int enBuyuk=x;
        if (y>enBuyuk){
           enBuyuk=y;
        }
        if (z>enBuyuk){
           enBuyuk=z;
        }else{
            enBuyuk=x;
        }
        System.out.println("En büyük sayınız = "+enBuyuk);

        System.out.println("Bir x sayısı yazın ");
        int x = scan.nextInt();
        System.out.println("Bir y sayısı yazın ");
        int y = scan.nextInt();
        System.out.println("Bir z sayısı yazın ");
        int z = scan.nextInt();

        if(x>=y && x>=z){
            System.out.println("En büyük sayı x= "+x+" tir.");}
        else if(y>=x && y>=z){
            System.out.println("En büyük sayı y= "+y+" dir. ");
        }
        else if(z>=x && z>=y){
            System.out.println("En büyük sayı z= "+z+" dir.");
        }

        System.out.println("Vize notunuzu yazın ");
        double viz = scan.nextDouble();
        System.out.println("Final notunuzu yazın ");
        double fin = scan.nextDouble();
        double yilSonu=(viz*0.4) + (fin*0.6);
        if(yilSonu>=50){
            System.out.println("Tebrikler Geçtiniz.");}
        else{
            System.out.println("Yeniden dene.");}


        System.out.println("Vize notunuzu yazın ");
        double viz = scan.nextDouble();
        System.out.println("Final notunuzu yazın ");
        double fin = scan.nextDouble();
        double yilSonu=(viz*0.4) + (fin*0.6);

        if(yilSonu>=50){
            System.out.println("Tebrikler Geçtiniz.");}

        else if(yilSonu<50) {String x=scan.nextLine();
            System.out.println("Bütünleme notunu yazın ");

            double but = scan.nextDouble();
            double ort = (yilSonu + but) / 2;

            System.out.println("Ortalamanız " + ort);
        if(ort>=50){
            System.out.println("geçtiniz");}

        else{
            System.out.println("Kaldınız");}}



        System.out.println("0 ile 365 arasında bir sayı yazın. ");
        int num1=scan.nextInt();
        if(num1%7==0){
            System.out.println("Bugün günlerden \"Salı\"");}
        else if(num1%7==1){
                System.out.println("Bugün günlerden \"Çarşamba\"");}
        else if(num1%7==2){
            System.out.println("Bugün günlerden \"Perşembe\"");}
        else if(num1%7==3){
            System.out.println("Bugün günlerden \"Cuma\"");}
        else if(num1%7==4){
            System.out.println("Bugün günlerden \"Cumartesi\"");}
        else if(num1%7==5){
            System.out.println("Bugün günlerden \"Pazar\"");}
        else {
            System.out.println("Bugün günlerden \"Pazartesi\"");}
        //işlemi böyle yapmak bilgisayarı yorar ama num1%7 diye en baştan int atasaydık daha kolay olurmuş.

 //aşağıdaki gibi yap
         */
        System.out.println("0 ile 365 arasında bir sayı yazın. ");
        int num1=scan.nextInt();
        int gun=num1%7;
        if(gun==0){
            System.out.println("Bugün günlerden \"Salı\"");}
        else if(gun==1){
                System.out.println("Bugün günlerden \"Çarşamba\"");}
        else if(gun==2){
            System.out.println("Bugün günlerden \"Perşembe\"");}
        else if(gun==3){
            System.out.println("Bugün günlerden \"Cuma\"");}
        else if(gun==4){
            System.out.println("Bugün günlerden \"Cumartesi\"");}
        else if(gun==5){
            System.out.println("Bugün günlerden \"Pazar\"");}
        else {
            System.out.println("Bugün günlerden \"Pazartesi\"");}









    }}
