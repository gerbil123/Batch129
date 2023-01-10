package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {
        //INTERWİEW SORUSU
        //Verilen bir List'teki elemanları tekrarsız olarak yazdırınız.
        //              [2,3,2,2,3,5,] ==>[2,3,5]

        List<Integer>myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(5);

        List<Integer>newList = new ArrayList<>();
        for (Integer w : myList) {
            if (!newList.contains(w)){
                newList.add(w);
            }
        }
        System.out.println(newList);//[2, 3, 5]

        //Example 2: Musteriden urun ismini alınız.
        //Musterinin ismini verdiği ürün listede varsa ürünün ismini yazdırınız.
        //Musterinin ismini verdiği ürün listede yoksa "Out of stock" yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Urun arama sistemimize hosgeldiniz");
        System.out.println("Aramayı sonlandırmak için Q 'ya basınız");
        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Headphone");
        products.add("Mobile Phone");

        do {
            System.out.println("Aradığınız ürünün ismini giriniz.");
            String product = input.nextLine();
            if (product.equalsIgnoreCase("Q")){
                break;
            }else if  (products.contains(product + " is in stock ")){
                System.out.println(product);

            }else
                System.out.println( product + " Out of stock! ");

        }while(true); //true yazdıgımızda sonsuz loop olur çünkü müşteri "Q" basınca çıkıcak.

        System.out.println("Sitemizi kullandıgınız için teşekkür eder, tekrar bekleriz");

    }
}
