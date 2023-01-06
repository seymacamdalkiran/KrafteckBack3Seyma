package day_38_Static.staticVeriables;

public class Student_ {

     // String name;        // instance veriable
    static String name;     // static veriable

    // Static yazarsak objelerden erişemeyiz
    // class adıyla sadece 6.satıra erişilebilir static olduğu için
    // obje ile hepsine erişilebilir
    // Constructor demek dönüş tipi olmayan metot demek

    public Student_(String name){
        this.name=name;
    }
    void printName(){
        System.out.println("name = " + name);
    }


}
