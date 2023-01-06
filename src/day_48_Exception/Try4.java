package day_48_Exception;

import java.util.Scanner;

public class Try4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı");
        int a= scan.nextInt();
        System.out.println("String");
        try {
            String b= scan.nextLine();
        } catch (Exception e) {
            System.out.println("Hata");
        }

    }
}
