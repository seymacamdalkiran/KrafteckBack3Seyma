package day_49_ExceptionAndCollection;

import java.util.Scanner;

public class ExampleTryCatch {
    public static void main(String[] args) {




    }
    public static void intCome(){

            try {Scanner scan=new Scanner(System.in);
                System.out.println("Bir int sayı girin");
                int i = scan.nextInt();

            } catch (Exception e) {
                System.out.println("int dışında bir değer girdiniz");
                intCome();
            }


    }
}
