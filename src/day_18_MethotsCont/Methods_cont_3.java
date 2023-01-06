package day_18_MethotsCont;

public class Methods_cont_3 {
    public static void main(String[] args) {

        //sum methodu için
        sum();  //konsolda bir sonuç vermez.
        System.out.println(sum());
        int i=sum();
        System.out.println("i = " + i);
        System.out.println(sum()+10);

        //sum 2 methodu için
        System.out.println("sum2 = " + sum2(5,10));
        System.out.println(sum2(1,2)+sum());
        System.out.println(sum2(sum(),5));

    }

    //return type methods

    public static int sum(){
        return 5;
    }
    public static int sum2(int a, int b){
        int i=a+b;
        return i;
    }






}
