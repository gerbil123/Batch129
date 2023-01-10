package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {

        int a = 5;
        System.out.println(a); //5

        //Increment
        a = a+2 ; // veya a += 2;
        System.out.println(a); //7
        //Example 1: Bir tane ınteger variable oluşturun ve onu 2 şekilde 5 arttırın.

        int b = 10;
        System.out.println(b);

        b = b+5;
        System.out.println(b);
        b += 5;

        System.out.println(b);

        //Decrement
        int c = 8;
        System.out.println(c);

        c = c-3;
        System.out.println(c);

        c -= 3 ;
        System.out.println(c);

        //Increment 2:
        int d = 6;
        System.out.println(d);

        d = d*2;
        System.out.println(d);

        d *= 2;
        System.out.println(d);


        //Decrement 2:
        int e = 24;
        System.out.println(e);

        e =e/2;
        System.out.println(e);

        e /= 2;
        System.out.println(e);

        //"1" ile increment
        int f = 12;

        //f = f + 1;
        //f += 1;
        f++;

        //"1" ile dicrement
        int h = 10;

        //h = h -1;
        //h -= 1;
        h--;

        //"post increment" ve "pre-increment"
        int i = 10;
        int k = i++;   //  Post increment cunku variable' in isminden sonra yazıldı "i" variable , "++" increment kısmı
        System.out.println(k);//10==> "i" arttırılmadan "k" ya konuldugu için "k" nın değeri 10 olur.
        System.out.println(i);//11 ==> "i" satır sonunda arttırıldıgı için "i" nin değeri 11 olur


        int m = 15;
        int n = ++m; //Pre increment cünkü variable'den önce geliyo  "++" increment "i" variable
        System.out.println(m);// ==> "m" satır sonunda arttırıldıgı için "m" nin değeri 16 olur.
        System.out.println(n);//16 ==> "m" arttırıldıktan sonra "n" ye konuldugu için "n" nin değeri 16 olur


        //post-decrement ve pre decrement
        int p =17;
        int r = p--;
        System.out.println(p); //16
        System.out.println(r); //17


        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19






    }
}
