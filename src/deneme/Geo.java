package deneme;

public interface Geo {

    double alanHesapla();   //Abstrack demek

    default double cevreHesapla(double... sides){
        double cevre=0;
        for (int i = 0; i < sides.length ; i++) {
            cevre+=sides[i];
        }
        return cevre;
    }// burda default ya da private(ama sacma) yazmadıkça hata veriyor.
    //Public ve protected kabul etmiyor. boş da bırakamıyoruz.


}
