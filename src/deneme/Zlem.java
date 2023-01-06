package deneme;
import java.util.*;
public class Zlem {
    public static void main(String[] args) {

        System.out.println(ozlem());
    }
    public static String ozlem() {
        String str = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı adını yazınız: ");
        String username = scan.nextLine();
   while (true) {
            if (username.isEmpty()) {
                System.out.println("kullanıcı adı boş olamaz ");
                ozlem();

            } else if (username.length() < 3) {
                System.out.println("kullanıcı adı en az üç karakter olmalıdır ");
                ozlem();

            } else {
                System.out.println("şifrenizi yazınız: ");
                String password = scan.nextLine();

                if (password.isEmpty()) {
                    System.out.println("şifre boş yazılamaz:");
                    ozlem();

                } else if (password.length() < 8) {
                    System.out.println("şifre en az 8 karakter olmalıdır.");
                    ozlem();
                }
            }break ;
        } return "kullanıcı adı ve şifre başarı ile oluşturuldu.";
    }

    }

