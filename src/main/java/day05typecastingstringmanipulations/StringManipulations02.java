package day05typecastingstringmanipulations;




public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";
        //Example 1: "s" String'inin money ile bitip bitmediğini kontrol ediniz.

        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        boolean isEnd1 = s.endsWith("  ");
        System.out.println(isEnd1);

        //Example 2: "s" String'inin money kelimesini " dollar" kelimesine çeviriniz.
        String newS = s.replace("money", "dollar");
        System.out.println(newS);// Learn java earn dollar

        //Example 3: "s" String'indeki earn kelimesini win kelimesine çeviriniz.
        String newS2 = s.replace("earn","win");
        System.out.println(newS2);//Lwin Java win money

        //Example 4: "s" String'indeki "a" harflerini "*" a çeviriniz.
        String newS3 = s.replace('a','*');
        System.out.println(newS3); //Le*rn J*v* e*rn money
        //NOTE: replace methodunda çoklu karakter ile çalışırsanız mecbur çift tırnak kullanıcaksınız.
        //Ama tek karakterle çalışırsanız çift tırnak veya tek tırnak kullanabilirsiniz.
        //Ya ikiside çift tırnak olmalıdır ya da ikiside tek tırnak olmalıdır.

        //Example 5: "n" harflerini "XXX" e çeviriniz
        String newS4 = s.replace("n","XXX");
        System.out.println(newS4);

        //Example 6: "s" String'indeki bütün "e" harflerini siliniz.
        //Note: "Hiçbir şey" char data type'inda yok bu yüzden replace() method'u kullanarak silme işlemi yaparsanız mutlaka çift tırnak alınız.
        String newS6 = s.replace("e","");
        System.out.println(newS6);

        String t = "Ali 13 yaşındadır";
        //Example 7: "t" String'indeki tüm rakamları "*" a çeviriniz.
        //Bir grup data'yı değiştirmek için replaceAll() kullanılır.
        //Bir grup data'yı ifade etmek için "Regular Expressions"(regegs)(köşeli parantez gibi olanlar) kullanırız.
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);

        /*
                                    Meshur Regex'ler
                1) Tum rakamlar ==> [0-9]
                2) Tum kucuk harfler ==> [a-z]
                3) Tum buyuk harfler ==> [A-Z]
                4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
                5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
                6) Tum noktalama isaretleri ==> \\p{Punct}
                7) Tum sesli harfler ==> [aeiouAEIOU]
                   x, q, w harfleri ==> [xqw]

                8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
                9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

         */

        //Example 8: "t" String'indeki tum rakamlari ve harfleri "!" e ceviriniz
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);// !!! !! !!!!!!!!!!!...

        //Example 9: "t" String'indeki tum sesli harfleri "?" e ceviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);//Al? 13 y?s?nd?d?r!...

        //Example 10: "t" String'indeki kucuk harfler disindaki tum character'leri "<>" ceviriniz
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);// <>li<><><><>yasindadir<><><><>

        //Example 11: "t" String'indeki tum harfler disindaki tum character'leri "+" ceviriniz
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);

        //Example 12: "t" String'indeki space'ler disindaki tum character'leri "+" ceviriniz
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);// +++ ++ ++++++++++++++

        //Example 13: "t" String'indeki sesli harfler'ler disindaki tum character'leri "&" ceviriniz
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);// A&i&&&&&a&i&&a&i&&&&&

    }

}