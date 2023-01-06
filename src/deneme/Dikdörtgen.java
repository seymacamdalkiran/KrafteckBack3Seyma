package deneme;

public class Dikdörtgen implements Geo {
    double kısaKenar;
    double uzunKenar;

    public Dikdörtgen(double kısaKenar,double uzunKenar){          //Constructor demek
       this.kısaKenar=kısaKenar;
       this.uzunKenar=uzunKenar;

        System.out.println("Alan = "+alanHesapla()+"\nCevre = "+cevreHesapla(kısaKenar, kısaKenar,uzunKenar,uzunKenar));
    }
    @Override
    public double alanHesapla() {
        return this.kısaKenar*this.uzunKenar;
    }

}
