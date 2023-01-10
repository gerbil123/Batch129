package sulehocadaytime19listsarrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_Lists {
    public static void main(String[] args) {


        /*
        SAYI TAHMİN OYUNU

        Oyuncudan 1-10 arası bir sayı isteyiniz.
        Elinizdeki Listede oyuncunun tahmin ettiği sayı varsa "BİNGO" yazdırınız.
        Yoksa verdiği sayıyı Listenize ekleyizin.
        Ilk "BINGO" yu tamamlayana "Kazandınız" yazdırınız.

        [5,8,2,9] ==> 2 ==> [5,8,BINGO,9]
        [5,8,2,9] ==> 3 ==> [5,8,BINGO,9,3]
        [5,8,BINGO,9,3]  ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ

         */

        Scanner input= new Scanner(System.in);
        List<String> c = new ArrayList<>();
        c.add("5");
        c.add("8");
        c.add("2");
        c.add("9");
        System.out.println("c = " + c);//c =c = [5, 8, 2, 9]
        String sayi ="";
        int counter=0;
        do {
            System.out.println("Lutfen 1-10 arasinda bir sayi giriniz");
            sayi= input.next().substring(0,1);

            if(c.contains(sayi)){
                c.set(c.indexOf(sayi),"BINGO");
                counter++;

            }else if(!sayi.equals("Q")){
                c.add(sayi);
            }
            System.out.println(c);

        }while (!(counter == c.size()));
        System.out.println("KAZANDINIZ");

    }
}
