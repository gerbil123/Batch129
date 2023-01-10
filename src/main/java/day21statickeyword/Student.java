package day21statickeyword;

public class Student {

        /*
        1) static variable veya static method'lar(class member) tüm object'ler için ortak elemandır.
        2) static class member'ler üzerinde yapılan tüm değişiklikler tüm object'leri etkiler.
        3) static class member'ler class'a, non static class member'lar object'lere monte edilir.
            Mesela bir class'dan 100 tane object oluşturduğunuzda non static olanlar 100 kere oluşturulur,
            ama static olanlar object sayısından bağımsız olarak 1 kere oluşturulur.
        4)static class member'lara ulaşmak için object oluşturmaya gerek duyulmaz, ama non static class member'lara
            ulaşmak için object oluşturmak şarttır.
        5)static variable'lara class variable de denilebilir. non static variable ile object variable (object variable) aynı şey demektir.
         */

    public static String stdName = "Tom Hanks"; //static
    public int age = 13; //non static

    //Ögrenci isminin ilk harflerini veren method'u oluşturunuz.
    public static String  getInitials(String name){

        String first = name.substring(0,1);//ismin ilk harf alır
        String second = name.split(" ")[1].substring(0,1);//soyismin ilk harfini alır
        return first + second;
    }

        //Ogrenci ismindeki sesli harfleri(a e i o u) sayan bir method oluşturunuz.
    public int countVowels(String name){

        int counter =0;

        for (int i = 0; i <name.length() ; i++) {
            char ch = name.toLowerCase().charAt(i);
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }
        return counter;
    }
}
