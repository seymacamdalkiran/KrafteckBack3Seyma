package day_48_Exception;

import java.sql.Array;

public class Try3 {
    public static void main(String[] args) {

        try {
            int num = 100 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }


        String str = "str";
        try {
            int i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }


        int[] array = new int[4];
        try {
            array[7] = 5;
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
