package day_49_ExceptionAndCollection;

public class CustomException extends ArithmeticException {
    public CustomException(String s) {
        super(s);
        System.out.println(s);
    }
}
class customExceptionTry{
    public static void check(int lenght){
        if(lenght<170){
            throw new CustomException("katılamaz");
        }else{
            System.out.println("approved");
        }
    }

    public static void main(String[] args) {
        check(169);
    }
}

