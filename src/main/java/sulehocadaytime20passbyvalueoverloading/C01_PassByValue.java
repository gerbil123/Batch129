package sulehocadaytime20passbyvalueoverloading;

public class C01_PassByValue {
    public static void main(String[] args) {

        /*
        Pas By Value : Method'a value'nun bir kopyasını gönder demektir.
        Bu nedenle Pass by Value'de orjinal parametre değişmez.

        Java Pass By Value kullanır.
        1)Java variable' nin orjinal değerini korumak ister.
        2)Java variable'in içindeki değeri kopyalar ve methodun içine kopya değeri gönderir.
        Değer uzerinde yapılan değisiklikler orjinal parametreyi etkilemez.


        Pass By Referance'da ise referans kopyalanır ve methodda kullanılır.
        Yapılan değişiklik orjinal parametreyi etkiler.
        Bu tarz programlar değeri korumak istiyorsa isi developer'a bırakmıştır.
        Kendisi değeri değiştirir.

         */
       int gomlek =100;

        System.out.println("gomlek = " + gomlek);//100

         //ogrenciIndirimi(gomlek);
        //System.out.println("gomlek = " + gomlek);
        gomlek = ogrenciIndirimi(gomlek);
        System.out.println("Atamadan sonra maindeki gomlek = " + gomlek);
    }//main

    private static int ogrenciIndirimi(int gomlek) {
        int ogrenciGomlegi=gomlek-10;
        System.out.println("ogrenciGomlegi = " + ogrenciGomlegi);
        return ogrenciGomlegi;

    }//ogrenci indirimi method'u
}
