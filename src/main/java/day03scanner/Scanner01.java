package day03scanner;

import java.util.Scanner;

public class Scanner01 {

      /*
         Objenin ismini input yaptik. Cunku bu objenin kullanimdan  alinan  data  bilgilerini  benim
         yazacagim  kodlarimin icine  koyacagiz.
        */
    //Scanner class ı kullanıcı ile etkileşim kurmamızı sağlar.
    //Scanner bir class'tır. Java util kütüphanesinden getirildiği için import ister.

    public static void main(String[] args) {

        //Kullanıcıdan data almak için
        //1. Adım: Scanner class'ından obje oluşturun.
        Scanner input = new Scanner(System.in);
        //Scanner scan = new Scanner(System.in); ' de kullanılır.

        //2. Adım: Kullanıcıya ne yapacağını söyle
        System.out.println("Lütfen yaşınızı giriniz.");

        //3. Adım : Kullanıcıdan aldığınız datayı variable içine koyun.(next ile başlayan methodlar kullanıcıdan datayı alır bana verir.
        byte age = input.nextByte();


        //Kullanıcıya ad, memleket, yas, boy,
        //yasadığı yeri sevip sevmediğini soran bir program yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String isim = scan.nextLine(); // Kullanıcıdan String bi değer istedik tüm satırı alması için nextLine seçtik.
        System.out.println("Lütfen memleketinizi giriniz");
        String memleket = scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();
        System.out.println("Lütfen boyunuzu giriniz");
        short boy = scan.nextShort();
        System.out.println("Lütfen yaşadığınız yeri sevip sevmediğinizi belirtiniz");
        boolean seviyorMu = scan.nextBoolean();
        System.out.println("**************");
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);




    }
}
