package deneme;

public class StringMethods {
    public static void main(String[] args) {

        System.out.println(karakterSayısı("sds jfjdf jhfjkhf"));
        System.out.println(nameSurname("asdf asdfg", "sdfgh"));
        System.out.println(bigChar("sdfg", " SDFgh"));
        System.out.println(smallChar("asASas", "dsdFGASv"));
        System.out.println(message("asdf asdfghe asdfg dfghi"));
        down("hadi iyisin");
        upDown("asdfghjklş");


    }

    public static int karakterSayısı(String message) {
        return message.length();

    }
    public static int nameSurname(String name, String surName) {

        return name.length() + surName.length();
    }
    public static String bigChar(String name, String surName) {
        return name.toUpperCase() + " " + surName.toUpperCase();

    }
    public static String smallChar(String name, String surName) {
        return name.toLowerCase() + " " + surName.toLowerCase();
    }
    public static char message(String message) {
        return message.charAt(message.length() - 1);
    }
    public static void down(String message) {
        char alt = 'a';
        for (int i = 0; i < message.length(); i++) {
            alt = message.charAt(i);
            System.out.println(alt);
        }
    }
    public static void upDown(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(word.toUpperCase().charAt(i));
            } else {
                System.out.print(word.toLowerCase().charAt(i));
            }
        }
    }






}
