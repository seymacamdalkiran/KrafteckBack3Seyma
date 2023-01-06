package day_44_Interface;

public abstract class B implements A{
    int i;  //Normal classlarda final yazmadıkça atama yapmak zorunda değiliz

    public void M1(){

    }

    public void M10(){
//Abbstract class içinde normal body li metot
// herhangi bir implementasyon zorunluluğu oluşturmaz
    }

    @Override
    public void M3() {

    }
}
class C extends B{

    @Override
    public void M10() { // bu normal metot olduğu için override etmek zorunda değiliz
        super.M10();    //istersek override edebiliriz
    }

    @Override
    public void M2() {

    }

    @Override
    public void M4() {

    }
}
