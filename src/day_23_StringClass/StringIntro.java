package day_23_StringClass;

public class StringIntro {
    public static void main(String[] args) {

        String say="hello";     //Literal say
        String sayMe="hello";                           //String pool da

        String sayNew=new String("hello");      //new keyword ile       //heap

        boolean bl;
        bl= say.equals(sayMe);      //true

        bl=say==sayMe;      //true

        bl=say.equals(sayNew);      //true

        bl=say==sayNew;         //false

        System.out.println(bl);

        //equals metodu sadece value a bakıyor. yani ne yazdığına
        //ama == hem value ya bakar hem de bellekteki yerine bakar. yani referansına da bakar.






    }
}
