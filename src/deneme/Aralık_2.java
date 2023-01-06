package deneme;
import java.util.*;
public class Aralık_2 {
    public static void main(String[] args) {
        // System.out.println(yHarfi("javayı seviyor muyum sevmiyor muyum"));
        // System.out.println(aei("javayı seviyor muyum hacı"));
        // System.out.println(kelimelerAynımı());
        // System.out.println(lovely("bayramları sviyoruz"));
        // System.out.println(name("şeyma",2,5));
        // System.out.println(orta("yavuzkaan"));
        // System.out.println(nameSurname("Yavuz","KaanCam"));
        // System.out.println(arindir("Ayşe","Alacatı"));
        // System.out.println(basSon("Aysenur","Yavuz"));
        // System.out.println(nickName("aysenur","dalkıran"));
       // System.out.println(tersten("kelime"));
       // System.out.println(sesliHarf("katı meyve sileceği"));
       // System.out.println(userNamePassword());

        System.out.println(parametre("yavuz neden uyumadın"));
    }
    public static String parametre(String word){

        return   word.replace('a','i').replace('e','i').replace('ı','i').
        replace('o','i').replace('ö','i').replace('u','i').replace('ü','i');

        /*   for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='ı'||word.charAt(i)=='i'||
            word.charAt(i)=='u'||word.charAt(i)=='ü'||word.charAt(i)=='o'||word.charAt(i)=='ö'){
             str+=  word.replace(word.charAt(i), 'o')+" ";
           } }*/
    }
    public static String userNamePassword(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Geçerli bir kullanıcı adı girin.");
        String userName=scan.nextLine();

        while(userName.length()<3){
        if(userName.isEmpty()){
            System.out.println("Kullanıcı adı boş olamaz");
            userName=scan.nextLine();
        }else if( userName.length()<3){
            System.out.println("Kullanıcı adı en az 3 karakter olmalı");
            userName=scan.nextLine();
        }}
        System.out.println("Kullanıcı adı başarılı\nGeçerli bir şifre giriniz");
        String password=scan.nextLine();

        while ( password.length()<8 ){
            if(password.isEmpty() ){
                System.out.println("Şifre kısmı boş olamaz\nGeçerli bir şifre giriniz");
                password=scan.nextLine();
            }else if(password.length()<8){
                System.out.println("Şifre 8 karakterden az olamaz.\nGeçerli bir şifre giriniz");
                password=scan.nextLine();
            }}
        return "Kullanıcı adı ve şifre başarı ile oluşturuldu";
    }
    public static String tersten(String word){
        String ters="";
            for (int i = word.length()-1; i >=0; i--) {
                ters+=word.charAt(i);
        }return ters;
    }
    public static String nickName(String name,String surName){
        return name.substring(0,3)+" "+surName.substring(surName.length()-3);
    }
    public static String basSon(String str1,String str2){
        String str="";
        if(str1.length()>str2.length()){
            str=str2.concat(str1).concat(str2);
        }else{
            str=str1.concat(str2).concat(str1);
        }
        return str;
    }
    public static String arindir(String name, String surName){
        String arindir="";
        if(surName.toLowerCase().contains(name.toLowerCase().substring(0,1))){
            arindir=name+" "+surName.toLowerCase().replace(name.toLowerCase().substring(0,1),"");
        }else{
            arindir=name+" "+surName;
        }
        return arindir;
    }
    public static String nameSurname(String name,String surName){
       if(name.length()>surName.length()) {
           name=name.substring(0,surName.length());
       }
        else{ surName= surName.substring(0,name.length());
        }
    return name.concat(surName);
    }
    public static String orta(String name){
      return name.substring(name.length()/2-1,name.length()/2+2);
    }
    public static String name(String name,int sonKac,int kacKere){
        String son3="";
        for (int i = 0; i < kacKere; i++) {
          son3+= name.substring(name.length()-sonKac)+" ";
        }
        return son3;
    }
    public static String lovely(String message){
        String mes="";
        if (message.contains("sev")){
            mes="what a lovely person";
        }else{mes="ok";
        }
        return mes;
    }
    public static String kelimelerAynımı(){     //scanner metodunu çağırarak yapamadım!!!
        String message="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki kelime yazın");
        String a = scan.nextLine();
        String b = scan.nextLine();
           if(a.length()==b.length()){
            if(a.equals(b)){
            message="Bu kelimeler aynı";
            }else{
                message="Girdiğiniz kelimelerin karakter sayısı eşit";
            }
           }else {
               System.out.println("Kelimeler her anlamda farklı, lütfen başka iki kelime yazın");
               return kelimelerAynımı();
           }
        return message;
    }
    public static void scanner(){ // iki stringi döndüremiyor muyum aynı anda?
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki kelime daha yazın");
        String a=scan.nextLine();
        String b=scan.nextLine();
    }
    public static int yHarfi(String message){
        int count=0;
        for (int i = 0; i <message.length() ; i++) {
            if(message.charAt(i)=='y'||message.charAt(i)=='Y'){count++;}
        }
        return count;
    }
    public static String aei(String message){
        String x="";
        for (int i = 0; i <message.length() ; i++) {
            switch(message.charAt(i)){
                case 'a','e','ı','i','o','ö','u','ü':
                x+=message.charAt(i)+",";
            }
        }
        return x;
    }
    public static String sesliHarf(String word){
        String sesli="";
      /*  for (int i = 0; i <word.length() ; i++) {
           if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='ı'||word.charAt(i)=='i'||word.charAt(i)=='o' ||
                   word.charAt(i)=='ö'||word.charAt(i)=='u'||word.charAt(i)=='ü'){
               sesli+=word.charAt(i);  }}*/

        return sesli;
    }


}
