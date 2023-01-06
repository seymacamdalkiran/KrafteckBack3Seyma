package day_8_operatorsCont;

public class unary {
    public static void main(String[] args){

        /*    unary operator
       +plus aritmetik değeri pozitif yapar
       -minos aritmetik değeri negatif yapar
       ++ increment operator değeri 1 arttırır
       ++ decrement operator değeri 1 azaltır
        ! logical not operatörü boalen değeri tersine çevirir.

         */
        int x;
        //  x++;    veriable should be değil initialize olmalı.
        x=2;

        System.out.println(x++);    //bir sonraki satırda arttırıyor
        System.out.println(x--);
        System.out.println("x = "+x);
        System.out.println(++x);
        //prefix and postfix
        // ++x     prefix x in değerini operatorun uygulandığı satırda değiştirir.
        // x++     postfix x in değerini operatorun uygulandığı satırda değil bir sonraki adımda değiştirir.
        System.out.println("-----------");
        //postfix
        int y=1;
        y++;    //increment uygulandı ancak y nin değeri bir sonraki kullanıldığı yerde artacak
        System.out.println("y = "+y);

        //prefix
        --y;
        System.out.println("y = "+y);

        //--y önce azalt sonra yaz     y--  önce yaz sonra azaltırsın

        System.out.println("--------");

                //tasks
        int value=+1;
        value--;
        value++;
        value++;
        value=-value;
        System.out.println("value = "+value);

        System.out.println("---------------");

        int i=10;
        i= --i + ++i + --i + i++;

        i= i++ + i-- * -i++ * --i;

        i= i++ - i++ / --i * i++;

        System.out.println("i = " + i);

        System.out.println("------------");
        //logical not

        boolean condition=true;
        System.out.println(!condition);

        int t=10, k=20;
        boolean bl= !(t>k);
        System.out.println("bl = "+bl);

        int n=11;
        int m=17;
        boolean cond= !(n==m)==(n<m);           //  true yapmak için ! istediğin yere koyabilirsin.
        System.out.println("cond = "+cond);


        boolean cond2=false==(n+1)>(m-5);
        System.out.println("cond2 = " +cond2);

        boolean cond3= cond2==1>m/n;
        System.out.println("cond3 = "+cond3);

        //boolean cond4= cond2==1<m/n;
        //System.out.println("cond4 = "+cond4);

        boolean cond4= cond3==!cond;
        System.out.println("cond4 = "+cond4);






    }
}
