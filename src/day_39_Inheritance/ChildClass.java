package day_39_Inheritance;

public class ChildClass extends ParentClass{
    public void print_message_C(){
        print_message_P();
        System.out.println(" World");
      //  Child üst clastan doğrudan metot çağırabilir
       }
}
class main{
    public static void main(String[] args) {
        ChildClass child1=new ChildClass();

        child1.print_message_P();
        child1.print_message_C();

        ParentClass parent =new ParentClass();
   //     parent.print_message_P();



    }
}
