package deneme;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class kasım_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*
        System.out.println("Kaça kadar olan sayıları yazalım?");
        int x=scan.nextInt();
        for (int i = 1; i <=x ; i++) {
            if(i%15==0){
                continue;
            }
            System.out.print(i+" ");
        }


        for (int i = 1; i <=10; i++) {
            for(char k=65;k<68;k++){
                if(i==3){
                    System.out.print(""+k+i+" ");
                    if(k==65){break;}
                }
           }if(i==3){
                continue;
            }
            System.out.print(i+ " ");
        }
*/
        String txt="Hello World";
        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
       

       // System.out.println(harf(5));
       // kar(5,"cam",false);
    }
    public static String harf(int x){
        String s="";
        Random ran=new Random();

        for (int i = 0; i <x ; i++) {
            char ch=(char)ran.nextInt(65,90);
        if(ch!='Q'&&ch!='W'&&ch!='X'){
        s=s+ch+" "; }
        else if(ch=='Q'||ch=='W'||ch=='X'){
            i=--i;
        }
    }
        return s;
    }
    public static void kar(int x,String b,boolean c){
        if(c==true){
            System.out.println(""+x+b);
        }else if(c==false){
            concat(x,b);
        }
    }
    public static void concat(int x,String s){
        for (int i = 0; i <x ; i++) {
        System.out.println(s);}
    }

    }

