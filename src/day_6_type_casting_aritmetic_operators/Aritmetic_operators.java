package day_6_type_casting_aritmetic_operators;

public class Aritmetic_operators {
    public static void main(String[] args){

        /*
        int sayı = 4+5;
        System.out.println("sayı = "+sayı+12); //bir tane string işlemi varsa gerisi de stringleşir
        System.out.println("sayı = "+sayı);
        System.out.println(sayı+12+"sayı");
        System.out.println(sayı+12+"sayı"+(3+3+3));// stringleşmemesi için parantez içinde yap

        int sy=15%4;
        System.out.println("sy = " +sy);
        double x=5;
        x=x+1;
        System.out.println(x);


        double toplamBorç=100;
        int ödeme=50;
        double kalanBorç=toplamBorç-ödeme;
        System.out.println(kalanBorç);     // bunda bir problem yok


        double toplamBorç=100;
        int ödeme=50;
        int kalanBorç=(int)toplamBorç-ödeme;
        System.out.println(kalanBorç);     // bunda parantez içinde int yazmak zorundasın.


        double toplamBorç=99.99;
        int ödeme=50;
        int kalanBorç=(int)toplamBorç-ödeme;
        System.out.println(kalanBorç);     //değer kaybı oldu. 49.99 olmalıydı. double ı int assing ettiğimiz için



        double toplamBorç=99.99;
        int ödeme=50;
        double kalanBorç=toplamBorç-ödeme;
        System.out.println(kalanBorç);     // bunda parantez içinde int yazmak zorundasın.

        System.out.println("-----------");

         */

        int sayı =20;
        int bölen=5;
        int sonuç=sayı/bölen;
        System.out.println(sonuç);

        int sayı1 =22;
        int bölen1=5;
        int sonuç1=sayı1/bölen1;
        System.out.println(sonuç1);

        int sayı2 =22;
        int bölen2=5;
        double sonuç2=sayı2/bölen2;
        System.out.println(sonuç2);

        int sayı3 =22;
        int bölen3=5;
        double sonuç3=(double)sayı3/bölen3;
        System.out.println(sonuç3);

        double sayı4 =22;
        int bölen4=5;
        double sonuç4=sayı4/bölen4;
        System.out.println(sonuç4);

        System.out.println("----------");







    }
}
