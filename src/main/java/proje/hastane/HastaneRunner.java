package proje.hastane;

public class HastaneRunner {
    public static void main(String[] args) throws InterruptedException  {

        DoktorIslemleri.doktorListesi();
        HastaIslemleri.hastaListesi();
        QA9_Hastanesiislemler.hastaneMenusu();

    }//main
}//class

