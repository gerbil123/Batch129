package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {

        //Bir multi-dimensional Array oluşturunuz ve bir dimensionalli array'a dönüştürünüz.
        //      [ [2,5] [3] [4,7,11] ] ==> [2,5,3,4,7,11]

        int a[][]= {{2,5},{3},{4,7,11}};
        System.out.println(Arrays.deepToString(a));//[[2, 5], [3], [4, 7, 11]]
        //a array'indeki toplam eleman sayısını bulunuz.
        int totalElement=0;

        for (int[] w:a){
            totalElement=totalElement+w.length;
        }
        //"b" isimli tek dimensional'li bir array oluşturunuz.
        int b[] = new int[totalElement];
        System.out.println(Arrays.toString(b));//[0, 0, 0, 0, 0, 0]

        // "a" array'indeki elemanları "b" array'ine transfer ediniz.
        int idx=0;
        for (int[]w:a){

            for (int k :w){
                b[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));//[2, 5, 3, 4, 7, 11]
    }
}
