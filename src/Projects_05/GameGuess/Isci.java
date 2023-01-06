package Projects_05.GameGuess;

public class Isci extends Muhasebe{
    public static void main(String[] args) {

        Isci isci_1=new Isci();
        Isci isci_2=new Isci();

        isci_1.saatUcreti=10;
        isci_2.saatUcreti=15;

        isci_1.id= isci_1.idAtaIsci();
        isci_2.id= isci_2.idAtaIsci();

        System.out.println("isci_1 = "+isci_1.id+" "+isci_1.maasHesapla());
        System.out.println("isci_1 = "+isci_2.id+" "+isci_2.maasHesapla());

    }

}
