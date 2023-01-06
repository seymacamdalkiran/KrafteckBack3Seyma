package mentoring;

import java.util.Scanner;

public class Atm {
    Scanner sc=new Scanner(System.in);
    String kartNo="1234567887654321";
    String password="2323";
    double bakiye=20000;

    public static void main(String[] args) {
        Atm kullanıcı1=new Atm();
        kullanıcı1.giris();
    }
    public void giris(){

        System.out.println("Kart numarası giriniz");
        String kullanıcıKartNo=sc.nextLine();
        kullanıcıKartNo=kullanıcıKartNo.replace(" ","");

        System.out.println("Parola giriniz ");
        String kullanıcıPassword=sc.nextLine();

        if(kullanıcıKartNo.equals(kartNo) && kullanıcıPassword.equals(password)){
            menu();
        }
        else{
            System.out.println("Yanlış giriş yaptınız tekrar deneyiniz");
            giris();
        }
    }
    public void menu(){
        System.out.println("Kraft Bankasına hoşgeldiniz.\nYapmak istediğiniz işlemi seçin");
        System.out.println("Bakiye sorgula => 1\nPara yatirma => 2 \nPara çekme => 3\nPara gönderme => 4 \n" +
                "Şifre değiştirme => 5\nÇıkış => 6");
        int islem=sc.nextInt();
        switch (islem){
            case 1:
                bakiyeSorgula();
                break;
            case 2:
                paraYatirma();
                break;
            case 3:
                paraCekme();
                break;
            case 4:
                paraGonderme();
                break;
            case 5:
                sifreDegistir();
                break;
            case 6:
                System.out.println("İYİ GÜNLER");
                break;
            default:
                menu();
        }

    }

    private void sifreDegistir() {
        System.out.println("eski şifrenizi giriniz");
        String teyit=sc.nextLine();
        if(teyit.equals(password)){
            System.out.println("yeni şifrenizi giriniz");
            password=sc.nextLine();
            System.out.println("Şifreniz başarıyla değiştirildi");
            System.out.println("Mevcut şifreniz = "+ password);
            menu();
        }else {
            System.out.println("şifrenizi yanlış girdiniz. Lütfen tekrar deneyin");
            sifreDegistir();
        }
    }
    private void paraGonderme() {
        System.out.println("Lütfen iban girin");
        sc.nextLine();
        String iban=sc.nextLine();

        if(iban.startsWith("TR") && iban.length()==26){
            System.out.println("Göndermek istediğiniz para miktarını girin");
            double miktar=sc.nextDouble();
            if(miktar<=bakiye){
                bakiye=bakiye-miktar;
                System.out.println("Havale işlemi gerçekleştirildi.\nMevcut bakiyeniz = "+bakiye);

                System.out.println("Yeniden para göndermek için 1 e, Menüye dönmek için 2 ye basın");
                int x= sc.nextInt();
                switch (x){
                    case 1:
                        paraGonderme();
                        break;
                    case 2:
                        menu();
                        break;
                }

            }else{
                System.out.println("Bakiye yetersiz");
                System.out.println("Yeniden denemek için 1 e, Menüye dönmek için 2 ye basın");
                int x= sc.nextInt();
                switch (x){
                    case 1:
                        paraGonderme();
                        break;
                    case 2:
                        menu();
                        break;
                }
            }
        }else{
            menu();
        }
    }

    private void paraCekme() {
        System.out.println("Çekmek istediğiniz miktarı girin");
        double cek=sc.nextDouble();
        if(cek<=bakiye){
            bakiye-=cek;
            System.out.println("Para çekme işleminiz başarıyla gerçekleşti. Lütfen kartınızı almayı unutmayın");
            System.out.println("Kalan bakiyeniz = "+bakiye);
            menu();
        }else{
            System.out.println("Bakiye yetersiz");
            System.out.println("Yeniden denemek için 1 e, Menüye dönmek için 2 ye basın");
            int x= sc.nextInt();
            switch (x){
                case 1:
                    paraGonderme();
                    break;
                case 2:
                    menu();
                    break;
            }
        }
    }

    private void paraYatirma() {
        System.out.println("Yatırmak istediğiniz miktarı yazın");
        double yatir=sc.nextDouble();
        bakiye+=yatir;
        System.out.println("Mevcut Bakiyeniz = "+bakiye);
        System.out.println("Yeniden para eklemek için 1 e, Menüye dönmek için 2 ye basın");
        int x= sc.nextInt();
        switch (x){
            case 1:
                paraYatirma();
                break;
            case 2:
                menu();
                break;
        }

    }

    private void bakiyeSorgula() {
        System.out.println("Mevcut bakiyeniz = "+bakiye);
        menu();
    }



}


/*     ATM Kullanicidan giriş için kart numarasi ve şifresini isteyin,
 eger herhangi birini yanlis girerse tekrar isteyin.
Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
 ​ Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme,
 sifre değiştirme ve cikis islemleri olacaktır.

​ Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
  Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
   eger değilse menü ekranina geri donsun.
  Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,      */
