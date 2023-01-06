package odevler;

import java.util.Arrays;
import java.util.Random;

public class ArraysHomeworkSeyma {
    public static void main(String[] args) {

    //   System.out.println(soru_1(a));
    //   System.out.println(soru_2(a));

        int[] a3={2,3,3,4,5,6,5,6,3};
    //   System.out.println(soru_3(a3));

        int[] ar=new int[4];
        ar[0]=5;    ar[1]=9;    ar[2]=3;    ar[3]=-6;
    //   System.out.println(Arrays.toString(soru_4(ar)));
    //   System.out.println(Arrays.toString(soru_5(ar)));

        int [] a6={8,15};
    //   System.out.println(Arrays.toString(soru_6(a6)));

        int[] a={10,8,15,1,40};
    //   System.out.println(Arrays.toString(soru_7(a,ar)));

        int[] a8={5,4,3,2,1};
        int[] a_8={1,2,3,4,5,7,9};
    //   System.out.println(soru_8(a8,a_8));

        int[] a9={5,4,3,2,1};
    //   System.out.println(Arrays.toString(soru_9(a9)));

    //   System.out.println(Arrays.toString(soru_10(10)));

    //   System.out.println(Arrays.toString(soru_11(500)));

    //   System.out.println(soru_12(500));

    //   System.out.println(soru_13(500));

        int[] a14={1,2};
    //   System.out.println(soru_14(a14));

        int[] a15={55,5,88,8,85,8,5,55,5};
       System.out.println(soru_15(a15));      // çalışıyor ama kısa yolunu sor     //Stringle yapmışım, arrayle dene

        int[] a16={2,4,3,5,3,8,8};
    //   System.out.println(soru_16(a16));      // çalışıyor ama kısa yolunu sor

        int[] a17={25,89,78,98};
    //   System.out.println(soru_17(a17));

        String str="Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek \n" +
                "dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp \n" +
                "sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının \n" +
                "üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.";
                
    //    System.out.println(soru_18(str));

        String s19="araba ile yola çıktık fakat arıza yaptı ";
    //   System.out.println(soru_19(s19));

        int[] a20={5,7,1,9};
    //   System.out.println(Arrays.toString(soru_20(a20)));

        int[] a21={6,5,8,6,8,5,8};
    //   System.out.println(Arrays.toString(soru_21(a21)));

        int[] a22={21,7,29,12};
    //   System.out.println(soru_22(a22));

        int[] a23={21,7,-1,12,29,12,-9,0,7};
    //   System.out.println(Arrays.toString(soru_23(a23)));      // uzun çözüm kısasını bul
    //   System.out.println(Arrays.toString(soru2323(a23)));     // bu kadar kısaldı
    //   System.out.println(Arrays.toString(soruu23(a23)));         //işte bu

        int[] a24={};                                             // uzun çözüm kısasını bul
    //   System.out.println(soru_24(a24));

        int[] a25={5,9,5,1,9};
    //   System.out.println(soru_25(a25));

        int[] a26={5,1,9,6,1,4,7,11,25,36,1};
    //   System.out.println(Arrays.toString(soru_26(a26)));



    }
    public static int[] soru_26(int [] arry){
        int[] newArry= Arrays.copyOf(arry,arry.length);
        int bir=0;
        for (int i = 0; i <newArry.length ; i++) {
            if(newArry[i]==1){
                bir++;
            }
        }
        while(bir>=0) {
            for (int i = 0; i < newArry.length; i++) {
                if (newArry[i] == 1 && i != newArry.length - 1) {
                    newArry[i] = newArry[i + 1];
                    newArry[i + 1] = 1;
                }
            }bir--;
        }
        return newArry;
    }

    public static int soru_25(int[] arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==5){
                for (int j = i; j < arr.length ; j++) {
                    if(arr[j]==9){
                        for (int k = i; k <=j ; k++) {
                            arr[k]=0;
                        }break;
                    }
                }
            }
            sum+=arr[i];
        }
        return sum;
    }

    public static int soru_24(int[] arr){
        int sum=0;
        if(arr.length==1){
            sum=arr[0];
        }else{
            for (int i = 0; i <arr.length ; i++) {
                if (i == 0) {
                    if (arr[i] != arr[i + 1]) {
                        sum += arr[i];
                    }
                } else if (i > 0 && i < arr.length - 1) {
                    if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
                        sum += arr[i];
                    }
                } else if (i == arr.length - 1) {
                    if (arr[i] != arr[i - 1]) {
                        sum += arr[i];
                    }
                }
            }
        }
        return sum;
    }

    public static int[] soruu23(int arr[]){
        int[] a=Arrays.copyOf(arr,arr.length);
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                int min=a[j];
                if(a[i]>a[j]){
                    a[j]=a[i];
                    a[i]=min;
                }
            }
        }
        return a;
    }

    public static int[] soru2323(int[] array){
        int[] arr=Arrays.copyOf(array,array.length);
        int[] result=new int[arr.length];
        for (int j = 0; j <arr.length ; j++) {
            int max=arr[0];
            int min=arr[0];

            for (int i = 0; i <arr.length ; i++) {
                if(max<arr[i]){
                    max=arr[i];
                }if(min>arr[i]){
                    min=arr[i];
                }
            }result[result.length-1-j]=max;
            for (int i = 0; i <result.length ; i++) {
                if(arr[i]==max){
                    arr[i]=min;
                    break;
                }
            }
        }
        return result;
    }

    public static int[] soru_23(int [] arr){
        int[] sAray=Arrays.copyOf(arr,arr.length);

        for (int j = 0; j <sAray.length/2 ; j++) {

            int min = sAray[j];
            int max = sAray[j];
            int ilkindex = sAray[j];
            int sonindex = sAray[sAray.length-j - 1];

            for (int i = 0+j; i < sAray.length-j; i++) {
                if (min > sAray[i]) {
                    min = sAray[i];
                }
                if (max < sAray[i]) {
                    max = sAray[i];
                }
            }
            for (int i = 1+j; i < sAray.length-j; i++) {
                if (min == sAray[i]) {
                    sAray[i] = ilkindex;
                    break;
                }
            }sAray[j] = min;

            for (int i = 0+j; i < sAray.length - 1-j; i++) {
                if (max == sAray[i]) {
                    sAray[i] = sonindex;
                    break;
                }
            }
            sAray[sAray.length-j - 1] = max;
        }
        return sAray;
    }
    public static boolean asal(int x){
        if(x<2){
            return false;
        }
        for (int i = 2; i <=x/2 ; i++) {
            if(x%i==0){
                return false;
            }
        }
        return true;
    }

    public static String soru_22(int[] ar){
        int[] arr=Arrays.copyOf(ar,ar.length);
        String asal="";
        for (int i = 0; i <arr.length ; i++) {
            if(asal(arr[i])) {
                asal+= arr[i]+" ";
            }
        }
        return asal;
    }

    public static int[] soru_21(int [] ar){
        int [] arr=Arrays.copyOf(ar, ar.length);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==5 && arr[i+1]==8){
                arr[i+1]=1;
            }
        }return arr;
    }

    public static int[] soru_20(int[] arr){
        int[] newArray=Arrays.copyOf(arr,arr.length);
        Arrays.sort(newArray);
        for (int i = 1; i < newArray.length; i++) {
            newArray[i]=0;
        }
        return newArray;
    }

    public static boolean soru_19(String str){
        String[] s=str.split(" ");
        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j <s.length ; j++) {
                if(s[i].equalsIgnoreCase(s[j])){
                    return true;
                }
            }
        }return false;
    }

    public static int soru_18 (String str){
        String[] arr=str.split("");
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].equalsIgnoreCase("o")){
                count++;
            }
        }
        return count;
    }

    public static boolean soru_17(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }


        return false;
    }

    public static int soru_16(int [] arr){
        int max=0;
        int enCok=-1;
        for (int i = 0; i <arr.length ; i++) {
          int sayi=0;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    sayi++;
                }
            }if(max<sayi){
             max=sayi;
             enCok=arr[i];
            }
        }
        return enCok;
    }

    public static String soru_15(int[] arr){
        String str="";
        for (int i = 0; i <arr.length-1 ; i++) {
            if(str.contains(","+arr[i]+",")){
                continue;
            }
            if(arr[i]==arr[i+1] || (i!=0 && arr[i]==arr[i-1])){
              continue;
            }
            str+=","+arr[i]+",";
        }
        if(str.contains(","+arr[arr.length-1]+",")){
           str+="";
        }else{
        str+=","+arr[arr.length-1]+",";}
        return str.substring(1,str.length()-1).replace(",,",",");
    }

    public static boolean soru_14(int [] arr){
        for (int i = 0; i <arr.length-2 ; i++) {
            if(arr[i]+1==arr[i+1] && arr[i]+2 == arr[i+2]){
                return true;
            }
        }return false;
    }

    public static int soru_13(int a){
        Random rd=new Random();
        int[] array=new int[a];
        for (int i = 0; i <array.length; i++) {
            array[i]=rd.nextInt(120,140);
        }
        int max=array[0];
        int min=array[0];
        for (int i = 0; i <array.length ; i++) {
            if(max<array[i]){
                max=array[i];
            }if(min>array[i]){
                min=array[i];
            }
        }
        for (int i = 0; i <array.length ; i++) {
            if(array[i]!=max && min<array[i]){
                min=array[i];
            }
        }
        return min;
    }

    public static int soru_12(int a){
      Random rd=new Random();
      int[] array=new int[a];
      for (int i = 0; i <array.length; i++) {
          array[i]=rd.nextInt(120,140);
      }
      int count=0;
      for (int i = 0; i < array.length; i++) {
          if(array[i]==125){
              count++;
          }
      }
      return count;
  }

    public static int[] soru_11(int a){
      Random rd=new Random();
      int[] array=new int[a];
      for (int i = 0; i <array.length; i++) {
          array[i]=rd.nextInt(30)+50;
      }return array;
  }

    public static int[] soru_10(int a){
        Random rd=new Random();
        int[] array=new int[a];
        for (int i = 0; i <array.length; i++) {
            array[i]=rd.nextInt(100);
        }return array;
    }

    public static int[] soru_9(int[] arry){

        int [] createArray=new int[arry.length];
            for (int i = 0; i <arry.length ; i++) {
                createArray[i]=arry[arry.length-1-i];
            }
        return createArray;
    }

    public static boolean soru_8(int [] ar1, int[] ar2){
       boolean bl=false;
        for (int i = 0; i <ar1.length ; i++) {
            for (int j = 0; j <ar2.length ; j++) {
                bl=false;
                if(ar1[i]==ar2[j]){
                    bl=true;
                    break;
                }
            }if(bl==false){
                return false;
            }
        }return true;
    }

    public static int[] soru_7(int[] ar1, int[] ar2){
        int [] arr=new int[ar1.length+ar2.length];
        for (int i = 0; i <ar1.length; i++) {
            arr[i]=ar1[i];
        }
        for (int i = 0; i <ar2.length  ; i++) {
            arr[i+ar1.length]=ar2[i];
        }return arr;
    }

    public static int[] soru_6(int [] arry){
        int min=arry[0];
        int max=arry[1];
       if(arry[1]<arry[0]){
           min=arry[1];
           max=arry[0];
       }
       int[] createArray=new int[max-min+1];
        for (int i = min,j=0; j <createArray.length ;j++, i++) {
            createArray[j]=i;
        }
        return createArray;
    }

    public static int[] soru_5(int[] arry){
        int min=arry[0];
        for(int param:arry){
            if(min>param){
                min=param;
            }
        }
        int [] arr=Arrays.copyOf(arry,arry.length);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=min;
        }
        return arr;
    }

    public static int[] soru_4(int [] arry){
        int min=arry[0];
        int max=arry[0];
        for (int param:arry) {
            if(min>param){
                min=param;
            }if(max<param){
                max=param;
            }
        }int[] result={min,max};
        return result;
    }

    public static int soru_3(int [] arry){
        int result=0;
        for (int uc:arry) {
            if(uc==3){
                result+=uc;
            }
        }

        return result;
    }

    public static int soru_2(int [] arry){
        int result=0;
        for(int sayi:arry){
            if(sayi%2==0){
                result+=sayi;
            }
        }return result;
    }

    public static int soru_1(int[] arry){
        int result=0;
        for(int param:arry){
            result+=param;
        }
        return result;
    }











}
