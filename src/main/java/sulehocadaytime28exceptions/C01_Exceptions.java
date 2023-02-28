package sulehocadaytime28exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

        //compile time error == kodların yazım asamasında olusan hatalardır.
        // Run Time Error == Kodlari calistirdiktan sonra olusan hata tipi

        /*
        1)NumberFormatException
         */
        //Bir String,2i alıp int'a ceviren kodu yazınız.

        String str ="123";// positiveScenario , happyScenario

        int result = convertStringToInteger(str);//String'i Integer'e çevir
        System.out.println("result+5 = " + (result+5));//128

        String st = "123a";//negative Scenario
        int result2 = convertStringToInteger(st);
        System.out.println("result2 = " + (result2+10));

    }//main

    private static int convertStringToInteger(String str) {
        //ctrl +alt+t
        int i=0;

        try {
            i = Integer.valueOf(str);
            System.out.println("Burası try Bölümü " + i);
        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan, karakter iceren String'ler Integer'a cevrilemez.");
        }
        return i;

    }
}
