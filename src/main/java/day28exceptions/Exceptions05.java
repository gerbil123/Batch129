package day28exceptions;

public class Exceptions05 {
    public static void main(String[] args) {
        int a = 12;
        int b = 4;
        String s = "My Java";
        getCharFromString(s,a,b);
    }
    //try kısmında birden fazla Exception olusturma ihtimali olan kod varsa,  coklu catch kullanabilirsiniz.
    //coklu catch kullandıgınızda exception class'lar arasında parent child ilişkisi yoksa, catch'lerin sırası
    //onemli değildir.Ama koddaki sıralamaya uymak tavsiye edilir.
    //Coklu catch kullandıgınızda Exception Class'lar arasında parent child iliskisi varsa, catch'lerin sırası onemlidir.
    //child olan class ustte olmalıdır.

    //Exception Class'lar arasinda "parent - child" iliskisi varsa, ya child class'i uste yazarak child ve parent class'lar
    //icin ozellestirilmis code'lar yazarsiniz.(Hirsiz icin 155, hasta icin 112 gibi)
    //Veya child'i hic kullanmaz sadece parent ile exception'lari handle etmeye calisirsiniz.(Hirsiz icin 911, hasta icin 911 gibi)
    public static void getCharFromString(String s, int a, int b) {
        try {
            int idx = a / b;

            char ch = s.charAt(idx);

            System.out.println(ch);

        }catch (ArithmeticException e ){
            System.out.println("Do not dıvıde by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandınız.");
        }

    }
}
