package day_16_Branching_Statement;
import java.util.*;
public class dallandırma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Random rd=new Random();
/*
 for (int i = 0; i <10 ; i++) {

            for (int j = 1; j < 70; j++) {
                if(j==3){
                    break;
                }
                System.out.println(j+".iç döngü loop");
            }
            System.out.println(i+ ". dış döngü loop");

        }


        int i=0;
        while(i!=-1){
            System.out.println("Çıkmak için -1 e basın");
            System.out.println("lütfen bir sayı girin");
        i=scan.nextInt();
        if(i==-1){
            System.out.println("Sistemden çıkılıyor.");
            break;}
            System.out.println("Yazdığınız sayı : "+i);
        i++;
        }


        int r=rd.nextInt(10);
        //System.out.println(r);
        System.out.println("Sayıyı bilmek için 4 hakkınız var.\nLütfen bir sayı yazın.");
        int t=scan.nextInt();
        for (int i = 1; i <4 ; i++) {

            if (r != t) {
                System.out.println("Bilemediniz "+(4-i)+" hakkınız kaldı.\nlütfen tekrar deneyin");
                t = scan.nextInt();
            } else {
                System.out.println("TEBRİKLER BİLDİN");
                break;
            }
        }if(r!=t){
            System.out.println("KAYBETTİN.\n Söylemen gereken sayı = "+r+" idi.");
        }

        System.out.println("1. sayınızı yazın");
        int x=scan.nextInt();
        System.out.println("2. sayınızı yazın");
        int y=scan.nextInt();
        int i=0;
        while((x+y)!=50){
            System.out.println("yazdığınız sayıların toplamı = "+(x+y));
            System.out.println("1. sayınızı yazın");
            x=scan.nextInt();
            System.out.println("2. sayınızı yazın");
            y=scan.nextInt();

            if((x+y)==50){break;}
        }
        System.out.println("Yazdığınız sayıların toplamı 50 dir");


        while(true){
            System.out.println("lütfen 2 sayı yazın. ");
            System.out.print("1.sayı = ");
            int x=scan.nextInt();
            System.out.print("2.sayı = ");
            int y=scan.nextInt();

            if((x+y)==50){break;}
        }

        boolean a=true;
        while (a){
            System.out.println("lütfen 2 sayı yazın. ");
            System.out.print("1.sayı = ");
            int x=scan.nextInt();
            System.out.print("2.sayı = ");
            int y=scan.nextInt();
            System.out.println("Toplama işlemi yapmak için = 1\nÇıkarma işlemi yapmak için = 2\n" +
                    "Çarpma işlemi yapmak için =3\nBölme işlemi yapmak için =4\nProgramdan çıkmak için 5'i tuşlayın");
            int z=scan.nextInt();
            switch(z){
                case 1:
                    System.out.println(x+y);
                    break;
                case 2:
                    System.out.println(x-y);
                    break;
                case 3:
                    System.out.println(x*y);
                    break;
                case 4:
                    System.out.println(x/y);
                    break;
                case 5:
                    a=false;
                    break;
            }
        }
*/
        int i=0;
        while(i<10){
            if(i==3||i==7){i++;
            continue;}
            System.out.print(i+" ");
            i++;
        }























    }
}
