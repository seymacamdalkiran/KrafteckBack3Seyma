package day_38_Static.staticClass;

public class Outer {

//Outer nesnesi burada
    static class nested{
        public static void message () {
            System.out.println("\"selam static nested classdan\" = " + "selam static nested classdan");
        }
    }
    class Inner{
        //
        public void message2(){
            System.out.println("selam Inner class dan");
        }
    }


}
class main{
    public static void main(String[] args) {
        Outer.nested.message();

    //    Outer outer=new Outer();
    //    Outer.Inner selam= outer.new Inner();

        Outer.Inner selam=new Outer().new Inner();  //Yukarıdaki 2satırın tek satırda hali


        selam.message2();

    }
}
