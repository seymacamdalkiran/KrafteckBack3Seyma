package odevler;

public class Kasım_24 {
    public static void main(String[] args) {

       //   sonRakam(12,223);
       //  asalSayı(22);
       // mutlakDeger(-324.34);
    }
    public static boolean sonRakam(int a,int b){
       boolean birlerBasamağı=true;
        if(a%10 != b%10)
        {birlerBasamağı=false;
        }
        System.out.println(birlerBasamağı);
        return birlerBasamağı;
    }
    public static boolean asalSayı(int a){

        boolean asal=true;
        int b=2;
        while(true){
        if(b!=a && a%b==0){
            System.out.println("Sayı asal sayı değildir "+false);}
        else{
            System.out.println("Sayı asal sayıdır "+true);
        }
            b++;
        return asal;}
    }
    public static double mutlakDeger(double a){
        if(a<0){a=-a;}
        System.out.println("Sayının mutlak değeri = "+a);
        return a;
    }





}
