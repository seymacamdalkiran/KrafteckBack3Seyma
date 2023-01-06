package day_13_Control;
import java.util.*;
public class ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

//  keyword başlangıç /initilization        şart/condition      increment/decrement
        for (   int i=0;                       i<5;                    i++){
        System.out.print(i+",");}                 //the code which is here be excuted as long as condition is true
                                                //burada ki kod cond true oldukça yürütülecek.
        System.out.println("\nHey compiler başın döndü mü");
                                                //this code will executed, if loop condition turn to false
                                                //loop un condu false olursa burdan devam eder

        // infilit yapmak denemek demek heralde
        System.out.println("\n-------------");

        for(int i=10;i>0;i--){
            System.out.print(i+" ");}

        System.out.println("\n-------------");

        for(int i=0;i<3;i++){
            System.out.println("he ");
        }
        System.out.println("🤪");

        System.out.println("-------------");







    }}
