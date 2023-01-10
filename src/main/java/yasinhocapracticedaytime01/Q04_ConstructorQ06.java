package yasinhocapracticedaytime01;

public class Q04_ConstructorQ06 {
    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız.
    //Birim fiyatı 99 lira üzeri olan ürünlere %10 vergi indirimi uygulayınız.
    public static void main(String[] args) {

        Q06_Market.Market cikolata = new Q06_Market.Market("Çikolata",20.50,6);
        System.out.println(cikolata);

        Q06_Market.Market peynir = new Q06_Market.Market("Peynir", 100,3);
        System.out.println(peynir);

        Q06_Market.Market deterjan = new Q06_Market.Market("Deterjan",200);
        System.out.println(deterjan);

        Q06_Market.Market ekmek = new Q06_Market.Market();
        System.out.println(ekmek);


    }
}

