package day_12_Control_Flaow_Statement_swich;
import java.util.*;
public class Control_Flow_Staentment_Swich {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*
        int x=7;

        switch (x){
            case 5:
                System.out.println("x 5 e eşittir. ");
                break;
            case 6:
                System.out.println("x 6 ya eşittir. ");
                break;
            default:
                System.out.println("x 5 ve 6 ya eşit değildir. ");
        }



        System.out.println("Bir sayı yazın. ");
        int num1=scan.nextInt();
        int gun=num1%7;
        switch (gun) {
            case 0:
                System.out.println("Bugün günlerden \"Salı\"");
                break;

            case 1:
                System.out.println("Bugün günlerden \"Çarşamba\"");
                break;

            case 2:
                System.out.println("Bugün günlerden \"Perşembe\"");
                break;

            case 3:
                System.out.println("Bugün günlerden \"Cuma\"");
                break;

            case 4:
                System.out.println("Bugün günlerden \"Cumartesi\"");
                break;

            case 5:
                System.out.println("Bugün günlerden \"Pazar\"");
                break;

            default:
                System.out.println("Bugün günlerden \"Pazartesi\"");
        }*/
        System.out.print("1 sayı yazın ");
        double x=scan.nextDouble();
        System.out.print("başka bir sayı yazın ");
        double y=scan.nextDouble();
        System.out.println("Yapmak istediğiniz işlem numarasını yazın\nToplama =1 / Çıkarma =2 / Çarpma =3 / Bölme =4 \nyazıp enter a basın.");
        int z=scan.nextInt();
        switch (z){
            case 1:
                System.out.println("sonuç= "+(x+y));
                break;
            case 2:
                System.out.println("sonuç= "+(x-y));
                break;
            case 3:
                System.out.println("sonuç= "+(x*y));
                break;
            case 4:
                if(y==0){
                System.out.println("Bölen sayı 0 olamaz. ");}
            else{
                System.out.println("sonuç= "+(x/y));}
                break;
            default:
                System.out.println("hatalı giriş");
        }
















        

    }
}
