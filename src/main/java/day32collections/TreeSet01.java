package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

        long one = System.nanoTime();
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println(ts);//[3, 8, 12, 25, 32]//kücükten buyuge sıralar.

        long two = System.nanoTime();

        HashSet<Integer> hs = new HashSet<>();//HashSet random sıralar.
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        System.out.println(hs);//[32, 3, 8, 25, 12] rastgele sıralar
        TreeSet<Integer> hts = new TreeSet<>(hs);//TreeSet HashSet'i alacak TreeSet'e cevirecek.HashSet'in hızından yararlanırız.
        System.out.println(hts);//[3, 8, 12, 25, 32]

        long three = System.nanoTime();

        System.out.println("TreeSet'in uygulama suresi :" + (two - one));
        System.out.println("HashSet'in uygulama suresi :" + (three - two));

        //Note: TreeSet eleman ekleme'de çok yavas, HashSet ise cok hızlıdır.
        //      TreeSet'in bu negatif yönunden kurtulmak icin; HashSet olusturur elemanları ekler ve sonra HashSet'i TreeSet'e ceviririz.

        int first = ts.first();
        System.out.println(first);//3

        int last = ts.last();
        System.out.println(last);//32

        int floor1 = ts.floor(15);
        System.out.println(floor1);//12  verilen değerin bi önceki değeri yazdırır.


        int floor2 = ts.floor(12);
        System.out.println(floor2);//12 verilen değer elemanlardan birisi. O yüzden 12 direkt yazdırıldı.

        // int floor3=ts.floor(2);
        //System.out.println(floor3);//hata verir. floor methodunda girilebilecek değer en kucukten kucuk olamaz.

        int ceiling1 = ts.ceiling(15);
        System.out.println(ceiling1);//25 girilen değer elemanlardan birisi değil o yüzden bir sonraki değer yazdırıldı.

        int ceiling2 = ts.ceiling(25);
        System.out.println(ceiling2);//25 elemanlardan birisi oldugu icin direkt yazdırıldı. en yuksek değerden yuksek değer girersen
        //hata verir.

        SortedSet<Integer> tailSet1 = ts.tailSet(12);
        System.out.println(tailSet1);//[12, 25, 32]girilen değer varsa o sayı ve buyuklerı yazdırılır. set icinde yazdırılır.

        SortedSet<Integer> tailSet2 = ts.tailSet(15);
        System.out.println(tailSet2);//[25,32]  girilen değer olmadıgı için onun buyuklerını yazdırır. set ıcınde yazdırılır.

        NavigableSet<Integer> tailSet3 = ts.tailSet(12, false);
        System.out.println(tailSet3);// [25, 32] ==> 12 elemanlardan biri normalde "12 ve sonraki elemanlar" bir Set icinde yazdirilirdi
        // ama ikinci parametre'de "false" kullandigim icin 12 haric tutuldu true yazsaydım 12 25 32 yazdıracaktı

        SortedSet<Integer> headSet1 = ts.headSet(12);
        System.out.println(headSet1);//[3,8]==> 12 elemanlardan biri onceki elemanlar bir set icinde yazdırıldı. 12 yazdırılmadı.

        SortedSet<Integer> headSet2 = ts.headSet(12, true);
        System.out.println(headSet2);//[3,8,12]

        //Generic Method: Normal method'lar parametlerde belirtilen data type'ları ile çalısırlar.
        //Generik Method'lar ise verilen her turlu data type ile calısma becerısıne sahiptirler.

        Integer higher1 = ts.higher(12);
        System.out.println(higher1);//25 12 den bir sonraki elemanı verir.

        Integer lover1 = ts.lower(12);
        System.out.println(lover1);//8 ==> 12'den bir onceki elemanı verir.


    }
}
