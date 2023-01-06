package day_28_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {



        //      1- how to declare an array
        int[] arry;     // int arry[];

        //      2- İnstantiating

        arry =new int[5];           // allocating memory

        int[] arryx =new int[5];    //declaring and instantiating

        //      alternate declaring
        int [] arry1,arry2;
        int arry3[],arry4[],arry5[];

        //      3- initializing
        arry[0]=10;
        arry[1]=20;
        arry[2]=30;
        arry[3]=40;
        // arry[0]=50;      reassing
        arry[4]=50;


        //      4- how to write an array to console
        //         4.1- foreach()
        for(int i:arry){
            System.out.println(i);
        }
        //          4.2- foorloop
        for (int i = 0; i <arry.length; i++) {
            System.out.print(arry[i]+" ");
        }
        System.out.println("\n------------");
        //          4.3- toString()
        System.out.println(Arrays.toString(arry));

        //       5-  literal way
        // arry1 ={60,70,80,90,100}     you can not do this
        int[] arryL={60,70,80,90,100,110};
        System.out.println(arryL[3]);
        System.out.println(Arrays.toString(arryL));
        System.out.println(arryL.length);

        //      extra
        arry1=new int[3];
        System.out.println(Arrays.toString(arry1));
        System.out.println(arry1[0]);

        arry2=arry1;
        System.out.println(Arrays.toString(arry2));
        System.out.println(Arrays.toString(arry));
        arry=arry1;
        System.out.println(Arrays.toString(arry));


    }
}
