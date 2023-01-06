package okulYonetimi;

import java.util.ArrayList;
import java.util.Scanner;

public class Ogretmen_Islemleri {

    ArrayList<Ogretmen> ogretmenListesi=new ArrayList<>();
    Scanner scan=new Scanner(System.in);


    public void islemler(){
        System.out.println("Yapmak istediğiniz işlemi seciniz.");
        System.out.println("1-EKLEME\n2-ARAMA\n3-LİSTELEME\n4-SİLME\nQ-ÇIKIŞ");
        char secim=scan.next().charAt(0);

        switch (secim){
            case '1':
                ekleme();
                break;
            case '2':
                arama();
                break;
            case '3':
                listeleme();
                break;
            case '4':
                silme();
                break;
            case 'q':
                System.exit(0);
                break;
            default:
                islemler();
                break;
        }
    }

    private void silme() {
        scan.nextLine();
        System.out.println("TC numarası giriniz");
        String tc=scan.nextLine();
        for (int i = 0; i < ogretmenListesi.size(); i++) {
            if(ogretmenListesi.get(i).getTc().equalsIgnoreCase(tc)){
                ogretmenListesi.remove(i);
            }
        }islemler();
    }

    private void listeleme() {
        for (Ogretmen i:ogretmenListesi) {
            System.out.println(i.getBolum()+" "+i.getTc()+" "+i.getAdSoyad()+" "+i.getSicilNo()+" "+i.getYas());
        }
        islemler();
    }

    private void arama(){
        scan.nextLine();
        System.out.println("TC Kimlik numarası giriniz");
        String tc=scan.nextLine();
        for (int i = 0; i < ogretmenListesi.size(); i++) {
            if(ogretmenListesi.get(i).getTc().equalsIgnoreCase(tc)){
                System.out.println(ogretmenListesi.get(i).getAdSoyad());
                System.out.println("---------------------");
                islemler();
            }
        }
        System.out.println(tc+" TC nolu ogretmen bulunamadı");
        System.out.println("-------------------------");
        islemler();
    }

    private void ekleme() {
        scan.nextLine();
        System.out.println("Ogretmenin adını soyadını giriniz.");
        String adSoyad=scan.nextLine();

        System.out.println("TC numarasını giriniz.");
        String tc=scan.nextLine();

        System.out.println("Bolüm giriniz");
        String bolum=scan.nextLine();

        System.out.println("Sicil no giriniz");
        String sicilNo=scan.nextLine();

        System.out.println("Yaşını giriniz");
        int yas=scan.nextInt();

        Ogretmen ogretmen=new Ogretmen(adSoyad,tc,yas,bolum,sicilNo);
        ogretmenListesi.add(ogretmen);

        System.out.println("Kayıt işlemi başarı ile sonuçlanmıştır");
        islemler();

    }


}
