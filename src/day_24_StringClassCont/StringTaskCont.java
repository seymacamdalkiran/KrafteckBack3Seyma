package day_24_StringClassCont;
import java.util.*;
public class StringTaskCont {
    public static void main(String[] args) {
       // System.out.println(trim("    s dsffd      fdsf d   "));
       // System.out.println(tarih("19/02/2022","20:34:50"));
       // System.out.println(index("sdasfsdf","efrsgb"));
      //  System.out.println(countY("javayı seVİYOR MUyum"));
      //  System.out.println(sesliHarf("sdfas ghfgh f"));
        // System.out.println(sesliHarf("bu nasıl bir soru böyle"));
        System.out.println(kelimeler());
    }

    public static String kelimeler(){
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        String b=scan.nextLine();
        int ilki=a.length();
        int ikinci=b.length();
        String message="";
        while(ilki==ikinci) {
            if (ilki == ikinci) {
                if (a.equals(b)) {
                    message = "Yazdığınız bu kelimeler aynı";
                    return message;
                } else {
                    message = "Girdiğiniz kelimelerin karakter sayısı eşit";
                    return message;
                }
            } else {
                return    message = "uzunlukları farklı kelimeler yazdınız, yeniden deneyin";
            }}return message;
    }
    public static String sesliHarf(String message){
        String a="";
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i)=='a'||message.charAt(i)=='e'||message.charAt(i)=='i'||message.charAt(i)=='u'){
            a+=message.charAt(i)+",";
            }}return a;
    }
    public static int countY(String str){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='y'||str.charAt(i)=='Y'){
                count++;
            }
        }
        return count;
    }
    public static int index(String a,String b){
        return b.indexOf(a.charAt(0));
    }
    public static String tarih(String tarih,String saat){
        return tarih.replace("/","")+saat.replace(":","");
    }
    public static String trim(String message){
        return message.trim();
    }

}
