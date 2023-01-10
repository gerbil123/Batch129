package sulehocadaytime20passbyvalueoverloading;

import java.util.Arrays;

public class C03_PassByValueArray {
    public static void main(String[] args) {

        int sayılar[] = {3, 4, 5, 6};
        System.out.println("sayılar [] = " + Arrays.toString(sayılar));
        elemanDeğiştir(sayılar);
        System.out.println("Main icinde eleman değişince sayılar[] " + Arrays.toString(sayılar));
        //Method icinde eleman değişince sayılar[] [10, 4, 5, 6]

        arrayiDeğiştir(sayılar);
        System.out.println("Main içindeki arrayi değiştir." + Arrays.toString(sayılar));
    }

    private static void arrayiDeğiştir(int[] sayılar) {
        sayılar = new int[6];
        System.out.println("Method içinde array'i değiştir. = " + Arrays.toString(sayılar));
    }

    private static void elemanDeğiştir(int[] sayılar) {
        sayılar[0] = 10;
        System.out.println("Method icinde eleman değişince sayılar[] " + Arrays.toString(sayılar));

    }

}
