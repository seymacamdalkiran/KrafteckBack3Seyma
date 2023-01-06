package mentoring;

public class Kare extends Dikdörtgen{
    int kısaKenar;

    public Kare(int kısaKenar){
        super(kısaKenar,kısaKenar);
    }

    @Override
    public String toString() {
        return "mentoring.Kare{" +
                "kısaKenar=" + kısaKenar +
                ", alanHesapla=" + alanHesapla() +
                ", cevreHesapla=" + cevreHesapla() +
                '}';
    }
}
