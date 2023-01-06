package odevler;

public class Cat {
    String eyeColor;
    String breed;
    boolean isFat;
    boolean isPet;

    public Cat(){

    }
    public Cat(String eyeColor){
        this.eyeColor=eyeColor;
    }
    public Cat(String eyeColor,String breed){
        this(eyeColor);
        this.breed=breed;
    }
    public Cat(String eyeColor,String breed,boolean isFat){
        this(eyeColor, breed);
        this.isFat=isFat;
    }
    public Cat(String eyeColor,String breed,boolean isFat,boolean isPet){
        this(eyeColor, breed, isFat);
        this.isPet=isPet;
    }

    public void sleep(){
        System.out.println("The cat is sleeping");
    }
    public void food(){
        System.out.println("The cat is eating");
    }
    public void run(){
        if(isFat==false){
        System.out.println("The cat is running");}
        else{
            System.out.println("The cat can not running");
        }
    }




}
