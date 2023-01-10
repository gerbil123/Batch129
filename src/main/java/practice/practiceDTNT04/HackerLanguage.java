package practice.practiceDTNT04;

import java.util.Arrays;
import java.util.Scanner;

public class HackerLanguage {

            /*
            INTERWIEW QUESTION
            Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız.
            Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar.
             Genellikle çevirdikleri harfler şu şekilde:
            s -> 5
            a -> 4
            e -> 3
            t -> 1
            o -> 0

            OUTPUT :
             hackerDili("java ile hersey guzel")
             h4ck3rd1l1("j4v4 1l3 h3r53y guz3l")
        */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String cumle = input.nextLine().toLowerCase();

        String arr[] = new String[cumle.length()];


        for (int i = 0; i < cumle.length(); i++) {
            arr[i] = cumle.substring(i, i + 1);
            System.out.print(arr[i]);
        }
        System.out.println();// bu boş sout atmazsak yanyana yerleştirir.
        System.out.println(Arrays.toString(arr));//[j, a, v, a,  , i, l, e,  , g, ü, z, e, l,  , d, ü, n, y, a,  ]

        for (int i = 0; i < cumle.length(); i++) {
            if (arr[i].contains("s")) { //cümle string oldugu için harf harf almanın yolu substrıng charlarda charAt
                arr[i] = "5";
            }
            if (arr[i].contains("a")) {
                arr[i] = "4";
            }
            if (arr[i].contains("e")) {
                arr[i] = "3";
            }
            if (arr[i].contains("t")) {
                arr[i] = "1";
            }
            if (arr[i].contains("0")) {
                arr[i] = "0";
            }//if
            System.out.print(arr[i]);//j4v4 il3 guz3l 53n3l3r 14m4m mı ( java ile guzel seneler tamam mı)
        }//for loop

    }//main

}//class
