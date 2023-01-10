package day03scanner;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {
        //Kullanıcıdan adresini alınız ve ekrana yazdırınız ( nextLine() methodu kullanıcıdan çok kelimeli string almak için kullanılır
        //Kullanıcı tek kelime vericekse sadece next kullanılır.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adresinizi giriniz");
        String address = input.nextLine();
        System.out.println(address);
    }
}
