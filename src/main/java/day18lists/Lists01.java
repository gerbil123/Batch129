package day18lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        //Example 1: Integer bir List oluşturunuz.
        //List'e 5 tane eleman ekleyiniz.
        //Bu elemanlardan 12 yi siliniz.

        List<Integer>ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);

        //Note: Siz Java'da tamsayı yazdıgınızda java o tamsayının data type'ini otomatik olarak primitive int kabul eder.
        //Bu yüzden remove() methodunun içine yazdğınız tamsayı eleman olarak değil index olarak kabul edilir.
        //Tamsayıyı eleman olarak göstermenin birkaç yolu vardır.

        //1 YOL;
        //Integer nonPrimitive=12;
        //ages.remove(nonPrimitive);

        //2. YOL:RECOMMENDED
        ages.remove((Integer)12);//remove method'unda iki tane secenek vardır object ve index

        //3.YOL:
        //ages.remove(Integer.valueOf(12));//2 method kullanıldı.

        //4.YOL:
        //ages.remove(ages.indexOf(12)); // 2 Method kullanıldı
        System.out.println(ages);

        //Example 2: Tüm 12'leri siliniz.

        List<Integer>nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);
        System.out.println(nums);//[10, 25, 12, 8, 12]
        List<Integer>silinecekler = new ArrayList<>();
        silinecekler.add(12);

        //removeAll() method'u List ile çalışır.
        //removeAll() method'u bir veya birden fazla elemanın tüm görünümlerini silmek kullanılır.
        nums.removeAll(silinecekler);
        System.out.println(nums);//[10, 25, 8]

    }
}
