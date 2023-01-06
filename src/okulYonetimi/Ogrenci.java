package okulYonetimi;

public class Ogrenci extends Okul{
    private int numara;
    private String sinif;

    public Ogrenci() {
    }

    public Ogrenci(String adSoyad, String tc, int yas, int numara, String sinif) {
        super(adSoyad, tc, yas);
        this.numara = numara;
        this.sinif = sinif;
    }


    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
}
