package day_28_Arrays;

import java.util.Arrays;

public class ArrayTasks {
    public static void main(String[] args) {

        int[] arry1={10,2,3,14,5,6};
        int[] arry2={1,2,3,4};
        // System.out.println(arrayLenghtCheck(arry1));
        // System.out.println(arrayLenghtCheck(arry2));
        // System.out.println(array5Check(arry1));
        // System.out.println(array5Check(arry2));
        // System.out.println(checkFirstMember(arry1, arry2));
        // System.out.println(Arrays.toString(ilkArray(arry1, arry2)));
        // System.out.println(toplam(arry1));
        // System.out.println(Arrays.toString(topCarp(arry1)));
        // System.out.println(Arrays.toString(arryBir(arry1, arry2)));
        // System.out.println(max(arry1));
        // System.out.println(min(arry1));
        // System.out.println(Arrays.toString(swap(arry1)));
        // System.out.println(Arrays.toString(tersten(arry1)));
        // System.out.println(toplm(arry1));

    }
    public static int toplm(int[] arry){
        int sum=0;
        for (int i = 0; i <arry.length ; i++) {
            if(i%2==1){
                sum+=arry[i];
            }
        }return sum;
    }
    public static int[] tersten(int[] arry){
        int[] arryTers=new int[arry.length];
        for (int i = 0; i <arry.length ; i++) {
            arryTers[i]=arry[arry.length-i-1];
        }return arryTers;
    }
    public static int[] swap(int[] arry){
        int a=arry[0];
        arry[0]=arry[arry.length-1];
        arry[arry.length-1]=a;
        return arry;
    }
    public static int min(int[] arry){
        int min=arry[0];
        for (int i = 0; i <arry.length ; i++) {
            if(min>arry[i]){
                min=arry[i];
            }
        }return min;
    }
    public static int max(int[] arry){
        int max=arry[0];
        for (int i = 0; i <arry.length ; i++) {
            if(max<arry[i]){
                max=arry[i];
            }
        }
        return max;
    }
    public static int[] arryBir(int[] arry1, int[] arry2){
        int arry3[]=new int[arry1.length+ arry2.length];
        for (int i = 0; i <arry1.length ; i++) {
             arry3[i]=arry1[i];
        }
        for (int i = 0; i <arry2.length ; i++) {
            arry3[i+arry1.length]=arry2[i];
        }
        return arry3;
    }
    public static int[] topCarp(int[] arry){
        int toplam=0;
        int carp=1;
        for (int i = 0; i <arry.length ; i++) {
            toplam+=arry[i];
            carp*=arry[i];
        }
        int[] arry1={toplam, carp};
        return arry1;
    }
    public static int toplam(int [] arry){
        int result=0;
        for (int i = 0; i <arry.length ; i++) {
            result+=arry[i];
        }return result;
    }
    public static int[] ilkArray(int[] array1,int[] array2){

        int[] yeniArray={array1[0], array2[0]};
        return yeniArray;
    }
    public static boolean checkFirstMember(int[] arry1,int [] arry2){
        return arry1[0]==arry2[0];
    }
    public static boolean array5Check(int[] arry){
        for (int i = 0; i <arry.length ; i++) {
            if(arry[i]==5){
                return true;
            }
        }return false;
    }
    public static boolean arrayLenghtCheck(int[] arry){
        return arry.length>5;
    }


}
