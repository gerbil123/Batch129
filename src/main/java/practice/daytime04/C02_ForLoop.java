package practice.daytime04;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan String bir ifade alınız.
        Harflerini alt alta gelecek şekilde boşluk veya 'a' harfi geldiğinde yazdırmayan diğer karakterleri
        yazdıran kodu yazınız.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen String bir ifade giriniz.");
        String str = input.nextLine();//gazi antep

        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)==' '){
                continue;
            }
            System.out.println(str.charAt(i));
        }






    }

}
