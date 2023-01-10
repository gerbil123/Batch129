package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {

        //Example 1: 3'den 10' a kadar tamsayıları console' a paylaşınız.
        //1.YOL
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //2.YOL While Loop
        int i = 3;
        while (i < 11) {
            System.out.print(i + "  ");

            i++;
        }
        System.out.println();
        //Example 2: 23'den 12'ye kadar çift tamsayıları console'a yazdırınız.
        int t = 23;
        while (t > 11) {
            if (t % 2 == 0) {
                System.out.print(t + " ");
            }
            t--;
        }
        System.out.println();
        //Example 3: Verilen bir tamsayının rakamları toplamını console'a yazdıran kodu yazınız. INTERWIEW SORUSUDUR
        //1.YOL: while-loop
        int num = 578;
        num =Math.abs(num);
        int sum = 0;
        while (num > 0) {
            sum=sum+ num % 10;


            num /= 10;
        }
        System.out.println(sum);

        //2.YOL: for-loop
        int a = 684;

        int toplam = 0;

        for ( int m =a; m>0;m/=10){
            toplam = toplam + m%10;
        }
        System.out.println(toplam);

    }
}
