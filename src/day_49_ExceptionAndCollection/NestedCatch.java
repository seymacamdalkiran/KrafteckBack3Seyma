package day_49_ExceptionAndCollection;

public class NestedCatch {
    public static void main(String[] args) {

        outer: try{

        try{
            int i=100/0;
        }catch (ArithmeticException e){
            System.out.println("inner 1");
        }
            System.out.println("innerların arasından selam");
        try{
            int[] arry={1,2,3};
            int t=arry[3];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("inner 2");
        }
        }catch (Exception e){
            System.out.println("outer");
        }




    }
}
