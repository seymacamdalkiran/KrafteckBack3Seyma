package day_18_MethotsCont;

public class ParameterCompatibility {
    public static void main(String[] args) {

        short sh=5;
        int i=10;
        double d=25;
        message(sh);
        message(i);
        message((int)d);
    }
    public static void message(int a){
        System.out.println(a+" is here");
    }
}
