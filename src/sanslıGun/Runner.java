package sanslıGun;

import java.util.Scanner;

public class Runner {
    static RegisterDate reg=new RegisterDate();
    static Listing li=new Listing();


    public static void main(String[] args) {
        secim();
    }


    public static void secim(){
        System.out.println("Kullanıcı girişi için => 1\nŞanslı isimleri listelemek için => 2\nÇıkmak için => 3 e tıklayın");
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);

        switch (s){
            case '1':
                reg.register();
                secim();
                break;
            case '2':
                li.printHappyUsers(reg.userList);
                secim();
                break;
            case '3':
                System.exit(0);
                break;
            default:
                System.out.println("Hatalı tuşlama tekrar tekrar deneyin");
                secim();
        }
    }
}
