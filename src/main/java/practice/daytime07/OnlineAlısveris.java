package practice.daytime07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineAlısveris {
    /*
     * Basit bir online alisveris programi yaziniz.
     *
     * 1. Adim : "urunListesi"nden urun sectir ve kac adet istedigini sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini "toplamOdeme" ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

     * */



    static List<String> urunListesi = new ArrayList<>();
    static List<Double> urunFiyatları = new ArrayList<>();
    static double toplamOdeme;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    urunListesi.add("saat : urun kodu 1 ");
    urunListesi.add("monitör : urun kodu 2 ");
    urunListesi.add("canta : urun kodu 3 ");
    urunListesi.add("kitap : urun kodu 4 ");
    urunListesi.add("futbol topu : urun kodu 5 ");

    urunFiyatları.add(15.0);
    urunFiyatları.add(200.0);
    urunFiyatları.add(50.0);
    urunFiyatları.add(10.0);
    urunFiyatları.add(500.0);

        System.out.println(urunListesi);

        musteriSecim();

    }

    private static void musteriSecim() {
        System.out.println("Lütfen sectiginiz ürünün kodunu giriniz.");
        int secim = input.nextInt();
        System.out.println("Lütfen sectiginiz urunden kac adet istediğinizi giriniz.");
        int adet = input.nextInt();

        double urunTutarı = adet*urunFiyatları.get(secim-1);//-1 dedik çünkü get methodu index kullanır
        System.out.println(urunTutarı);
        toplamOdeme+=urunTutarı;
        System.out.println("Devam ise 1  \n odeme  için 2 'yi seçiniz. ");
        int devamMı = input.nextInt();

        if (devamMı==1){
            musteriSecim();//tekrarlayan method ( recursive method)
        }else
            odeme();
    }

    private static void odeme() {

        LocalDate kurulusGunumuz = LocalDate.of(2023,01,10);
        LocalDate date = LocalDate.now();

        if (date.isEqual(kurulusGunumuz))
        {

            System.out.println("Bugün bizim kuruluş günümüz borcunuz yoktur.");
        }else
        System.out.println("Yine bekleriz ödemeniz " + toplamOdeme + "$");


    }
}
