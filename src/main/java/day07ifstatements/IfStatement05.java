package day07ifstatements;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

        //Example 1: Ay isimleri girilince kaçıncı ay oldugunu yazan kodu yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ay ismi giriniz");
        String monthName = input.next();

        if(monthName.equalsIgnoreCase("January")){ //Sadece equals yazsaydık ay isimlerinde büyük küçük harfi önemsicekti
            System.out.println(1);                             // ama equalsIgnoreCase küçük büyük harfi önemsemez
        }else if(monthName.equalsIgnoreCase("February")){
            System.out.println(2);
        }else if(monthName.equalsIgnoreCase("March")){
            System.out.println(3);
        }else if(monthName.equalsIgnoreCase("April")){
            System.out.println(4);
        }else if(monthName.equalsIgnoreCase("May")){
            System.out.println(5);
        }else if(monthName.equalsIgnoreCase("June")){
            System.out.println(6);
        }else if(monthName.equalsIgnoreCase("July")){
            System.out.println(7);
        }else if(monthName.equalsIgnoreCase("August")){
            System.out.println(8);
        }else if(monthName.equalsIgnoreCase("September")){
            System.out.println(9);
        }else if(monthName.equalsIgnoreCase("October")){
            System.out.println(10);
        }else if(monthName.equalsIgnoreCase("November")){
            System.out.println(11);
        }else if(monthName.equalsIgnoreCase("December")) {
            System.out.println(12);
        }else{
            System.out.println("Invalid month name...");
        }

        /*
        String'lerin eşitlerini kontol ederken "==" yerine "equals()" kullanırız.
            Niye? Çünkü == sembolu iki String'i karşılaştırırken hem adreslerine hemde değerlerine bakar.
            İkiside aynı ise size Stringler eşittir der ama biz kod yazarken genellikle Stringlerin
            adresleri ile değil değerleri ile ilgileniriz. Bu yüzden String karşılaştırmalarında "==" kullanmayız.
            "equals()" method'u ise iki String'i karşılaştırırken sadece değerlerine bakar, değerler aynı ise bu iki String
            esittir der degerler afrklı ise bu iki String farklıdır der ki bu bizim kod yazarken ihtiyac duydugumuz şeydir.

        Stack Memory'de
        1)Primitive Data'lar depolanir
        2)Non-primitive'lerin adresleri depolanir.(Reference)
        Heap Memory'de Non-primitive'ler depolanir.

        Primitive Data: char,boolean,byte,short,int,long,float,double
        Non-primitive Data: String,Wrapper Class,sizin olusturdugunuz Class'lar
            */

        /*
        Javanin kullandigi ve urettigi hersey datadir.
        Javada iki turlu Memory vardir
        1) Stack Memory ==> small gibi
        i) Kucuk Memory'dir
        ii )Primitiveleri ve Non-Primitivelerin Referance (adreslerini ) tutar
        2) Heap Memory ==> Huge gibi
            i) Buyuk Memory'dir
            ii)Non-Primitive datalari icerir

            J ava Heap Memory'e yerlestirilen tum Non-Primitive datalar icin
            bir adres (Referance) olusturur.
            Bu adreside Stack Memory'de saklar.
            Herhangi bir sebeple adress (Referance) silinirse Heapdeki Non-Primitive
            datayi Memory'nin temizligini saglayan "Garbage Collector" temizler.


            String s = "Tom";
            String t ="Terry";
            String r = "Tom";
            1) s==t ==> i) Adres ===> farkli
                ii)Deger ===>farkli

            2) s.equals(t) ==> i) Deger ==>farkli
            s.equals(r) ==>  i) Deger ==> Ayni


        */
         String s = "Tom";
         String t = "Terry";
         String r = new String("Tom");
         String m = "Tom";
        System.out.println(s==t);//false çünkü; adres'ler ve değerler farklı
        System.out.println(s.equals(t));//false cunku; değerler farklı

        System.out.println(s==r);//false çünkü adresler farklı
        System.out.println(s.equals(r));//true çünkü equals method adreslere bakmaz

        System.out.println(s==m);//true
        System.out.println(s.equals(m));//true



    }
}
