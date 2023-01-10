package studentpractice;

import java.util.Scanner;

public class Interwiew_3ve5Katları {
    public static void main(String[] args) {

            /*

    Interview Question
     Kullanicidan 100’den kucuk bir tamsayi isteyin.
     1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
     Ancak;
     - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
     - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
     - Sayi hem 3’un hem 5’in kati ise sayi yerine " ** Java Guzeldir ** " yazdirin.
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 100'den küçük bir tamsayı giriniz.");
        int sayı = input.nextInt();

        for (int i = 1; i <=sayı ; i++) {
            if (i%3==0 && i%5==0){
                System.out.println(" ** Java güzeldir. ** ");
            }else if (i%3==0){
                System.out.println("Java");
            }else if (i%5==0){
                System.out.println("Güzeldir.");
            }else
                System.out.println(i + " ");
        }

    }
}
