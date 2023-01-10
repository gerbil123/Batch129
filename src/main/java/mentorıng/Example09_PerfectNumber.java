package mentorıng;

import java.util.Scanner;

public class Example09_PerfectNumber {



        /* Perfect Number (Mukemmel sayi)
          Kullanici tarafindan bir sayiya kadar olan sayilarin,
          mukemmel olup olmadigini bulan method yaziniz.
          Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
          kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
          ORNEK: (6, 28, 496, 8128)
          INPUT      : 6
          OUTPUT     :  1,2,3
        */
        public static void main(String[] args) {
            System.out.println("************* Mükemmel Sayi *****************");
            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("Çıkış İçin 'negatif'(-) değer giriniz. \nBir sayı giriniz");
                int num = scan.nextInt();
                if (num < 0) {
                    break;
                } else {
                    int sum = 0;
                    for (int i = 1; i < num; i++) {

                        if (num % i == 0) {
                            sum += i;
                        }
                    }
                    if (sum == num) {
                        System.out.println(num + " sayısı Mükemmel bir sayıdır.");
                    }else {
                        System.out.println(num + " sayısı Mükemmel bir sayı Değildir!..");
                    }

                }
            }


            Scanner input=new Scanner(System.in);

            System.out.println("lutfen bir 1.isim giriniz");
            String name1=input.next();
            System.out.println("lutfen bir 2.isim giriniz");
            String name2=input.next();
            int ortaNokta = name1.length()/ 2;

            if (name1.length()%2==0){



                System.out.println(name1.substring(0,ortaNokta)+name2+name1.substring(ortaNokta));

            }else {
                System.out.println(name1+" , "+ name2 +" ye eklenemiyor");
            }












        }
    }
