package day_40_Summary;

public class Math3 {

    public static double PI=3.14;
    private Math3(){}

    public static int max(int x,int y){
        if(x>=y) return x;
        return y;
    }
    public static int min(int x,int y){
        if(x>=y) return y;
        return x;
    }

//  eğer private constructor kullanırsak new keywordüyle obje oluşturamayız

    //static metodlar sınıfın bir örneğidir

}
class mainMath{
    public static void main(String[] args) {
    //    Math3 math =new Math3();
    //    System.out.println("Daire.cevreHesapla(12) = " + Daire.cevreHesapla(12));

    //    Daire daire=new Daire(2);
    //    System.out.println("daire.getCevre() = " + daire.getCevre());

        Daire daire_1=new Daire(8);
        Daire daire_2=new Daire(2);

        System.out.println("daire_1.yariCap = " + daire_1.yariCap);

        //static metodları obje oluşturmadan çağırabiliyoruz
        //static bir fieldı değiştirdiğimiz zaman herşey değişir.çünkü classa aittir.



    }
}
