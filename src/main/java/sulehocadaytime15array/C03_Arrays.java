package sulehocadaytime15array;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        //INTERWİEW QUESTION
        //[0,1,2,3,0,12,0] SIFIRLARI EN SONA KOYUNUZ

        int original [] = {0,2,3,0,12,0};

        int yeni []  = new int[original.length];

        int idx = 0;
        for (int i = 0; i <original.length ; i++) { // orijinal array için çalıştı.

            if (original[i]!=0){
                yeni[idx] =original[i];
                        idx++; //bir sonraki indexe geçer.
            }
        }
        System.out.println(Arrays.toString(yeni));

    }
}
