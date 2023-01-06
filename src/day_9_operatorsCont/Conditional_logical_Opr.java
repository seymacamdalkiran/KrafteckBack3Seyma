package day_9_operatorsCont;

public class Conditional_logical_Opr {
    public static void main(String[] args) {
        boolean bl;
        System.out.println("----logical and------");
        bl= true && true;
        System.out.println("bl = "+bl);
        bl=true&&false;
        System.out.println("bl = "+bl);
        bl=false&&true;
        System.out.println("bl = "+bl);
        bl=false&&false;
        System.out.println("bl = "+bl);

        System.out.println("------logical or------");

        bl= true||true;
        System.out.println("bl = "+bl);
        bl=true||false;
        System.out.println("bl = "+bl);
        bl=false||true;
        System.out.println("bl = "+bl);
        bl=false||false;
        System.out.println("bl = "+bl);

        System.out.println("------bitwise axclusive--------");

        //      ^ bitwise axclusive or
        //      aynı ise true farklı ise false

        bl= true^true;
        System.out.println("bl = "+bl);
        bl=true^false;
        System.out.println("bl = "+bl);
        bl=false^true;
        System.out.println("bl = "+bl);
        bl=false^false;
        System.out.println("bl = "+bl);

        System.out.println("------example------");

        int a=5;
        int b=7;
        bl = true;
        bl= (a>b)&&(b==7);
        System.out.println("bl = "+ bl);
        bl=a/b>0||(b>a);
        System.out.println("bl = "+bl);
        bl=(a-b)>0&& b>a;
        System.out.println("bl = "+bl);

        System.out.println("---------");

        boolean x= false, y= false, z=true;
        x= !y;
        z= !x && x==z;
        System.out.println("z = "+z);



    }
}
