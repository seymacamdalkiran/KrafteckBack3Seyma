package day_52_Collection_Set;
import java.util.*;
public class List_Polinrom {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>(Arrays.asList("kaşık","adanada","kazak","radar","ses","adanada","ses"));
        polindromKelimeBul(list);
        System.out.println();
     //   aynıKelimeYok(list);
       // System.out.println();
        polindromKelimeBul5(list);


    }
    public static void polindromKelimeBul5(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String reverse = "";
            for (int j = str.length()-1; j >=0;  j--) {
                reverse+=str.charAt(j);
            }
            if(str.equalsIgnoreCase(reverse)){
                System.out.print(str+" ");
                list.removeAll(Arrays.asList(str));
                i--;
                //removeAll-remove ikisinden biri
                //
            }
        }

    }
    public static void aynıKelimeYok (List<String> list){
        List<String> list1=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equalsIgnoreCase(reverse(list.get(i)))){
                list1.add(list.get(i));
            }
        }
        for (int i = 0; i < list1.size() ; i++) {
            for (int j = i+1; j <list1.size() ; j++) {
                if(list1.get(i).equalsIgnoreCase(list1.get(j))){
                    list1.remove(list1.get(j));
                }
            }
        }
        for (int i = 0; i <list1.size() ; i++) {
                System.out.print(list1.get(i)+", ");
        }
    }
    public static void polindromKelimeBul(List<String> list){
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equalsIgnoreCase(reverse(list.get(i)))){
                System.out.print(list.get(i)+", ");
            }
        }
    }
    public static String reverse(String str){
        String reverse="";
        for (int j = str.length()-1; j >=0 ; j--) {
            reverse+=str.charAt(j);
        }
        return reverse;
    }



}
