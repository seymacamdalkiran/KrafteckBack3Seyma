package deneme;
import java.util.*;
public class Maas {
    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);

    /*
        Bir fabrikada sabit maaşla çalışan işçiler aile durumlarına ve ürettikleri parça sayısına göre de ek maaş
        almaktadır. Aşağıda verilen yönergelere göre işçilerin maaşlarını hesaplayan programın algoritmasını ve akış
        diyagramını tasarlayınız.
		Çocuk sayısı1 ise maaşın %5 i Çocuk sayısı 2 ise maaşın %10 u Çocuk sayısı 3 ve 3 den fazla ise maaşın %15
		i kadar aile yardımı.
		Üretilen parça sayısı 50-100 arasında ise maaşın %10 Üretilen parça sayısı 100-150 arasında ise maaşın %15 i
	    Üretilen parça sayısı 150-200 arasında ise maaşın %20 si
         */


        System.out.println("çocuk sayısı = ");
    int x= scan.nextInt();
    int maas=1000;
        System.out.println("ürettiğiniz parcaSayisi sayısı = ");
    int parcaSayisi=scan.nextInt();

        if(x==1){
        if(parcaSayisi>=50 && parcaSayisi<100){
            System.out.println("Alacağınız maas = "+(maas+maas*5/100+maas*10/100));}
        else if(parcaSayisi>=100 && parcaSayisi<150){
            System.out.println("Alacağınız maas = "+(maas+maas*5/100+maas*15/100));}
        else if(parcaSayisi>=150){
            System.out.println("Alacağınız maas = "+(maas+maas*5/100+maas*20/100));}
        else{
            System.out.println("alacağınız maas = "+(maas+maas*5/100));}
    }
        else if(x==2){
        if(parcaSayisi>=50 && parcaSayisi<100){
            System.out.println("Alacağınız maas = "+(maas+maas*10/100+maas*10/100));}
        else if(parcaSayisi>=100 && parcaSayisi<150){
            System.out.println("Alacağınız maas = "+(maas+maas*10/100+maas*15/100));}
        else if(parcaSayisi>=150){
            System.out.println("Alacağınız maas = "+(maas+maas*10/100+maas*20/100));}
        else{
            System.out.println("alacağınız maas = "+(maas+maas*10/100));}
    }
        else if(x>=3){
        if(parcaSayisi>=50 && parcaSayisi<100){
            System.out.println("Alacağınız maas = "+(maas+maas*15/100+maas*10/100));}
        else if(parcaSayisi>=100 && parcaSayisi<150){
            System.out.println("Alacağınız maas = "+(maas+maas*15/100+maas*15/100));}
        else if(parcaSayisi>=150){
            System.out.println("Alacağınız maas = "+(maas+maas*15/100+maas*20/100));}
        else{
            System.out.println("alacağınız maas = "+(maas+maas*15/100));}
    }
        else {

        if (parcaSayisi >= 50 && parcaSayisi < 100) {
            System.out.println("Alacağınız maas = " + (maas + maas * 10 / 100));
        } else if (parcaSayisi >= 100 && parcaSayisi < 150) {
            System.out.println("Alacağınız maas = " + (maas + maas * 15 / 100));
        } else if (parcaSayisi >= 150) {
            System.out.println("Alacağınız maas = " + (maas + maas * 20 / 100));
        } else {
            System.out.println("alacağınız maas = " + (maas));
        }
        }



}}
