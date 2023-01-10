package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {
        //Example 1: Size verilen bir String'i tersten yazdırınız.
        //"Germany"

        String s = "Germany";
        String t = "";


        for (int i=s.length()-1;i>=0; i--){
            t = t+s.charAt(i);

        }
        System.out.println(t); // çok önemli iyi öğren Loop dışına yazarsam sadece "ynamreG" GÖRÜRÜM ama içine yazarsam her adımı
                                    //görürüm

        //Example 2: Size verilen bir String'in "Palindrome" olup olmadıgını kontrol eden kodu yazınız.
                    //soldan sağa ve sağdan sola okudugunda aynıysa palindrome derler (nalan),(11211)
        //Logic: String'i ters çevir sonra da düz hali ile ters halini karşılaştır, aynı ise "Palindrome" de

        String duz = "civic"; // Buyuk harfle yazarsanız palindrome değildir dicektir ama ignorecase yaparsan no problem
        String ters = "";
        for (int i =duz.length()-1; i>=0; i--){
            ters = ters+duz.charAt(i);
        }
        if (duz.equalsIgnoreCase(ters)){
            System.out.println(duz +  "  Palindromedur");
        }else{
            System.out.println(duz +  "  Palindrome değildir.");
        }
            //TEK KARAKTER HER ZAMAN PALINDROME DUR













    }
}
