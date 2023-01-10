package day03scanner;

import java.util.Scanner;

public class Scanner08 {
    public static void main(String[] args) {

        // Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alınız
        //Alanını hesaplayınız.
        //Çevresini hesaplayınız.

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz");
        float shortSide = input.nextFloat();

        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz");
        float longSide = input.nextFloat();

        System.out.println(shortSide*longSide);
        System.out.println(2*shortSide+ 2*longSide);




    }


}
