package day_7_aritmetic_operators;

import java.util.Scanner;
//ilgili sınıfa gitmek için cmd ile aynı anda tıkla
public class ScannerExample {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
/*
        System.out.print("lütfen isminizi yazınız:");
        String ad=scan.nextLine();
        System.out.println("isminiz "+ad+"'dır");

        System.out.print("lütfen bir sayı giriniz: ");
        double x=scan.nextDouble();
        System.out.println(x*10);

        System.out.print("lütfen bir sayı daha giriniz: ");
        double y=scan.nextInt();
        System.out.println(x+y);


        System.out.print("Ali'nin doğum yılı : ");
       int a=scan.nextInt();
        System.out.println("Ali'nin yaşı = "+(2022-a));
*/

        System.out.print("Fizik notu : ");
        double fzk=scan.nextDouble();

        System.out.print("Kimya notu : ");
        double kmy=scan.nextDouble();

        System.out.print("Matematik notu : ");
        double mat=scan.nextDouble();

        System.out.print("not ortalaman"+(fzk+kmy+mat)/3);

    }
}
