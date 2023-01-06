package deneme;
import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
  /*      Random rd=new Random();

        System.out.println("------Task 19---------");

        int x=1;
        while(x<=100){
            if(x%2==1){
            System.out.print(x+" ");}
            x++;}

        System.out.println("\n------Task 20---------");

        int y=0;
        int i=0;
        while(y<=25){
            if(y%2==1){
                i=i+y;
            }   y++;
        }System.out.println(i);


   */
        System.out.println("\n------Task 21---------");

        System.out.println("Are you married ?");
        System.out.println("Evli isen 1 e, bekar isen 2 ye bas ");
        int e=scan.nextInt();
        int c=0;
        String name;
        switch (e){
            case 1:
                System.out.println("Kaç çocuğunuz var");
                c=scan.nextInt();
                if(c>=0){
                    String nam=scan.nextLine();
                   for (int j = 1; j <=c ; j++) {
                        System.out.println(j+". çocuğunun ismi nedir ?");
                        name=scan.nextLine();
                    }
                }else{
                    System.out.println("hatalı tuşladınız");
                }
                break;
            case 2:
                System.out.println(" Bekarlık Sultanlıktır");
                break;
            default:
                System.out.println("Hatalı sayı girdiniz. ");
        }
        if(e==1 && c>=0){ System.out.println("AİLE DURUMU\nMedeni hali  = Evli\nÇocuk Sayısı = "+c+"\nÇocuğunun ismi = ");
        }
        else if(e==2){System.out.println("AİLE DURUMU\nMedeni hali = Bekar ");
        }


/*
        System.out.println("\n------Task 21---------");

        System.out.println("Bir sayı yazın. ");
        int x1=scan.nextInt();
        System.out.println("Bir sayı daha yazın. ");
        int y1=scan.nextInt();
        int r=rd.nextInt(y1);
        System.out.println(r);
        if(r<=y1){
           int a=x1+r;
            while(true){
            System.out.println(" Bir tahminde bulunun. ");
            int t=scan.nextInt();

            if(a==t){
                System.out.println("🌼 TEBRİKLER 🌼");
                break;
            }}
        }else{
            System.out.println("2.verdiğin sayı 6 den büyük olsun");
        }

 */




















    }
}
