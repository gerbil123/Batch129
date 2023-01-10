package practice.practiceDTNT05;

public class OverloadıngHacimRunner {
    public static void main(String[] args) {

        //Küp kare prizma ve dikdörtgen prizmanın
        //hacmini hesaplayan method oluşturunuz.

        OverloadingHacim hacim = new OverloadingHacim();
        int karePrizma = hacim.hacimHesapla(5,6);
        int dikdörtgenPrizma = hacim.hacimHesapla(5,6,7);
        int küp = hacim.hacimHesapla(5);
        System.out.println(karePrizma);
        System.out.println(dikdörtgenPrizma);
        System.out.println(küp);





    }
}
