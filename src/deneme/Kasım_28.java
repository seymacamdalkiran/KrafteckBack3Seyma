package deneme;
import java.util.*;
public class Kasım_28 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*Bir sayının iki tamsayının kareleri toplamı şeklinde yazılıp yazılamayacağını gösteren bir program yazınız. Örneğin
kullanıcı 100 girerse çıktı şöyle olmalıdır:
100 sayısının kare toplamı açılıml

        4K+1 şeklinde yazılabilen sayılara Hilbert sayısı denir. Örneğin ilk birkaç Hilbert sayısı şunlardır: 5, 9, 13, 17, …
        Buna göre bir sayının Hilbert sayısı olup olmadığını belirleyen bir program yazınız.
*/
        while(true) {
            System.out.println(" bir sayı yazın");
            int x = scan.nextInt();
            if(x==1){break;}
            else if (x % 4 == 1) {
                System.out.println("Bu sayı hilbert sayısıdır");
            }else {
                System.out.println("Bu sayı hilbert sayısı değildir");
            }
        }
    }



}