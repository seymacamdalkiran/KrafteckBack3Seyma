package day_23_StringClass;

public class StringClass_ {
    public static void main(String[] args) {

        //LENGTH
        String progLang="java";
        System.out.println(progLang.length());
        String progLang2="pyTHon";
        System.out.println(progLang2.length());
        System.out.println(progLang.length()+progLang2.length());

        //toUpperCase()  and  toLowerCase()
        System.out.println(progLang.toUpperCase());     //bütün harfleri büyük harf yapar
        System.out.println(progLang2.toLowerCase());    //bütün harfleri küçük harf yapar

        //charAt()
        System.out.println(progLang2.charAt(2));
        String message="Girilen index numarasındaki char değeri döndürür";
        System.out.println(message.charAt(0)+" ve "+message.charAt(message.length()-1));

        //concat()
        System.out.println(message.concat(progLang));
        System.out.println(message.concat(" değil mi?"));

        //contains()
        System.out.println(message.contains("index"));
        System.out.println(message.contains(" n"));
        System.out.println(message.contains("x n"));
        System.out.println(message.contains("ct"));//false
        System.out.println(message.contains(" "));
        System.out.println(message.contains("c"));

        //trim()
        String s="    merhaba dünya bugün hava yağışlı ";
        System.out.println(s);
        System.out.println(s.trim());
        String trim=s.trim();
        System.out.println(trim);

        //replace()
        String replace= trim.replace("merhaba","selam");
        System.out.println(replace);

        //indexOf()
        int dünya=replace.indexOf("bugün");
        System.out.println(dünya);

        int dunya2=replace.indexOf("bugun");
        System.out.println(dunya2);

        //equalsIgnoreCase()
        String st ="hello";
        String st2 ="hello";
        String st3 ="Hello";

        System.out.println(st.equals(st2));
        System.out.println(st.equals(st3));
        System.out.println(st.equalsIgnoreCase(st3));

        //isEmpty()
        System.out.println("  isEmpty");
        String emp="";
        String emp2=" ";
        System.out.println(emp.isEmpty());
        System.out.println(emp2.isEmpty());

        //substring()

        String main="Merhaba java insanları";
        String sub=main.substring(5);
        String sub2=main.substring(5,10);
        System.out.println(sub);
        System.out.println(sub2);








    }
}
