package Projects_05.GameGuess;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public int randomGenerator(){
        Random rd=new Random();
        int i= rd.nextInt(100);
        return i;
    }
    public void LetsGuess (int sayi){

        Scanner scan=new Scanner(System.in);

        int count=0;
        int t=0;
        while (count<5){
            System.out.println("Lütfen sayınızı tahmin edin. 5 hakkınız var.\nKalan tahmin hakkınız = "+(5-count));
            int tahmin=scan.nextInt();
            if(tahmin==sayi){
                System.out.println("You got it !!");
                break;
            }else if(tahmin>sayi){
                System.out.println("Your number is too high ");
            }else if(tahmin<sayi){
                System.out.println("Your number is too low ");
            }
            count++;
            t++;
        }
        if(t==5){
        System.out.println("Anlamadım dostum !!!");}
    }

}
 /*

        Ve execution durdurun.
        Tahmin girişiminiz maksimum 5'tir.
        Eğer tahmininiz  5'e ulaşırsa
        Not:
         1) Sayıları tahmin ederken Scanner Class kullanmanız gerekir.
         2) Bu methodların her ikisi de statik bir method değildir
 */