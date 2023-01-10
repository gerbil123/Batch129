package sulehocadaytime18arraylist;


import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        //1) ArrayList nasıl oluşturulur
        List<Integer> nums = new ArrayList<>();
        //ArrayList'ler nasıl yazdırılır.
        System.out.println(nums);//[] görürüz çünkü daha oluşturmadık.

        nums.add(37);
        nums.add(38);
        nums.add(39);
        nums.add(40);
        nums.add(41);
        nums.add(42);

        System.out.println(nums);//[37, 38, 39, 40, 41, 42]

        //ArrayList'in boş olup olmadıgını nasıl anlarız?
        boolean bosMu1 = nums.isEmpty();
        System.out.println(bosMu1);//false

        List<Integer> ages = new ArrayList<>();
        boolean bosMu2 = ages.isEmpty();
        System.out.println(bosMu2);//true

        //Example 1: nums ArrayList'indeki tum tek sayilari 11
        // artirdiktan sonra ekrana yazdiriniz

        for (int w : nums) {
            if (w % 2 != 0) {
                nums.set(nums.indexOf(w), w + 11);
            }
        }
        System.out.println("nums = " + nums);//[48, 38, 50, 40, 52, 42]
        // Array'e ekleme yaptık
        nums.add(52);
        nums.add(36);
        nums.add(52);


        //List'lerden eleman nasıl silinir.
        //nums Arraylist'ten 52 rakamını ilk görünümünü siliniz.
        System.out.println("nums = " + nums);//nums = [48, 38, 50, 40, 52, 42, 52, 36, 52]

        /*
        nums.remove(52);//hatalı olur çünkü 52. index yok
        System.out.println(nums);
        */
        //remove method'unun içerisine tamsayı yazarsanız Java bunu index kabul eder.Silinecek eleman
                                //olarak algılamaz.
        //Tüm tamsayılar aksi belirtilmedikçe primitive yani int'dir.
        //Primitive'lerde ArrayList'lerin elemanı olamazlar bu yüzden Wrapper kullanılıyordu.
        //Primitive data type'larını Wrapper class'a çevirmeliyiz.

        Integer sayı =52;
        nums.remove(sayı);
        System.out.println("nums = " + nums);//nums = [48, 38, 50, 40, 42, 52, 36, 52]

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println("names = " + names); //names = [Tom, Thomas, Tahsin, Trump, Taceddin]
        List<String> emekliOlacaklar = new ArrayList<>();
        emekliOlacaklar.add("Thomas");
        emekliOlacaklar.add("Tahsin");
        emekliOlacaklar.add("Trump");
        names.removeAll(emekliOlacaklar);

        System.out.println("emekliOlacaklar = " + emekliOlacaklar);//emekliOlacaklar = [Thomas, Tahsin, Trump]
        System.out.println("names = " + names);  //names = [Tom, Taceddin]


        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println("a =" + a);//a =[Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]
        a.remove("Shoes");
        System.out.println("a =" + a);//a=[TV, Radio, Laptop, Shoes, Book, Shoes]

        //Array Listimizde coklu datanın olup olmadıgını nasıl gösteririz.
        //containsAll() : Bir list'in içinde çoklu elemanın olup olmadıgını kontrol eder.
        //Hepsi varsa true en az bir tanesi varsa yoksa false verir.
        List<String> myNames = new ArrayList<>();
        myNames.add("Burcu");
        myNames.add("Can");
        myNames.add("Zisan");
        myNames.add("Emre");
        myNames.add("Bilal");
        myNames.add("Gul");
        System.out.println("myNames = " + myNames );//myNames = [Burcu, Can, Zisan, Emre, Bilal, Gul]
        List<String >varMı = new ArrayList<>();
        varMı.add("Burcu");
        varMı.add("Gul");
        varMı.add("Can");
        System.out.println("varMı = "+ varMı);
        boolean sonuc = myNames.containsAll(varMı);
        System.out.println("Sonuc =" + sonuc);//Sonuc =true




    }
}
