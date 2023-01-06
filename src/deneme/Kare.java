package deneme;

public class Kare extends Dikdörtgen {
    


    public Kare(double kısaKenar){       //Constructor demek
       super(kısaKenar, kısaKenar);
    }
    @Override
    public double alanHesapla() {
        return Math.pow(super.kısaKenar,2);
    }

}
