package practice.daytime06;

public class C02_Varargs {
    //Verilen sayılardan ilki hariç tum sayıları
    //toplayıp ilk sayıyla carpan bir method oluşturunuz.(Varargs kullanımı)

    public static void main(String[] args) {

        int sayı1=5;
        int sayı2=7;
        int sayı3=2;
        int sayı4=4;
        int sayı5=9;

        sonuc(sayı1,sayı2,sayı3,sayı4,sayı5);

    }//main

    private static void sonuc(int sayı1 ,int ...toplanacakSayı) { //5 datası önce sayı 1 e gideceği için hariç olmuş olacak
        int toplam =0;                                              //foreach döngüsüne girmeyecek.
        for (int w:toplanacakSayı
             ) {
            toplam+=w;
        }
        System.out.println(toplam);//22
        int sonuc= toplam*sayı1;//22*5=110
        System.out.println("sonuc = " + sonuc);//110
    }

}//class
