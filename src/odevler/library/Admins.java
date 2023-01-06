package odevler.library;

import java.util.ArrayList;

public class Admins extends Members{

    String adminName;
    int toplamKitap=books.size();
    ArrayList<String> admins=new ArrayList<>();

    public void addMember(String memberName){
        members.add(memberName);
    }
    public void addAdmin(String adminName){
        admins.add(adminName);
    }
    public void addBook(String bookName){
        books.add(bookName);
        musaitKitaplar.add(bookName);
        toplamKitap++;
        musaitKitapSayisi++;
    }
    private void toplamKitapSayisi(){
        System.out.println(toplamKitap);
    }
    public void getMembersList(){
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i));
        }
    }
    public void getBooksList(){
        for (int i = 0; i <books.size() ; i++) {
            System.out.println(books.get(i));
        }
    }
    public void getAdminsList(){
        for (int i = 0; i <admins.size() ; i++) {
            System.out.println(admins.get(i));
        }
    }



}
