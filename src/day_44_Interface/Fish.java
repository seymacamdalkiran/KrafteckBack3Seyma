package day_44_Interface;

public class Fish implements Animal,Food{
//Eğer food extends Animal yaparsak burda Animal ı
// yazmak zorunda değiliz. Aynı anlama gelir.
    @Override
    public void hunt() {

    }

    @Override
    public void meal() {

    }
}
class Chicken implements Food{
    @Override
    public void hunt() {

    }

    @Override
    public void meal() {

    }

}
