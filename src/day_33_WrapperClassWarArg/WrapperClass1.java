package day_33_WrapperClassWarArg;

public class WrapperClass1 {
    public static void main(String[] args) {
        Byte b1=new Byte((byte)125);
        System.out.println(b1);

        Byte b2=new Byte("125");
        System.out.println(b2);

        Integer i1=new Integer(1000000);
        Integer i2=new Integer("10000000");

        Long l1=new Long(100000000);
        Long l2=new Long("10000000000");

        Double d1=new Double(4.5);
        Double d2=new Double("4.5");

        Boolean bl1=new Boolean(true);
        Boolean bl2=new Boolean("true");

        Character c= new Character('a');


        Integer i=new Integer(10);
        int in=10;

        boolean bln= i==in;
        System.out.println("boolean = "+bln);

        System.out.println("boolean equals = "+i.equals(in));

        int number=i+in;
        System.out.println("number = "+number);

        Integer num=i+in;
        System.out.println("num = "+num);

        i=in;       //outoboxing

        in=i;       //unboxing




    }
}
