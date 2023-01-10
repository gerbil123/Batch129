package practice.practiceDTNT04;

public class HesapMakinası {


    public void toplama(int... a) {
        int toplam = 0;
        for (int w : a) {
            toplam += w;
        }
        System.out.println(toplam);

    }

    public void cıkarma(int... a) {
        int fark = 0;
        for (int w : a) {
            fark -= w;
        }
        System.out.println(fark);
    }

    public void carpma(int... a) {
        int carpım = 1;

        for (int w : a) {
            carpım *= w;
        }
        System.out.println(carpım);
    }


    public void bölme(int a, int b) {
        if (b == 0) {
            System.out.println("Hicbir sayı sıfıra bölünemez");
        } else {
            System.out.println("Bölüm:" + a / b);
        }
    }
}