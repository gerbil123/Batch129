package day05typecastingstringmanipulations;

public class TypeCasting01 {

    /*
        Numeric primitive data type'larının birbirine dönüştürülmesine "Type Casting" denir.

        Numeric (sayısal) data type'lar byte - short- int- long- float- double
        NOTE1:Küçük data type'lerini büyük data type'lerine çevirmeyi Java otomatik olarak yapabilir.
        Bu işleme "Autowidening"(otomatik genişletme) denir.
        NOTE2: Büyük data type'lerini küçük data type'lerine çevirmek riskli bir iştir.Java bu riskli işi otomatik olarak yapmaz.
               Bu işlemi kod yazanlar yapar.Bu işleme "ExplicitNarrowing"(Açıktan daraltma) denir.

     */

    public static void main(String[] args) {
        //byte data type'ini int data type'ine çeviriniz.
        byte age = 13;
        int ageInt = age; //AutoWidening

        //Long data type'ini short data type'ine çeviriniz.
        long weight = 234;
        short weightShort = (short)weight; //Explicit Narrowing

        //int data type'ini float data type'ine çeviriniz
        int populatıon = 700000;
        System.out.println(populatıon);
        float populatıonFloat = populatıon;
        System.out.println(populatıonFloat);

        //double data type'ini short data type'ine çeviriniz.
        double number = 12.234;
        System.out.println(number);//12.234
        short numberShort= (short)number;
        System.out.println(numberShort);//12 short tam sayıları alır jaava yuvarlama yapmaz.

        //Dikkat!
        //Dönüşüm yaptıgınız sayı(260)dönüşeceğiniz data type'ini sınırları dışında ise Java kullandıgınız sayı ile mod işlemi yapar
            //ve mod işleminin sonucu sizin yeni değeriniz olur.
        short num = 260;
        System.out.println(num);//260
        byte numByte= (byte)num;
        System.out.println(numByte);//4 byte' lar -128den başlar +127 ye gider. Toplam 256 tane var.
        //Kullandıgınız sayı byte'ın sınırını aşarsa sayıyı byte'ın sınırına böler. 260/256 yaparız.

        //Example 2:
        short n = 1023;
        System.out.println(n);//1023
        byte nByte= (byte)n;
        System.out.println(nByte);//-1 1023/256=255 çıkar. Fakat java büyük sayı kullanmaktansa -1 i kullanır.


        /*
        Swap Volues
         */

        int a =12;
        int b = 15;
        int temp =0;
        System.out.println("a:"+b);
        System.out.println("b"+a);


        int x = 12;
        int y = 5;
        x=x+y; //x=17
        y=x-y; //y=12
        x=x-y; //x=5




























    }
}
