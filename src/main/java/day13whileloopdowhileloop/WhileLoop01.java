package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Exaple 1:Kullanıcının verdiği sayı için çarpım tablosu oluşturup console'a yazdıran kodu yazınız.
        //      3==>3*1=3   3*2=6   3*3=9  ......3*10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Çarpım tablosunu görmek için bir sayı giriniz.");
        int num = input.nextInt();

        int i =1;
        while(i<11){

                System.out.println(num+ "x" + i + "=" + (num*i));
            i++;
            }

        //Example 2: Verilen bir String'de her harfin sonrasına "*" sembolünü ekleyiniz.
        //              Java==> J*a*v*a*
        System.out.println("Bir kelime giriniz.");
        String word = input.next();
        String newWord = "";

        int k = 0;
        while(k<word.length()){
           newWord = newWord + word.charAt(k) + "*";
            k++;
        }
        System.out.println(newWord);

        }

    }

