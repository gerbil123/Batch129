package day22staticblocksconstructors;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class ZTekrar {
    public static void main(String[] args) {

        Date myDate = new Date();
        System.out.println(myDate);
        System.out.println(myDate.getTime());

        System.out.println(LocalTime.now());

        System.out.println(LocalDateTime.now());



    }
}
