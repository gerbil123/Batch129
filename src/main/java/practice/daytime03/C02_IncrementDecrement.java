package practice.daytime03;

public class C02_IncrementDecrement {
    public static void main(String[] args) {

        int a = 12;
        int b=a++;
        System.out.println("b=" + b);//b 12 a 13
        System.out.println("a="+ a);

        int x =15;
        int y =x--;
        System.out.println("x= "+  x); //x 14 y 15
        System.out.println("y= "+ y);

        int m = 21;
        int n=++m; //pre Increment
        System.out.println(n); //m = n = 22
        System.out.println(m);

        int t=32;
        int u=--t;
        System.out.println(t); //m=n=31
        System.out.println(u);




    }
}
