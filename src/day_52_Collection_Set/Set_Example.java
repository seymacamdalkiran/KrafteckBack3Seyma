package day_52_Collection_Set;

import java.util.*;

public class Set_Example {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>(Arrays.asList("Ali","Şeyma","Ferid"));
        hashSet.add("Harun");
        hashSet.add("Şeyma");
        hashSet.add("Harun");
        System.out.println(hashSet);

        Integer [] arr={1,2,3,6,8,45,33,69,78,1,2,3,6,8};

        Set<Integer> hashSet1=new HashSet<>(Arrays.asList(arr));
        Set<Integer> treeSet=new TreeSet<>(Arrays.asList(arr));
        System.out.println(hashSet1);
        System.out.println(treeSet);
    }
}
