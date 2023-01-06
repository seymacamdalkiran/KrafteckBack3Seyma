package odevler;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class soruCozumu {
    public static void main (String[] args){



      //  System.out.println(soru_29("Merhabbbba"));
      //  System.out.println(soru());
      //  System.out.println(soru_13(arr));
      //  System.out.println(soru(arr));
      //  System.out.println(enBuyukIkinciSayi(arr));
      //  System.out.println(soru_13(arr));

        int ar[]={3,5,7,5,2,1,4};

      //  int degistir=newAr[0];
      //  newAr[0]=ar[4];
      //  newAr[4]=degistir;

       // System.out.println(Arrays.toString(newAr));
        int[] arr={5,-4,-4,-1,-5};

      // System.out.println(soru13(arr));

        // Örnek 23:Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)
        //[21,7,29,12] ----→[7,12,21,29]
        System.out.println(Arrays.toString(soru2323(arr)));

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

    public static int[] soru_26(int [] arr){
        int bir=0;
        int[] newArray=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==1){
                bir++;
            }
        }
        for (int i = 0; i <bir ; i++) {
            newArray[arr.length-1-i]=1;
        }
        for (int i = 0; i <arr.length-bir ; i++) {
            if(arr[i]!=1){
                newArray[i]=arr[i];
            }
        }   //{5,1,9,6,1,4,7,11,25,36,1}

        int sifir=0;
        for (int i = 0; i <arr.length-bir ; i++) {
            if(newArray[i]==0){
                sifir++;
            }
        }
        int sondanBir=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]==1){
                sondanBir++;
            }break;
        }
        int count=0;
        while(count<=bir){
            for (int i = 0; i <arr.length-bir-sondanBir ; i++) {
                if(newArray[i]==0){
                    newArray[i]=newArray[i+1];
                    newArray[i+1]=0;
                }
            }       //  {5,1,9,6,1,4,7,11,25,36,1}
            //  [5,9,6,4,7,11,0,0,1,1,1}
            count++;
        }
        for (int j = 0; j <sifir; j++) {
            for (int i = 0; i <arr.length ; i++) {
                if(newArray[i]==0){
                    newArray[i]=arr[arr.length-bir+j];
                    break;
                }
            }
        }
        return newArray;
    }

    public static int soru13(int[] array) {
        int max = array[0];
        int max2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != max && max2 < array[i]) {
                max2 = array[i];
            }
        }
        return max2;
    }


    public static int[] soru_23(int [] arr){
        int[] sıralıArray=Arrays.copyOf(arr,arr.length);

        for (int j = 0; j <sıralıArray.length/2 ; j++) {

            int min = sıralıArray[j];
            int max = sıralıArray[j];
            int ilkindex = sıralıArray[j];
            int sonindex = sıralıArray[sıralıArray.length-j - 1];

            for (int i = 0+j; i < sıralıArray.length-j; i++) {
                if (min > sıralıArray[i]) {
                    min = sıralıArray[i];
                }
                if (max < sıralıArray[i]) {
                    max = sıralıArray[i];
                }
            }
            for (int i = 1+j; i < sıralıArray.length-j; i++) {
                if (min == sıralıArray[i]) {
                    sıralıArray[i] = ilkindex;
                    break;
                }
            }sıralıArray[j] = min;

            for (int i = 0+j; i < sıralıArray.length - 1-j; i++) {
                if (max == sıralıArray[i]) {
                    sıralıArray[i] = sonindex;
                    break;
                }
            }

            sıralıArray[sıralıArray.length-j - 1] = max;


        }
        return sıralıArray;
    }
    public static int[] soru23(int [] arr){
        int[] sıralıArray=Arrays.copyOf(arr,arr.length);

        int min=sıralıArray[0];
        int max=sıralıArray[0];
        int ilkindex=sıralıArray[0];
        int sonindex=sıralıArray[sıralıArray.length-1];

        for (int i = 0; i <sıralıArray.length ; i++) {
            if(min>sıralıArray[i]){
                min=sıralıArray[i];
            }if(max<sıralıArray[i]){
                max=sıralıArray[i];
            }
        }
        for (int i = 1; i <sıralıArray.length ; i++) {
            if(min==sıralıArray[i]){
                sıralıArray[i]=ilkindex;
                break;
            }
        }
        for (int i = 0; i <sıralıArray.length-1 ; i++) {
            if(max==sıralıArray[i]){
                sıralıArray[i]=sonindex;
                break;
            }
        }
        sıralıArray[0]=min;
        sıralıArray[sıralıArray.length-1]=max;

        return sıralıArray;
    }
    public static int soru_13(int[] array) {
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
    public static int enBuyukIkinciSayi(int[] arry){

        int[] newArray = new int[arry.length];
        int max = newArray[0];
        int max2 = newArray[0];
        for (int i = 0; i < arry.length; i++) {
            newArray[i] = arry[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i]>max){
                max = newArray[i];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i]>max2 && newArray[i]<max){
                max2 = newArray[i];
            }
        }
     //   System.out.println(Arrays.toString(newArray));
        return max2;
    }
    public static int soru(int[] newArray){
        int max = newArray[0];
        int max2 = newArray[0];

        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i]>max){
                max = newArray[i];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i]>max2 && newArray[i]<max){
                max2 = newArray[i];
            }
        }
        return max2;
    }
    public static String soru(){
        Scanner scan=new Scanner(System.in);
        int count1=0;
        int count2=0;
        String s1="";
        String s2="";
        while(count1<3){
            System.out.println("Lütfen bir isim yazın.\nKalan hakkınız = "+(3-count1));
            String ilkİsim=scan.nextLine();
            if(ilkİsim.length()>=1 && ilkİsim.length()<=4){
                s1=ilkİsim;
                break;
            } count1++;
        }
        if(s1.length()>0){
            while(count2<3){
                System.out.println("Lütfen ikinci bir isim yazın\nKalan hakkınız = "+(3-count2));
                String ikinciİsim=scan.nextLine();
                if(ikinciİsim.length()>=1 && ikinciİsim.length()<=4){
                    s2=ikinciİsim;
                    break;
                }count2++;
            }
        }
        if(s2.length()>=0){
            return s1.concat(" ").concat(s2);
        }
        return "hatalı giriiş, Program sonlandırıldı";
    }
    public static String soru_21(){
        int count1=0;
        int count2=0;
        String a="";
        String b="";
        Scanner scan=new Scanner(System.in);
        while(count1<3){
            System.out.println("Kalan hakkınız = "+(3-count1)+"\nLütfen bir kelime yazın.");
            String s1=scan.nextLine();
            if(s1.length()>0 && s1.length()<5){
                a=s1;
                break;
            }
            count1++;
        }
        if(a.length()>0){
        while(count2<3){
            System.out.println("Kalan hakkınız = "+(3-count2)+"\nLütfen bir kelime daha yazın.");
            String s2=scan.nextLine();
            if(s2.length()>0 && s2.length()<5){
                b=s2;
                break;
            }
            count2++;
        }}
        if(b.length()>0){
            return a+" "+b;
        }return "Program sonlandırıldı";
    }
    public static String soru_22(String st){
        String str=st.replace(" ","");
        int count=0;
       for (int i = 0; i <str.length() ; i++) {
           count=str.toLowerCase().length()-str.toLowerCase().replace(str.toLowerCase().substring(i,i+1),"").length();
           if(count==1){
              return str.substring(i,i+1);
           }
       }return "Benzersiz harf yoktur";
   }
    public static String soru_29(String st){
        int count=0;
        int max=0;
        String result="";
        String str=st.toLowerCase().replace(" ","");
        for (int i = 0; i <str.length(); i++) {
            count=str.length()-str.replace(str.charAt(i)+"","").length();
            if(count>=max){
                max=count;
                result=str.charAt(i)+"";
            }
        }
        return result;
    }






}
