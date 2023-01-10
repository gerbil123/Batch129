package day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {


        //Kullanıcıdan aldıgımız sekıl ıle asagıdakı gibi bir görsel oluşturunuz
            /*
                    A              //boşluk boşluk A boşluk boşluk
                   A A             //boşluk A boşluk A boşluk
                  A A A            //A boşluk A boşluk A
             */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");

        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);

        System.out.println("\t\t"+ch+"\t\t");
        System.out.println("\t"+ch+"\t\t"+ch+"\t");
        System.out.println(ch+"\t\t"+ch+"\t\t"+ch);

          /*
        \n ==> alt satira gecirir
        \t ==> bir tab bosluk birakir
        \b ==> gerisindeki ilk harfi siler
        ctrl+ alt +l ==> windows icin sayfayi duzenler
        cmd + alt +l ==> mac icin sayfayi duzenler
        ctrl+z==> geri al
        ctrl +s ==> kaydeder
        ctrl+d ==> cogaltir
         */





    }
}
