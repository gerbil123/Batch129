package day03scanner;





public class ZTekrar {

    public String model = "Corolla";
    public int fiyat = 200000;

    public static void main(String[] args) {

    Car myCorolla = new Car();
        System.out.println(myCorolla.model);
        System.out.println(myCorolla.fiyat);
        myCorolla.hareket();
        myCorolla.dur();

    }
    public void hareket(){
        System.out.println("Toyota hızlı hareket eder..");
    }
    public void dur(){
        System.out.println("Toyota güvenle durur");
    }


}
