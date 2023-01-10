package practice.nighttime01;

public class C01_Variables {

    public static void main(String[] args) {

        //byte; short; integer; long; double; float; Data Type'larının max ve min değerlerini yazdıran kodu yazınız.
        // max ve min değerlerini yazdıran kodu yazınız.

        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMax = " + byteMax);//127
        System.out.println("byteMin = " + byteMin);//-128

        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);//-32768
        System.out.println("shortMax = " + shortMax);//32767

        int intMax = Integer.MAX_VALUE;
        int İntMin = Integer.MIN_VALUE;
        System.out.println("intMax = " + intMax);//2147483647
        System.out.println("İntMin = " + İntMin);//-21474883648

        long longMax = Long.MAX_VALUE;
        long longMin = Long.MAX_VALUE;
        System.out.println("longMin = " + longMin);//9223372036854775807
        System.out.println("longMax = " + longMax);//9223372036854775807

        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        System.out.println("doubleMax = " + doubleMax);//1.7976931348623157E308
        System.out.println("doubleMin = " + doubleMin);//4.9E-324

        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        System.out.println("floatMax = " + floatMax);//3.4028235E38
        System.out.println("floatMin = " + floatMin);//1.4E-45


        /*
        \n ==> alt satira gecirir
        \t ==> bir tab bosluk birakir
        \b ==> gerisindeki ilk harfi siler
        ctrl+ alt +l ==> windows icin sayfayi duzenler
        cmd + alt +l ==> mac icin sayfayi duzenler
         */

        //TECHPRO EDUCATION ==> her bir harf alt alta gelecek şekilde yazdıran kodu olusturunuz.(CTRL D İle alt alta coğaltabiliriz.
        //ctrl alt L harfi kodları düzenler


        System.out.println("1.yol");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");

        //yukarıdaki örneği tek sout ile her harfi alt alta gelecek sekilde yazdırınız.(sağdan slash ctrl+alt+?)

        System.out.println("\nT\nE\nC\nH\nP\nR\nO");

        //JAVA İLE GÜZEL DÜNYA Her bir kelimeyi alt alta gelecek şekilde yazınız.

        System.out.println("\nJAVA\nİLE\nGÜZEL\nDÜNYA");



        //JAVA İLE GÜZEL DÜNYA şeklinde kelimeler arasında bir tab boşluk bırakan kodu yazınız.

        System.out.println("\tJAVA\tİLE\tGÜZEL\tDÜNYA");

        //"Techpro" ile java cok 'kolay'
        // yazdıran bir kod yazınız.

        System.out.println("\"Techpro\"\tile\tjava\tcok\t\'kolay\'");

        //"MAHARET" hiç 'DÜŞMEMEK' değil;




        //"Her düştüğünde kalkabilmektir" ifadesini

        // seklinde noktalı virdülden
        //sonra 3 satır asağıdan ve satır bası yaparak yazdıran bir kod yazınız.

        System.out.println("\"MAHARET\"\thic\t'DUSMEMEK'\tdegil\n\n\n\"Her\tdustugunde\tkalkabilmektir\"");



    }

}
