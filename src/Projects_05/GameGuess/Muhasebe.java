package Projects_05.GameGuess;

public class Muhasebe extends Personal{

    int saatUcreti;
    String statü;
    int maas;

    public int maasHesapla(){
        maas=saatUcreti*8*30;
        return maas;
    }


}
