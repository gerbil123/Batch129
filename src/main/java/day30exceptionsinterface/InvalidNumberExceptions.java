package day30exceptionsinterface;

public class InvalidNumberExceptions extends RuntimeException {

    public InvalidNumberExceptions(String message){
        super(message);
    }
}
