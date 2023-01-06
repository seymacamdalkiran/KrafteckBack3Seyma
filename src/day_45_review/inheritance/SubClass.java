package day_45_review.inheritance;

public class SubClass extends SuperClass{
    public SubClass() {
        System.out.println("SUB parametresiz cons");
    }

    public SubClass(int x){
        super(x);
        System.out.println("SUB parametreli cons");
    }
}
