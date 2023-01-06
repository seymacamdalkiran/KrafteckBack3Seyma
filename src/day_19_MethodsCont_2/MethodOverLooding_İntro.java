package day_19_MethodsCont_2;

public class MethodOverLooding_İntro {
    public static void main(String[] args) {

    //    sum1(5);
    //    sum2(5,10);
    //    sum3(5,10,15);
      //  CalculateArea(5,10);
     //   CalculateArea(5);
      //  concat(10,"Yavuz",true);



    }
    public static void sum1(int a){
        System.out.println(a+10);
    }
    public static void sum2(int a,int b){
        System.out.println(a+b+10);
    }
    public static void sum3(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void CalculateArea(double a,double b){
        double alan=a*b;
        System.out.println("Karenin alanı = "+alan);
    }
    public static void CalculateArea(double a){
        double alan=Math.PI*a*a;
        System.out.println("Dairenin alanı = "+alan);
    }
    public static void concat(int a, String b, boolean c){
        if(c==true){
            System.out.println(""+a+b);
        }else{
            concat(a,b);
        }
    }
    public static void concat(int a,String b){
        for (int i = 0; i <a ; i++) {
            System.out.println(b);

        }
    }






}
