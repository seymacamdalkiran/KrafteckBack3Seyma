package kutuphane;


import java.util.Scanner;

public class Admin extends Insanlar {

    public Admin(String name, Sifat sifat) {
        super(name,sifat);
    }

    public Admin() {
        super();
    }

    @Override
    public void oduncKitapAl() {
        System.out.println("----------------------------------------------------");
if(myBook.size()>=3){
    System.out.println("Lütfen kitap almak için kitap teslim ediniz.");
    anaSayfa();
}
        scan.nextLine();
        System.out.println("Almak istediğiniz kitabın adını yazın");
        String kitapAdi=scan.nextLine();
        for (int i = 0; i < alınabilecekKitaplar.size() ; i++) {
            if(kitapAdi.equalsIgnoreCase(alınabilecekKitaplar.get(i).kitapAdi) ){
                System.out.println("Kitabı alabilirsiniz. Teslim etmek için 15 gün süreniz var");
                alınabilecekKitaplar.remove(alınabilecekKitaplar.get(i));
                myBook.add(alınabilecekKitaplar.get(i));
            }
        }

        adminIslemleri();
    }

    @Override
    public void getAlinabilecekKitapListesi() {
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < alınabilecekKitaplar.size() ; i++) {
            System.out.println(alınabilecekKitaplar.get(i).kitapAdi);
        }
        adminIslemleri();
    }

    @Override
    public void kitapSil() {
        System.out.println("----------------------------------------------------");
        scan.nextLine();
        System.out.println("Silmek istediğiniz kitabın adını yazın");
        String ktpAdı=scan.nextLine();
           for (int i = 0; i < tumKitaplar.size(); i++) {
            if(ktpAdı.equalsIgnoreCase(tumKitaplar.get(i).kitapAdi)){
                 System.out.println(tumKitaplar.get(i).kitapAdi+" kütüphanemizden çıkarıldı.");
                tumKitaplar.remove(tumKitaplar.get(i));
            }
        }

           for (int i = 0; i < alınabilecekKitaplar.size(); i++) {
            if(ktpAdı.equalsIgnoreCase(alınabilecekKitaplar.get(i).kitapAdi)){
//                System.out.println(alınabilecekKitaplar.get(i).kitapAdi+" kütüphanemizden çıkarıldı.");
                alınabilecekKitaplar.remove(alınabilecekKitaplar.get(i));
            }
        }adminIslemleri();
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
        adminIslemleri();
    }

    @Override
    public void personelSil() {
        System.out.println("----------------------------------------------------");

        System.out.println("---PERSONEL SİLME SAYFASI---");
        System.out.println("1-Üye Sil\n2-Admin Sil\n3-Bir üst menüye dön");
        System.out.println("Seçiminiz = ");

        try {
            int secim = scan.nextInt();
            scan.nextLine();
            if(secim==1){
                System.out.println("Üyenin ismi = ");
                String isim=scan.nextLine();
                for (int i = 0; i < uyeler.size() ; i++) {
                    if(isim.equals(uyeler.get(i).name)){
                        uyeler.remove(uyeler.get(i));
                        break;
                    }
                }
                for (int i = 0; i < insan.size() ; i++) {
                    if(isim.equals(insan.get(i).name)){
                        insan.remove(insan.get(i));
                        break;
                    }
                }
                personelSil();
            }else if(secim==2){
                System.out.println("Adminin ismi = ");
                String isim=scan.nextLine();
                for (int i = 0; i < adminler.size() ; i++) {
                    if(isim.equals(adminler.get(i).name)){
                        adminler.remove(adminler.get(i));
                        break;
                    }
                }
                for (int i = 0; i < insan.size() ; i++) {
                    if(isim.equals(insan.get(i).name)){
                        insan.remove(insan.get(i));
                        break;
                    }
                }
                personelSil();
            }else if(secim==3){
                System.out.println("Ekleme sayfasından çıkılıyor");
                adminIslemleri();
            }else{
                System.out.println("Hatalı giriş. 1-2-3 seçimlerinden birini yapın.");
                personelSil();
            }
        } catch (Exception e) {
            System.out.println("Hatalı giriş. 1-2-3 seçimlerinden birini yapın.");
            // personelEkle();
        }

    }

    @Override
    public void personelEkle() {

        System.out.println("----------------------------------------------------");

        System.out.println("---PERSONEL EKLEME SAYFASI---");
        System.out.println("1-Üye Ekle\n2-Admin Ekle\n3-Bir üst menüye dön");
        System.out.println("Seçiminiz = ");

        try {
            int secim = scan.nextInt();
            scan.nextLine();
            if(secim==1){
                System.out.println("Üyenin ismi = ");
                String isim=scan.nextLine();
                Insanlar uye=new Uyeler(isim, Sifat.uye);    //Buraya bi daha bak!!!
                insan.add(uye);
                uyeler.add((Uyeler) uye);
                personelEkle();
            }else if(secim==2){
                System.out.println("Adminin ismi = ");
                String isim=scan.nextLine();
                Insanlar admin=new Admin(isim, Sifat.admin);
                insan.add(admin);
                adminler.add((Admin) admin);
                personelEkle();
            }else if(secim==3){
                System.out.println("Ekleme sayfasından çıkılıyor");
                adminIslemleri();
            }else{
                System.out.println("Hatalı giriş. 1-2-3 seçimlerinden birini yapın.");
                personelEkle();
            }
        } catch (Exception e) {
            System.out.println("Hatalı giriş. 1-2-3 seçimlerinden birini yapın.");
           // personelEkle();
        }

    }

    @Override
    public void personelleriListele() {
        System.out.println("----------------------------------------------------");

        for (int i = 0; i <insan.size() ; i++) {
            System.out.println("ID = "+insan.get(i).id+"     ISMİ = "+insan.get(i).name+"     TİPİ = "+insan.get(i).tip);
        }
        adminIslemleri();
    }

    @Override
    public void adminleriListele() {
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < adminler.size(); i++) {
            System.out.println("ID = "+adminler.get(i).id+"     ISMİ = "+adminler.get(i).name+"     TİPİ = "+adminler.get(i).tip);
        }
        adminIslemleri();
    }
    @Override
    public void getKitapListesi() {
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < tumKitaplar.size(); i++) {
            System.out.println(tumKitaplar.get(i).kitapAdi);
        }
        adminIslemleri();
    }

    @Override
    public void uyeleriListele() {
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < uyeler.size(); i++) {
            System.out.println("ID = "+uyeler.get(i).id+"     ISMİ = "+uyeler.get(i).name+"     TİPİ = "+uyeler.get(i).tip);

        }
        adminIslemleri();
    }
    public void kitapEkle() {
        Scanner scan=new Scanner(System.in);
        System.out.println("----------------------------------------------------");

        System.out.println("---KİTAP EKLEME SAYFASI---");
        System.out.println("Kitap eklemek için => 1\nBir üst menüye dönmek için => 2");

        try {
            int secim = scan.nextInt();
            if (secim == 1) {
                System.out.println("Eklemek istediğiniz kitabın ismini yazın.");
                scan.nextLine();
                String name = scan.nextLine();
                Kitaplar ktp = new Kitaplar(name);
                tumKitaplar.add(ktp);
                alınabilecekKitaplar.add(ktp);
                kitapEkle();
            } else if (secim == 2) {
                adminIslemleri();
            } else {
                System.out.println("Yanlış tuşlama");
                kitapEkle();
            }

        } catch (Exception e) {
            System.out.println("1 ya da 2 yi tuşlamalısınız");
            kitapEkle();
        }
    }
    public void adminIslemleri(){
        System.out.println("----------------------------------------------------");

        System.out.println("Yapmak istediğiniz işlemi yazın");
        System.out.println("\t1 =>  Alabileceğiniz kitapları listelemek için\t\t\t 7 =>  Uyeleri listelemek için" +
                "\n\t2 =>  Tüm kitapları listelemek için\t\t\t\t\t\t 8 =>  Adminleri listelemek için" +
                "\n\t3 =>  Kütüphanemizden kitap alabilmek için\t\t\t\t 9 =>  Tüm personelleri listelemek için" +
                "\n\t4 =>  Daha önce aldığınız kitabı teslim etmek için\t\t10 =>  Personel eklemek için\t\t" +
                "\n\t5 =>  Kütüphaneye kitap eklemek için\t\t\t\t\t11 =>  Personel silmek için" +
                "\n\t6 =>  Kütüphaneden kitap silmek için\t\t\t\t\t12 =>  Bir üst menüye dönmek için" +
                "\n\t\t\t\t\t\t\t\t\t\t13 =>  SİSTEMDEN ÇIKIŞ");

        try {
            int   secim = scan.nextInt();
            switch (secim) {
                case 1:
                    getAlinabilecekKitapListesi();
                    break;
                case 2:
                    getKitapListesi();
                    break;
                case 3:
                    oduncKitapAl();
                    break;
                case 4:
                    kitapTeslimEt();
                    break;
                case 5:
                    kitapEkle();
                    break;
                case 6:
                    kitapSil();
                    break;
                case 7:
                    uyeleriListele();
                    break;
                case 8:
                    adminleriListele();
                    break;
                case 9:
                    personelleriListele();
                    break;
                case 10:
                    personelEkle();
                case 11:
                    personelSil();
                case 12:
                    anaSayfa();
                    break;
                case 13:
                   // System.exit(0);
                    return;
                default:
                    System.out.println("11 den küçük bir değer girmelisiniz");
                    adminIslemleri();
            }
        } catch (Exception e) {
            System.out.println("Hatalı tuşlama yaptınız yeniden denemelisiniz.");
        }
        System.out.println("Hatalı tuşlama yaptınız yeniden denemelisiniz.");

        //  adminIslemleri();

    }


}
