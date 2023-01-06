package day_30;

import java.util.Arrays;

public class Arrays_And_String_summary {
    public static void main(String[] args) {

     /*   String str="merhaba";
        String[] arr=str.split("");
        for (String harf:arr) {
            System.out.println(harf);
        }      */

      //  System.out.println(replace("merhaba","a","e"));
      //  System.out.println(replaceFirst("merhaba","a","e"));
      //  System.out.println(replaceFirst1("merhaba","a","e"));
      //  System.out.println(replaceFirst2("adanada ayran iç","a","e"));
      //  System.out.println(replaceFirst3("adanada ayran iç","a","e"));  //hatam nerde???
      //  System.out.println(Arrays.toString(harfKaldir("manisa","a")));
        System.out.println(soyAd("harun can aslantaş"));

    }

    public static String soyAd(String str){
        String str2=str.trim();
        int count=0;
        for (int i = 0; i <str2.length() ; i++) {
            if(str2.substring(i,i+1).equals(" ")){
                count=i;
            }
        }
        return str2.substring(count+1);
    }
    public static String[] harfKaldir(String kelime,String harf){
        String[] arry=kelime.split("");
        String[] result=new String[arry.length];

        for (int i = 0; i <arry.length ; i++) {
            if(arry[i].equals(harf)){
                continue;
            }result[i]=arry[i];
        }
        return result;
    }
    public static String replaceFirst3(String str,String target,String param){
        String[] degistir=str.split("");
        String result="";
        int count=0;
        for (int i = 0; i < degistir.length ; i++) {
            count++;
            if(degistir[i].equals(target)){
                if(count==3){
                degistir[i]=param;}
            }result+=degistir[i];
        }return result;
    }
    public static String replaceFirst2(String str,String target,String param){
        String[] degistir=str.split("");
        String result="";
        int count=0;
        for (int i = 0; i < degistir.length ; i++) {
            if(degistir[i].equals(target)&&count<2){
                degistir[i]=param;
                count++;
            }result+=degistir[i];
        }return result;
    }
    public static String replaceFirst1(String str,String target,String param){
        String[] arry=str.split("");
        String result="";
        int count=0;
        for (int i = 0; i <arry.length ; i++) {
            if(arry[i].equals(target)&&count==0){
                arry[i]=param;
                count++;
            }result+=arry[i];
        }return result;
    }
    public static String replaceFirst(String str,String target,String param){
        String[] arry=str.split("");
        String result="";
        boolean first=true;
        for (int i = 0; i <arry.length ; i++) {
            if(arry[i].equals(target)&&first){
                arry[i]=param;
                first=false;
            }result+=arry[i];
        }return result;
    }
    public static String replace(String str,String target,String param){
        String[] arry=str.split("");
        String result="";

        for (int i = 0; i < arry.length; i++) {
            if (arry[i].equals(target)){
                arry[i]=param;
            }
            result+=arry[i];
        }
        return result;
    }
}
