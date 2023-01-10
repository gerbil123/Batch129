package practice.daytime04;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*

    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz. INTERWİEW SORUSU

    */
        int numberOfBananas = 165;
        int survıvaldays = 1;
        boolean monkeyalive = true;

        do {
            System.out.println("*************** maymunlar günde 4 muz yer **************");
            numberOfBananas -= 4; //toplam muz sayısından hergün 4 muz eksiltir.
            System.out.println("Kalan muz sayısı " + numberOfBananas);
            survıvaldays++;
            if (numberOfBananas < 4) {
                monkeyalive = false;
                System.out.println("Bugün " + survıvaldays+ ". gün yeterli muz kalmadı maymun öldü");
                System.out.println("Maymun " + survıvaldays+ " .gün öldü");
            } else
                System.out.println("Bugün " + survıvaldays + ".gün maymun hala hayatta");
        } while (monkeyalive);


    }
}
