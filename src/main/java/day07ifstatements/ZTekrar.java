package day07ifstatements;


import java.util.Scanner;

public class ZTekrar {
    public static void main(String[] args) {
        //Verilen bir sayının pozitif negatif veya notr oldugunu kontrol eden kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int num = input.nextInt();

        if(num>0){
            System.out.println("Pozitif sayı");
        }else if (num<0){
            System.out.println("Tek sayı");
        }else
            System.out.println("Notr");










    }
}
