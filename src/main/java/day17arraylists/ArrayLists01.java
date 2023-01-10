package day17arraylists;

import java.util.ArrayList;

import java.util.Collections;


public class ArrayLists01 {
    public static void main(String[] args) {

        /*
        1)ArrayList'ler  çoklu data depolamak için kullanılır.
        2)ArrayList'ler non-primitive data type'indeki çoklu data depolamak için kullanılır.
            List'ler non-primitive data kabul ederler Arrayler ise primitive data veya reference kabul ederler.
        3)ArrayList(List)'leri oluştururken içine koyacagınız eleman sayısını basta söylemeye gerek yok.
            List'ler eleman sayısında "flexible" dırlar ama "Array"ler  "flexible" değildirler.
        4)Madem "Array"ler eleman sayısında flexible değil nicin Java "Array" leri iptal etmedi?
                i)Eleman sayısı belli olan dataları depolamak için arrayler tercih edilir.
                ii)Array'ler cok hızlı çalışır
                iii)Arrayler memoryde çok az yer kaplar.
         */
        //List nasıl oluşturulur.
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);//[]

        //List'lere eleman nasıl eklenir.
        //List'e eleman eklemek için add() method'unu kullanırız
        //add() method'u elemanları sizin verdiğiniz sırada "List" e ekler. (Ensertion order)
        ages.add(12);
        ages.add(9);
        ages.add(10);

        ages.add(1,656);//656'yı indeks 1'e koy demek
        ages.add(3,777);//3. indekse 777 koy demek
        ages.add(888); // en sona index koymak için direkt böyle yazabilir.
        System.out.println(ages);//[12, 656, 9, 10, 777]  9'u önce yazsaydım başa 9'u yazdıracaktı.

        //List'e çoklu eleman nasıl eklenir? veya List'e baska bir List nasıl eklenir?
        //Bir "List" coklu eleman eklemek, o elemanları önce bir List'in içine koymalısınız.
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);//Çoklu eleman ekleme
        ages.addAll(2,newAges);//[12, 656, 8, 9, 10, 9, 777, 10, 888, 8, 9, 10] 2. indekse yani 656 nın sağına newAges i ekler.
        System.out.println(ages);//[12, 656, 9, 777, 10, 888, 8, 9, 10]

        //Bir List'teki tüm elemanları nasıl silebilirim.
        ages.clear();
        System.out.println(ages);//[]

        ages.contains(656); //Yukardaki clear kodu yoruma alırsak true diyecek almazsak false diyicek çünkü sıfırladık
        boolean r = ages.contains(656);
        System.out.println(r); //Bir elemanın List'te var olup olmadıgını kontrol eder.

        //2List'in eşit olabilmesi için aynı index'te aynı elemanlar olmalıdır.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");
        boolean s= names1.equals(names2);
        System.out.println();//false çünkü names2 'de kim'le jim'in yeri değişti

        //Example 1: Verilen iki İnteger List'te tamamıyla aynı elemanların olup olmadığını kontrol eden kodu yazınız.

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(8);
        num1.add(10);
        num1.add(9);

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(8);
        num2.add(9);
        num2.add(10);

        Collections.sort(num1);
        Collections.sort(num2);

        boolean t = num1.equals(num2);
        System.out.println(t);//true

    }
}
