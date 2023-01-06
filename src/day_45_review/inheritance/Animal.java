package day_45_review.inheritance;

public class Animal {
    public static void method(){
        System.out.println("method from Animal");
    }
}
class Bird extends Animal{

    public static void method(){
        System.out.println("method from Bird");
    }


}
class MainHiding{
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.method();

        Bird bird=new Bird();
        bird.method();

        Animal birdAn=new Bird();
        birdAn.method();

    }
}
