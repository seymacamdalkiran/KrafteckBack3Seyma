package day_51;

import java.util.ArrayList;
import java.util.List;

public class Collection_List_Example_2 {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(3);
       // arrayList.removeAll(arr2);
        //arrayList.retainAll(arr2);
       // System.out.println(arrayList);

        List<Double> not=new ArrayList<>();
        not.add(70.0);
        not.add(80.0);
        not.add(90.0);

        System.out.println("ortalama(not) = " + ortalama(not));

    }
    public static double ortalama(List<Double> not){
        int top=0;
        for (int i = 0; i < not.size(); i++) {
            top+=not.get(i);
        }
        return top/ not.size();
    }


}
