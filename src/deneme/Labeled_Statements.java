package deneme;

import java.util.Scanner;

public class Labeled_Statements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

      /*  while(true){
            System.out.println("İki sayı yazın");
            int x=scan.nextInt();
            int y=scan.nextInt();
            System.out.println("Bu sayıların toplamı =>  "+(x+y));
            if(x+y==50){break;}
        }
       */

        while(true){
            System.out.println("iki sayı yazın");
            int a=scan.nextInt();
            int b=scan.nextInt();
            System.out.println("Yapmak istediğiniz işlem için uygun sayıyı tuşlayın");
            System.out.println("Toplama=> 1 / Çıkarma=> 2 / Çarpma=> 3 / Bölme=> 4 \n       Programdan çıkış=> 5");
            int x=scan.nextInt();
            int sonuc=1;
            if(x==1){sonuc = a+b;
            }else if(x==2){sonuc = a-b;
            }else if(x==3) {sonuc = a*b;
            }else if(x==4){
                if(b!=0){sonuc = a/b;}else{
                    System.out.println("Payda 0 olamaz");
                    continue;
                }
            } else if(x==5){break;
            } else{
                System.out.println("Doğru tuşlama yapınız.");
            }
                    System.out.println("sonuc = "+sonuc);
            if(sonuc==0){break;}
        }








    }
}
