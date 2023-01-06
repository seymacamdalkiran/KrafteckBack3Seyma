package deneme;
import java.util.*;
public class SayıTahmini {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random rd=new Random();


        int random=rd.nextInt(100);
      //  System.out.println(random);
         System.out.println("Bir sayı tahmin edin ");
        int tahmin=scan.nextInt();

        int i=1;
        while(i<=random){

            if (tahmin > random) {

                if (tahmin > (random + random / 2)) {
                    System.out.println("Çok büyük bir sayı yazdınız. Daha küçük bir sayı yazın");
                    tahmin = scan.nextInt();
                } else {
                    System.out.println("Yaklaştınız ama daha küçük bir sayı yazmalısınız");
                    tahmin = scan.nextInt();
                }
            } else if (tahmin < random) {
                if (tahmin < random / 2) {
                    System.out.println("Çok küçük bir sayı yazdınız. Daha büyük bir sayı yazın");
                    tahmin = scan.nextInt();
                } else {
                    System.out.println("Yaklaştınız ama daha büyük bir sayı yazın");
                    tahmin = scan.nextInt();
                }
            } else {
                System.out.println("🌠💫✴️⭐️TEBRİKLER BİLDİNİZ⭐️✴️💫🌠");
                break;
            }i++;
        }

        int a=1;
        for (int k = 1; k <=4 ; k++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(a+" ");a++;
            }
            System.out.println();
        }



























    }
}
