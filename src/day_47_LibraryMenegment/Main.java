package day_47_LibraryMenegment;

public class Main {
    public static void main(String[] args) {
        Personel admin=new LibraryPersonel("Harun","Admin");
        Library.addPersonal(admin);
        admin.addPersonal();
        admin.getAllPersonel();


    }
}
