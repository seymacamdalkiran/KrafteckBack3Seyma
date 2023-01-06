package deneme;

public class Cember implements Geo {

double yarıCap;
    public Cember(double yarıCap){
        this.yarıCap=yarıCap;
        System.out.println("Alan = "+alanHesapla()+"\nCevre = "+cevreHesapla(yarıCap));

    }
    @Override
    public double cevreHesapla(double... sides) {
        return 2*Math.PI*sides[0];
    }

    @Override
    public double alanHesapla() {
        return Math.PI*Math.pow(yarıCap, 2);
    }
}
