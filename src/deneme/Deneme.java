package deneme;

import java.util.*;

public class Deneme {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
/*
        System.out.print("Ucgenin 1.kenarının uzunluğunu yazın = ");
        double k1=scan.nextDouble();
        System.out.print("Ucgenin 1.kenarının uzunluğunu yazın = ");
        double k2=scan.nextDouble();
        System.out.print("Ucgenin 1.kenarının uzunluğunu yazın = ");
        double k3=scan.nextDouble();

        double i=(k1+k2+k3)/2;
        double area = Math.sqrt(i*(i-k1)*(i-k2)*(i-k3));
        System.out.println(area);


        System.out.println("Age = ");
        int age=scan.nextInt();
        System.out.println("Are you healty = ");
        String healty=scan.next();

        boolean toBeSoldier= age>=20 && healty.equals("healty");
        System.out.println(toBeSoldier);


        int i=2;
        boolean ln;
        ln= --i==i || i<1;
       // ln= i++== i || i<1;
        System.out.println("ln = "+ln);
*/
        /*
     \t tab
     \b konulduğu yerden backspace yapıyor
     \n yeni satıra geçer yani alt satır
     \r satırbaşı yaptırır
     \' ' ekler
     \" "ekler
     \\ \ ekler
      */
       /*
        System.out.println("   ___   ");
        System.out.println("  /   \\ ");
        System.out.println(" { ⁰ ⁰ }       Hi!");
        System.out.println("    |    ");
        System.out.println("    ¬    ");
        System.out.println("  \\__/ ");

        System.out.println("-------------------");

        System.out.println("odanın uzunluğu = ");
        double uz=scan.nextDouble();
        System.out.println("odanın genişliği = ");
        double yk=scan.nextDouble();
        System.out.println("odanın yüksekiliği = ");
        double gn=scan.nextDouble();
        System.out.println("kaç kapı var? ");
        int kapı=scan.nextInt();
        System.out.println("kaç pencere var? ");
        int pen=scan.nextInt();
        double galon= ((uz*yk+gn*yk)*2+uz*gn+ -kapı*20-pen*15)/350;
        System.out.println("size gereken galon miktarı = "+ galon);



        Eğer işçi 40 saatten az çalışmışsa çalıştığı saat ve saat ücreti çarpılarak alacağı ücret hesaplanıyor ,
        eğer işçi 40 saat ve daha fazla çalışmışsa çalıştığı saat 2 saat olarak hesaplanacak buna göre bilgileri
        alınarak ödenecek tutarı yazdıran algoritması.


                System.out.println("haftalık çalıştığınız saat = ");
        int a=scan.nextInt();
        System.out.println("İşçinin saatlik ücreti = ");
        int b=scan.nextInt();

        if(a>=40){
            System.out.println("Ödenecek maaş = "+(2*a*b));}
        else{
            System.out.println("Ödenecek maaş = "+ (a*b));}



        System.out.println("Bir x sayısı yazın ");
        int x = scan.nextInt();
        System.out.println("Bir y sayısı yazın ");
        int y = scan.nextInt();
        System.out.println("Bir z sayısı yazın ");
        int z = scan.nextInt();

        if(x>y && x>z){
            System.out.println("En büyük sayı x "+x);}
        else if(x==y&&x>z){
            System.out.println("En büyük sayınız x ve y "+x);}
        else if(x==z&&x>y){
            System.out.println("En büyük sayınız x ve z "+x);}


        else if(y>x && y>z){
            System.out.println("En büyük sayı y= "+y+" dir. ");}

        else if(y==z&&y>x){
            System.out.println("En büyük sayınız y ve z "+y);}


        else if(z>x && z>y){
            System.out.println("En büyük sayı z"+z+" dir.");}
        else {
            System.out.println("Sayılar birbirine eşittir. "+x);}


            Ax2+bx+c=0 a b c değerlerini klavyeden girilerek denklemin çözümü var mı yok mu ekrana yazdıralım.
D=b2-4ac


        System.out.println("ax²+bx+c=0 şeklindeki bir denklemin kat sayılarını sırayla yazın. ");
        System.out.println("a= ");
        double a=scan.nextDouble();
        System.out.println("b= ");
        double b=scan.nextDouble();
        System.out.println("c= ");
        double c=scan.nextDouble();
        double d=b*b-4*a*c;
        if(d<0){
            System.out.println("Bu denklemin çözümü yoktur.");
        }else{
            System.out.println("Bu denklemin çözümü vardır.");
        }


        Klavyeden 3 adet kenar uzunluğu giriliyor. Girilen kenar uzunlukları ile :
a-Üçgenin çizilip çizilemeyeceğini
b-Eğer üçgen çizilirse Üçgenin çeşidini(ikizkenar, çeşitkenar, eşkenar)
c- çizilen üçgenin alan ve çevresini bulup ekrana yazan programın algoritmasını ve akış diyagramını tasarlayınız.




        System.out.println("Üçgenin kenarlarını sırayla yazın ");
        System.out.println("1. kenar = ");
        double a=scan.nextDouble();
        System.out.println("2. kenar = ");
        double b=scan.nextDouble();
        System.out.println("3. kenar = ");
        double c=scan.nextDouble();

        if((a<b+c)&&((b>c&&a>b-c)||(c>b&&a>c-b))){
            System.out.println("Verilen kenar uzunlukları ile bir üçgen çizilebilir");
            if(a==b||b==c||a==c){
                System.out.println("Bu bir ikizkenar üçgendir. ");}
            else if(a==b&&b==c){
                System.out.println("Bu eşkenar bir üçgendir. ");}
            else{
                System.out.println("Bu çeşitkenar bir üçgendir. ");}
            double u=(a+b+c)/2;
            System.out.println("çevre = "+2*u);
            System.out.println("alan = "+Math.sqrt(u*(u-a)*(u-b)*(u-c)));}
        else{
            System.out.println("Verilen değerler ile bir üçgen çizilemez. ");}


            Kürenin alanını ve hacmini hesaplayan algoritma ve akış şeması örneği.


        System.out.println("Kürenin yarıçapını yazın. ");
        double r=scan.nextDouble();
        double hacim=(4/3)*Math.PI*r*r*r;
        double alan=4*Math.PI*r*r;
        System.out.println("hacim = " + hacim);
        System.out.println("alan = " + alan);
        maşır ma

        //  bir gün sayısı alın ve kullanıcının girmiş olduğukinesi
        //.....gün sonra haftanın hangi günü olduğunu bulan programı
        // switch case kullanarak yazınız

        System.out.println("Bugün günlerden perşembe kaç gün sonra hangi gündeyiz? ");
        int x=scan.nextInt();
        int gun=x%7;
        switch (gun){
            case 1:
                System.out.print("Cuma");
                break;
            case 2:
                System.out.print("Cumartesi");
                break;
            case 3:
                System.out.print("Pazar");
                break;
            case 4:
                System.out.print("Pazartesi");
                break;
            case 5:
                System.out.print("Salı");
                break;
            default:
                System.out.print("Çarşamba");
        }
        System.out.println(" günü olur");


        char k;
        for(k='a'; k<='z'; k++){
            System.out.print(k+" , ");}

        System.out.println("\n---------------");

        for(k='A';k<'Z';k++){
            System.out.print(k+" , ");}

        System.out.println("\n---------------");


        System.out.println("Başlangıç sayısını yazın");
        int a=scan.nextInt();
        System.out.println("Bitiş sayısını yazın");
        int b=scan.nextInt();

        System.out.println("1------------------");
        int i;
        int s1=0;
        for(i=1;i<=7;i++){
            s1=i+s1;
            System.out.print(s1+" ");}

        System.out.println("\n\n2--------------------");
        int s2=0;
        for(i=1;i<=7;i++){
            s2=i+s2;}
            System.out.print(s2+" ");


        System.out.println("\n\n3--------------------");

        int s3=1;
        for(i=1;i<=7;i++){
            s3=i*s3;}
            System.out.print(s3+" ");

        System.out.println("\n\n4--------------------");

        int s4=1;
        for(i=1;i<=7;i++){
            s4=i*s4;
            System.out.print(s4+" ");}

        */

        System.out.println("\n\n9--------------------");

        System.out.println("Bir sayı yazın");
        int x=scan.nextInt();

        if(x>5){
            System.out.println("Yazdığınız sayı 5 den büyüktür");
        }
        if(x>25){
            System.out.println("Yazdığınız sayı hem 5 ten hem de 25 den büyüktür.");
        }
        if(x>5 && x<=25){
            System.out.println("Yazdığınız sayı 5 ten büyük 25 den küçüktür.");
        }
        if(x>50){
            System.out.println("Yazdığınız sayı 50 den büyüktür");
        }
        if(x<=5){
            System.out.println("Yazdığınız sayı 5 e eşit ya da daha küçüktür. ");
        }











    }}
