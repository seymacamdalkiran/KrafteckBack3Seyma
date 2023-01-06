package odevler;

public class Pencil {
    String color;
    double lenght;
    boolean haveEraser;
    String str="";

    public Pencil(){

    }
    public Pencil(String color){
        this.color=color;
    }
    public Pencil(String color,double lenght){
        this.color=color;
        this.lenght=lenght;
    }
    public Pencil(String color,double lenght,boolean haveEraser){
        this(color,lenght);
        this.haveEraser=haveEraser;
    }
    public String write(String s){
        this.str=str;
        str+=s;
        return str;
    }
    public String delete(String s){
        this.str=str;
        str=str.replace(s,"");
        return str;
    }





}

