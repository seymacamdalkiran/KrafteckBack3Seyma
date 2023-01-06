package deneme;
import java.util.*;
public class ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("---task1--------");
        for(int i=0;i<=100;i++){
            System.out.print(i+" ");}


        System.out.println("\n---task2--------");
        for(int i=0;i<=100;i++){
            if(i%2==1) {
                System.out.print(i+" ");
            }}

        System.out.println("\n---task3--------");
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }}

        System.out.println("\n---task4--------");
        for(int i=50;i>=10;i--){
            if(i%2==1){
                System.out.print(i+" ");
            }}

        System.out.println("\n---task5--------");
        int toplam=0;
        for(int i=0;i<=100;i++){
            toplam=toplam+i;}
            System.out.print(toplam+" ");

        System.out.println("\n---task6--------");
        for(int i=1;i<=20;i++){
            System.out.println(i+" x 3 = "+(i*3));}

        System.out.println("\n---task7--------");
            for(int i=0;i<=30;i++){
                if(i%2==1){
                    System.out.println("\t\t\t\t"+i+" + 3 = "+(i+3));}
                    else{
                    System.out.println(i+" x 2 = "+(i*2));
                    }}

        System.out.println("---task8--------");
            for(int i=30;i<=70;i++){
                if(i%3==0){
                    System.out.print(i+" ");
                }}

        System.out.println("\n---task9--------");
            for(int i=0;i<=1000;i++){
                if(i%100==11){
                    System.out.print(i+" ");
                }}
        System.out.println("\n---task10--------");
        System.out.print("Başlangıç sayısını yazın =  ");
        int x=scan.nextInt();
        System.out.print("Bitiş sayısını yazın =  ");
        int y=scan.nextInt();
        if(x<y){
            int z=1;
            for(int i=x;i<=y;i++){
                z=z*i;
            }
            System.out.println("sayıların çarpımı =  "+z);

        }else{int z=1;
        for(int i=y;i<=x;i++){
            z=z*i;
        }
        System.out.println("sayıların çarpımı =  "+z);
        }

        System.out.println("\n---task11--------");
        System.out.print("yaşınız =  ");
        int age=scan.nextInt();
        System.out.print("İsminiz =  ");
        String isim=scan.nextLine();
        String name=scan.nextLine();
        for(int i=1;i<=age;i++){
            System.out.println(name);}

        System.out.println("\n---task12--------");

        char count;
        for(char i='A';i<='Z';i++){
            System.out.print(i+" , ");}



        System.out.println("\n---task13--------");

       for(int i=1;i<=5;i++){
          for(int j=1;j<=3;j++){ System.out.print("* ");
       }
        System.out.println(" ");}

        System.out.println("\n---task14--------");

       for (int i=1;i<=5;i++){
           for(int j=1;j<=i;j++){
               System.out.print("* ");
           }System.out.println(" ");
       }

        System.out.println("\n---task15--------");

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

        System.out.println("\n---task16--------");

        for(int i=9;i>=1;i--){
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("\n---task17--------");

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        System.out.println("\n---task18--------");

       for(int i=5;i>=1;i--){
           for(int j=i;j>=1;j--){
               System.out.print(" ");
           }
           for(int z=(6-i);z>=1;z--){
               System.out.print("* ");
           }
           System.out.println(" ");
       }

        System.out.println("\n---task19--------");

        for(int i=13;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(".");
            }for(int z=(14-i);z>=1;z--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int i=1;i<=13;i++){
            for(int j=1;j<=i;j++){
                System.out.print(".");
            }for(int z=(13-i);z>=1;z--){
                System.out.print(" *");
            }
            System.out.println(" ");
        }




        int a=1;
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println(" ");
        }





















    }
}
