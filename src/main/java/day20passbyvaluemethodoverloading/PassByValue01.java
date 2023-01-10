package day20passbyvaluemethodoverloading;

public class PassByValue01 {

    /*
    1)Java "pass by value" sayesinde variable'ların orjinal değerlerini koruma altına alır.
     */

    public static void main(String[] args) {

        double shirt =100;
        double studentShirtPrice = discount("student", shirt);
        double veteranShirtPrice = discount("veteran", shirt);
        double seniorShirtPrice = discount("senior", shirt);

        System.out.println("shirt = " + shirt);//100.0 orjinal değer

        System.out.println(studentShirtPrice);//90.0  //discount'un önüne doubleShirtPrice yazmasaydım 90.0 göremezdim.
        System.out.println(veteranShirtPrice);//80.0
        System.out.println(seniorShirtPrice);//95.5

        shirt = discount("veteran",shirt);//tüm fiyatları gazilerin fiyatına dönüştürülmesi( bu kod süreli yazılabilir)
        System.out.println(shirt);//80.0
    }
    public static double discount(String state, double price){
        switch (state){
            case "student":
                price = price *0.90;
                break;
            case "veteran":
                price=price*0.80;
                break;
            case "senior":
                price=price*0.95;
               break;
            default:
                price=price;
        }
        return price;
    }
}
