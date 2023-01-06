package Projects_05.GameGuess;

import java.util.Random;

public class Personal {
    int id;
    String isim;
    String soyisim;
    String adres;
    String tel;
    public static int sayac=1000;
    public static int sayac2=2000;
    public int idAta(){
        this.id=sayac++;
        return id;
    }
    public int idAtaIsci(){
        this.id=sayac2++;
        return id;
    }

}