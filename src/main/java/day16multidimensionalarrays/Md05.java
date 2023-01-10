package day16multidimensionalarrays;

public class Md05 {
    public static void main(String[] args) {
        //Example 1: Bir integer multi-dimensional array olusturunuz
        //Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz

        int a[][]= {{2,5},{3},{4,7,11}};

        int carpım = 1;

        for (int[]w: a){

            for (int k:w){
                carpım=carpım*k;
            }
        }
        System.out.println(carpım);//9280
    }
}
