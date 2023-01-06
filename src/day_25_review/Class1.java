package day_25_review;

public class Class1 {
    public static void main(String[] args) {
        MyString my=new MyString();
        String s="ferid";
        System.out.println(my.reverse(s));
        System.out.println("salih"+my.space+"hoca");
        String str2="  salih     emre    cengiz    ";

        System.out.println(str2.trim());
        System.out.println(my.allTrim(str2));

    }
}
