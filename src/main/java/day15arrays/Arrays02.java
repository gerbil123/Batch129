package day15arrays;

import java.util.Arrays;
import java.util.Locale;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 2: Bir Stringdeki sesli harflerin sayisini bulan kodu yazini
        // a - e - i - o - u - A - E - I - O - U

        String s = "Java brings you money";
        //1. YOL use replaceAll()
        int vowels = s.replaceAll("[^aeiouAEIOU]", "").length();
        System.out.println(vowels);//7

        //2.YOL: use Array - Loop
        String letters[] = s.split("");
        System.out.println(Arrays.toString(letters));

        int counter = 0;
        for (String w : letters){
            switch (w.toLowerCase()){ //ihtimal sayısı 2 den fazla ise case kullan
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);

    }

}
