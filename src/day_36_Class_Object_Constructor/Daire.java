package day_36_Class_Object_Constructor;

public class Daire {
    double yaricap=1;


    public double getTamCap(){
        return 2*yaricap;
    }
    public int getCevre(){
        return (int)(2*yaricap*Math.PI);
    }
    public double getAlan(){
        return Math.PI*Math.pow(yaricap,2);
    }


}
