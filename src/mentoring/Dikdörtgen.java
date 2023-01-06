package mentoring;

public class Dikdörtgen extends Sekil{
    int kısaKenar;
    int uzunKenar;

    public Dikdörtgen(int kısaKenar, int uzunKenar) {
        this.kısaKenar = kısaKenar;
        this.uzunKenar = uzunKenar;
    }

    public int alanHesapla(){
        return kısaKenar*uzunKenar;
    }
    public int cevreHesapla(){
        return 2*(kısaKenar+uzunKenar);
    }

    @Override
    public String toString() {
        return "mentoring.Dikdörtgen{" +
                "kısaKenar=" + kısaKenar +
                ", uzunKenar=" + uzunKenar +
                ", alanHesapla=" + alanHesapla() +
                ", cevreHesapla=" + cevreHesapla() +
                '}';
    }
}
