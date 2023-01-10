package day09incrementdecrementternaryswitch;

public class Ternary01 {
        public static void main(String[] args) {

            //Example 1:
            int a = 10;
            int b = 20;

            int r1 = a<b ? a++ : ++b;

            System.out.println(r1); //10
            System.out.println(a); //11
            System.out.println(b); //20

            //Example 2:Verilen bir sayının mutlak değerini hesaplayan kodu yazınız.

            int c = -4;  //"4" yazsaydık yine 4 çıkıcaktı.

            int r2 = c<0 ? -1*c : c;
            System.out.println(r2);

            //Example 3: İki sayının işareti aynı ise bu sayıları çarpan, işaretleri farklı ise "Farklı işaretli sayıları çarpamıyorum"
            //          mesajı veren kodu yazınız.

            int m = 5;
            int n = -6;

            //Object Java'da bütün Non- Primitive data typle'lerinin ortak "Parent"(Baba, aile) idir.
            //Object' in parenti yoktur
            //Farklı data type'leri için ortak bir variable oluşturmak istediğinizde data type olarak objeck kullanabilirsiniz.
            //Java'da "Object" insanlık aleminde Hz. Adem' e benzer.
            Object r3 = (m>0 && n>0) || (m<0 && n<0) ? m*n : "Farklı işaretli sayıları çarpamıyorum.";
            System.out.println(r3);

            //Example 4: Size verilen sayının 3 basamaklı olup olmadıgını kontrol eden kodu yazınız.

            int p = -436;
            int r = Math.abs(p);

            String r4 = r>99 && r<1000 ? p + " Üc basamaklıdır." :p + "Uc basamaklı değildir.";
            System.out.println(r4);






        }
}
