package sulehocadaytime11loops;

import java.util.Scanner;

public class C05_ForLoop {

    //5'ten 10'a kadar tam sayıların toplamını bulan kodu yazınız.
    public static void main(String[] args) {

        int num =0;
        for (int i = 5; i <11 ; i++) {
            num=num+i;

        }
        System.out.println(num);


        //6'dan 3 e kadar tamsayıların çarpımını bulan kodu yazınız.

        int multiply=1;
        for (int i = 6; i >2 ; i--) {
            multiply=multiply*i;
        }
        System.out.println("Multiply : "+ multiply);

        //Bir tamsayının rakamlarının toplamını yazan kodu oluşturunuz.
        //2543==> 2+5+4+3
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz.");
        int sayı = input.nextInt();
        sayı = Math.abs(sayı);
        int sonuc =0;
        for (int i = sayı; i >0 ; i=i/10) {
            sonuc=sonuc+i%10;
        }
        System.out.println(sonuc);




        }


    }



