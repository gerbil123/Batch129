package day04asciiwrapperclassoperatorsmemoryusage;




public class WrapperClass {
    public static void main(String[] args) {

        //primitive:      char       boolean       byte        short           ınt        long         double         float
        //Wrapper Class:Character   Boolean        Byte        Short           Integer     Long         Double         Float

        int n = 12; //"n" yazıp nokta koyarsanız hiç methot göremezsiniz. Çünkü primitiveler method içermez.

        Integer m = 12; // alt tarafa geçip "m." yazdıktan sonra methodlarda ortaya çıkıyor.çünkü Wrappler Classlar method içerir.

        byte p = 23;// "p" yazıp nokta koydum hiçbir method içermedi.

        Byte r = 43;// "r." yazdıktan sonra bir çok method ortaya çıktı.

        //Wrapper classlar non primitive data typelerdir o yüzden memoryde çok fazla yer kaplarlar.Şart değilse Wrapper class tercih edilmez.

        //Example 1: short data type' inin minimum ve maksimim değerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort); //32767

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort); //-32768

        //Example 2: int data type'inin minimum degeri ile byte data type'inin maximum degerinin toplamini bulunuz.
        int minİnt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minİnt+maxByte);

        //Example 3: i) Primitive int'i Wrapper İnteger'a çeviriniz(Autoboxing)
        int nun = 22;
        Integer wrapperNun = nun;
        System.out.println(wrapperNun);

        //           i))Wrapper Byte ' i primitive byte'a çeviriniz.(Unboxing)

        Byte k = 43;
        byte primiteveK = k;
        System.out.println(primiteveK);

        //Example 4: Primitive char'ı Wrapper Charactere çeviriniz.(Autoboxing)
        //          ii) Wrapper Boolean'ı primitive boolean'a çeviriniz. (Unboxing)

        char fb = 'x';
        Character wrapperFb = fb;
        System.out.println(wrapperFb);

        Boolean b = true;
        boolean primitiveBoolean = b;
        System.out.println(primitiveBoolean);

        //Size Sting olarak verilen iki fiyatın toplamını ekrana yazdırınız.
        String shirt = "2300";
        String shoes = "5200";
        //Java' da + sembolu iki sayı arasında kullanılırsa toplama işlemi olur.
        //Java'da + sembolü 2 String arasında veya bir String ve bir sayı arasında kullanılırsa "Concatenation" işlemi olur.
        //Concatenation işlemi birleştirme işlemi yapar.
        //Concatenation işlemlerinde Java matematikteki işlem önceliği kurallarını kullanır.

        System.out.println(shirt+shoes); //23005200 javada toplama işlemini 2 anlamı vardır birisi toplama diğeri de birleştirme
                                        //+ işaetini Stringlerin arasına koyarsak birleştirir. (Concatenation)
        int toplamFiyat = Integer.valueOf(shirt)+ Integer.valueOf(shoes);
        System.out.println(toplamFiyat);


        //Example 6: Size Strıng olarak verilen iki fiyatın toplamını ekrana yazdırınız:
        //ValueOf method u tüm karakterleri rakam olan Stringleri sayılara çevirir.
        //Eğer value of methodu kullanırken String ' in içine rakam olmayan bir karakter koyarsanız hata alırsınız.
        //Bu hatayı düzeltmeyi ileride öğreneceğiz
        String tv ="$11000";
        String radio = "$3000";
        System.out.println(tv+radio);//bunu yazarsam java concatenation yapar ekranda $11000$3000 görürüm.
        int totalPrice= Integer.valueOf(tv)+Integer.valueOf(radio);// dolar işaretinden dolayı hata vericektir.
        System.out.println(totalPrice);








    }
}
