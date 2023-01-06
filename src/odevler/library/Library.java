package odevler.library;

public abstract class Library {
    /*
    1-Kütüphanede admin ,üyeler ve kitaplar vardır

    2-admin kullanıcılar kütüphane sistemine sistemine kitap ekleyebilir,
admin, üye ve tüm kitapları listeleyebilir, max 3 adet kitap emanet alabilirler.

    3-üye kişiler kitap ekleyemez ve tüm admin veya üye kişileri listeleyemez
sadece müsait kitap ödünç alabilir kitap başka birine emanet verilmiş ise alamaz,
emanet aldığı kitapları ve tüm müsait kitapları listeleyebilir.
 */
    int kitapSayisi=0;

    public Library(){
        kitapSayisi++;
    }

}
