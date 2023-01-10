package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 2: Integer array oluşturunuz, içine 6 tane eleman yerleştiriniz. Bu elemanları en küçüğü ile en büyüğünün
        //toplamını ekrana yazdırınız.

        int ages[] = new int[6];
        ages[0]=12;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;
        System.out.println(Arrays.toString(ages));//[12, 23, 19, 44, 15, 32]

        Arrays.sort(ages);//sort() method'u array'deki elemanları küçükten büyüğe dizer.
        System.out.println(Arrays.toString(ages));//[12, 15, 19, 23, 32, 44]

        System.out.println(ages[0]+ ages[ages.length-1]);//56

        //2YOL:
        int minimum = ages[0];
        int maximum = ages [0];

        for (int w: ages ){
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);
        }
        System.out.println(minimum+maximum);//56


    }
}
