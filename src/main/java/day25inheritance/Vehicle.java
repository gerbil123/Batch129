package day25inheritance;

public class Vehicle {

    /*
        1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
          parent class'dan baslatilarak alta dogru calistirilir.
        2) Child Class'daki constructor'dan Parent Class'daki contructor'a gidebilmek için "super()" kullanılır.
        3)Parent Class'da birden fazla constructor varsa istenilen constructor super() ifadesinin parantezi icine yazılan parametreler
        yardımı ile secilebilir.
        4)Aynı class icindeki constructor'ları secmek icin "this()" kullanılır.
        Aynı class'da birden fazla constructor varsa istenilen constructor, "this()" ifadesinin parantezi icine yazılan
        parametreler yardımı ile secilebilir.
        5)"super()" ifadesini yazmak istege baglıdır, yazmazsanız da Java sanki "super()" varmıs gibi davranır,
        ama kodunuzu daha okunur yapmak icin yazmanız gerekir.
        6)"super()" ifadesi constructor icinde her zaman ilk satırda olmak zorundadır.
        7)Bir constructor icinde super() ve this() ifadeleri sadece bir kere kullanılabilir.BKNZ 6.KURAL
        8)Inheritance'da variable'ları ve method'ları çağırmak için this veya super kullanılır.parantezli ve parantezsiz farkları ınterwiew sorusudur
            parantezli olunca constructor çağırır parantezsiz olursa variable çağırır.
            this aynı class icindeki variable'ları e methodları cagırmak icin kullanılır.
            super parent class icindeki variable'ları ve methodları cagırmak icin kullanılır.
        9)Inheritance'da object kullanarak variable çağırırsanız, object'in data type'ini temsil eden class'dan variable'i aramaya
            baslayınız.O class'da yoksa parent'lara bakınız.
        10)Inheritance'da object kullanarak method cağırırsanız object'ın constructor'ını temsil eden class'dan
            method'u aramaya baslayınız o class'da yoksa parentlara bakınız.
                OOP Principals:
                i:Inheritance + Polymorphism + Encapsulation + Abstraction
     */
    public int price = 12000;
    public void engine(){
        System.out.println("Vehicle engine..");
    }
    public Vehicle(){
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price){
        System.out.println("Vehicle 2: " + price);
    }

}