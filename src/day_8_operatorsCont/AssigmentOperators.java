package day_8_operatorsCont;

public class AssigmentOperators {
    public static void main(String[] args){


         int x=10;
         int y= 20;
         x=x+y;
        System.out.println("x = "+ x);
        x+=y;   //shortn deniyormuş. x=x+y nin kısa yazılması
        System.out.println("yeni x = "+x);

        x=x/y;
        System.out.println("x nesin sen = şimdilik "+x);
        x/=y;
        System.out.println("hep değiş zaten = "+ x);

        // int olduğu için virgülden sonrakini görmüyor.
        System.out.println("-----------");

        x=10;
        y=20;
        x=x%y;
        System.out.println("x = "+x);

        y%=x; // y=y%x; ikisi de aynı anlama geliyor.
        System.out.println("y = " +y);





    }
}
