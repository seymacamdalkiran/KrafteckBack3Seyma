package day_20_;
import java.util.*;
public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

/* int a=10;
        for (int i = 1; i < 30; i++) {
            if(a==i){
                // break;
               // System.out.println("<<Bugün iş yok>>");
                continue;
            }
            System.out.print(i+10+" ");
        }


        System.out.println("Kaça kadar yazmasını istersiniz?");
        int x=scan.nextInt();
        for (int i = 1; i < x; i++) {
            if(i%3==0 && i%5==0){
                System.out.print(--i+"  ");
                break;
        }
        }

        System.out.println("Kaça kadar yazmasını istersiniz?");
        int x=scan.nextInt();
        for (int i = 1; i < x; i++){

            if(i%3==0&&i%5==0){
                continue;
            } System.out.print(i+" ");
        }
  */
      outer:  for (int i = 1; i <=10 ; i++) {
            for(char k=65;k<68;k++){
            if(i==3){
                System.out.println(k+"");
            break ;
            }
          System.out.println(i+" ");
            continue outer;
        }}






    }
}
