package day_9_operatorsCont;
import java.util.*;
public class Task1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
/*
        System.out.print("Yaşınız = ");
        int age=scan.nextInt();
        System.out.print("Sağlıklı mısınız = ");
        boolean healty=scan.nextBoolean();
        boolean a= !(age<20);
        boolean isSoldier= healty&&a;
        System.out.println("Askere alınabilirsiniz = "+isSoldier);

        System.out.print("Sayınız = ");
        int x=scan.nextInt();
        boolean a= !((x%3==0) ^ (x%5==0));

        System.out.println(a);

 */
        System.out.print("Boyunuzu yazın = ");
        double boy=scan.nextDouble();
        System.out.print("Kilonuzu yazın = ");
        double kilo=scan.nextDouble();
        double c= (boy%100);
        double d= (kilo+5);
        double e= (kilo-10);
        boolean cond= (c<d && c>e);
        System.out.println(cond);



    }
}
