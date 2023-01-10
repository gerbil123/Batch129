package day05typecastingstringmanipulations;



public class StringManipulations01 {

    //String bir non primitive data type' dır ve aynı zamanda bir class'dır.
    public static void main(String[] args) {

        String s = "Java is easy";
        //Example 1 : "s" Stringindeki tüm karakterleri büyük harf yapınız.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA İS EASY

        //Example 1 : "s" Stringindeki tüm karakterleri küçük harf yapınız.

        String sLover=s.toLowerCase();
        System.out.println(sLover);//java is easy

        //Example 3: "s" String'indeki ilk karakteri alınız.

        char firstChar=s.charAt(0);
        System.out.println(firstChar);//J

        //Example 4: "s" String'indeki ikinci ve sondan ikinci karakteri alınız ve ekrana yanyana yazınız.
        //1.YOL: AYNI SATIRDA YAZDIRMAK İÇİN
        char secondChar =s.charAt(1);//a
        char secondLastChar = s.charAt(10);//s
        System.out.print(secondChar);
        System.out.println(secondLastChar);

        //2. YOL: AYNI SATIRDA YAZDIRMAK İÇİN
        System.out.println(""+secondChar+secondLastChar);//as

        //Example 5: "s" String'indeki karakter sayısını bulunuz.
        int sLenght=s.length();
        System.out.println(sLenght);//12

        //Example 5: "s" String'indeki ilk dört karakteri alınız.
        //substrıng (0,4) ==> "0" yani ilk index dahil, "4" yani ikinci index hariçdir.(0,1,2,3)
        String sub1 = s.substring(0,4);
        System.out.println(sub1);
        //Example 6: "s" String'indeki is kelimesini alınız.

        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        //Example 7= "s" String'indeki easy kelimesini alınız.
        String sub3 = s.substring(8,12);
        System.out.println(sub3);

        //Bir karakterden başlayıp String'in sonuna kadar almak isterseniz ikinci indeks'i yazmayınız.

        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Example 8: "s" String'inde "money" kelimesinin var olup olmadıgını kontrol ediniz.

        boolean isExist = s.contains("money");
        System.out.println(isExist);


        boolean isExist1 = s.contains("easy");
        System.out.println(isExist1); //Stringler küçük büyük harfe duyarlıdır.Tek karakter de koyabilirim tırnak içine.

        boolean isExist2 = s.contains("");
        System.out.println(isExist2); // parantezin içine bi tane space koyarsam true verir iki tane space koyarsam false verir
                                        //çünkü Java is easy 'de yanyana 2 tane space yok.
        /*
        Bir method ' u öğrenirken 3 şeyi mutlaka öğren
        i) Bu method ne iş yapar
        ii)Bu method'un farklı kullanımları nasıldır
        iii)Bu method size ne return eder.
         */

        //Example 10: "s" String'inin belli bir harf ile başlayıp başlamadıgını kontrol ediniz.
        boolean isStart = s.startsWith("Java");//true
        System.out.println(isStart);

        boolean isStart1 =s.startsWith("JAVA");//false
        System.out.println(isStart1);

        boolean isStart2 = s.startsWith(" ");//False
        System.out.println(isStart2);

        //Example 11: "s" String'inin altıncı karakterden itibaren belli bir harfle başlayıp başlamadıgını kontrol ediniz.

        boolean isBegin = s.startsWith("i",5); //5'in anlamı ilk 5 karakteri görme demektir.Sonra geri kalana bakıyoruz
                                                            //i harfi ise geri kalan "i" harfi ile başlıyo mu diye bakıyor ve sonuç true
        System.out.println(isBegin);








    }
}
