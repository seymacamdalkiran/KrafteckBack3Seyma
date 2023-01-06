package day_27;

public class String_Lab {
    public static void main(String[] args) {

       // System.out.println(harfTemizle("merhaba","a"));
       // System.out.println(kelime("kinlenmek","inl"));
       // System.out.println(ikiDefa("Mehmet","Ayse"));
       // System.out.println(ilk3("merhabalar"));
        System.out.println(ilkSon("Kafka"));

    }
    public static boolean ilkSon(String str){
      return  str.substring(0,2).equalsIgnoreCase(str.substring(str.length()-2));
    }
    public static String ilk3(String str){
        if(str.length()<=3){
            return str;
        }String result="";
        for (int i = 0; i <str.length()-3 ; i++) {
            result+=".";
        }
        return str.substring(0,3)+result;
    }
    public static String ikiDefa(String a,String b){
        String result="";
       if(a.length()>=b.length()){
           result=a+a;
           for (int i = 0; i <10 ; i++) {
               result+=b;
           }
           result=result+a+a;
       }
       else{
           result=b+b;
           for (int i = 0; i <10 ; i++) {
               result+=a;
           }
           result=result+b+b;
       }return result;

    }
    public static boolean kelime(String str,String target){
        return str.substring(0,target.length()+1).contains(target);
    }
    public static String harfTemizle(String str,String target){
        return str.replace(target,"");
    }

}
