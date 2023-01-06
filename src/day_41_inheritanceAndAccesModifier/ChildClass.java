package day_41_inheritanceAndAccesModifier;

public class ChildClass extends ParentClass{



    public void metotChild(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        super.parentStaticMetot();
    }

}
