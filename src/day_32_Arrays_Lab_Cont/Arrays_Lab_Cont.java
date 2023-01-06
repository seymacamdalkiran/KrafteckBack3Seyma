package day_32_Arrays_Lab_Cont;

import java.util.Arrays;
import java.util.Random;

public class Arrays_Lab_Cont {
    public static void main(String[] args) {

        int[] a={-5,5};
    //    System.out.println(Arrays.toString(newArrayCreate(a)));

        int[]ar1={1,5,3,2,1,4,0};
        int[]ar2={1,2,3,4,5};
     //   System.out.println(Arrays.toString(terstenSirali(ar1,ar2)));
     //   System.out.println(varmı(ar1,ar2));
    //    System.out.println(arrayVar2(ar1,ar2));
      //  System.out.println(varmı(ar1,ar2));
        System.out.println(Arrays.toString(randomArray(5)));

    }
    public static int[] randomArray(int uzunluk){
        Random rd=new Random();
        int [] array=new int[uzunluk];
        for (int i = 0; i <array.length ; i++) {
            array[i]=rd.nextInt(50,80);
        }return array;
    }

    public static boolean arrayVar2(int[] ar1, int ar2[]){
        boolean result=false;
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                result=false;
                if(ar1[i]==ar2[j]){
                    result=true;
                    break;
                }
            }
            if(result==false){
                return false;
            }
        }
        return true;
    }

    public static boolean arrayVarmi(int[] ar1, int[] ar2){
        boolean result=false;
        for (int i = 0; i <ar1.length ; i++) {
            for (int j = 0; j <ar2.length ; j++) {
                result=false;
                if(ar1[i]==ar2[j]){
                    result =true;
                    break;
                }
            }
            if(result!=true){
                    return false;
                }
        }
        return true;
    }

    public static boolean varmı(int [] ar1, int [] ar2){
        String str="";
        for (int i = 0; i <ar2.length ; i++) {
            str+=","+ar2[i]+",";
        }
        System.out.println(str);
        for (int i = 0; i <ar1.length ; i++) {
            if(!str.contains(","+ar1[i]+",")){
                return false;
            }
        }return true;
    }

    public static int[] terstenSirali(int[] ar1, int[] ar2){
        int[] array=new int[ar1.length+ar2.length];
        for (int i = 0; i <ar1.length ; i++) {
            array[i]=ar1[i];
        }
        for (int i = 0; i <ar2.length ; i++) {
            array[i+ar1.length]=ar2[i];
        }
        int[] resultArray=Arrays.copyOf(array,array.length);
        Arrays.sort(resultArray);
        for (int i = 0; i <array.length ; i++) {
            array[i]=resultArray[array.length-i-1];
        }return array;
    }

    public static int[] newArrayCreate(int [] arr){
        if(arr.length!=2){
            return arr;
        }
        int arry[] =Arrays.copyOf(arr,2);
        Arrays.sort(arry);

        int newArray[]= new int[Math.abs((arry[1]-arry[0])+1)];

        for (int i = 0,j=arry[0]; i <newArray.length ;j++, i++) {
            newArray[i]=j;
        }
        return newArray;
    }













}
