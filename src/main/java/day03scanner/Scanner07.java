package day03scanner;

import java.util.Scanner;

public class Scanner07 {
    public static void main(String[] args) {

        //Kullanıcıdan 2 sayı alıp 4 işlem yapan ve işlemlerin sonuçlarını ekrana yazdıran kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);
    }
}
