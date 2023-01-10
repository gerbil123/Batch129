package practice.daytime04;

import java.util.Scanner;

public class C04_WhileLoop {

    /*
Interwiew Questions
 Kullanicidan toplanmak uzere sayilar isteyin
 sayi adedi 10'u gecerse veya toplam 500 'u gecerse
 bu kadar sayi yeter
 ".... adet sayi girdiniz , toplami..." yazdirin
 */
    public static void main(String[] args) {
        //sayı adedi=sayac
        //toplam

        Scanner input = new Scanner(System.in);
        int sayı = 0;
        int toplam = 0;
        int sayac = 0;

        while(sayac<11 && toplam<501){

            System.out.println("Lütfen toplanmak üzere bir sayı giriniz.");
            sayı = input.nextInt(); //Her adımda gözüksün diye loop içinde yazdık.
            toplam+=sayı;
            sayac++;

        }
        if (toplam>500){
            System.out.println(sayac + " adet sayı girdiniz. Toplamı " + toplam);
        }else
            System.out.println("Bu kadar sayı yeter." + sayac + " adet sayı girdiniz Toplam " + toplam);


    }

}
