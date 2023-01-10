package practice.daytime04;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        /*
        Kullanıcıdan aldıgınız bir String değerde  'c'den önceki  'a'  harfinin String değer içerisinde kaç kez geçtiğini bulan
        kodu yazınız.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen String bir ifade giriniz.");
        String str = input.nextLine().toLowerCase();

        int sayac=0;

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'){
                sayac++;
            }else if (str.charAt(i)=='c'){
                break;
            }
        }
        System.out.println("c öncesi 'a'ların sayısı = " + sayac);

    }
}
