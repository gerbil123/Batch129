package day16multidimensionalarrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        //Example 1: Bir integer multi-dimensional oluşturunuz.
        //Toplam eleman sayısını console'a yazdırınız.

        int a[][]={ {13,213,4},{12,87},{4,7,1,19},{99} };
        System.out.println(Arrays.deepToString(a));//[[13, 213, 4], [12, 87], [4, 7, 19], [99]]

        int sum = 0;

        for (int[] w:a){

            sum=sum+w.length;
        }
        System.out.println(sum);//10
    }
}
