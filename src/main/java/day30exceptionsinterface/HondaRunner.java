package day30exceptionsinterface;

public class HondaRunner {
    public static void main(String[] args) {


        Civic myCivic = new Civic();
        myCivic.cool();

        System.out.println("Ac.price = " + Ac.price);//Ac.price = 2000
        //Ac.price = 7000; final variable'ya değer atayamazsın diyo
        System.out.println("Engine.price = " + Engine.price);//Engine.price = 3000
        System.out.println(Security.price);//4000

        System.out.println(Ac.model);//Mıtsubishi

        Accord myAccord = new Accord();
        myAccord.cool();


    }
}
