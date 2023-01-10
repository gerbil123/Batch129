package day10switchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        /*
        Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kısaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR

        Kullanicidan bir ulke ismi aliniz.Alinan ulke adina gore kisaltmalari yazdiriniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ülke adını giriniz...");
        String countryName = input.nextLine(); //Burda da küçük harfe çevirebilirim.Ama aşşada tercih edilir çünkü countrName'yi başka yerdede kullanıcam

        switch (countryName.toLowerCase()) { //Burda da küçük harflere çevirebilirim.
            case "america":
                System.out.println("US");
                break;
            case ("england"):
                System.out.println("UK");
                break;
            case ("germany"):
                System.out.println("DE");
                break;
            case ("turkey"):
                System.out.println("TR");
                break;
            case ("india"):
                System.out.println("IN");
                break;
            case ("peru"):
                System.out.println("PE");
                break;
            case ("spain"):
                System.out.println("SP");
                break;

            case ("bulgaria"):
                System.out.println("PR");
                break;

            case ("albania"):
                System.out.println("AL");
                break;
            case ("france"):
                System.out.println("FR");
                break;

        }


    }

}
