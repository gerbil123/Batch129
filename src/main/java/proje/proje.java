package proje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class proje {
    /*
    projemizin adı YIYECEK OTOMATI
    --15 adet ürün ve bu ürünlerin fiyatlarını belirleyiniz.
    Bu ürünler ekranda listelensin
    --ürün seçip, para miktarı giriniz
    --girdiğiniz para fazla ise üstünü versin, eksik ise ekleme yapmanızı istesin
    --Ek ürün seçme seçeneği olsun, siz devam ettiğiniz sürece,para kontrolünü de yaparak işlem yapmaya devam etsin...
    NOT: Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl miktarlarını kabul etsin
    iyi çalışmalar
    Kolay gelsin...
    1 ne istedigini sor
    2 fiyatini hesabla
    3 parasini al
     */

    public static void main(String[] args) {
        String[] urunler = {"Kraker", "Bisküvi", "Gofret", "Sakiz", "Cikolata", "Seker", "Bonibon", "Bonbon", "Cikolata", "Kek", "Su", "Soda", "Meyve Suyu", "Kola", "Gazoz"};
        int[] fiyatlar = {10, 15, 8, 3, 10, 13, 12, 8, 15, 7, 4, 7, 15, 20, 16};
        int bakiye = 0;
        System.out.println("******* Yiyecek Otomatı *******");
        System.out.println("Nu\tUrunler\t\t\t Fiyatlar");
        for (int i = 0; i < urunler.length; i++) {
            System.out.println((i + 1) + "-\t" + String.format("%-13s", urunler[i]) + " = \t" + String.format("%2d", fiyatlar[i]) + " Tl");
        }
        System.out.println("*".repeat(30));
        Scanner input = new Scanner(System.in);
        int secim;
        do {
            System.out.println("Ürün Numarasını Girin" + "\nÇıkmak Icin 0 tusuna basiniz");
            secim = input.nextInt();
            if (secim > 0 && secim < 16) {
                System.out.println(urunler[secim - 1] + " Sectiniz. Ucreti = " + fiyatlar[secim - 1] + " TL");
                if (bakiye < fiyatlar[secim - 1]) {
                    do {
                        System.out.println("Parayı Yerleştirin\n 1 Tl 5 TL 10 TL 20 TL");
                        int para = input.nextInt();
                        switch (para) {
                            case 1:
                            case 5:
                            case 10:
                            case 20:
                                bakiye += para;
                                break;
                            default:
                                System.out.println("Geçersiz Para!");
                        }
                    } while (fiyatlar[secim - 1] > bakiye);
                }
                bakiye -= fiyatlar[secim - 1];
                System.out.println(urunler[secim - 1] + " aldınız.\nBakiyeniz = " + bakiye +" Tl");
            } else if (secim == 0) {
                System.out.println("Teşekkür Ederiz");
                if (bakiye > 0) {
                    System.out.println("Para Üstünü Alınız : " + bakiye+" TL");
                    break;
                }else{
                    break;
                }
            } else {
                System.out.println("Hatalı Ürün Seçimi!.. Lütfen Yeniden Giriniz");
            }
        } while (true);
    }
}