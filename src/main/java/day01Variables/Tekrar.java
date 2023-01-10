package day01Variables;

public class Tekrar {
    /*3 tamsayı değişken oluşturun, onlara değer atayın,
             a) Bunları konsolda tek tek yazdırın
          b) 3 tamsayının toplamını yazdır
          c) 3 tamsayının toplamını başında bir etiketle yazdırın. Örnek: 'Toplam 39'dur'
          */

    public static void main(String[] args) {

        int i01 = 12;
        int i02 = 15;
        int i03 = 20;
        System.out.println(i01);
        System.out.println(i02);
        System.out.println(i03);

        int sum = i01+i02+i03;
        System.out.println(sum);
        System.out.println("Toplam=" + (i01+i02+i03)); //Parantez içine koymazsan değerleri sadece yanyana yazar toplamaz.

        //2 tamsayı değişkeni oluşturun ve bunların çarpımını bir etiketle konsolda yazdırın
        int i04=15, i05=16;
        int carpma = i04* i05;
        System.out.println(carpma);


        // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
        String okulIsmi = "yıldız koleji";
        char ilkHarf = 'N';
        int yıl = 2019;
        System.out.println("okulIsmi"  +okulIsmi+" "+"İlk harf" +ilkHarf+ " "+"yılı " +yıl);

        //2- isim ve soyisim icin iki variable olusturun ve bunlari
        //	isminiz : Muhmmad
        //	soyisminiz : Frotan
        //	seklinde yazdirin

        String isim = "Gökhan";
        String soyİsim= "Erbil";
        System.out.println("İsim "+ " "+ isim+ " " + "Soyisim "+ " "+ soyİsim);

        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int sayi5=20;
        char harf='a';
        System.out.println(sayi5+harf);//117 20+97=117
        System.out.println(""+sayi5+harf);//"20a" baştaki çift tırnak string kabul eder ve sadece yanyana yazdırır.

        //2) char is for just a single character it uses 16 bit(2 byte) in memory.
        char ch='A';


        /*

        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz
        Orn 	: sayi1=10 ve sayi2=20;
        kod calistiktan sonra
                sayi1=20 ve sayi2=10
                */

        //1 method
        int sayi1=10;
        int sayi2=20;

        System.out.println("Swap'dan once sayi1: " + sayi1 + ", sayi2 : "+ sayi2);

        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("Swap'dan sonra sayi1: " + sayi1 + ", sayi2 : "+ sayi2);

        // 2 method
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("Swap'dan sonra sayi1 farkli method : " + sayi1 + ", sayi2 : "+ sayi2);





    }

}
