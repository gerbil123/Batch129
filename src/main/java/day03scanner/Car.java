package day03scanner;

public class Car {

    //Class ==> Variable(Pasif özellikler)==> Object
        //Method ( Aktif özellikler)

    public String model = "corolla"; // pasif özellikler Variable
    public int fiyat = 200000;

    //Note return type void ise return kelimesi kullanılmaz.



    public static void main(String[] args) {

     //Class ismini yazın , objeye isim verin  Atama operatörü  new keywordunu kullanın  ,  Constructor
        Car                     myCorolla           =                     new                     Car();
        System.out.println(myCorolla.fiyat);
        System.out.println(myCorolla.model);
        myCorolla.hareket();
        myCorolla.dur();





    } // main ' in bodysi
    public void hareket (){
        System.out.println("Toyota hızlı hareket eder");

    }
    public void dur (){
        System.out.println("Toyota güvenle durur");

    }


} //class bodysi
