package day_34_;

import java.sql.SQLOutput;
import java.util.Arrays;

public class WrapperClass2 {
    public static void main(String[] args) {


    //    System.out.println(Character.isAlphabetic(','));
    //    System.out.println(Character.isLetter(','));
        String str2 ="|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>" +
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n*" +
                "*-<<|||>>012345l679--a**//##++34r``~~((ı[234]+||";
        String s="";
        for (int i = 0; i <str2.length() ; i++) {
            if(Character.isAlphabetic(str2.charAt(i)) || ((str2.charAt(i)==' '))) {
                s += str2.charAt(i);
            }
        }
    //    System.out.println(s);

        //          strx
//        A number is a mathematical object used to count, measure, and label.
//        The original examples are the natural numbers 1, 2, 3, 4, and so forth.

//        task1 -- string içindeki sayıların toplamını alan bir method oluşturnuz
//        task2 -- string içindeki sayıları bir aray çinde döndüren bir method yazın


//          stry
//        A number is a mathematical object used to count, measure, and label.
//        The original examples are the natural numbers 1, 2, 3, 4, and so forth.[1]
//        Numbers can be represented in language with number words. More universally,
//        individual numbers can be represented by symbols, called numerals; for example,
//        "5" is a numeral that represents the number five. As only a relatively small
//        number of symbols can be memorized,
//        basic numerals are commonly organized in a numeral system,
//        which is an organized way to represent any number.

//        Task3 -- String içindeki toplam character/dijit character/alphabethic character/letter
//        character sayılarını yazdıran bir method oluşturun


        String s1="A number is a5 mathematical object used to count, measure, and label.\n" +
                "//     7   The original examples are the natural numbers 1, 2, 3, 4, and so forth.";
        System.out.println(task1(s1));

        System.out.println(Arrays.toString(task2(s1)));

        String s2="A number is a mathematical object used to count, measure, and label. " +
                "The original examples are the natural numbers 1, 2, 3, 4, and so forth.[1] " +
                "Numbers can be represented in language with number words. More universally," +
                "individual numbers can be represented by symbols, called numerals; for example," +
                "\"5\" is a numeral that represents the number five. As only a relatively small" +
                " number of symbols can be memorized,basic numerals are commonly organized in a numeral system," +
                "which is an organized way to represent any number.";

        task3(s2);


    }
    public static void task3(String str){
        int character=str.length();
        int digit=0;
        int alphabetic=0;
        int letter=0;
        System.out.println("Toplam character = " + character);

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                digit++;
            }
        }
        System.out.println("digit = " + digit);

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                alphabetic++;
            }
        }
        System.out.println("alphabetic = " + alphabetic);

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLetter(str.charAt(i))){
                letter++;
            }
        }
        System.out.println("letter = " + letter);

    }


    public static int[] task2(String s2){
        String digit="";
        for (int i = 0; i <s2.length() ; i++) {
            if(Character.isDigit(s2.charAt(i))){
                digit+=s2.charAt(i);
            }
        }
        String[] array=digit.split("");
        int[] arr=new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            arr[i]=Integer.valueOf(array[i]);
        }
      return arr;
    }


    public static int task1(String s1){
        int sum=0;
        for (int i = 0; i < s1.length(); i++) {
            if(Character.isDigit(s1.charAt(i))){
                sum+=Integer.valueOf(s1.charAt(i)+"");
            }
        }
        return sum;
    }




}
