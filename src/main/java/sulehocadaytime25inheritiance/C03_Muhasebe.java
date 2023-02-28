package sulehocadaytime25inheritiance;

public class C03_Muhasebe extends C04_Personel {//baba=super class


    protected int saatUcreti;
    protected String statu;
    protected int calısmaSaati=8;


    protected int maasHesapla(){
        int maas = saatUcreti*calısmaSaati*30;
        return maas;
    }


}
