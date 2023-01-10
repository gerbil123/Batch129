package day23datetimestringbuilder;

public class StringBuilder01 {
    /*
    Java'da String, "String Class" kullanılarak veya "StringBuilder Class" kullanılarak oluşturulabilir.
    "String Class" kullanarak ürettiğiniz String'ler "Immutable"(Degistirilemez.) dir.
    "StringBuilder Class" kullanarak ürettiğiniz String'ler "Mutable"(Degistirilebilir) dir.
     */

    public static void main(String[] args) {
        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        ///String'i degistirdikten sonra aynı String ' e assign ederseniz, Java yine yeni bir container oluşturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gösteren oku yeni container'a yönlendirir.
        //Dolayısıyla eski container adressiz kalır ve "Garbage Collector" adressiz olan container'lari siler.
        String a = "Money";
        a = a + "More";


        //Mutable
        //StringBuilder kullanarak String uretmenin 1.yolu
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python
        sb1.append("!").append("?").append(".");//String builder'ler yeni kap oluşturmazlar var olan kabın içindeki değeri değiştirirler.
        System.out.println(sb1);//Python!?.

       //StringBuilder kullanarak String uretmenin 2.Yolu;
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0
        //StringBuilder Kullandıgınızda baslangıc kapasitesi 16dir.
        //Kapasite aşıldıgında var olan kapasitenin 2 katının 2 fazlası kadar var olan kapasiteye ekleme yapılır.
        //16 ise ==>16*2+2 =34    34*2+2==>70
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//24 24 kutumuz dolu
        System.out.println(sb2.capacity());//34 toplam kutu sayımız 34 oldu 24 kutumuz dolu anlamında 16*2+2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//40 24 dolu kutu 24 taneydi 16 tane daha ekledim 40 oldu
        System.out.println(sb2.capacity());//70 34*2+2 bi önceki capacity'de var olanın 2 katının 2 fazlası kadar ekler

        //StringBuilder kullanarak String uretmenin 3.yolu
        StringBuilder sb3 = new StringBuilder(2); //burda ihtiyacımıza göre kapasite belirliyoruz.

        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        sb3.insert(2,"XXXXX"); //İlk 2 karakteri görmezden gel arasına x koy
        System.out.println(sb3);//FlXXXXXo bunu yaptıktan sonra lenght 'e bakarsak 9 olur.

        //toString() method'u StringBuilder'i String'e cevirir.
        //String class'da var olan ama StringBuilder class 'da var olmayan split() gibi
        //method'lara ihtiyac duydugumuzda toString() method'u kullanarak String Class gecer ve o methodları kullanırız.
        sb3.toString().split("l");

        //String'i tekrar StringBuilder'a çevirebilirsiniz.
        StringBuilder sb4 = new StringBuilder(sb3);

        //reverse() method'u String'leri ters cevirir.
        sb3.reverse();
        System.out.println(sb3);//oXXXXXlF

        //deleteCharAt(1); index 1 deki karakteri siler.
        sb3.deleteCharAt(1);
        System.out.println(sb3);

        //delete(1,6); index 1 deki karakterden index 5(6dahil olmadıgı için) deki karakter'e kara tum karakterleri siler.
        sb3.delete(1,6); //ilk index dahil ikinci index hariç
        System.out.println(sb3);

        StringBuilder sb5 = new StringBuilder("Java");
        StringBuilder sb6 = new StringBuilder("Java");

        //sb5 ile sb6'yı alfabetik sıralama olarak karşılaştırır.
        //sb5 alfabetik sıralamada önce ise sonuç negatif olur sonra ise pozitif olur.
        sb5.compareTo(sb6);
        System.out.println(sb5.compareTo(sb6));//0 veriyo çünkü arada hiç fark yok sb6 yı "Kava" yapsaydık -1 verirdi.
                                                //Çünkü alfabetik olarak karşılaştırıyor.

        //sb6.setCharAt() index 2 deki karakteri 'm' ye cevirir
        sb6.setCharAt(2,'m');
        System.out.println(sb6);//Jama


        sb6.replace(1,3,"xyz");
        System.out.println(sb6);//Jxyza index 2 yerine xyz yazdırdı

        //StringBuilder class'da kullanmamıza izin verilen bazı String Class method'ları vardır, substring() gibi
        //bu method'ları String builder üstünde kullanınca StringBuilder'in orjinal değeri değişmeez
        String s7 = sb6.substring(1,3);
        System.out.println(sb6);//orjinal değeri değiştirmez üstteki sonucu görürüz çünkü String Class methodu oldugu için
        System.out.println(s7); //xy                        //orjinal değeri değiştiremez.

    }
}
