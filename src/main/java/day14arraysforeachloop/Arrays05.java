package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //Note 1: sort() method'u sayısal data type'lerini küçükten büyüğe sıralar(ascending order)
        //Note 2: sort() method'u String data type'larının alfabetik olarak sıralar(alphabetical order)
        //Note 3: ascending order+ alphabetical order==> Natural Order
        //Note 4: sort() merhod'u array elemanlarını "Natural Order'a göre sıralar.

        //binarySearch() method'u bir elemanın bir arrayda olup olmadıgını kontrol etmek için kullanılır.
        //binarySearch() method'unu kullanmadan önce sort() method'unu kullanmak zorundayız.
        //sort() method'unu kullanmazsanız buldugunuz sonuç güvenilir olmaz.

        String color[]= new String[6];
        color[0] = "Red";
        color[1] = "Orange";
        color[2] = "Blue";
        color[3] = "Yellow";
        color[4] = "Green";
        color[5] = "Brown";

        Arrays.sort(color);
                                                      //0,     1    2       3       4      5 (indeksleri)
        System.out.println(Arrays.toString(color));//[Blue, Brown, Green, Orange, Red, Yellow]

        int num = Arrays.binarySearch(color, "Blue");

        System.out.println(num); //0 ==> Var hem de indexi sıfır.

        int num2 = Arrays.binarySearch(color, "Orange");

        System.out.println(num2); //3 ==> Var hem de indexi üç.

        int num3 = Arrays.binarySearch(color, "Tarık");

        System.out.println(num3); //-6 ==> "-" Bu eleman yok demek.
                                    //6 ise olsaydı 6. eleman olurdu demek , alfabetik sırada Red ' den sonra gelicekti


    }
}
