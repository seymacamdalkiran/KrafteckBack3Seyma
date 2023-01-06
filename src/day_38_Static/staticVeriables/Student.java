package day_38_Static.staticVeriables;

public class Student {
    int number;
    String name;

    static String schoolName="KRAF";
    static int counter;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
        counter++;
    }
    public String getInfo(){
        return "[ "+"Name "+name+
                ", number "+number+
                ", schoolName "+schoolName+
                ']';
    }
}
class main{
    public static void main(String[] args) {
        Student student1=new Student(150,"Büşra");
        Student student2=new Student(151,"Cengiz");
        Student student3=new Student(152,"Şeyma");
        Student student4=new Student(153,"Emre");
        Student student5=new Student(154,"Özlem");

        System.out.println("student1 = " + student1.getInfo());
        System.out.println("student2 = " + student2.getInfo());
        System.out.println("student3 = " + student3.getInfo());
        System.out.println("student4 = " + student4.getInfo());

        Student.schoolName="New Kraft";

        System.out.println("student1 = " + student1.getInfo());
        System.out.println("student2 = " + student2.getInfo());
        System.out.println("student3 = " + student3.getInfo());
        System.out.println("student4 = " + student4.getInfo());

        System.out.println("Student.counter = " + Student.counter);

    }
}