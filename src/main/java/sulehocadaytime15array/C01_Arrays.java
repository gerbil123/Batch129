package sulehocadaytime15array;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {
    public static void main(String[] args) {

        //Bir öğretmenin okulundaki öğrencilerin isimlerini applicationa yükleyebileceği kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Kac öğrenci ismi gireceksiniz.");

        int numOfstd = input.nextInt();
        String name[] = new String[numOfstd];
        System.out.println("Cıkmak istiyorsanız lutfen Q harfine basınız");

        for (int i = 1; i <=numOfstd ; i++) {
            System.out.println("Lütfen " + i + ". öğrencinin ismini giriniz.");
          String stdName = input.next();
          if (stdName.equalsIgnoreCase("Q")){
              break;
          }
            name[i-1] = stdName;

        }
        System.out.println(Arrays.toString(name));

    }
}
