package day_38_Static.staticVeriables;

public class Student_Test {
    public static void main(String[] args) {
        Student_ student_1=new Student_("Bülent");
        Student_ student_2=new Student_("Ferit");
        Student_ student_3=new Student_("Omer");

        Student_.name="Cengiz";     //nesneyle ilgisi yok, clasa ait. çünkü name i static yazdık.
                                    //eğer name i static yazmasaydık nesneye ait olurdu

        student_1.printName();
        student_2.printName();
        student_3.printName();

        //Class adıyla nereye erişilir Obje adıyla nereye erişilr anlamadım SOR


    }









}
