package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {
    /*
    1)Method overloading yaparken method ismi değiştirilmez(add)
    2)Method overloadıng yaparken parametreler değiştirilir.
        i)Parametre değiştirirken, parametrelerin data type'leri değiştirilebilirç
        ii)parametre değiştirirken, parametrelerin data type'ları farklı ise yerleri değiştirilebilir.
        iii)Parametre değiştirirken, parametrelerin sayısı değiştirilebilir.
    3)Java için ismi ve parametreleri aynı olan 2 method tamamıyla aynıdır.
    void demek ekrana bişi yazdırıyosunuz demek int demek bir data döndürüyosunuz demek.
        Bu yüzden ismi ve parametre method signature olarak adlandırılır.
    4)Method Overloading olustururken return type'i değiştirmenin hiçbir etkisi yoktur.
    5)Method overloading oluştururken acces modifieri değiştirmenin hiçbir etkisi yoktur.
    6)Method overloading oluştururken method'u static veya non static yapmanın hiçbir etkisi yoktur.
    7)Method overloading oluştururken method body değiştirmenin hiçbir etkisi yoktur.

    8) Private method'lar overload edilebilir.Çünkü method overloading sadece bir class in icinde olur.
    9)Private olmak ise baska classlara gidildiğinde problem oluşur.
    10)"Static" methodlar overload edilebilirler.
    Static olanlar class a yapıştırılır non statik olanlar obje'ye yapıştırılır.
    class'lar objecklerin kalıbıdır. objectler classların görünümüdür.
     */

    public static void main(String[] args) {
        add(3, 5);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(double a, double b) { //Java int'i double conteyner'in içine koyabilir.AutoWidening 2 kere yorulacak
        System.out.println(a + b);
    }

    public static void add(double a, int b) {//java burda 1 kere yorulacak
        System.out.println(a + b);
    }

    public static void add(int a, double b) {//java burda da 1 kere yorulacak
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {//burda çalışmaz
        System.out.println(a + b + c);
    }

}