package day_35_review;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperTasks {
    public static void main(String[] args) {

        ArrayList<String> birinci=new ArrayList<>();
        birinci.add("elma");
        birinci.add("armut");
        birinci.add("kayısı");
        birinci.add("üzüm");
        birinci.add("erik");

        ArrayList<String> ikinci=new ArrayList<>();
        ikinci.add("armut");
        ikinci.add("kayısı");
        ikinci.add("üzüm");

        birinci.removeAll(ikinci);
    //    System.out.println("birinci = " + birinci);

        ArrayList<Integer> listOfNums =new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(500);

      //  printListNumbers(listOfNums);

        String str="SaLih hOCa";
        System.out.println(upperLower(str));

        System.out.println(sum(listOfNums));

        System.out.println(listOfNums);
        System.out.println(duplicate(listOfNums));
        System.out.println(listOfNums);

        System.out.println(squared(listOfNums));

        System.out.println(getList(20));

    }
    


    //      ArrayList<Integer> myList = getList(20);//return method
    //      System.out.println(myList);
    //      [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

    public static ArrayList<Integer> getList(int num){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <=num ; i++) {
            list.add(i);
        }return list;
    }




    //      squared(listOfNums); methodu ile de değerleri kendi ile
    //      çarpıp list i döndürün.
    public static ArrayList<Integer> squared(ArrayList<Integer> nums){

        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i)* nums.get(i));
        }
        return nums;
    }

    //      duplicate(listOfNums); methodu ile de değerleri dublicate
    //      edip list i döndürelim.
    public static ArrayList<Integer> duplicate(ArrayList<Integer> nums ){
        for (int i = 0; i < nums.size() ; i++) {
            nums.set(i,nums.get(i)*2);
        }
        return nums;
    }


        //sum(listOfNums); methodu ile de toplam değeri döndürelim.
    public static int sum(ArrayList<Integer> nums){
        int num=0;
     //   for (int i = 0; i < nums.size(); i++) {
     //       num+=nums.get(i);
     //   }
        for(Integer I : nums ){
            num+=I;
        }

        return num;
    }




    public static void printListNumbers(ArrayList<Integer> add){
        for (Integer I: add) {
            System.out.print(I+" ");
        }
    }













    public static String upperLower(String str){
        String degisim="";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                degisim+=str.substring(i,i+1).toLowerCase();
            }else{
                degisim+=str.substring(i,i+1).toUpperCase();
            }
        }
        return degisim;
    }
}
