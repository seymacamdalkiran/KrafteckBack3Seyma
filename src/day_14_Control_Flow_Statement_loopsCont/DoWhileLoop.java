package day_14_Control_Flow_Statement_loopsCont;
import java.util.*;
public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

      /*
        int speed=99;

        do{
            System.out.println("say hello ");
        }
        while(speed>=100);


        int i=30;
        do{
            System.out.println("merhaba");
            i++;
        }while(i<3);

*/

        int number=5;
        int x;
        do {
            System.out.println("çabuk bir sayı yaz ");
            x= scan.nextInt();

        }while(x!=number);

        if(x==number){
            System.out.println("Congrat");
        }
















    }
}
