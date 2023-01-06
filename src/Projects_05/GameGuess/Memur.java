package Projects_05.GameGuess;

public class Memur extends Muhasebe {

    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statü='" + statü + '\'' +
                ", maas=" + maas +
                ", id=" + id +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {


    Memur memur_1=new Memur();
    Memur memur_2=new Memur();

    memur_1.isim="Ahmet";
    memur_1.soyisim="Yolcu";
    memur_1.adres="koşu yolu";
    memur_1.saatUcreti=20;
    memur_1.statü="şef";
    memur_1.tel="05055055050";
    memur_1.id=memur_1.idAta();
    memur_1.maas=memur_1.maasHesapla();

    memur_2.id= memur_2.idAta();

        System.out.println("memur_1 = "+memur_1.id+" "+memur_1.maas);
        System.out.println("memur_2 = " + memur_2.id+" "+memur_2.maas);


    }
}
