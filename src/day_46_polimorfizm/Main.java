package day_46_polimorfizm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*
        System.out.println(sum(5,6,7));

        SubClass subClass=new SubClass();
        System.out.println("subClass.sum(5,6) = " + subClass.sum(5, 6));

 */
        Animal obje1=new Kelebek();
        Animal obje2=new Yarasa();

        obje1.move();
        obje1.sleep();
        System.out.println(obje1.x);

        //    ArrayList<Kelebek> kelebek=new ArrayList<>();
    //    ArrayList<Yarasa> yarasa=new ArrayList<>();

        ArrayList<Animal> animal =new ArrayList<>();



    }
    public static int sum(int x,int y){
        return x+y;
    }
    public static int sum(int x,int y,int z){
        return x+y+z;
    }




}
