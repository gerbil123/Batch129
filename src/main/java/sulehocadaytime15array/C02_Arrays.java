package sulehocadaytime15array;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        //Bir Stringdeki sesli harflerin sayısını bulan kodu yazınız.
        //                  a-e-i-o-u-A-E-I-O-U

        String str = "Java ogrenince para kazanmak ne kolay, öğrenmeyince ne kadar zor.";
        str = str.toLowerCase();
        String  harfler[] = str.split("");//harf ayırmak
        System.out.println(Arrays.toString(harfler));

        int counter = 0;
        //iter yazınca for each loop otomatik açılır.
        for (String w : harfler) {

            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);
    }
}
