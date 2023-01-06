package day_23_StringClass;

import java.util.*;
public class StringTasks {
    public static void main(String[] args) {

        //  System.out.println(countOfChar());
        //  System.out.println(countOfChar("sdsd sd"));
        //  System.out.println(you("asd","srew"));
        //  fullName("hgfdsa","sdf");
        //  sonIndex("awedwqe");
        //  altAlta("Yavuz Kaan");
        //  oruntu("adasgergfd");
        //  System.out.println(sev("sgdsasv sevgili dfsdf"));
        //  System.out.println(son3("asdadfdgdg"));
        System.out.println(orta("yavuz"));

    }
    public static String orta(String name){

        return name.substring(name.length()/2-1,name.length()/2+2);
    }
    public static String son3(String name){
        for (int i = 0; i <3 ; i++) {
            name=name.substring(name.length()-3);
            name+=name.concat(name);
        }
        return name;
    }
    public static String sev(String a){
        String message="";
        if(a.toLowerCase().contains("sev")){
            message="ne hoş bir insan";
        }else{message="ok";}
        return message;
    }
    public static void oruntu(String isim){

        for (int i = 0; i <isim.length() ; i++) {
            if(i%2==0){
                System.out.print(isim.toUpperCase().charAt(i));
            }else{
                System.out.print(isim.toLowerCase().charAt(i));
            }
        }
    }
    public static void altAlta(String message){
        for (char i = 0; i <message.length() ; i++) {
            System.out.println(message.charAt(i));
        }
        System.out.println("--------------------");
        for (int i = message.length()-1; i >=0 ; i--) {
            System.out.println(message.charAt(i));
        }
    }
    public static int countOfChar(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Bir cümle yazın");
            String message = scan.nextLine();

            return message.length();
}
    public static int countOfChar(String str){

        return str.length();
    }
    public static int you(String name,String surName){

        return name.length()+surName.length();
    }
    public static void fullName(String name,String surName){
        System.out.println(name.toUpperCase()+" "+surName.toUpperCase());
    }
    public static void sonIndex(String message){
        System.out.println(message.charAt(message.length() - 1));
    }



}