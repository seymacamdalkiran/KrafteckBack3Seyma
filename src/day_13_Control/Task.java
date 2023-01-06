package day_13_Control;
import java.util.*;
public class Task {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
/*
        for(int i=0;i<=100;i++){
            System.out.print(i+" ");  }
                    System.out.println("\n--------------");

        for (int i = 0; i <=100 ; i++) {
           if(i%2==0) {System.out.print(i+" ");}}
                   System.out.println("\n--------------");


        for (int i = 50; i>10 ; i--) {
            if(i%2==1) {System.out.print(i+" ");}}

        System.out.println("\n--------------");

        for(int i=0; i<100; i++){
            if(i%2==1){
                System.out.print(i+" ");}}
        System.out.println("\n--------------");



        int sum=0;
        for (int i = 0; i <= 100; i++) {
            sum=sum+i;}
            System.out.print(sum);
        System.out.println("\n--------------");
       //süslü parantezin içinde sout yaparsak tüm sayıları yazıyor. Dışında yazarsak sadece sonuncuyu yazıyor.

        int sum1=0;
        for(int i=0;i<=100;i++){
          if(i%2==1){sum1=sum1+i;}}
        System.out.print(sum1+" ");

        System.out.println("\n--------------");

        int s=1;
        for(int i=1;i<60;i++){
            if(i%15==0){s=s*i;}}
        System.out.println(s);





        for (int i = 1; i < 20; i++) {
        System.out.println(i+" x 3 = "+(i*3));}

//ANLAYAMADIM SOR MUTLAKA
        int x=0;
        for (int i = 0; i < 30 ; i++) {
            if(i%2==1){
                x=i+3;
                System.out.println(i+" + 3 = "+x );}
            else{ x=i*2;
                System.out.println("\t"+i+ " x 2 = "+x);
        }}

        for (int i = 30; i <=70 ; i++) {
            if(i%3==0){
                System.out.print(i+" ");}}


        for (int i = 0; i < 1000; i++) {
            if(i%100==11){
                System.out.println("sonu 11 ile biten sayı = "+i);}}

 */

        System.out.println("Başlangıç sayısını yazın.");
        int x1=scan.nextInt();
        System.out.println("Bitiş sayısını yazın. ");
        int y=scan.nextInt();
        if(x1<y){
        int t=1;
        for (int i = x1; i <=y ; i++) {
            t*=i;}
            System.out.println(t);}
        else{int t=1;
            for (int i = y; i <=x1 ; i++) {
                t*=i;}
            System.out.println(t);}

        System.out.println("----------------");

        System.out.println("Yaşınız = ");
        int yas=scan.nextInt();
        System.out.println("İsminiz = ");
        String bos=scan.nextLine();
        String isim=scan.nextLine();
        for (int i = 0; i <=yas; i++) {
            System.out.println(isim);}














    }}
