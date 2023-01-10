package practice.practiceDTNT01;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir gün alın e
        Eğer gün cuma ise "Müslümanlar için kutsal gün";
        Eğer gün cumartesi ise "Yahudiler için kutsal gün";
        Eğer gün pazar ise "Hristiyanlar için kutsal gün"; yazdıran kodu oluşturunuz.

         */
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen gün ismini giriniz...");
        String gün = input.next().toLowerCase(); //Küçük harfe çevirdik.

        if(gün.equals("cuma")){
            System.out.println("Müslümanlar için kutsal gün...");
        }else if(gün.equals("cumartesi")){
            System.out.println("Yahudiler için kutsal gün...");
        }else if(gün.equals("pazar")){
            System.out.println("Hristiyanlar için kutsal gün");
        }else
            System.out.println("Kutsal gün değil");

























    }
}
