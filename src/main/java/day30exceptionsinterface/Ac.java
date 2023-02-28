package day30exceptionsinterface;

public interface Ac {

    //interface'lerın icine concrede method konulamaz.
    //body vardır ve body o method'un isi nasıl yapacagını belirtir.İsın nasıl yapılacagı bir çok detay verir
    //ve bu child class'larda kafa karısıklıgına sebep olur.
    //Halbuki sadece yapılması gereken isi soyleyıp nasıl yapılacağını child'a bırakırsanız child class'ın kafa karısıklıgını
    //engellemiş olursunuz.

    //interface'ler concerete method iceremezler, dolayısıyla ınterface'ın ıcındeki hicbirsey istege baglı değildir.
    //hersey child class'lar icin mecburidir. Bu yüzden interface'lere to do list ' de denir.

    //ınterface'lerdeki tüm method'lar otomatik olarak public'dir, abstract'dır, static değildir.

     //interface'lerdeki variable'lar otomatik olarak public'dir, static'dir final'dır.

     void cool();

     void run ();

     public static final int price = 2000;
     String model = "Mıtsubishi";

}
