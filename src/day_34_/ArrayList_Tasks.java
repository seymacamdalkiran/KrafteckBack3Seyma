package day_34_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayList_Tasks {
    public static void main(String[] args) {

        ArrayList<Integer> listOfNums=new ArrayList<>();
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

        printListNumbers(listOfNums);
        System.out.println();
        System.out.println("sum(listOfNums) = " + sum(listOfNums));
        System.out.println("dublicate(listOfNums) = " + dublicate(listOfNums));
        System.out.println("squared(listOfNums) = " + squared(listOfNums));
        System.out.println("getList(20) = " + getList(20));
        System.out.println("rndm() = " + rndm());

        ArrayList<String> stringNums = new ArrayList<>();
        stringNums.add("10");
        stringNums.add("100");
        stringNums.add("101");
        stringNums.add("1000");
        System.out.println(toIntList(stringNums));
        System.out.println(Arrays.toString(toIntArr(stringNums)));


    }
    //  stringNums isimli arrayList i
    //  toIntArr(stringNums); methodu ile int bir array e convert edip
    //  döndürelim.
    public static int[] toIntArr(ArrayList<String> nums){
        int[] toArray=new int[nums.size()];
        for (int i = 0; i <nums.size() ; i++) {
            toArray[i]=Integer.parseInt(nums.get(i));
        }
        return toArray;
    }


    //  "10","100","101","1000" sayılarını stringNums isimli arrayList e atalım.
    //  toIntList(stringNums); methodu Integer bir arrayList e convert edip
    //  döndürelim.
    public static ArrayList<Integer> toIntList (ArrayList<String> nums){
        ArrayList<Integer> arraylis= new ArrayList<>();
        for (String I : nums) {
            arraylis.add(Integer.parseInt(I));
        }
        System.out.println(arraylis.get(0)+arraylis.get(1));
        return arraylis;
    }
    



    //  random(20);  bir method oluşturup 20 size li 20 ye kadar random
    //  rakamlardan oluşan bir ArrayList döndüren method oluşturalım.
    //  Random class using example/Random class kullanım örneği
    //  Random rm = new Random();
    //  rm.nextInt(20)

    public static ArrayList<Integer> rndm(){
        ArrayList<Integer> random=new ArrayList<>();
        Random rd=new Random();
        for (int i = 0; i <20 ; i++) {
            random.add(rd.nextInt(20));
        }return random;
    }


    //  ArrayList<Integer> myList = getList(20);//return method
    //  System.out.println(myList);
    //  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

    public static ArrayList<Integer> getList(int num){
        ArrayList<Integer> arl=new ArrayList<>();
        for (int i = 1; i <=20 ; i++) {
            arl.add(i);
        }return arl;
    }

    //  squared(listOfNums);  methodu ile de değerleri kendi ile
    //  çarpıp list i döndürün.
    public static ArrayList<Integer> squared(ArrayList<Integer> nums){
        ArrayList<Integer> arl=new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            arl.add(nums.get(i)*nums.get(i));
        }return arl;
    }

    //  dublicate(listOfNums);  methodu ile de değerleri dublicate
    //  edip list i döndürelim.
    public static ArrayList<Integer> dublicate(ArrayList<Integer> nums){
        ArrayList<Integer> dubli=new ArrayList<>();
        for (int i = 0; i <nums.size() ; i++) {
            dubli.add(nums.get(i)*2);
        }
        return dubli;
    }

    //  sum(listOfNums);  methodu ile de toplam değeri döndürelim.
    public static int sum(ArrayList<Integer> nums){
        int sum=0;
        for (Integer ints: nums) {
            sum+=ints;
        }return sum;
    }

    //  5,10,15,15,20,25,25,100,100,500  rakamlarını listOfNums isili
    //  bir ArrayListe atın ve
    //  printListNumbers(listOfNums);  methodu ile yazdıralım.
    public static void printListNumbers(ArrayList<Integer> nums){
        for (Integer ints: nums) {
            System.out.print(ints+" ");
        }
    }
















}
