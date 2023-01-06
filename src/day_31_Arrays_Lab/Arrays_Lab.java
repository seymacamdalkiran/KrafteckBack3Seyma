package day_31_Arrays_Lab;

import java.util.Arrays;

public class Arrays_Lab {
    public static void main(String[] args) {

        int [] a={3,5,3,1,7};
        //  System.out.println(arraySum(a));
        //  System.out.println(cift(a));
        //  System.out.println(tumThree(a));
        //  System.out.println(Arrays.toString(maxMin(a)));
        //  System.out.println(minArray(a));
        //  System.out.println(maxArray(a));
        //  arraysYazdır(maxMin(a));
        //  arraysYazdır(terstenYaz(a));

        String[] s={"sandalye","Masa","table","masa","koltuk"};
        System.out.println(findTable(s,"masa"));



    }
    public static int findTable(String [] arry,String param){
        int count=0;
        for (int i = 0; i < arry.length; i++) {
            if(arry[i].equalsIgnoreCase(param)){
                count++;
            }
        }
        return count;
    }

    public static int [] terstenYaz(int arry []){
        int [] newArr=new int[arry.length];
        for (int i = 0; i <arry.length ; i++) {
            newArr[arry.length-1-i]=arry[i];
        }return newArr;
    }

    public static void arraysYazdır(int [] arry){
        for (int param: arry) {
            System.out.print(param + " ");
        }
    }

    public static int maxArray(int [] arry){
        int max=arry[0];
        for (int i = 0; i <arry.length ; i++) {
            if(max<arry[i]){
                max=arry[i];
            }
        }return max;
    }

    public static int minArray(int [] arry){
        int min=arry[0];
        for (int i = 0; i <arry.length ; i++) {
            if(min>arry[i]){
                min=arry[i];
            }
        }return min;
    }

    public static int[] maxMin(int [] arry){
        int min=arry[0];
        int max=arry[0];
        for (int i = 0; i <arry.length ; i++) {
            if(min>arry[i]){
                min=arry[i];
            }
            if(max<arry[i]){
                max=arry[i];
            }
        }
        int [] mm={min,max};
        return mm;
    }

    public static int tumThree(int [] arry){
        int toplam=0;
        for (int sayı: arry) {
            if(sayı==3){
                toplam+=sayı;
            }
        }return toplam;
    }

    public static int cift(int [] arry){
        int result=0;
        for (int i = 0; i <arry.length ; i++) {
            if(arry[i]%2==0){
                result+=arry[i];
            }
        }return result;
    }

    public static int arraySum(int [] arry){
        int result=0;
        for (int sayı: arry ) {
            result+=sayı;
        }
        return result;
    }



}
