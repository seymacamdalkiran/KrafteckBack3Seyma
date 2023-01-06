package day_47_LibraryMenegment;

import java.util.Scanner;

public class LibraryPersonel extends Personel{

    public LibraryPersonel(String fullName, String personelType) {
        super(fullName, personelType);
    }
    @Override
    public void addPersonal() {
        System.out.println("-----PERSONEL EKLEME SAYFASI-----");
        System.out.println("1-Üye Ekle\n2-Admin Ekle\n3-Çıkış");
        System.out.println("Seçim");
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        scan.nextLine();
        if (secim == 1) {
            System.out.println("Personel Full Name = ");
            String fullName = scan.nextLine();
            Personel member = new LibraryMember(fullName, "Üye");
            totalPersonel.add(member);
        } else if (secim == 2) {
            System.out.println("Personel Full Name = ");
            String fullName = scan.nextLine();
            Personel admin = new LibraryPersonel(fullName, "Admin");
            totalPersonel.add(admin);
        } else if (secim == 3) {
            System.out.println("Ekleme sayfasından çıkılıyor");
            return;
        } else {
            System.out.println("Hatalı giriş. 1-2-3 seçimlerinden birini yapın.");
        }
        addPersonal();
    }
    @Override
    public void getAllPersonel() {
        for (Personel personal: totalPersonel) {
            System.out.println(personal.personelId+" "+personal.fullName+" "+personal.personelType);
        }
    }
}
