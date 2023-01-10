package day02datatypesmethodcreation;

public class Variables02 {

    /*
    Non-Primitive Data Types: String bir non-primitive data type'dir.
                          Uretilen her bir class ayni zamanda bir "non-primitive data type" dir.
                          Bu yuzden "non-primitive data type" lar sinirsiz sayidadir denebilir.
                          Non-primitive data type'larin isimleri buyuk harfle baslar
                          Non-primitive data type'larin tamami icin Java memory'de ayni miktarda yer ayirir.

       Interviev Sorusu: "primitive" ve " non-primitive" data type'ları arasındaki fark nedir?
                         1)"primitive" ler sadece bizim atadığımız değeri içerir,
                           "non-primitive" ler bizim atadığımız değer ve method'lar içerir.
                         2)"primitiev"ler kucuk harfle başlar, "non-primitive"ler buyuk harfle baslar.
                         3)"primitiev"leri Java uretmistir ve 8 tanedir,
                           "non-primitive" leri Java ve developerlar uretebilir, sinirsiz sayıdadır.
                         4)"primitive" ler memory'de data type'ine göre yer kaplar,
                           "non-primitive" ler icin Java memory'de hep aynı buyuklukte yer ayırır.

     */
    public static void main(String[] args) {
        //Ornek1: Sehir ismi icin bir variable olusturun ve bir deger atayıp onu ekrana yazdırın
        String cityName = "Miami";
        System.out.println(cityName);

        String sehirAdı = "Manisa";
        System.out.println(sehirAdı);

    }

}

