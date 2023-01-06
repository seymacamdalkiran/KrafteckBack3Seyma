package mentoring;

public class Cember extends Sekil {
    double radius;

    public Cember(double radius) {
        this.radius = radius;
    }

    @Override
    public int alanHesapla() {
        return (int) (Math.PI*Math.pow(radius,2));
    }

    @Override
    public int cevreHesapla() {
        return (int)(2*Math.PI*radius);
    }

    @Override
    public String toString() {
        return "mentoring.Cember{" +
                "radius=" + radius +
                ", alanHesapla=" + alanHesapla() +
                ", cevreHesapla=" + cevreHesapla() +
                '}';
    }
}

//5-Her metodun toStringini yapiniz.++
//  6- Main de bunlardan nesne olusturup sonuclari yazdirinz.

