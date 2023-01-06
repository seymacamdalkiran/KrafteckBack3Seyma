package day_33_WrapperClassWarArg;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //  System.out.println(sum(5, 10));
        //  System.out.println(sum(5, 10, 15));
        //  System.out.println(sum(3, 6, 9, 12, 15));
        //  System.out.println(basHarf("JAVA","PHYTON","C++","PHP","FORTRAN"));
        System.out.println();
        System.out.println(Arrays.toString(cevre(5,4,7,9,3,1,5)));
    }
    public static String[] cevre(int... kenar){
        int cevre=0;
        String[] hata={"Hatalı","Giris"};
        String[] result=new String[2];
        for (int i = 0; i < kenar.length ; i++) {
            if(kenar[i]<=0 && kenar.length<3){
                return hata;
            }
            cevre+=kenar[i];
        }
        result[0] = "Bu bir "+kenar.length+"gendir : ";
        result[1] =" Bu çokgenin çevre uzunluğu = "+cevre+"\"";

        return result;
    }

    public static String basHarf(String... ilkHarf){
        String str="";
        for (int i = 0; i < ilkHarf.length ; i++) {
            str+=ilkHarf[i].substring(0,1);
        }return str;
    }

    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d,int e){
        return a+b+c+d+e;
    }

    public static int sum(int... sayılar){
       int sum=0;
        for(int i:sayılar){
            sum+=i;
        }
        return sum;
    }

}
