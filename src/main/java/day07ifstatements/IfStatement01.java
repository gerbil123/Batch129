package day07ifstatements;


import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {


        //Example 1) Verilen karakter buyuk hard ise ekrana "Buyuk Harf" yazdıran  küçük harf ise
        //  ekrana "Küçük Harf" yazdıran kodu oluşturunuz.
        Scanner input =  new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char ch = input.next().charAt(0);
        //1. YOL

        if(ch>='A' && ch<= 'Z'){
            System.out.println("Buyuk Harf...");//Büyük harf girince Büyük harf çıkıyo küçük harf girince çalışmıyor.
        }
        if (ch>='a'&& ch<='z'){
            System.out.println("Kücük Harf...");//Küçük harf yazınca Küçük Harf çıkar büyük yazınca çalışmaz.
        }
        //2. Yol
        if(ch>='A' && ch<= 'Z') {

            System.out.println("Büyük Harf...");

        }else if (ch>='a'&& ch<='z'){

            System.out.println("Küçük Harf...");

        }else{
            System.out.println("Harf Değil...");

            }


        }


}
