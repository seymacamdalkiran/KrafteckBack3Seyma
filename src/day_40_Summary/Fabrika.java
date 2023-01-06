package day_40_Summary;

public class Fabrika {

    String fabrikaAdi;
    double depolamaAlani;
    boolean isContainArge;
    int isciSayisi;

    public static double vergiOrani;

    public Fabrika(){
        System.out.println("Fabrika oluşturuldu");
    }

    public Fabrika(String fabrikaAdi){
        this();
        this.fabrikaAdi=fabrikaAdi;
    }


    public Fabrika(String fabrikaAdi, double depolamaAlani) {
        this.fabrikaAdi = fabrikaAdi;
        this.depolamaAlani = depolamaAlani;
    }

    public Fabrika(String fabrikaAdi, double depolamaAlani, boolean isContainArge) {
        this(fabrikaAdi, depolamaAlani);
        this.isContainArge = isContainArge;
    }
    public void depolamaAlaniniArttir(double artisMiktari){
        this.depolamaAlani=this.depolamaAlani+artisMiktari;
        System.out.println(depolamaAlani);
    }
    public int metreKareBasiOran(){
        return (int)(this.depolamaAlani/this.isciSayisi);
    }
    //Static metotlarda this keywordu kullanılamaz


}
