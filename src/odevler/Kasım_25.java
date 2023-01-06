package odevler;
import java.util.*;
public class Kasım_25 {
    public static void main(String[] args) {


        // ikiSayı();
         weiding();


    }
    public static int ikiSayı(){
        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayı yaz");

        int x= scan.nextInt();
        int y= scan.nextInt();
        if(y%3==0){
           return toplam(x,y);
        }else{
           return toplam(x,uc(y));
        }

    }//ikiSayı methodunu returnlü yazmak istersek hem ife hem else return ata
    public static int uc(int y){
        if(y%3==1){y=y+2;}
        else{
            y=y+1;
        }return y;
    }
    public static int toplam(int x,int y){
        int toplam=x+y;
        System.out.println("Toplam = "+ toplam);
        return toplam;
    }

    public static String weiding(){       //Bu soruyudaki return mantığı doğru mu?
        Scanner scan=new Scanner(System.in);
        System.out.println("İsimlerinizi yazınız");
        String a=scan.nextLine();
        String b=scan.nextLine();
        String message="";
        if(a.equals(b)){
           baska();
        }else{ kart(a,b);}
        return message;
    }
    public static String baska(){
        System.out.println("Birbirinden farklı iki isim yazın");
        return weiding();
    }
    public static String kart (String a,String b){
        String c="";
                System.out.println("EVLENİYORUZ  "+a+b+"  💫🌠⭐️✴️✨");
        return c;
    }










}
