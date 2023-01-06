package odevler;
import java.util.*;
public class kasım_30 {
    public static void main(String[] args) {
        //concatKısa("Yazılım", "Krafttect", "Kursu");
        //concat("Yazılım", "Krafttect", "Kursu");
        //System.out.println(boslukKes("     Asfds rturt LJnjb    "));
        //System.out.println(tarihDamga("18/10/2022","20:50:55"));
        //System.out.println(index("kraftteck", "yazılım kursu"));

       // System.out.println(" Cümle sadece harflerden mi oluşmuş ==>  " +letter());
       // System.out.println("Yazdığınız cümledeki ingilizce harf olmayan karakteler şunlardır==>\n" +letter());
    }
    public static String kullanici(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle yazın");
        String cumle=scan.nextLine();
        return cumle;
    }
    public static String letter() {
        String cumle = kullanici();
      //  boolean result=true;
        String b="";
        for (int i = 0; i < cumle.length(); i++) {
            char a = cumle.charAt(i);
            if (((a < 65) || (a > 122) || (a > 90 && a < 97))&&(a!=32)) {
               b+=a;
        //        result= false;
            }}
       return b;
    }
    public static int index(String a,String b){
        return b.indexOf(a.charAt(0));
    }
    public static String tarihDamga(String a,String b){
        a=a.replace("/","");
        b=b.replace(":","");
        return a.concat(b);
    }
    public static String boslukKes(String message){
        message=message.trim();
        return message;
    }
    public static void concat(String word1, String word2, String word3) {
        int a = word1.length();
        int b = word2.length();
        int c = word3.length();
        int max = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);
        if (max == a) {
            if (b > c) {
                System.out.println(word1.concat(word2).concat(word3));
            } else {
                System.out.println(word1.concat(word3).concat(word2));
            }
        } else if (max == b) {
            if (a > c) {
                System.out.println(word2.concat(word1).concat(word3));
            } else {
                System.out.println(word2.concat(word3).concat(word1));
            }
        } else {
            if (a > b) {
                System.out.println(word3.concat(word1).concat(word2));
            } else {
                System.out.println(word3.concat(word2).concat(word1));
            }
        }
    }
    public static void concatKısa(String word1, String word2, String word3) {
        if(word1.length()>=word2.length() && word1.length()>=word3.length() && word2.length()>=word3.length()){
            System.out.println(word1.concat(word2).concat(word3));
        }
        else if (word1.length()>=word2.length() && word1.length()>=word3.length() && word3.length()>=word2.length()) {
            System.out.println(word1.concat(word3).concat(word2));
        }
        else if (word2.length()>=word1.length() && word2.length()>=word3.length() && word1.length()>=word3.length()) {
            System.out.println(word2.concat(word1).concat(word3));
        }
        else if (word2.length()>=word1.length() && word2.length()>=word3.length() && word3.length()>=word1.length()) {
            System.out.println(word2.concat(word3).concat(word1));
        }
        else if (word3.length()>=word1.length() && word3.length()>=word2.length() && word2.length()>=word1.length()) {
            System.out.println(word3.concat(word2).concat(word1));
        }
        else if (word3.length()>=word2.length() && word3.length()>=word1.length() && word1.length()>=word2.length()) {
            System.out.println(word3.concat(word1).concat(word2));
        }

    }



}