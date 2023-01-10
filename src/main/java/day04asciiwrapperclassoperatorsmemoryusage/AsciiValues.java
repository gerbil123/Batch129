package day04asciiwrapperclassoperatorsmemoryusage;



public class AsciiValues {

    //Java da her karakterin bir sayısal değeri vardır.
    // Bu değerler ASCII Değer'ler olarak adlandırılır.
    //Bu değerlerin tamamının bulunduğu tabloya ASCII Table denir.
    // ASCII Table globaldir. Her proglamlama dilinde değerler aynıdır.
    public static void main(String[] args) {
        //Herhangi bir karakterin ASCII değerini bulmak için o karakteri int data type inde bir variable içine koyunuz.

        int ch = 'A';
        System.out.println(ch);

        int unlem = '!';
        System.out.println(unlem);

        char c1 = 'K';
        char c2 = '?';
        System.out.println(c1+c2);//138 çıkar. + işleminin java da 2 anlamı var kodlama ve birleştirme.
                                    // Her karakterin ASCII değeri vardır. Java da char'ları matematiksel işlemlerde kullanırsanız
                                    //java o char'ların ASCII değerlerini kullanır.

    }
}
