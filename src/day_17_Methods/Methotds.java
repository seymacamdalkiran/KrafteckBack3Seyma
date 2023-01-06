package day_17_Methods;

import java.util.Scanner;

public class Methotds {
    public static void main(String[] args) {

        kos();
        System.out.println("Ali koşmaktan yoruldu çünkü yimeeeeeni yidi");
        enBuyuk();
    }

    public static void menu() {

        System.out.println("    MENÜ:\n1. Kebap  🥓\n2. Çorba  🍜\n3. Tatlı  🎂\n4. Salata 🥗\n5. İçecek 🥤");
    }

    public static void kos() {
        System.out.println("goş ali goşşşş");
        yemek();
    }

    public static void yemek() {
        System.out.println("yimeeeeni yi gaaaari");
        menu();
    }

    public static void ortalama() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int ort = (x + y) / 2;
        System.out.println("Ortalama = " + ort);
    }

    public static void enBuyuk() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int buyuk=x;
        if(y>x){
            buyuk =y;
        }
        System.out.println("Büyük olan sayı = "+buyuk);

    }
}