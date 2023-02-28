package day29exceptions;

public class Exceptions02 {
    /*
  "throw" ile "throws" keyword'leri arasindaki fark nedir?
  1)"throw" method body'si icinde, "throws" ise method parantezinden hemen sonra kullanilir.
  2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir.
     "throws" ise method parantezinden hemen sonra sadece bir kere kullanilabilir.
  3)"throw" dan sonra "new" keyword ve constructor kullanilarak object olusturulur.
    "throws" dan sonra sadece "Exception Class" ismi yazilir.
  4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra
     durdurur.
    */

    //throw da hata verir calısmaya devam eder. throws da hata verip calısmayı durdurur
    public static void main(String[] args)throws IllegalArgumentException,ArithmeticException {
        try {
            printAge(-18);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        //try {
            getMark(-25);
        //}catch (IllegalArgumentException e){
         //   System.out.println(e.getMessage());
        //}
    }

    //"throw" keyword bir method'un body'si icinde istediğimiz yerde, istediğimiz kosullar, istediğimiz kadar icin Exception atmamızı sağlar.
    //"throw" keyword yazıldıktan sonra bir Exception Class object'i olusturulur.
    //Exception Class constructor'ının parantezi icine istediğiniz Exception mesajını yazabilirsiniz.
    public static void printAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else
            System.out.println(age);
    }

    //Ogrenci notları girisi yapan ve notu console'a yazdıran bir method olusturunuz.
    public static void getMark(double d){
        if (d<0){
            throw new IllegalArgumentException("Marks cannat be less than zero");
        }else if(d>100){
            throw new IllegalArgumentException("Marks cannat be greater than hundred");
        }else
        System.out.println(d);
    }



}
