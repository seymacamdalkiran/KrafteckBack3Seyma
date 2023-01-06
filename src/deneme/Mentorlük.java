package deneme;
import java.util.*;
public class Mentorlük {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

/*kullanicidan 3 pozitif tamsayi alalim.
 bu uc sayidan ucgen olup olmamayi inceleyelim


        System.out.println("Üçgenin kenarkarını sırayla yazın");
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();
        if(x<(y+z) && x>(y-z)&&(y>=z)){
            System.out.println(" Bu üçgen çizilebilir. ");
        }
        else if(x<(y+z) && x>(z-y)&&(z>=y)){
            System.out.println(" Bu üçgen çizilebilir. ");
        }else{
            System.out.println("Bu üçgen çizilemez. ");
        }

        System.out.println("boy");
        double x=scan.nextDouble();
        System.out.println("kilo");
        double y=scan.nextDouble();

        double kitle=y/(x*x/10000);
        System.out.println(kitle);

        if(kitle<=20){
            System.out.println("zayıfsınız ");
        }else if(kitle>20 && kitle<=25){
            System.out.println("normal kilodasınız");
        }else{
            System.out.println("obezsiniz ");
        }

        System.out.println("bir şeyler yazın. ");
        String th=scan.nextLine();
        char ilkHarf=th.charAt(0);
       // System.out.println(ilkHarf);
        boolean harfmi=(ilkHarf>='a'&&ilkHarf<='z')||(ilkHarf>='A'&&ilkHarf<='Z');
       // System.out.println(harfmi);
        if(harfmi){
            boolean seslimi=ilkHarf=='a'||ilkHarf=='A'||ilkHarf=='e'||ilkHarf=='E'||ilkHarf=='i'||ilkHarf=='I'||
                    ilkHarf=='o'||ilkHarf=='O'||ilkHarf=='u'||ilkHarf=='U';
            if(seslimi){
                System.out.println("İlk harfi sesli harf");
            }else{
                System.out.println("İlk harfi sessiz harf");
            }
            }else{
            System.out.println("kelimeniz harf ile başlamadı");
        }

 */
        System.out.println("1.sayınız = ");
        int x=scan.nextInt();
        System.out.println("2.sayınız = ");
        int y=scan.nextInt();
        if(x<y){
            System.out.println("ilk yazdığınız sayı = "+x+" ikinci yazdığınız = "+y+" sayısından küçüktür. Yani\n"+x+" < "+y);
        }else if(x>y){
            System.out.println("İkinci yazdığınız sayı = "+y+" ilk yazdığınız = "+x+" sayısından küçüktür. Yani\n"+y+" > "+x);
        }else{
            System.out.println("ilk yazdığınız sayı = "+x+" ile ikinci yazdığınız sayı = "+y+" birbirine eşittir. Yani\n"+x+" = "+y);
        }
























    }
}
