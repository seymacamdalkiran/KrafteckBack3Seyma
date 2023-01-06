package odevler;
import java.util.*;
public class kasım_27 {
    public static void main(String[] args) {

       // System.out.println("ebob =>  "+ebob(12,18));

        birlerBas();
    }
    public static int birlerBas(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı yazın");
        int x=scan.nextInt();
        int y=x;
        while(x>9){
            x=x/10;
        }  System.out.println(y+" - "+x+" = "+(y-x));
        return (y-x);
    }
    public static int ebob(int x,int y) {

        int ebob=1;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0 && y % i == 0) {
                ebob=i;}
        }
        return ebob;
    }

}
