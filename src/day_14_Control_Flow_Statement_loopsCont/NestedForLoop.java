package day_14_Control_Flow_Statement_loopsCont;
import java.util.*;
public class NestedForLoop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

/*
        for(int i=1; i<=3; i++){
            System.out.println("outer loop "+i+". kez döndü ");
            for (int j = 1; j < 5; j++) {
                System.out.println("\tinter loop "+j+". defa döndü");
            }}

         for(int i=0; i<5; i++){
           for (int j = 0; j < 3; j++) {
                System.out.print("* ");}
                System.out.println(" ");}


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
               System.out.print("* ");
            }
            System.out.println(" ");}


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");}
            System.out.println(" ");
        }

        for (int i=9;i>0;i--){
            for(int j=i; j>0;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

 */


        for(int i=1;i<=5;i++){
            int y=0;
            i=i+y;
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
                 }
            System.out.println(" ");
        }

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }for (int t=6-i;t>0;t--){
            System.out.print("x ");
            }System.out.println(" ");
        }




















    }}

