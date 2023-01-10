package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cüneyt");
        names.add("Mahsun");
        names.add("Müslüm");
        names.add("Orhan");

        List<String > females = new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");

        names.containsAll(females);//names içinde ajda ve emel var mı diye soruyor
                                    //hepsi varsa true diyecek herhangi birisi yoksa false diyecek.

        // names.containsAll(females); names list'inde females listindeki tüm elemanların var olup olmadıgını kontrol eder.
        //tamamı varsa true verir herhangi birisi yoksa size false verir.
        boolean r = names.containsAll(females);
        System.out.println(r);//false

        //name.subList(1,3) "names" Listindeki index'i 1 ve 2 olan elemanları bir List'in içinde size verir.
        //Ikıncı ındex olan 3 dahil olmaz.
       List<String>subList =  names.subList(1,3);
        System.out.println(subList);//[Cüneyt, Mahsun] 1. index ikinci index i aldı

        names.retainAll(females);
        System.out.println(names);//[Ajda] ilk list ortakları verir
        System.out.println(females);//[Ajda, Emel] ikinci list değişmez

        //Example 1 : Elektronik aletler ve ev aletleri List'leriniz var.
        //Elektronik ev aletlerini listeleyiniz.

        List<String> elektronics = new ArrayList<>();
        elektronics.add("TV");
        elektronics.add("Radio");
        elektronics.add("Refrigerator");
        elektronics.add("Mobile Phone");
        elektronics.add("Notebook");


        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        //homeGoods.retainAll(elektronics) homeGoods ile elektronics list'lerinin ortak elemanlarını homeGoods listi içinde verir.
        //Baska bir deyişle (ın other words) homeGoods listindeki ortak olmayan elemanları siler.
        homeGoods.retainAll(elektronics);

        System.out.println(homeGoods);//[Radio, TV] ortak olanları verdi..

        //isEmpty() listte hiç eleman yoksa size true verir, 1 veya daha fazla eleman varsa size false verir.
        //isEmpty() esasında names.size()==0 demektir.Bir iş için Java bir method oluşturduysa o kullanılır.
        names.isEmpty();

        System.out.println(names.hashCode());//2041509

    }
}
