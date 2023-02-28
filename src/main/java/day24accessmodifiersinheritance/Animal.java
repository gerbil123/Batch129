package day24accessmodifiersinheritance;

public class Animal {

    /*
    Inheritance'in faydalari;               INTERWİEV QUESTION
    1) Code standardında tekrar iyi değildir.
    2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
    3) Gelişime update'e açık olmalıdır
    4) Code atomic yapıda olmalı.
    Note 1: "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
    Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
    Note 3: public method'lar child class'lar tarafından kullanılabilir.
            "child class'lar tarafından kullanılabilir" demek inherit edilebilir demektir.
    Note 4:protected method'lar inherit edilebilir.
        cunku protected olan method ve variable'lar child'lar tarafından kullanılır.
    Note 5: default method'lar object ile aynı package'de oldukları sürece inherit edilebilirler.
            ama default method ile object'in üretildiği class farklı package'lerde ise inherit edilemezler.
    Note 6: private method'lar inherit edilemezler.
    Note 7: Java 1'den fazla parent'i(multiple inheritance java tarafından desteklenmez.) onaylamaz.
    Note 8: Child==> Parent ==> Grand Parent ==> Grand Grand Parent... şeklinde ilerleyen ınheritance'lara "Multi level Inheritance" denir.
    Note 9: Java'da Object Class tum java class'larının ortak parent'idir.
    Note 10: Java'da object class haric tüm class'ların parenti vardır.
    Note 11: Java'da parent'dan "child"a olan ilişkilere "HAS A  relationship" denir.
             Java'da child'dan parent'e olan ilişkilere ise "İS A relationship" denir.
    Note 12: Java'da her class'ın bir tane default constructor'ı vardır.
            Bu default constructor class'ın icinde görünmez. Cünkü default constructor "Object Class" içindedir.
            Bizim class'ımız default constructor'a ihtiyac duydugunda parent olan "Object Class"a gider ve oradaki constructor'ı kullanır.
     */

    protected void eat(){
        System.out.println("Animal's eat");
    }
    public void drink(){
        System.out.println("Animal's drinks");
    }
}
