package deneme;

import java.util.Arrays;

public class Aralik_8_Odeve_Hazirlik {

    public static void main(String[] args) {
     /*   System.out.println(ilk3("yavuz kaan"));
        System.out.println(bosluk("yavuz kaan"));
        System.out.println(ikinciYarı("sanayagi"));
        System.out.println(ilkiniDegistir("kasaba","a","i"));
        System.out.println(herHarf3Defa("ali"));
        System.out.println(kacTane("edirne",'e'));
        System.out.println(harfKaldır("merhaba","a"));
        System.out.println(kin("ekinlenmek","kin"));
        System.out.println(concat("ali","mehmet"));
        System.out.println(ilk5("ya"));
        System.out.println(ilk2("Kafkaokur"));

        Örnek 26:Array’in içerisindeki ne kadar 1 var ise hepsini en sağa taşıyan metodu yazınız.
        [5,1,9,6,1,4,7,11,25,36] →[5,9,6,4,7,11,25,36,1,1]

      */

        int[] bir={1,0,5,1,-9,6,0,1,4,7,11,25,36,1,1,1,1};
        System.out.println(Arrays.toString(birleriTasi(bir)));


    }
    public static int[] birleriTasi(int [] arry){
        int[] newArry= Arrays.copyOf(arry,arry.length);
        int bir=0;
        for (int i = 0; i <newArry.length ; i++) {
            if(newArry[i]==1){
                bir++;
            }
        }
        while(bir>=0) {
            for (int i = 0; i < newArry.length; i++) {
                if (newArry[i] == 1 && i != newArry.length - 1) {
                    newArry[i] = newArry[i + 1];
                    newArry[i + 1] = 1;
                }
            }bir--;
        }
        return newArry;
    }
    public static boolean ilk2(String str){
        return str.substring(str.length()-2).equalsIgnoreCase(str.substring(0,2));
    }
    public static String ilk5(String str){
        String result="";
        if(str.length()>=5){
            result=str.substring(0,5);
        }else{
            result=str;
            for (int i = 0; i <5-str.length() ; i++) {
                result+=".";
            }
        }return result;
    }
    public static String concat(String str1,String str2){
        String result="";
        if (str1.length()>=str2.length()){
            result=str2+str2;
            for (int i = 0; i <10 ; i++) {
                result+=str1;
            }result+=str2+str2;
        }else{
            result=str1+str1;
            for (int i = 0; i <10 ; i++) {
                result+=str2;
            }result+=str1+str1;
        }
        return result;
    }
    public static boolean kin(String str,String kin){
        return str.startsWith(kin)||str.substring(1).startsWith(kin);
    }
    public static String harfKaldır(String str,String harf){
        return str.replace(harf,"");
    }
    public static int kacTane(String str, char a){
        int result=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==a){
                result++;
            }
        }return result;
    }
    public static String herHarf3Defa(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j < 3; j++) {
                result+=str.charAt(i);
            }
        }return result;
    }
    public static String ilkiniDegistir(String str,String a,String b){
        return str.replaceFirst(a,b);
    }
    public static String ikinciYarı(String str){
        return str.substring(str.length()/2);
    }
    public static String bosluk(String str){
        return str.replace(" ","%");
    }
    public static String ilk3(String str){
        return str.substring(0,3);
    }

}
