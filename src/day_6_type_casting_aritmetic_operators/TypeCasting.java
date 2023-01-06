package day_6_type_casting_aritmetic_operators;

public class TypeCasting {
    public static void main(String[] args){


        byte x =5;
        int y= 10;
        y=x;
        x=(byte)y;  // büyük veriyi küçüğe atarken başını değiştirmek zorundasın.
        /*
        widening casting, narrowing casting öğren. interview lerde sorulur
        narowing daraltma(data kaybı var), widening genişletme (data kaybı yok)
        y=x widening
        x=(byte) narrowing
        */
        int z=130;
        byte t;
        t= (byte)130;
        System.out.println(t); // veri kaybı oldu. -126 buldu.
        //string i int a cast edemezsin, aynı türde olmak zorunda.
        // neden -126 olduğunu anlattı ama çok da önemli değil nedeni.


        /*
        double a =100;
        int b= 50;
        y =(int) x;
        y=x;
        System.out.println(x);
         */

        //byte short ve int verilerle yapılan tüm işlemler int dır.
        // int double string float char
        // koyu gri renkte görülen şeyler kullanılmıyor demek.

        int a = 5,b=10,c=a+b;
        System.out.println(c);

        short d= (short)c;
        System.out.println(d);




    }
}
