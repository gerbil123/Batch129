package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1: Bir String'in bas ve sonunda space karakteri varsa siliniz.
        //          " Ali Can "   ==> "Ali Can"
         String s = "   Ali Can  ";
         System.out.println(s);//  Ali Can
        //Note: trim() method'u bir String'in baş ve sonundaki space karakterleri siler, aradaki space'lere dokunmaz.
         String sTrimed = s.trim();
         System.out.println(sTrimed);//Ali Can

        //Example 2: Aşağıda fiyatları verilen ürünlerin toplam fiyatını bulunuz.
        //           String tv= "$456.99";       String laptop = "$879.99;"  ==>456.99 + 875.99 = 1332.98
        String tv1= "$456.99";
        String laptop1 = "$879.99";
        String tv2 = tv1.replace("$", "");
        System.out.println(tv2);//456.99==> ondalık sayılar Java'da otomatik olarak double kabul edilir.

        String laptop2 = laptop1.replace("$","");
        System.out.println(laptop2);//879.99 dolar işaretini boşlukla yer değiştirerek dolar işaretini kaybediyo.

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice); //1332.98Toplama yapabilmek için önce dolar işaretlerinden kurtulduk sonra String'i double'a çevirdik

        //Example 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdırınız.
        //            "Ali Can" ==> AC

        String name = "   ali cAN  ";
        char first = name.trim().toUpperCase().charAt(0);//Önce space'leri sildik sonra buyuk harf yaptık hepsini
        System.out.println(first);                        //sonra charAt 0 da ilk harfi verir yani A çıkar
        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second); //önce space'leri sildik (trim) sonra hepsini büyük harf yaptık(toUppercase)
                                    //sonra boşluktan 2'ye parçalar(split) space yok olur sonra köşeli parantezdeki 1 kelimesi CAN kelimesini
                                    // kasteder ve CAN kelimesinin ilk harfini alır ( charAt(0);)

        System.out.println("" + first + second ); //AC Başına "" koymazsak toplama işlemi anlar ve ASCII değerlerini alır

        //Example 4: Bir string'in hiç karakter içermediğini (Bos Sttring) kontrol eden kodu yazınız.
        String str = "";

        //1.Yol: lenght () kullan
        boolean result1 = str.length()==0;
        System.out.println("String boş mu "+ result1);//true

        //2.Yol:
        boolean result2= str.isEmpty();
        System.out.println(result2);//true Java özel method oluşturmuşsa o method'u kullanmak daha iyidir.
        //Java ya az iş yaptırırsanız hızlı çalışır hızlı olmak önemlidir.

        //Example 5: Bir String'in space hariç hiçbir karakter içermediğini kontrol eden kodu yazınız.
        String t = "     ";
        //1.YOL
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println("Sadece space mi var "+ result3);//true

        //2.YOL
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println(result4);//true

        //3.YOL
        //isBlank method'u sadece space içeren Stringler için true verir space dışında bir karakter içerirse false verir.
        //isBlank method'u boş String'ler içinde true verir.
        //isBlank() ==> space + hiçbişey için true          isEmpty==> hiçbişey için true
        boolean result5 =t.isBlank();
        System.out.println(result5);

        //Example 6: Bir String'de a, e, i, karakterlerinin ilk görünümlerinin indeksleri toplamını ekrana yazdırınız.
        //          "Java is easy to learn" ==> 1+5+8=14

        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("İndeks'ler toplamı:"+ (idxE+idxA+idxI));

        //Example 7: Bir String'de "Java" kelimesinin ilk  kaçıncı indeks'de kullanıldıgını gösteren kodu yazınız.
        //          "Ah Java vah Java sensiz olmuyor Java" ( ilk 3. indekste kullanılıyor)

        String u = "Ah Java vah Java sensiz olmuyor Java.";
        //indexOf("Java") kullanımında siz "Java" kelimesinin ilk görünümündeki ilk harfin indeksini almış olursunuz.
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        //Note indexOf() methodu olmayan karakterler için kullanılırsa herzaman -1 verir.
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);

        //Example 8: Bir String'de a, i, e karakterlerinin "son" görünümlerinin indexleri toplamını ekrana yazdırınız
        // "Java is easy to learn " ==> 18+5+17 = 40
        String v = "Java is easy to learn";
        int idxL=v.lastIndexOf('a');
        System.out.println(idxL);

        int idxL1 = v.lastIndexOf('i');
        System.out.println(idxL1);

        int idxL2 = v.lastIndexOf('e');
        System.out.println(idxL2);

        System.out.println( idxL+idxL1+idxL2);//40
        //Note lastIndexOf() String de olmayan bir karakter için kullanılırsa herzaman -1 verir.

        //Example 9: Bir String'deki tekrarsız karakterlerin ekrana yazdırınız.
        //      abbccdc==>ad

        String y = "abbccdc";
        char ch1 = y.charAt(0);

        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);//a

        }

        char ch2 = y.charAt(1);

        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);//b tekrarlı olduğu için yazdırmadı

        }

        char ch3= y.charAt(2);

        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);

        }



        //Note: Bazı kodların bazı şartlara bağlı olarak çalışması gerekir.
        //      Bazı kodları bazı şartlara göre aktive etmek için "if statement" kullanılır.
        //      if u study hard, u will learn Java.

        //Example 10: Sayı pozitif ise ekrana "pozitif" yazdırın.
        int num = 12;

        if(num>0){
            System.out.println("pozitif");//Pozitif:bu kodun çalışıp çalışmaması yukardaki denkliğin doğru olup olmaması önemlidir.

        }

        //Example 11: Sayı -1 ile 10 arasında ise ekrana "Rakam" yazdırın.

        int number = 3;

        if(number>-1 && number<10){
            System.out.println("Rakam");

        }

        //Example 12: Sayı 3 basamaklı ise "Wooow" yazdırın.

        int number1 = 123;
        if(number1>99){
            System.out.println("woowww");

        }


        int number2 = -123;
        number2= Math.abs(number2);//Mutlak değere alıyoruz.
        if(number2>99){
            System.out.println("YEAAHH");


        }


    }
}
