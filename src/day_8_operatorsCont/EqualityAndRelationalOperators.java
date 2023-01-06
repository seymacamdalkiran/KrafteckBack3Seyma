package day_8_operatorsCont;
import java.util.*;
public class EqualityAndRelationalOperators {
    public static void main(String[] args) {

        /*
        condition demek şart demek
        ==      equals to                yani eşittir
        !=      not equal to             yani eşit değil
        >       greater than             yani büyük
        >=      greater than or equal    yani büyükeşit
        >       less than                yani büyük
        >=      less than or equal       yani küçükeşit
         */

        int x=10;
        int y=20;

        boolean bl;
        bl=x==y;
        System.out.println("bl = "+bl);
        bl=x!= y;
        System.out.println("bl = "+bl);
        bl= x>y;
        System.out.println("bl = "+bl);
        bl= x>=y;
        System.out.println("bl = "+bl);
        bl=x<y;
        System.out.println("bl = "+bl);
        bl= x<=y;
        System.out.println("bl = "+bl);

        int z= 20;
        bl= z>=y;
        System.out.println("bl = "+bl);
        bl= z<=y;
        System.out.println("bl = "+bl);
        bl= z!=y;
        System.out.println("bl = " +bl);

        System.out.println("-------------");
        double temp= 37.3;
        int hum= 60;

        boolean c1= temp>38;
        boolean c2= hum>55 == hum<=60;
        System.out.println("Sıcaklık şartı = "+c1+" Nem şartı = "+c2);

        System.out.println("-------------");

        Scanner scan=new Scanner(System.in);
        /*
        System.out.print("lütfen bir sayı yazın = ");
        int t=scan.nextInt();
        boolean tek= t%2==0;
        System.out.println(t+ " sayısının çift sayı olması "+tek);

        System.out.println("------------");

         */


        System.out.print("Aldığınız günlük kalori miktarı = ");
        int kalori= scan.nextInt();

        System.out.print("Kilonuzu yazın = ");
        double kilo=scan.nextDouble();

        boolean cal=  kalori>=30*kilo;
        System.out.println("kilo alma ihtimalin yüksek "+cal);



    }
}
