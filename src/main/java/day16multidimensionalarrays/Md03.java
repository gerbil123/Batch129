package day16multidimensionalarrays;

public class Md03 {
    public static void main(String[] args) {
        //Example 2: Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz

        int a[][] = {{2, 62, 82}, {3, 13}};

        int sum = 0;

        for (int[] w : a) {//dış array için

            for (int k : w) {// inner loop //elemanlara birer birer ulaşmak istiyorsanız nested loop kullanılır

                sum = sum + k;
            }
        }
        System.out.println(sum);
    }
}
