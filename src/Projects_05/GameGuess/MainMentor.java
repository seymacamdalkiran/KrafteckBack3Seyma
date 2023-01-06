package Projects_05.GameGuess;

public class MainMentor {
    public static void main(String[] args) {

        GuessGame oyuncu1=new GuessGame();
        oyuncu1.randomGenerator();
        int sayi=oyuncu1.randomGenerator();
        System.out.println(sayi);
        oyuncu1.LetsGuess(sayi);


    }
}
