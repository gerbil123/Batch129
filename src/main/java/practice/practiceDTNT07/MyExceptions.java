package practice.practiceDTNT07;

public class MyExceptions extends Exceptions{
    static final String str = "Sen değerlisin";
    public MyExceptions(String str){
        super(str);
        System.out.println("Oyun oynadı ");
    }
    public MyExceptions(){
        super(str);

    }
}
