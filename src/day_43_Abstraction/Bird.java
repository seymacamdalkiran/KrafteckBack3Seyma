package day_43_Abstraction;

public abstract class Bird extends Animal{
/*
    @Override
    public void eat() {
        System.out.println("kuşlar yem yerler");
    }
 */
    @Override
    public void move() {
        System.out.println("kuşlar uçarlar");
    }
    public abstract void fly();

    public Bird(String name) {
        super(name);
    }
}


class kanarya extends Bird{
    @Override
    public void eat() {
    }

    public kanarya(String name) {
        super(name);
    }

    /*
        @Override
        public void move() {
        }
     */
    @Override
    public void fly() {

    }
}