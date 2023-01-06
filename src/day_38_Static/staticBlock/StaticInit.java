package day_38_Static.staticBlock;

public class StaticInit {


     static final int age;
    // önce static block yürüdüğü için hata vermedi.
    // eğer static blockta age e değer atamasaydık
    // final age e atama yapmak zorundaydık.
    static int counter; //bu değişken staticImport clasından static import etmek için buraya koyuldu

    static {
        age=10;
        System.out.println(age);
    }

    private static int one;
    private static final int two;
    private static final int three=3;
    private static final int four;

    static {
        one=1;
        two=2;
     //   three=4;      //yukarıda atadığı için burda atayamazsın
        four=4;
    }

    {

    }


}
