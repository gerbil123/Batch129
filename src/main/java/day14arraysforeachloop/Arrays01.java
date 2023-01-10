package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Example 1: String array oluşturun, içine 5 tane eleman ekleyin, ilk eleman ile son elemanın
        //içerdiği karakter sayıları toplamını ekrana yazdırınız.
        String arr[] = new String[5];
        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";
        System.out.println(Arrays.toString(arr)); //[Math, Science, Music, English, Art]

        System.out.println(arr[0].length() + arr[arr.length - 1].length());//7
        //String'lerdeki .lenght() parantezlidir, array'lerdeki .lenght parantezsizdir.

        //Example 2: String array oluşturun, içine 5 tane eleman ekleyin, tüm elemanların
        // içerdiği karakter sayıları toplamını ekrana yazdırın.

        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "İstanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";
        //1 YOL:
        int totalChar = 0;

        for (int i = 0; i < brr.length; i++) {
            totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar);//33

        //2 YOL:for-each-loop : Başlangıc değeri, loop'un çalışma şartı ve ıncrement decrement kısmını kendisi halleder.
        //    for-each-loop "Array" lerde ve "Collection"larda kullanılır.
        //    INdex kullanmanız gerektiğinde bazen for-each-loop çaresiz kalır, mecburen diğer loopları kullanırız.

        int sum = 0;

        for (String w : brr){
            sum = sum+w.length();

        }
        System.out.println(sum);//33

    }
}
