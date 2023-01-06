package deneme;
import java.util.*;
public class Replit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();

            String s=word;
            for(int j=0;j<word.length()-1;j++){
                for(int i = 0; i<word.length();i++){
                    s=s.substring(s.length()-1)+s.substring(0,s.length()-1);
                    System.out.println(s);
                }
                s=word.substring(j+1,j+2)+
                        word.substring(j,j+1)+
                        word.substring(j+2,word.length());
            }





        
    }}