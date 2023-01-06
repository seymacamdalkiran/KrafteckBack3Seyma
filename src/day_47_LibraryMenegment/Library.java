package day_47_LibraryMenegment;

import java.util.ArrayList;

public abstract class Library {
    static ArrayList<Personel> totalPersonel=new ArrayList<>();
    static ArrayList<Book> books=new ArrayList<>();

    public abstract void addPersonal();
    public abstract void getAllPersonel();

    public static void addPersonal(Personel personal){
        totalPersonel.add(personal);
    }

}
/*
1-Kütüphanede admin ,üyeler ve kitaplar vardır

2-admin kullanıcılar kütüphane sistemine sistemine kitap ekleyebilir,
 admin, üye ve tüm kitapları listeleyebilir, max 3 adet kitap emanet
 alabilirler.

3-üye kişiler kitap ekleyemez ve tüm admin veya üye kişileri listeleyemez
 sadece müsait kitap ödünç alabilir kitap başka birine emanet verilmiş ise
  alamaz, emanet aldığı kitapları ve tüm müsait kitapları listeleyebilir.

 */