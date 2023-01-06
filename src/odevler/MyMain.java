package odevler;

public class MyMain {
    public static void main(String[] args) {

        Math2 kuvvet=new Math2();
        kuvvet.taban=2;
        kuvvet.us=3;
        System.out.println(kuvvet.pow(kuvvet.taban, kuvvet.us));

        System.out.println("----------------");

        System.out.println(Math2.StaticPow(2, 3));
    }}