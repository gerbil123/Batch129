package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almatı");
        System.out.println(cities);

        //remove method'u index ile kullanılırsa o index'teki elemanı siler.
        String n = cities.remove(1);
        System.out.println(n);//Istanbul
        System.out.println(cities);//[Miami, Kayseri, Almatı] 1. indeksi sildirdim

        //remove methodu eleman ile kullanılırsa ilk görünümü siler.2 tane kayseri olsaydı ilkini silicekti diğeri durucaktı
        //remove methodu eleman ile kullanılırsa size o elemanı silip silmediğini ifade eden
        //true veya false verir. Eleman varsa true yoksa false verir
        boolean p =cities.remove("Kayseri");
        System.out.println(p);//true "Kayseri" yerine olmayan bişi yazsaydık false yazıcaktı.
        System.out.println(cities);//[Miami, Almatı]
        //clear ile arasındaki fark clear hepsini yok eder. remove teker teker yok eder.
    }
}
