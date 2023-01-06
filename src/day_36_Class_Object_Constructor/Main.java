package day_36_Class_Object_Constructor;

public class Main {
    public static void main(String[] args) {
    /*    Daire daire1=new Daire();
        System.out.println(daire1.yaricap);
        daire1.yaricap=5;
        System.out.println("daire1.getAlan() = " + daire1.getAlan());
        System.out.println("daire1.getCevre() = " + daire1.getCevre());

     */
        Ogrenci ogrenci1=new Ogrenci();
        ogrenci1.ad="harun";
        ogrenci1.okulNo=22365412;
        ogrenci1.soyad="aslan";
        ogrenci1.tc="123456789";
        ogrenci1.bolumNo=25;
        ogrenci1.fakulteNo=36;
        ogrenci1.yilSonuNotu=85;

        System.out.println("ogrenci1 giriş yılı = " + ogrenci1.getOgrenciYili());


        Ogrenci ogrenci2=new Ogrenci();
        ogrenci2.ad="Çiğdem";
        ogrenci2.okulNo=21365412;
        ogrenci2.soyad="koc";
        ogrenci2.tc="41352353241";
        ogrenci2.bolumNo=25;
        ogrenci2.fakulteNo=36;
        ogrenci2.yilSonuNotu=61;

        System.out.println("ogrenci2 giriş yılı = " + ogrenci2.getOgrenciYili());
        System.out.println("ogrenci2.ad = " + ogrenci2.ad);
        System.out.println("ogrenci2 sinifi gecti mi = " + ogrenci2.sinifiGectiMi());
        System.out.println("ogrenci1 sinifi gecti mi = " + ogrenci1.sinifiGectiMi());


    }
}
