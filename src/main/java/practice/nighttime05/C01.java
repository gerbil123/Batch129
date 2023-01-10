package practice.nighttime05;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        /*
        INTERWIEW QUESTIONS
        Kullanicidan bir String aliniz.
        String'de var olan her character'in sayisini ekrana yazdiriniz.
        Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
        abaa   ==> a=3  b=1
                */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir String giriniz.");

        String str = input.nextLine();//alican
        String arr[]= str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        int counter=0;

        for (int i = 1; i <arr.length;         i++) {

            if (arr[i-1].equals(arr[i])){
                counter++;//aynı olanlar için 1 arttır.
            }else {

                System.out.println(arr[i - 1] + " karakterinin sayısı " + (counter+1) + " kez  tekrarlanmıştır.");
                counter=0; //baska harfe geçtiği için sıfırlanmalı
            }
            if (i==arr.length-1)//defalarca kodu yazdırmaması için sona gelindiğinde yazdırması için
            System.out.println(arr[i]+ " karkterinin sayısı " + (counter+1) + " kez tekrarlanmıştır.");
        }

    }
}
