package day_20_;
import java.util.*;
public class Tasks {
    public static void main(String[] args) {

      //  harf();
      //  System.out.println(generat(10));
        startProcess("dugun kartı için ismlerinizi giriniz");

    }
    public static void harf(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç tane harf yazılmasını istersiniz?");
        int x=scan.nextInt();
      dış:  for (int i = 1; i <=x ; i++) {
        iç:    for(char y=65;y<=65+x;y++){
            System.out.print(y+" ");
            break iç;}
        }


    }

    public static String generat(int a){
        Random rd=new Random();
        char ch;
        String str="";

        for (int i = 0; i < a; i++) {
          ch=(char)(  rd.nextInt(26)+65);
          str+=ch+" ";
        }

        return str;
    }
    public static void startProcess(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String s = sc.nextLine();
        String s2 = sc.nextLine();
        if (s.equals(s2)){
            goingProcess();
        }else{
            goingProcess(s,s2);
        }
    }
    public static void goingProcess(){
        String s = "gitmiş olduğunuz kelimeler aynı farklı kelime giriniz";
        startProcess(s);
    }
    public static void goingProcess(String a, String b){
        System.out.println("------------------------");
        System.out.println("*****"+a+" ve "+b+ "******");
        System.out.println("kasımda guzel bir gunde");
        System.out.println("mutlu gunumuzde sizi bekleriz");
        System.out.println("----------------------------");
    }








}
