package sulehocadaytime20passbyvalueoverloading;


import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {
    /*
       bir list oluşturalım.
       sonra list elemanlarını degiştir methodu yazıp orada
       list elemanlarından bazılarını degiştirelim.
       method void olsun.
       main methoda döndükten sonra yeniden listi yazdıralım
       */

    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");

        listElemanlarınıDegistir(harfler);
        System.out.println("main icinde methoddan sonra harfler" + harfler);//[R,B,C,D]
        //Listemizde içindeki elemanlardan bir yada birkacını değiştirdiğimizde
        //Listeyi değiştirmiş olmuyoruz.PassByValue Array ve List'lerde de aynen geçerlidir.Değerini korur.
        //Ama listenin kendisini değiştirmiş olmuyoruz.

        listDegistir(harfler);
        System.out.println("Main içinde method'dan sonra harfler = " + harfler);

    }//main

    private static void listDegistir(List<String> harfler) {

        harfler = new ArrayList<>();
        System.out.println("Methodda yeni List Harfler" + harfler);//[]
    }

    private static void listElemanlarınıDegistir(List<String> harfler) {
      harfler.set(0,"R");
        System.out.println("Method içindeki harfler = " + harfler);

    }
}
