package day_51;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class CollectionList {
    public static void main(String[] args) {
        ArrayList<Object> obje=new ArrayList<>();
        obje.add("ayşe");
        obje.add("mehmet");
        obje.add("ahmet");
        obje.add("sefa");

        System.out.println("1");
        System.out.println(obje);
        for (int i = 0; i < obje.size() ; i++) {
            System.out.println(obje.get(i));
        }
        System.out.println("2)");
        while(!obje.isEmpty()){
            System.out.println(obje.remove(0));
        }
        System.out.println("3)");

        LinkedList<Object> obje1=new LinkedList<>();
        obje1.add("ayşe");
        obje1.add("mehmet");
        obje1.add("ahmet");
        obje1.add("sefa");

        System.out.println(obje1);
        System.out.println("4)");
        for (int i = 0; i < obje1.size(); i++) {
            System.out.println(obje1.get(i));
        }
        System.out.println("5)");
        while ((!obje1.isEmpty())){
            System.out.println(obje1.remove(0));
        }





    }
}
