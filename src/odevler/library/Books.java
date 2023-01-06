package odevler.library;

import java.util.ArrayList;

public class Books {
/*
    1-Kütüphanede admin ,üyeler ve kitaplar vardır

    2-admin kullanıcılar kütüphane sistemine sistemine kitap ekleyebilir,
admin, üye ve tüm kitapları listeleyebilir, max 3 adet kitap emanet alabilirler.

    3-üye kişiler kitap ekleyemez ve tüm admin veya üye kişileri listeleyemez
sadece müsait kitap ödünç alabilir kitap başka birine emanet verilmiş ise alamaz,
emanet aldığı kitapları ve tüm müsait kitapları listeleyebilir.
 */

    ArrayList<String> books=new ArrayList<>();
    ArrayList<String> musaitKitaplar=new ArrayList<>();

    int musaitKitapSayisi=musaitKitaplar.size();

    public void addBooks(ArrayList<String> bookss){

    }


    public void adminKitapAl(String bookName){
        int count=3;
        for (int i = 0; i < books.size() ; i++) {
            if(bookName.equalsIgnoreCase(books.get(i)) && count>0){
                musaitKitapSayisi--;
                count--;
                musaitKitaplar.remove(bookName);
            }else{
                System.out.println("you are out of limit");
            }
        }
    }
    public void MusaitKitaplarList(){
        for (int i = 0; i <musaitKitaplar.size() ; i++) {
            System.out.println(musaitKitaplar.get(i));
        }
    }
    public void membersKitapAl(String bookName){
        for (int i = 0; i < musaitKitaplar.size(); i++) {
            if(bookName.equalsIgnoreCase(musaitKitaplar.get(i))){
                musaitKitapSayisi--;
                musaitKitaplar.remove(bookName);
            }
        }
    }

}


class main{
    public static void main(String[] args) {
        Admins ad=new Admins();
        ad.addBook("A");
        ad.addBook("B");
        ad.addBook("c");
        ad.addBook("d");

        ad.getBooksList();
        System.out.println("------------");

        Members mb=new Members();
        mb.MusaitKitaplarList();








    }

}
