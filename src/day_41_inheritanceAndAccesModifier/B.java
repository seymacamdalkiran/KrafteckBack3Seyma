package day_41_inheritanceAndAccesModifier;

public class B extends A{
   String strB;
   int intB;


   public B(String strA,String strB, int intA){
      super(strA);   //Bu illa em başta yazılmak zorunda
      //eğer parent da boş constructor varsa bunu yazmak zorunda değiliz.

      this.strB=strB;
      this.intB=intB;
   }


   public void metotB() {

      System.out.println(this.strA);
      System.out.println(super.strA);

   }

















}
