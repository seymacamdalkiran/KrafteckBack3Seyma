package odevler;

import java.util.Scanner;

public class HomeworkSeyma {
    public static void main(String[] args) {

        System.out.println(soru_1("Merhaba"));
        System.out.println(soru_2("Merhaba Dünya"));
        System.out.println(soru_3("Merhabalar"));
        System.out.println(soru_4("Merhabalar","a","i"));
        System.out.println(soru_5("Merhaba"));
        System.out.println(soru_6("Ankara","a"));
        System.out.println(soru_7("Merhaba","a"));
        System.out.println(soru_8("ekin ektim","kin"));
        System.out.println(soru_9("Ekin","Ali"));
        System.out.println(soru_10("Ali"));
        System.out.println(soru_11("Salsa"));
        System.out.println(soru_12("Harun Kenan Can Özsoy      "));
        System.out.println(soru_13("Ananas"));
        System.out.println(soru_14("derslerime cok calisiyorum"));
        System.out.println(soru_15("Ankara"));
        System.out.println(soru_16("Merhaba"));
        System.out.println(soru_17("Merhaba"));
        System.out.println(soru_18("Karkas rotası"));   //oldu ama çok uzun
        System.out.println(soru18("Karkas rotası"));    //bulduuuuum:)
        System.out.println(soru_19("İftaÜür","Taüriif"));
        System.out.println(soru_20("abaccbb"));
        //System.out.println(soru_21());
        //System.out.println(soru21());         //Çok uzun
        System.out.println(soru_23("Nalan"));
        System.out.println(soru_25("Sev seni seveni, sevmek güzeldir."));
        System.out.println(soru_26("Ankara bursa kadar yeşil değil bir başka","ankara","bursa"));
        System.out.println(soru_27("zamlanacak"));
        System.out.println(soru_28("merhabA"));
        System.out.println(soru_29("aaaaaaaaaaaaaaabbcccccddbddddddbbbdd"));


    }
    public static String soru_29(String st){
        String str=st.toLowerCase().trim();
        int count=0;
        String result="";
        int max=0;
        for (int i = 0; i <str.length() ; i++) {
                count=str.length()-str.replace(str.substring(i,i+1),"").length();
                if(max<count){
                    max=count;
                    result=str.substring(i,i+1);
            }
        }
        return result;
    }
    public static String soru_28(String st){
        String str=st.toLowerCase().replace(" ","");
        String result="";
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(result.contains(str.charAt(i)+"")){
                continue;
            }
            count=str.length()-str.replace(str.charAt(i)+"","").length();
            result+=count+(str.charAt(i)+" ");
        }
        return result;
    }
    public static boolean soru_27(String str){

        return str.endsWith("acak");
    }
    public static boolean soru_26(String str,String an,String br){
        int a=0;
        int b=0;
        for (int i = 0; i <str.length()-5 ; i++) {
            if(str.substring(i,i+an.length()).equalsIgnoreCase(an)){
                a++;
            }if(str.substring(i,i+br.length()).equalsIgnoreCase(br)){
                b++;
            }
        }return a==b && a!=0;
    }
    public static int soru_25(String str){
        int count=0;
        for (int i = 0; i <str.length()-2 ; i++) {
            if(str.substring(i,i+3).equalsIgnoreCase("sev")){
                count++;
            }
        }return count;

    }

    // soru 24 soru 23 ün aynısı;
    public static boolean soru_23(String str){
       String ters="";
        for (int i = 0; i <str.length() ; i++) {
            ters+=str.charAt(str.length()-i-1);
        }

        return str.equalsIgnoreCase(ters);
    }

    //soru 22 soru 18in aynısı;

    public static String soru_21(){
        int count=0;
        Scanner scan=new Scanner(System.in);
        while(count<3){
            System.out.println("Kalan hakkınız = "+(3-count)+"\nLütfen 2 kelime yazın. 3 kere yazma hakkınız var");
            String s1=scan.nextLine();
            String s2=scan.nextLine();
            if(s1.length()>0&&s1.length()<5&&s2.length()>0&&s2.length()<5){
                return s1.concat(" ").concat(s2);
            }
            count++;
        }
        return "Hakkınız da bitti. Program sonlandı";
    }
    public static String soru21(){
        Scanner scan=new Scanner(System.in);
        int count1=0;
        int count2=0;
        String s1="";
        String s2="";
        while(count1<3){
            System.out.println("Lütfen bir isim yazın.\nKalan hakkınız = "+(3-count1));
            String ilkİsim=scan.nextLine();
            if(ilkİsim.length()>=1 && ilkİsim.length()<=4){
                s1=ilkİsim;
                break;
            } count1++;
        }
        if(s1.length()==0) {
            return "Hatalı giriiş, Program sonlandırıldı";
        }
        else{
            while(count2<3){
                System.out.println("Lütfen ikinci bir isim yazın\nKalan hakkınız = "+(3-count2));
                String ikinciİsim=scan.nextLine();
                if(ikinciİsim.length()>=1 && ikinciİsim.length()<=4){
                    s2=ikinciİsim;
                    break;
                }count2++;
            } if(s2.length()>0){
                return s1.concat(" ").concat(s2);
            }
        }
        return "hatalı giriiş, Program sonlandırıldı";
    }
    public static String soru_20(String str){
        String result="";
        for (int i = 0; i < str.length()-1; i++) {
            if(str.substring(i,i+1).equals(str.substring(i+1,i+2)) && !result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            }
        }if(result.length()==0){
            return "ardı ardına tekrar eden harf yoktur";
        }
        return result;
    }
    public static boolean soru_19(String s1,String s2){
        boolean result=false;
            for (int i = 0; i <s1.length() ; i++) {
              if(s1.toLowerCase().replace(s1.substring(i,i+1),"").length()==s2.toLowerCase().replace(s1.substring(i,i+1),"").length()){
                  result=true;
              }else{
                  return false;
              }
            }
        return result;
    }
    public static String soru_18(String str){
        String aynı="";
        String benzersiz="";
        String str1=str.toLowerCase().replace(" ","");
        for (int i = 0; i <str1.length() ; i++) {
            if(benzersiz.contains(str1.charAt(i)+"")){
                aynı+=str1.charAt(i);
                continue;
            }
            benzersiz+=str1.charAt(i);
        }
        for (int j = 0; j <aynı.length() ; j++) {
            benzersiz=benzersiz.replace(aynı.charAt(j)+"","");
        }
      //  System.out.println("aynı "+ aynı);
        String result="";
        if(benzersiz.length()>0){
            result=benzersiz.substring(0,1);
            for (int i = 0; i <str.length() ; i++) {
                if(result.equalsIgnoreCase(str.substring(i,i+1))){
                    result=str.charAt(i)+"";
                }
            }
        }
        else{result="Hiç bir harf benzersiz değildir.";}
        return result;
    }
    public static String soru18(String st){
        String str=st.replace(" ","");
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            count=str.length()-str.toLowerCase().replace(str.toLowerCase().substring(i,i+1),"").length();
            if(count==1){
                return str.substring(i,i+1);
            }
        }
        return "Benzersiz harf yoktur";
    }
    public static String soru_17(String str){

       return str.substring(str.length()-3)+str.substring(0,str.length()-3);
    }
    public static String soru_16(String str){

        return str.substring(3)+str.substring(0,3);
    }
    public static String soru_15(String str){
        String unlu="";
        String unsuz="";
        for (int i = 0; i <str.length() ; i++) {
            switch (str.charAt(i)){
                case 'a','e','ı','i','o','ö','u','ü','A','E','I','İ','O','Ö','U','Ü':
                    if(unlu.contains(str.charAt(i)+"")){
                        continue;
                    }
                    unlu+=str.charAt(i);
                    break;
                default:
                    if(unsuz.contains(str.charAt(i)+"")){
                        continue;
                    }
                    unsuz+=str.charAt(i);
                    break;
            }
        }
        System.out.println("Ünlü harfler ==> "+unlu);
        System.out.println("Ünsüz harfler ==> "+unsuz);
        return " ";
    }
    public static String soru_14(String str){
        String aynıHarfler="";
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if((str.charAt(i)+"").equalsIgnoreCase((str.charAt(j)+""))){
                    if(aynıHarfler.contains(str.charAt(i)+"")){
                        continue;
                    }
                    aynıHarfler+=str.charAt(i);
                }
            }
        }
        return aynıHarfler.replace(" ","");
    }
    public static String soru_13(String str){
        String kelime="";
        for (int i = 0; i <str.length() ; i++) {
            if(kelime.contains(str.charAt(i)+"")){
                continue;
            }
            kelime+=str.charAt(i);
        }return kelime;
    }
    public static String soru_12(String str){

        return "Soyadınız = "+str.substring( str.trim().lastIndexOf(" ")+1);
    }
    public static boolean soru_11(String str){

        return str.substring(0,2).equalsIgnoreCase(str.substring(str.length()-2));
    }
    public static String soru_10(String str){

        if(str.length()>=5){
            return str.substring(0,5);
        }
        String noktalı=str;
        for (int i = 0; i <5-str.length() ; i++) {
            noktalı=noktalı+".";
        }
        return noktalı;
    }
    public static String soru_9(String a,String b){
        String uzun;
        String kısa;
        String result="";
        if (a.length() >= b.length()) {
            uzun=a;
            kısa=b;
        }else{
            uzun=b;
            kısa=a;
        }
        result=kısa+kısa;
        for (int i = 0; i <30 ; i++) {
            result+=uzun;
        }result+=kısa+kısa;
        return result;
    }
    public static boolean soru_8(String str,String kin){

        return str.startsWith(kin)||str.substring(1).startsWith(kin);
    }
    public static String soru_7(String str,String kaldır){

        return str.toLowerCase().replace(kaldır,"");
    }
    public static int soru_6(String str,String c){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)+"").equalsIgnoreCase(c)){
                count++;
            }
        }return count;
    }
    public static String soru_5(String str){
        String s3="";
        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j <3 ; j++) {
                s3+=str.charAt(i);
            }
        }return s3;
    }
    public static String soru_4(String str,String s1,String s2){

        return str.replaceFirst(s1,s2);
    }
    public static String soru_3(String str){

        return str.substring(str.length()/2);
    }
    public static String soru_2(String str){

        return str.replace(" ","%");
    }
    public static String soru_1(String str){

        return str.substring(0,3);
    }

}
