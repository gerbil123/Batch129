package practice.zlambdaDTNT08;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {


    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));
        ciftVePozitifLamExYazdir(sayi);
        System.out.println("\n ********************");
        ciftvePozitifMetRef(sayi);
        System.out.println("\n ********************");
        kareYazdir(sayi);
        System.out.println("\n ********************");
        kareTekrarsiz(sayi);
        System.out.println("\n ********************");
        buyuktenKucugeSırala(sayi);
        System.out.println("\n ********************");
        pozKupBirlerBas(sayi);
        System.out.println("\n ********************");
        methodlaTopla(sayi);
        System.out.println("\n ********************");
        toplamLambdaEx(sayi);
        System.out.println("\n ********************");
        System.out.println(listinpozitifelemanlarınıLambdaExpression(sayi));
        System.out.println("\n ********************");
        System.out.println(listHalindeReturn(sayi));
        System.out.println("\n ********************");

    }
    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifLamExYazdir(List<Integer> sayi){
        sayi.
                stream().
                filter(t->t%2==0 && t>0).
                forEach(t-> System.out.print(t+" "));

    }

        //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

    public static  void ciftvePozitifMetRef(List<Integer> sayi){

        sayi.stream().filter(t->t%2==0 && t>0).forEach(Utils::yazdir);
    }
    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

    public static void kareYazdir(List<Integer> sayi){

        sayi.stream().map(Utils::kareAl).forEach(Utils::yazdir);
    }
    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın

    public static void kareTekrarsiz(List<Integer> sayi){

        sayi.stream().distinct().map(Utils::kareAl).forEach(Utils::yazdir);
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyuktenKucugeSırala(List<Integer> sayı){
        sayı.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);
    }

    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız.
    public static void pozKupBirlerBas(List<Integer>sayı){
        sayı.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(Utils::yazdir);
    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın.

    public static void methodlaTopla(List<Integer>sayı){
        Optional<Integer>sonuc =sayı.stream().reduce(Integer::sum);//reduce method'u terminal method'dur.
        System.out.println(sonuc);                                  //terminal method'lardan sonra for each gibi methodlar kullanılamaz.
                                                                    //reduce methodundan sonra nokta koydugunda akıs devam etmez.
    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void toplamLambdaEx(List<Integer>sayı){
        int sonuc2 = sayı.stream().reduce(0,(t,u)->t+u);
        System.out.println(sonuc2);
    }
    //SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın


    public static int listinpozitifelemanlarınıLambdaExpression(List<Integer> sayi) {

        int sonuc3 = sayi.stream().filter(t->t%2==0).reduce(1, (t, u) -> t * u);
        return sonuc3;
    }

    //SORU10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static List<Integer> listHalindeReturn(List<Integer>sayı){
        List<Integer> sonuc4 = sayı.stream().filter(t->t%2==0).map(Utils::kareAl).sorted().collect(Collectors.toList());
        return sonuc4;
    }

}