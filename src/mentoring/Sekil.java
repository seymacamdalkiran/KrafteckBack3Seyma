package mentoring;

public abstract class Sekil {

    public abstract int alanHesapla();
    public abstract int cevreHesapla();

}

class mainMetodu{
    public static void main(String[] args) {

        Cember cember1=new Cember(5);
        System.out.println(cember1);

        Kare kare1=new Kare(14);
        System.out.println(kare1);

        Dikdörtgen dikdortgen1=new Dikdörtgen(7,5);
        System.out.println(dikdortgen1);
    }
}