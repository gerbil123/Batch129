package day02datatypesmethodcreation;



public class Variables01 {

        //primitive data types --> char - boolean - byte - short - int - long - float - double
        //float: Virgüllü sayılar (Ondalık Sayılar - Decimal Numbers) için kullanılır. (Fiyatlandırmalar - 12.99)
        //double: Virgüllü sayılar (Ondalık Sayılar - Decimal Numbers) için kullanılır. (Hücre Ağırlığı: 0,000000112)

        //Note 1: primitive data type'larini Java olusturmustur, biz olusturamayiz
        //Note 2: primitive data type'larinin isimlerinde sadece kucuk harf kullanilir
        //Note 3: primitive data'lar data type'lara gore memory de farkli farkli yer kaplarlar
        //Note 4: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar

    public static void main(String[] args) {

        //Ornek 1: Gomlek ve ayakkabı fiyatları için 2 tane variable oluşturup toplam fiyatı ekrana yazdırınız.
        //Note: Java "Desimal Numbers" i otomatik olarak double kabul eder.
        //Siz data type'ini "float yazarsanız hata verir
        //float olmasına ısrar ediyorsanız sonuna "F" veya "f" koymalısınız.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        //System.out.println() ekrana yazdırır ve "poınter" ı bir sonraki satıra koyar
        //System.out.print() ekrana yazdırır ve "poınter" ı aynı satırda tutar.
        System.out.println(shirtPrice + shoesPrice);

        //System.out.println() yazdirmanin kisa yolu ==> "sout" yaz ve Enter'a bas
        System.out.println();

        //Ornek 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirin
        double weightCell = 0.000000000000112;
        double weightAmip = 0.000000000000023;
        System.out.println(weightCell - weightAmip);//8.9E-14 ==> 0.000000000000089 ==> "8.9 carpi 10 uzeri -14"  "E ==> Exponent"
    }
}




