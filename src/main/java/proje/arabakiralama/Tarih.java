package proje.arabakiralama;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tarih {
    public static int toplamGun;
    public void tarih() throws ParseException {
        SimpleDateFormat trh = new SimpleDateFormat("dd/MM/yyyy");

        Scanner input=new Scanner(System.in);
        System.out.print("İlk tarihi giriniz (dd/MM/yyyy formatında): ");
        String alisTarihi = input.nextLine();
        System.out.print("İkinci tarihi giriniz (dd/MM/yyyy formatında): ");
        String teslimTarihi = input.nextLine();



        Date alisTarihiTrh= trh.parse(alisTarihi);
        Date teslimTarihiTrh = trh.parse(teslimTarihi);


        long gunHesabi = teslimTarihiTrh.getTime() - alisTarihiTrh.getTime();
        toplamGun = (int)(gunHesabi / (1000 * 60 * 60 * 24));

    }


}


