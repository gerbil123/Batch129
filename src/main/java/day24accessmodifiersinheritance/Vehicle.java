package day24accessmodifiersinheritance;

public class Vehicle {
    /*
    child class'dan bir object olusturdugumuzda Constructor'lar en ustteki parent class'dan
    baslatılarak alta doğru calıştırılır.
     */
    public Vehicle(){
        System.out.println("Vehicle 1 ");
    }
}
