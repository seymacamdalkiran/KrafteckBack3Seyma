package day_15;
import java.util.*;
public class While {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.println("<<for lighting, use switch>>");

        while (true) {

            int button = 0;

            while (button != 1 && button == 0) {
                System.out.println("for lighting, use switch\n" + "Light is on. To on, turn button to 1");
                button =scan.nextInt();
            }

            switch (button) {
                case 0:
                    System.out.println("<<Light is on>>");
                    break;
                case 1:
                    System.out.println("<<Light is off>>");
                    break;
            }
            while (button != 0 && button == 1) {
                System.out.println("for lighting, use switch\n" + "Light is off. To on, turn button to 0");
                button =scan.nextInt();
            }
        }

































    }
}
