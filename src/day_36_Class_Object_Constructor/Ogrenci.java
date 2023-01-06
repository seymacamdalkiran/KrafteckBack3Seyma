package day_36_Class_Object_Constructor;

public class Ogrenci {
    String tc;
    int okulNo;
    String ad;
    String soyad;
    int bolumNo;
    int fakulteNo;
    double yilSonuNotu;


    public boolean sinifiGectiMi(){
        if(yilSonuNotu<65){
            return false;
        }return true;
    }
    public int getOgrenciYili(){
        return Integer.parseInt("20"+String.valueOf(okulNo).substring(0,2));
    }



}
