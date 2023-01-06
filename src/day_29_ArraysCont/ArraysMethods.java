package day_29_ArraysCont;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {

        String str="Merhaba java insanları bugün nasılsınız";
        String[] sArr= str.split(" ");
        System.out.println(Arrays.toString(sArr));

        System.out.println(sArr[1]);
        System.out.println("-----------");

        for (String st:sArr) {
            System.out.println(st);
        }
        String str2="kayısı, armut, üzüm, çilek, nar";
        System.out.println(Arrays.toString(stringToArray2(str2)));
        System.out.println(Arrays.toString(stringToArray2(str2)));

        System.out.println(Arrays.deepToString(merhaba(str)));

    }
    public static String[][] merhaba(String str){
        String[] splt=str.split(" ");
        String[] str1=Arrays.copyOfRange(splt,0,3);
        String[] str2=Arrays.copyOfRange(splt,3,5);

        String splt2[][]={str1,str2};
        return splt2;
    }
    public static String[] stringToArray2(String str){
        String[] splt=str.split(", ");
        for (int i = 0; i <splt.length ; i++) {
            if(splt[i].length()<5){
                splt[i]="armut";
            }
        }
        return splt;
    }



}
