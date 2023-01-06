package day_38_Static.staticMethod;

public class Geometric {

    int primeter;

    static int counterSides;

    public void setPrimeter(int... sides){
 //       counterSides=0;
        resetSides();

        for(int i:sides){
            primeter+=i;
 //           counterSides++;
            counterSidesSet();
        }
        System.out.println("geometrik şeklin çevresi "+primeter);
        System.out.println("geometrik şeklin kenar sayısı "+counterSides);
    }
    public static void counterSidesSet(){
        counterSides++;
    }
    public static void resetSides(){
        counterSides=0;
    }


}
class main2{
    public static void main(String[] args) {
        Geometric geo1=new Geometric();
        Geometric geo2=new Geometric();

        geo1.setPrimeter(2,3,5);
        geo2.setPrimeter(2,3,5,7);


    }
}
