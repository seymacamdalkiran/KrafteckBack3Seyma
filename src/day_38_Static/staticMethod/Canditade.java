package day_38_Static.staticMethod;

public class Canditade {
    String name;
   // int schoolID;
    String schoolID;
    static String branch;
    static int counter;

    public Canditade(String name) {
        this.name = name;
        this.schoolID = setNumber2();
    }
    public static int setNumber(){
        counter++;
        return counter;
    }
    public static String setNumber2(){
        counter++;
      //  return "000"+counter;
        return String.format("%04d",counter);
    }

    public static void setBranch(String str){
        branch=str;
    }
    public void getInfo(){
        System.out.println("name=' "+name);
        System.out.println("schoolID = " + schoolID);
        System.out.println("branch = " + branch);
    }


}
class main3{
    public static void main(String[] args) {
        Canditade.setBranch("JAVA");
        Canditade st1=new Canditade("Ferid");
        Canditade st2=new Canditade("Alperen");
        Canditade st3=new Canditade("Özlem");

        st1.getInfo();
        st2.getInfo();
        st3.getInfo();

    }
}