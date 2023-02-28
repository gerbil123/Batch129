package practice.practiceDTNT06;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HacimRunner {
    public static void main(String[] args) {

        KarePrizma karePrizma = new KarePrizma();
        double karePrizmaHacmi = karePrizma.hacimHesapla(5,6);
        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);


        NumberFormat obj = new DecimalFormat(".00");//virgüllü sayılarda virgülden sonra 2 basamak ilerlemesi için
        Koni koni = new Koni();                                 //kaç tane sıfır koyarsan o kadar 0 koy.
        double koniHacmi = koni.hacimHesapla(3,5);
        System.out.println("koniHacmi = " + obj.format(koniHacmi));//47,10

        /*
        NumberFormat class'ından bir obje oluşturup DecimalFormat(".00) yazdıgınızda virgilden sonra 2 basamak yazdırır.
        Virgülden sonra kaç basamak yazdırmak istiyorsanız o kadar sıfır koyabilirsiniz.
         */


        Silindir silindir = new Silindir();
        double silindirHacmi =silindir.hacimHesapla(1,5);
        System.out.println("silindirHacmi = " + obj.format(silindirHacmi));

        System.out.println(silindir.sayi);
    }
}
