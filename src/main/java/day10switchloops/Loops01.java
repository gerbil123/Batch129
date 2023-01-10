package day10switchloops;

public class Loops01 {

    /*
    Code Standarts
    i)Tekrar(Repetition) olmamalıdır.
    ii)Dynamic olmalıdır.
    iii)Tamir ve update kolay yapılabilmelidir.

     */
    public static void main(String[] args) {
        //1.YOL: Tavsiye edilmez
        //Example 1: Ekrana 5 kere "Hi" yazdırınız.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.YOL:
        //Aynı adımlar tekrar tekrar yapılması gerektiğinde "loop" lar kullanılır.
        //Dort tane loop var; i)for-loop ii)while-loop iii)do-while-loop iiii)for-each-loop

        //i)for-loop
        //Baslangıc degeri   Loop'un calışma sartı      Increment /Decrement
        for(int i=1        ;  i<6                    ;   i++                     ){
            System.out.println("Hi");
        }

       //Example 2: 11'den 44'e kadar tüm tamsayıları ekrana yazdıran kodu yazınız.
       for (int i=11  ; i<45 ; i++ ){
           System.out.println(i);
       }

        //Example 3: 40'dan 23 e kadar tüm çift sayıları ekrana yazdıran kodu yazınız.
        for(int i=40 ;i>22; i--){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //Example 4: 18'den 56'ya kadar tüm teksayıları ekrana yazdıran kodu yazınız.
        for(int i=18 ; i<57 ; i++){
            if (i%2!=0){
                System.out.print(i + " "); //yanyana sayıların arasında boşluk bırakarak yazdırmak için

            }
        }
















    }
}
