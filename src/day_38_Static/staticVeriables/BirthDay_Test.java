package day_38_Static.staticVeriables;

import day_38_Static.staticVeriables.BirthDay;

public class BirthDay_Test {
    public static void main(String[] args) {


    BirthDay aFm=new BirthDay();
    BirthDay Haci=new BirthDay();
    BirthDay Yunus=new BirthDay();
    BirthDay Mustafa=new BirthDay();
    BirthDay Busra=new BirthDay();
    BirthDay Ozlem=new BirthDay();

    // cakeSlice static olmadığında herkesin ayrı ayrı 26 dilim pasta hakkı var
    //  cakSlice static olursa 26 dilim pasta var. her alınan dilimden herkes etkilenir


    aFm.takeSlice();
        System.out.println("aFm.cakeSlice = " + aFm.cakeSlice);
    Haci.takeSlice();
        System.out.println("Haci.cakeSlice = " + Haci.cakeSlice);
    Yunus.takeSlice();

    Mustafa.takeSlice(2);
        System.out.println("Mustafa.cakeSlice = " + Mustafa.cakeSlice);
    Busra.takeSlice(3);
        System.out.println("Busra.cakeSlice = " + Busra.cakeSlice);

    Ozlem.takeSlice();

        System.out.println("BirthDay.cakeSlice = " + BirthDay.cakeSlice);
        // cakeSlice static olmazsa BirthDay ona erişemez


    }
}