package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1: Time'i formatlayınız.

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//21:41:57.803823300

        //hh==> 12 lik saat sistemini kullanır.  -  HH==> 24luk saat sistemini kullanır.
        //hh kullandıgınızda AM veya PM demelisiniz, bunu demek icin "a" yazmanız yeterlidir. Yani "hh:mm a"
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm-ss a");//

        System.out.println(dtf.format(myTime));//09-41-13 ÖS


    }
}
