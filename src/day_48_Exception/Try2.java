package day_48_Exception;

public class Try2 {
    public static void main(String[] args) {

        try{
            int i=10/0;
            System.out.println("Selam");
        }catch (ArithmeticException e){
            System.out.println("Hata alındı");
        }
        System.out.println("Devam eder");
    }
    //  Try Catch blokları mutlaka bir blok içinde olması gerekior
    //  Try block u içindeki hata atan satırdan sonraki satırlar yürütülmez
    //  Hata atılırsa catch yürütülür / atılmazsa catch execute edilmez.

}
