package kutuphane;

import java.util.Scanner;

public class MainKutuphane {

    public static void main(String[] args) {

      Insanlar admin=new Admin("Harun", Sifat.admin);
      admin.personelEkle(admin);
        admin.anaSayfa();
        for (int i = 0; i <admin.myBook.size() ; i++) {
            System.out.println(admin.myBook.get(i).kitapAdi);
// Harun
        }


        // KİTAP ALMAK İÇİN 3 HAK VAR, onu yapamamışsın

        //  try catch çalışmıyor onu kontrol et


    }
}
