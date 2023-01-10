package day04asciiwrapperclassoperatorsmemoryusage;



public class Operators01 {
    public static void main(String[] args) {
        /*
        1)+,-,*,/ işlemleri Java'da matematikte kullanıldıgı gibi kullanılır
        Note: int/int==> int olur
        Note: double/int==>double olur.Çünkü Java'da matematiksel işlemlerde farklı data type'leri kullanılırsa sonuc büyük data type'ınde olur
        2)Java'da "Logical Operator" lar vardır.

        i)AND ve OR işlemleri "Logical Operator" lerdir.
        AND işleminden true alabilmek için her şey true olmalıdır.
        AND işlemi "perfectionist" tir.
        AND işleminde bir tane false sonucu false yapar

        ii)OR işleminde bir tane true sonucu true yapmaya yeter.(|| or symbol)
        OR işleminde sonucun false olması için her şey false olmalıdır.
        OR işlemi "polyanna" gibidir.
        iii)NOT operatörü true olanı false, false olanı true yapar.
           işareti :"!" dir
           !true=false
           !false=true
           !!true =true
        3)Karşılaştırma(Comparison) Operatörleri
        <, >, <=, >=, == (tek "=" atama operatörüdür) !=(eşit değildir)
        Note:Karşılaştırma operatörlerini kullandıgınızda kesinlikle boolean(true veya false) alırsınız.

        Note:Biz AND işlemi için && kullanırız ama & kullanımda geçerlidir.
        Farkları nelerdir:
        && kullanımı ilk ifade false oldugunda diğerlerini kontrol etmez dolayısıyla hızlı çalışır.
        & kullanımı ilk ifade ne olursa olsun diğerlerini kontrol eder dolayısıyla yavaş çalışır.
        Biz bu yüzden hep && kullanırız.

         */
        boolean first= 3<5;

        boolean second = 2+3!=5;

        boolean third = 2+5*3>=19;

        System.out.println(first+ "-" + second+"  -  "+third);
        System.out.println(first && second);
        System.out.println(first || second || third);


        /*
        ASCII VALUES
         */

        int ch = 'A';
        System.out.println(ch);

        int ch1 = '!';
        System.out.println(ch1);


        char c3 = 'K';
        char c2 = '?';
        System.out.println(c3+c2);


    }
}
