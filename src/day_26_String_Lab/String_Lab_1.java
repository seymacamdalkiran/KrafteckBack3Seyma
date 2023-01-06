package day_26_String_Lab;

public class String_Lab_1 {
    public static void main(String[] args) {
     //   System.out.println(methotName("ko"));
     //   System.out.println(yuzde("bu günün konusu çok eğlenceli"," ","-"));
     //   System.out.println(yarisi("kelimeler"));
      //  System.out.println(tekrarla("harun"));
       // System.out.println(kacAdet("hAarun","a"));
       // System.out.println(isPolindrom(1221));
       // System.out.println(kacTane("anlamadankonuşmadanyaşanmaz","an"));

    }
    public static int kacTane(String str,String ne){
        int result=0;
        for (int i = 0; i <str.length()-ne.length()+1 ; i++) {
            if(str.substring(i,i+ne.length()).equalsIgnoreCase(ne)){
                result++;
            }
        }
        return result;
    }
    public static boolean isPolindrom(int a){
        String str=String.valueOf(a);
        String result="";

        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        } return str.equals(result);
    }
    public static int kacAdet(String str,String letter){
        int result=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.substring(i,i+1).equalsIgnoreCase(letter)){
                result++;
            }
        }
        return result;
    }
    public static String tekrarla(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j <3 ; j++) {
                result+=str.charAt(i);
            }
        }
        return result;
    }
    public static String yarisi(String str){
        return str.substring(0,(int)Math.ceil((double)str.length()/2));
    }
    public static String yuzde(String str,String target,String param){
        return str.replace(target,param);
    }
    public static String methotName(String str){        //olmadı bu, bi daha bak!!!
        if(str.length()<=3){return str.substring(0,3);}
        return str;

}



}