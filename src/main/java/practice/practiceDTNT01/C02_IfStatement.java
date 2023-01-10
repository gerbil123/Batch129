package practice.practiceDTNT01;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        /*
        Kullanıcıdan alacağınız 2 sayıyı yine kullanıcıya seçtireceğiniz dört işlemden biri ile işleme koyup yazdırınız.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen\n toplama yapmak için 1\n cıkarma yapmak için"+
                "2\n çarpma için 3\n bölme yapmak için 4\n giriniz"); // Kullanıcıya seçmesi için menu oluşturdum.
        int islem = input.nextInt();
        System.out.println("Lütfen 2 tam sayı giriniz...");
        double num1 = input.nextDouble(); // birinci sayı assign edildi.
        double num2 = input.nextDouble(); //ikinci sayı assign edildi.

        if(islem == 1){
            System.out.println("Toplama işleminin sonucu...:"+ num1+ "+"+ num2 +"="+(num1+num2));
        }else if(islem==2){
            System.out.println("Cıkarma işleminin sonucu...:"+ num1+ "-" +num2 +"="+(num1-num2));
        }else if(islem ==3){
            System.out.println("Çarpma isleminin sonucu ...:"+num1+ "x"+num2+"="+(num1*num2));
        }else if(islem==4){
            System.out.println("Bölme isleminin sonucu....:"+num1+ "/"+num2+"="+(num1/num2));
        }else
            System.out.println("Hatalı seçim yaptınız tekrar deneyiniz.");
















    }
}
