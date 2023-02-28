package day33maps;


import java.util.*;

public class HashMaps01 {
    /*
    1)Map'ler "USA = 400,000,000" şeklinde depolamamız gerektiğinde kullanılır.
    2)"USA = 400,000,000" DATA'SININ "usa" kısmı key olarak adlandırılır ve "key" ler unıque dir.
    3)"USA = 400,000,000" data'sının "400,000,000" kısmı "value" olarak adlandırılır ve "value"ler tekrarlu olabilir.
    4)Map'lerde depoladıgınız her bşr data'ya "Entry" denir, "Eleman" denmez.
    5)"Entry"ler unıque dir.Cunku key kısımları unıque oldugundan her bir entry diğerlerinden farklıdır.
    6)"HashMap" cok hızlıdır cunku HashMap'ler sıralama ile ugrasmazlar.
    7)"HashMap" lerde bir tane "key" i "null" yapabilirsiniz.
    8)"HashMap"lerde birden fazla "value" u "null" yapabilirsiniz.
    9)"HashMap"ler multi thread icin kullanılamaz ve "synchronization" yoktur.
     */
    /*
    sozluk yapisi map'a benzer
    solda kelime, sagda aciklamasi vardir
    soldakiler tekrarli olamaz sagda tekrar olabilir
    map te boyledir soldakiler Unique olacak sag taraf tekrarli olabilir de olmayapilir repeatedly (tekrarli) olabilir
    cat = evcil hayvan
    dog = evcil hayvan
    crocodile = timsah
    tiger = kaplan
    solda data sagda data
    map deyince sozluk akla gelsin
    sola unique lere key tekrarli olabilen sagdaki data lara value denir

    map te bir data stractir dir
    depolarken bu yapiya ihtiyac varsa map kullaniriz
    mesela ulkeler ve nufuslarini depolamamiz lazim burda sol unique sag tekrarli olabilir burda map kullaniriz
    mesela okul app imiz var ogrencilerin karne ort ni depolayacagiz sol unique sa[ tekrarli olabilir burda map kullanilmalidir
     */
    public static void main(String[] args) {
        //HashMap nasıl olusturulur.
        HashMap<String, Integer> hm = new HashMap<>();//primitive data type olamaz.
        System.out.println(hm);//{}

        //HashMap'lere nasıl entry eklenir.
        hm.put("USA",400000000);
        hm.put("Germany", 85000000);
        hm.put("Albania",3000000);
        //Aynı "key" i kullanarak yeni bir entry eklerseniz var olan "value" u update etmis olursunuz.
        hm.put("Albania",1);//
        hm.put(null,120000000);
        hm.put(null,180000000);//null'ı rastgele koyar aynı key'e ekledik ilk değeri update etti son değeri yazdırdı
        hm.put("Myanmar",null);
        hm.put("Bhutan",null);
        System.out.println(hm);//{null=180000000, Myanmar=null, USA=400000000, Bhutan=null, Germany=85000000, Albania=1}

        //HashMap'lerde sadece "key"leri almak istiyorum.
        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys);//[null, Myanmar, USA, Bhutan, Germany, Albania]

        //HashMap'lerde sadece "value" ları almak istiyorum.
        //Example'1: hm Map'indeki ülkelerin toplam nüfusunu bulunuz.
        Collection<Integer>hmValues=hm.values();
        int sum = 0;
        for (Integer w : hmValues) {
            if (w!=null) {//if'i koymazsak null'dan dolayı hata verir.
                sum = sum + w;
            }
        }
        System.out.println(sum);//665000001

        //HashMap'lerde belirli bir "key"in "value" sunu naısl alabiliriz.
        Integer usaPopulation = hm.get("USA");
        System.out.println(usaPopulation);//400000000

        //HashMap'lerde replace() methodu varolan bir "key"nin "value" sunu değiştirmek icin kullanılır.
        hm.replace("Bhutan",35000000);//Bhutan'ın değerini değiştirdik.
        System.out.println(hm);//{null=180000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=85000000, Albania=1}


        hm.putIfAbsent("USA",700000000);//yoksa ekle varsa dokunma USA oldugu için değerini değiştirmedi.
        System.out.println(hm);//{null=180000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=85000000, Albania=1}

        hm.putIfAbsent("Indıa",700000000);//varsa değeri değiştirmez yoksa yeni key ve value ekler
        System.out.println(hm);//{null=180000000, Myanmar=null, USA=400000000, Bhutan=35000000, Indıa=700000000, Germany=85000000, Albania=1}

        //Example 2:Yeni ogretmenin maası standart ucretten(10000) 1000 tl fazla ,eski ogretmenin maası standart ucretten 2000 tl fazla olsun
        HashMap<String,Integer>salaries = new HashMap<>();
        salaries.put("Ali",8000);
        salaries.put("Ayse",5000);
        salaries.put("Veli",9000);
        salaries.put("Tom",9900);

        String teacherName="Kemal";//olmayan bi String girersek Kemal=11000 ekler, olan girersek değerini değiştirir.
        if (salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);
        }else
            salaries.putIfAbsent(teacherName,11000);

        System.out.println(salaries);

        //replace("USA",400000000,500000000); method'u eski değeri değiştirir ama eski değeri doğru girmen gerek.
        hm.replace("USA",400000000,500000000);
        System.out.println(hm);//{null=180000000, Myanmar=null, USA=50000000, Bhutan=35000000, Indıa=700000000, Germany=85000000, Albania=1}

        //olan key'lerin değerini verir olmayan key'ler icin de sizin ikinci parametre'ye yazdıgınız değeri verir.
        Integer r = hm.getOrDefault("Bhutan",0);
        System.out.println(r);//35000000  olmayan bir key girseydik 0 vericekti olan bir değer girdik değerini verdi.

        //entrySet(); methodu "Map"i "Set"e cevirir.
        // Setlerin methodlarini kullanabilmek icin entrySet(); methodu'nu kullanarak ceviririz.
        Set<Map.Entry<String,Integer>> myEntrys = hm.entrySet();
        System.out.println(myEntrys);//[null=180000000, Myanmar=null, USA=500000000, Bhutan=35000000, Indıa=700000000, Germany=85000000, Albania=1]

        //Example 3: Ulke ismindeki character sayısını ulke nufusuna ekleyen ve sonucu console'a yazdıran kodu yazınız.
        //Map'lerde loop kullanamazsın. İhtiyac durumunda set'e çevirip kullanırız
        //entrySet(); method'unu kullandiginizda elde ettiginiz Set'in elemanlari "Map.Entry<String,Integer>" seklinde bir Map olur.
        //Mesela Map collection olmadığı için loop kullanamayız ama set olursa kullanırız
        for (Map.Entry<String,Integer> w:myEntrys){

            if (w.getValue()!=null && w.getKey()!=null) {

                int sum1 = w.getValue() + w.getKey().length();
                System.out.println(sum1);
            }
        }
    }
}
