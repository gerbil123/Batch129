package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

        //ArrayList olustururken sag tarafa ( constructor) ArrayList yazmak zorundasınız.
        //Ama saol tarafa ister "ArrayList" yazın isterseniz de "List" yazın, ikiside çalışır.
        //char için Wrapper = Character
        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir List'te kaç eleman oldugunu nasıl anlarız.
        int numOfElement =initials.size();
        System.out.println(numOfElement);//4 Array'lerin lenght 'i List'lerin size 'ı eleman sayısını verir.

        //Bir List'ten istenen bir eleman nasıl alınır.
        char u =initials.get(2);
        System.out.println(u);//M

        //Example 1: Verilen bir String List'teki elemanların toplam karakter sayılarını bulunuz.
        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almatı");

        int sum =0;

        for (String w: cities){

            sum=sum+w.length();
        }
        System.out.println(sum);//26
        //2. YOL
        int toplam =0;

        for (int i = 0; i < cities.size() ; i++) {

            toplam = toplam +cities.get(i).length();
        }
        System.out.println(toplam);//26

        //Bir Listedeki istenen bir elemanı nasıl değiştirebiliriz.
        cities.set(0,"New York");

        System.out.println(cities);//[New York, Istanbul, Kayseri, Almatı]

        //Example 2: Maaş List'i oluşturunuz ve maaşlara %20 zam yapınız.
        List<Double>salary= new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);

        //1.YOL
        int idx =0;

        for (Double w: salary){
             salary.set(idx,w*1.20);
             idx++;
        }
        System.out.println(salary);

        //2.YOL
        for (int i = 0; i < salary.size() ; i++) {
              salary.set(i, salary.get(i)*1.20);

        }
        System.out.println(salary);
    }
}
