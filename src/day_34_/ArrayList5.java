package day_34_;

import java.util.ArrayList;
import java.util.List;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList <String> weekDays =new ArrayList<>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        System.out.println("weekDays = " + weekDays);

        ArrayList<String> allDays = new ArrayList<>(weekDays);  //Kopyalamak için parantezin içine yazıyoruz
        System.out.println("allDays = " + allDays);

        ArrayList<String> allDays2=new ArrayList<>();
        allDays2.addAll(weekDays);       //bu da bi çeşit kopyalama yöntemi;
        System.out.println("allDays2 = " + allDays2);

        // Yukarıdaki iki kopyalama yönteminde de yeni objeler üretildi. yani elementler kopyalandı, referans noktaları kopyalanmadı

        List<String> strings=allDays2.subList(2,4);
        strings.add("merhaba");
        System.out.println("strings = " + strings);
        System.out.println("allDays2 = " + allDays2);

        ArrayList<String> allDays3=new ArrayList<>(allDays.subList(2,4));
        System.out.println("allDays3 = " + allDays3);
        allDays3.add("Merhaba");
        System.out.println("allDays = " + allDays);
        System.out.println("allDays3 = " + allDays3);

        System.out.println("allDays.contains(\"Thursday\") = " + allDays.contains("Thursday"));     //true
        if(allDays.contains("Thursday")){
            System.out.println("allDays.indexOf(\"Thursday\") = " + allDays.indexOf("Thursday"));
        }

        System.out.println("allDays.contains(weekDays) = " + allDays.contains(weekDays));           //false

        System.out.println("weekDays.contains(allDays) = " + weekDays.contains(allDays));           //false


    }
}
