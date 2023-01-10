package practice.practiceDTNT04;

public class HesapMakinasıVarags {
    public static void main(String[] args) {

        HesapMakinası islem = new HesapMakinası();

        islem.toplama(234,235345,124,45,124,2451,23,234,2,5345,235,-85);
        islem.cıkarma(10,10,0,40);
        islem.carpma(15,63,-8);
        islem.bölme(3,5);//0 çıkar ınt oldugu için virgülden sonrasını atar sıfır yazdırır.

    }
}
