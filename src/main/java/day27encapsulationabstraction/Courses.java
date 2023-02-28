package day27encapsulationabstraction;

public abstract class Courses {

    /*
    1)Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method oluşturmak gerekir.
        Body'si olmayan method'lara "abstrack method" lar denir.

    2) "abstrack method'lar child class'lar tarafından override edilmek zorundadırlar.
        Bu yüzden, eger bir fonksiyonun child class'lar tarafından kullanılmasını mecbur kılmak isterseniz
        o method'u abstrack yapmanız gerekir.

    3)Bir method'un body'sini silmek o method'un abstrack olması için yeterli değildir.
        acces modifier ile return type arasına "abstrack" koymamız gerekir.

    4)"abstrack method'lar" sıradan class'ların(concrete) icine yazılamazlar, abstrack method'ların icine yazıldıkları class'larda
    "abstract" olmak zorundadırlar.

    5) "abstract class'larda hem abstrack method'lar hemde concrete method'lar kullanılabilir.
    6)"concrete" class'lar "abstract" class'ların child'i olabilir.
       " abstract" method'ların "override" edilme zorunlulugu concrete class'lar icindir
     */

    public abstract void math();
    public void art(){
        System.out.println("Painting...");
    }
    //final method'lar overrite edilemezler, halbuki abstract method'lar override edilmek icin oluşturulurlar.
    //Bu celiskidir.Bu yüzden Java abstract method'ların final olmasına müsaade etmez.
    //public final abstract void science();

    //concrete class'lar final oldugunda child class'a sahip olamazlar.
    //Ama abstract class'lar icin child class olmalıdır, cünkü child  class'lar abstract parent class'daki
    //absract method'ları kullanırlar. Bu yüzden Java "Abstract class'ların final olmasına musaade etmez.
    //abstract method'lar private olamazlar cünku child class'lar abstract method'ları kullanırlar
    //private yapınca kullanıma kapalı  olur bu celiskidir.Bu yüzden Java abstract method'ların private olmasına müsaade etmez.

    //abstract method'lar static olamazlar, cunku static method'lar override edilemez, halbuki abstract methodlar override edilmek üzere olusturulmustur.
}
