package day05typecastingstringmanipulations;

public class SwapValues {
    //Swap yer değiştirme. 1.kap: Patates 2. kap:domates ==> swap 1. kap domates 2. kap patates

    public static void main(String[] args) {
        int a = 12;
        int b = 5 ;// Swap'den sonra ==> a=5 ve b = 12
        int temp = 0;
        System.out.println("a:"+a);
        System.out.println("b"+b);
        //1. YOL
        //1. adım
        temp=a;
        //2. adım
        a=b;
        //3. adım
        b=temp;

        System.out.println("a:"+a);
        System.out.println("b"+b);

        //2.YOL
        int x = 12;
        int y = 5 ;
        x=x+y;
        y=x-y;
        x=x-y;
        //ınterwıev sorusudur.


    }
}
