package sulehocadaytime24accessmodifiersinheritiance;

public class Car extends Vehicle {

    public String renk;
    int km;

    public Car(){

    }

    public Car(String renk, int km) {
        this.renk = renk;
        this.km = km;
        System.out.println("Car Costructor'ı");
    }
}
