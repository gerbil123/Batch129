package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //Example 1:Kullanıcıdan 2 sayı alınız "buyuk olmayan" ( kucuk veya eşit olan sayıyı yazdırınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Ikı sayı giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();

        //1.YOL
        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        //2.YOL:Ternary
        //             Condıtıon      ?    condition true ise çalışır       :             condition false ise çalışır
        double result = a<b           ?        a                            :                         b;
        System.out.println(result);




    }

}
