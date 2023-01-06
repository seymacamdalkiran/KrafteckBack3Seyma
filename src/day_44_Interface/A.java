package day_44_Interface;

public interface A {

    int i=10;   //interface ler otomatikmen public static final olur.
    // O yüzden atama yapmak zorundasın. Atama yapmazsan hata verir

    void M1();  //Bu metodu arka planda public abstrack olarak algılıyor.

    void M2();
    void M3();
    void M4();

    default void M5(){
        // default olmasını istiyorsak özellikle keywordü kullanıcaz
    }
    static void M6(){
        // static olsun istiyorsak keywordü yazmak zorundayız.
    }

}
