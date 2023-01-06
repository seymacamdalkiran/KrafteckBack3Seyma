package day_49_ExceptionAndCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionIntro {
    public static void main(String[] args) {
    /*    ArrayList<Integer> alist=new ArrayList<>();

        alist.add(15);
        alist.add(25);
        alist.add(35);
        alist.add(45);
        alist.add(55);
        System.out.println(alist);
        System.out.println(alist.remove(3));
        alist.add(0, alist.remove(alist.size()-1));
        System.out.println(alist);

     */

        List<Integer> list=new ArrayList<>();
        Collection<Integer> col=new ArrayList<>();

        col.add(5); col.add(5);col.add(15);
        col.add(50); col.add(100);


    //    System.out.println(col.size());
      //  System.out.println(col);

        System.out.println(col.remove(5));
        System.out.println(col);
    //    System.out.println(col.remove(34));
    //    System.out.println(col);



    }
}
