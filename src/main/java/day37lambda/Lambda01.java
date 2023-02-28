package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    //rangeClosed==> baslangis ve bitis araligi veriyor
    //Intstream==> integerlari yukardan asagi diziyor.
    //Note: Her zaman bize verilen list ile islem yapamayabiliriz
    //      Bunun icin IntStream methodunu kullaniriz.
    //      rangeClosed(startInclusive, endInclusive) methodu bize
    //      baslangıc ve bitis degeri kapsayan degiskenlerle islem yapmamızı saglar
    public static void main(String[] args) {
        List<Integer> myList= new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);
        System.out.println(getSumOfAllElements(myList));//60
        System.out.println(getSumFromSevenToSeventy(myList));//2464
        System.out.println(getMultiplication(myList));//181440
        System.out.println(getMultiplication1(myList));//181440
        System.out.println(getFactorial(5));//120
        System.out.println(getSumOfEvensBetweenTwoInt(5, 14));//36
        System.out.println(getSumOfDigitBetweenTwoInts(12, 18));//30

    }
    //1) Verilen list'deki tum sayıların toplamını veren method'u olusturunuz.
    public static int getSumOfAllElements(List<Integer>myList){
        return myList.stream().reduce(Math::addExact).get();
    }

    //2)7'den 70'e kadar tum tamsayıların toplamını veren kodu yazınız.
    public static int getSumFromSevenToSeventy(List<Integer>myList){
        return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
    }
    //3'den 9'a kadar tum tamsayıların carpmını veren methodu olusturunuz.
    public static int getMultiplication(List<Integer>myList){
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();//rangeClosed'de ikincisi dahil.

    }
    public static int getMultiplication1(List<Integer>myList){
        return IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt();//range methodunda ikinci index dahil değil.

    }

    //4)Size verilen sayının faktoriyel hesaplayan kodu yazınız.
    public static int getFactorial(int x){
        if (x==0){
            return 1;
        }else if (x<0){
            System.out.println("Faktoriyel islemi negatif sayılarla yapılamaz.");
            return -1;
        }else

        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();//rangeClosed'de ikinci sayı birinci sayıya eşit yada büyük olmalıdır.
    }

    //5)Size verilen iki tamsayı arasındaki tum cift sayıların toplamını veren kodu yazınız.
    public static int getSumOfEvensBetweenTwoInt(int a, int b){
        if (a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return IntStream.range(a+1,b).filter(Utils::isNumberEven).sum();

    }
    //6)Size verilen iki tamsayı arasındaki tum tamsayıların rakamları toplamını veren kodu yazınız.
    //12 ve 18 ==> 13 14 15 16 17 == 4+5+6+7+8=30
    public static int getSumOfDigitBetweenTwoInts(int a, int b){
       return IntStream.range(a+1, b).map(Utils::getSumOfDigit).sum();//13+14+15+16+17+ range
    }
}
