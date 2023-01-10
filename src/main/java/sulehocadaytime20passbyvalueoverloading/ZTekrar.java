package sulehocadaytime20passbyvalueoverloading;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZTekrar {
    public static void main(String[] args) {

    int tobacco = 70;
    tobacco=decemberPrice(tobacco);
    System.out.println(tobacco);




    }

    private static int decemberPrice(int tobacco) {
        tobacco-=10;
        System.out.println(tobacco);
       return tobacco;

    }
}