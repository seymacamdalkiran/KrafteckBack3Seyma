package day_49_ExceptionAndCollection;

public class ThrowExcepcionExample {
    public static void main(String[] args) {
        //kkullanıcıdan boy ölçüsü alan bir kod yazalım
        //kullanıcı 170 den daha kısa girerse excepton atalım
        //kullanıcıya mesaj verelim
        length(170);

    }
    public static void length(int len){
      try{
        if(len<170){
            throw new ArithmeticException("Length is not suitable");
        }else{
            System.out.println("Approvel");
        }}catch (ArithmeticException e) {
          e.printStackTrace();
          System.out.println("selam");
      }

        System.out.println("kod bitti");
    }
}
