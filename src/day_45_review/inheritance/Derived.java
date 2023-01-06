package day_45_review.inheritance;

public class Derived extends Base{
    int a=55;
    static int i=Base.b;
    public Derived(int a, String s) {
        super(a, s);
// önce superi yazmak zorundasın. thisi daha önce yazamazsın.
    //    this.a=a;
        System.out.println("Derived contructor");
        System.out.println("a = " + a);
        System.out.println("This a = "+this.a);
        System.out.println("Super a = "+super.a);
        System.out.println("Base.b = " + Base.b);
    }

    void M1(){
        System.out.println("Base.b = " + Base.b);
        System.out.println("b = " + b);
        System.out.println("i = " + i);
    }

    @Override
    public void method() {
        super.method();
    }
}
