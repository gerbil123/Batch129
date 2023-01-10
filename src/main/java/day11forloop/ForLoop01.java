package day11forloop;

public class ForLoop01 {

    public static void main(String[] args) {


        //Example 1: Verilen bir String'de ilk 'a' harfinden önceki tüm karakterleri ekrana yazdırınız.
        //   "I love Java" ==> "I love J"
        String s = "I love Java";
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(s.charAt(i));// I love J
        }

        System.out.println();

        //Example 2: Verilen bir String'de son 'a' dan sonraki tüm karakterleri ters sırada yazdırınız.
        //          "Germany" ==> yn ( tersten yazdıralım)

        String t = "Germany";

        for (int i=t.length()-1; i>=0; i--){
            char ch = t.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(t.charAt(i));
        }





    }
}
