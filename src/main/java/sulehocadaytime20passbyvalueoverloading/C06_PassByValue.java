package sulehocadaytime20passbyvalueoverloading;

public class C06_PassByValue {
    public static void main(String[] args) {

        //100tl ye satılan bir ürün için 2 farklı indirim uygulayan iki method oluşturalım.
        int fiyat =100;

        indirimYap25(fiyat);//atama yapmadım 100 gördüm
        System.out.println("main içinde method'dan sonra fiyat = " + fiyat);//100
        fiyat =indirimYap10(fiyat);//fiyat konternırının içine atamazsam 100 görürüm
        System.out.println("main içindeki method'dan sonra fiyat = " + fiyat);//90




    }//main

    private static int indirimYap10(int fiyat) {
        fiyat*=0.90;
        System.out.println("%10 indirimli fiyat = " + fiyat);//90
        return fiyat;
    }

    private static void indirimYap25(int fiyat) {
        fiyat*=0.75;
        System.out.println("%25 indirimli fiyat = " + fiyat );//75

    }
}