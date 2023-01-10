package day11forloop;

public class ForLoop02 {
    public static void main(String[] args) {
        //Example 1: Verilen bir String'de 'a' karakteri hariç tüm karakterleri yazdırınız.
        //          "Madagaskar" ==> Mdgskr
        String s = "Madagaskar";
        //1. yol
        String t = s.replace("a", "");
        System.out.println(t);

        //2.YOL
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 'a'){
                System.out.print(ch);
            }
        }
        System.out.println();

        //3. yol
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='a'){
                continue; //contınue keyword'ü bazı şartlar için loop'un adımlarını atlamamızı sağlar.
            }
            System.out.print(ch);
        }




    }
}
