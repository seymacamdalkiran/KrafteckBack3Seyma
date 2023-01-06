package day_47_LibraryMenegment;

public class LibraryMember extends Personel{

    public LibraryMember(String fullName, String personelType) {
        super(fullName, personelType);
    }

    @Override
    public void addPersonal() {
        System.out.println("Üyelerin personel ekleme yetkisi yoktur");
    }

    @Override
    public void getAllPersonel() {
        System.out.println("Üyelerin personelleri listeleme yetkisi yoktur.");
    }
}
