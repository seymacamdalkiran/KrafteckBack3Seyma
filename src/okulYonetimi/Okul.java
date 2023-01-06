package okulYonetimi;

import java.util.Scanner;

public abstract class Okul {

    private String adSoyad;
    private String tc;
    private int yas;

    public void panel(){
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİNE HOŞGELDİNİZ");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçin.");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ\n2- ÖĞRETMEN İŞLEMLERİ\nQ- ÇIKIŞ");

        Scanner scan=new Scanner(System.in);
        char secim=scan.next().charAt(0);
        if(secim=='1'){
            System.out.println("OGRENCİ İSLEMLERİ");


        }else if(secim=='2'){
            System.out.println("OGRETMEN İSLEMLERİ");
            Ogretmen_Islemleri obje=new Ogretmen_Islemleri();
            obje.islemler();

        }else if(secim=='q' || secim=='Q'){
            System.exit(0);
        }else{
            panel();
        }

    }

    public Okul() {
    }

    public Okul(String adSoyad, String tc, int yas) {
        this.adSoyad = adSoyad;
        this.tc = tc;
        this.yas = yas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
