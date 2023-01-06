package okulYonetimi;

public class Ogretmen extends Okul{
    private String bolum;
    private String sicilNo;


    public Ogretmen() {
    }

    public Ogretmen(String adSoyad, String tc, int yas, String bolum, String sicilNo) {
        super(adSoyad, tc, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }
}
