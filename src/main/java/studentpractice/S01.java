package studentpractice;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {

        /*
        interview Questions1
            * Kullanicidan bir cumle ve bir harf alin,
            * Cumlede harfin kac kere kullanildigini bulup, yazdirin

                 * ORNEK:

            * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e

                * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
            */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String cümle =input.nextLine().toLowerCase();

        System.out.println("Lütfen bit harf giriniz.");
        char harf = input.next().toLowerCase().charAt(0);

        int counter =0;

        for (int i = 0; i <cümle.length() ; i++) {
            if (cümle.charAt(i)==harf){

                counter++;
            }
        }
        System.out.println("Girdiginiz cumlede " +harf+ " harf " +counter+ " kere kullanilmistir");


    }
}

