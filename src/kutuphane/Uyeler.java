package kutuphane;

public class Uyeler extends Insanlar {


    public Uyeler(String name, Sifat sifat) {
        super(name, sifat);
    }
    public Uyeler(){}


    @Override
    public void getAlinabilecekKitapListesi() {
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < alınabilecekKitaplar.size() ; i++) {
            System.out.println(alınabilecekKitaplar.get(i).kitapAdi);
        }
        uyeIslemleri();
    }

    @Override
    public void kitapTeslimEt() {
        System.out.println("----------------------------------------------------");

        scan.nextLine();
        System.out.println("Teslim etmek istediğiniz kitabın adını yazın");
        String ktpAdı=scan.nextLine();
        loop:   for (int i = 0; i < tumKitaplar.size(); i++) {
            if(ktpAdı.equalsIgnoreCase(tumKitaplar.get(i).kitapAdi)){
                for (int j = 0; j < alınabilecekKitaplar.size() ; j++) {
                    if( ktpAdı.equalsIgnoreCase(alınabilecekKitaplar.get(j).kitapAdi) ){
                        System.out.println("Bu kitap zaten kütüphanemizde var");
                        break loop;
                    }
                } System.out.println("Kitabınızı teslim ettiniz.");
                alınabilecekKitaplar.add(tumKitaplar.get(i));
            }
        }
        uyeIslemleri();
    }

    @Override
    public void getKitapListesi() {
        System.out.println("Sadece alabileceğiniz kitapları görebilirsiniz");
    }

    @Override
    public void kitapSil() {
        System.out.println("Kitap silme yetkiniz yoktur");
    }

    @Override
    public void kitapEkle() {
        System.out.println("Kitap ekleme yetkiniz yoktur");
    }

    @Override
    public void personelEkle() {
        System.out.println("Personel ekleme yetkiniz yoktur.");
    }

    @Override
    public void personelSil() {
        System.out.println("Personel silme yetkiniz yoktur.");
    }

    @Override
    public void personelleriListele() {
        System.out.println("Personelleri listeleme yetkiniz yoktur.");
    }

    @Override
    public void adminleriListele() {
        System.out.println("Adminleri listeleme yetkiniz yoktur");
    }

    @Override
    public void uyeleriListele() {
        System.out.println("Uyeleri listeleme yetkiniz yoktur");
    }

    public void uyeIslemleri(){
        System.out.println("----------------------------------------------------");

        System.out.println("Yapmak istediğiniz işlemi yazın");
        System.out.println("Alabileceğiniz kitapları listelemek için => 1\nKütüphanemizden kitap alabilmek için => 2\n" +
                "Daha önce aldığınız kitabı teslim etmek için => 3\nBir üst menüye dönmek için => 4\nCıkıs yapmak için => 5");
        try {
            int   secim = scan.nextInt();

            if (secim == 1) {
                getAlinabilecekKitapListesi();
            } else if (secim == 2) {
                oduncKitapAl();
            } else if (secim == 3) {
                kitapTeslimEt();
            }else if(secim==4){
                anaSayfa();
            } else if (secim == 5) {
                System.exit(0);
            } else {
                System.out.println("Hatalı tuşlama yaptınız");
                uyeIslemleri();
            }
        } catch (Exception e) {
            System.out.println("Hatalı tuşlama yaptınız yeniden denemelisiniz.");

        }
       // uyeIslemleri();
    }

    @Override
    public void oduncKitapAl() {
        System.out.println("----------------------------------------------------");

        scan.nextLine();
        System.out.println("Almak istediğiniz kitabın adını yazın");
        String kitapAdi=scan.nextLine();
        int count=3;
        for (int i = 0; i < alınabilecekKitaplar.size() ; i++) {
            if(kitapAdi.equalsIgnoreCase(alınabilecekKitaplar.get(i).kitapAdi) && count>0){
                System.out.println("Kitabı alabilirsiniz. Teslim etmek için 15 gün süreniz var");
                alınabilecekKitaplar.remove(alınabilecekKitaplar.get(i));
                count--;
            }
        }
        uyeIslemleri();
    }
}
