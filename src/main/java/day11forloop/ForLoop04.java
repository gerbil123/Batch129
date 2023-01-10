package day11forloop;

public class ForLoop04 {
    public static void main(String[] args) {

        //Example 1: 5'den 8' kadar tamsayıların toplamını veren kodu yazınız.
                // 5+6+7+8 ==>26
        int sum = 0;
        for (int i=5 ; i<9 ; i++){
            sum =sum + i;
        }
        System.out.println(sum);//ÖNEMLİİ


        //Example 2: 7'den 9 a kadar tamsayıların çarpımını veren kodu yazınız.
        // 7+8+9+ ==>504

        int sum1 = 1;//0 yazarsak çarpmada yutan eleman oldugundan dolayı
        for (int i=7 ; i<10; i++){
            sum1 = sum1*i;
        }
            System.out.println(sum1);











    }
}

