package day_17_Methods;
import java.util.*;
public class Day_16_Summary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random rd=new Random();
/*
        disloop: for (int i = 1; i < 7; i++) {


            icloop:
            for (int j = 1; j < 5; j++) {
                System.out.println("                "+j+" iç loop");
                if(i==4){break disloop;}

                System.out.println(j+"  dış loop");
            }
        }

 */
        int para=2000;
        firstLoop:   while (true){
            System.out.println("Bankamıza hoş geldiniz");
            System.out.println("yapmak istediğiniz işlemi seçiniz?");
            System.out.println("1 hesabımdaki parayı görme");
            System.out.println("2 para ekleme");
            System.out.println("3 kart iade");

            int x= scan.nextInt();

            if(x==1){
                System.out.println("bankadaki hesabınızdaki para miktarı : "+para);
            }else if(x==2){

                while(true){
                    System.out.println("Para ekleme sayfasına hoş geldiniz");
                    System.out.println("1 EFT");
                    System.out.println("2 HAVALE");
                    System.out.println("3 Bir Önceki menüye dön");
                    System.out.println("4 Kart iade");
                    System.out.print("secim: ");
                    int secim=scan.nextInt();
                    if(secim==1){
                        System.out.println("eft yapıldı");
                    }else if(secim==2){
                        System.out.println("havale yapıldı");
                    }else if(secim==3){
                        break;  //continue firstLoop;
                    }else if(secim==4){
                        break firstLoop;
                    }else{
                        System.out.println("hatalı giriş");
                        continue firstLoop;
                    }
                }
            }else if(x==3){
                break;
            }else {
                System.out.println("hatalı giriş");
            }
        }

















    }
}
