package day_48_Exception;

public class ExceptionTry {
    public static void main(String[] args) {

        System.out.println("Test suit started");
        System.out.println("Test1 started");
        System.out.println("Test2 started");
        try {
            int[] array = {1, 2, 3};
            System.out.println("array[2] = " + array[2]);
            System.out.println("test");
            System.out.println("array[3] = " + array[5]);
            System.out.println("Test3 started");
            System.out.println("array[1] = " + array[1]);
            System.out.println("-------");
        }catch(Exception e){
            System.out.println("Hata Alındı");
        }

        System.out.println("Test4 started");
        System.out.println("Test5 started");
        System.out.println("Test suit ended");

        //  Exception normal program akışının kesintiye uğraması
        //  distrupts the normal flow
        //  abnormal condition






    }
}
