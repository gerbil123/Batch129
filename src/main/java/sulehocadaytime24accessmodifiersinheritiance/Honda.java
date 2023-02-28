package sulehocadaytime24accessmodifiersinheritiance;

public class Honda  extends Car{

    public String renk;
    public Honda (){
        super("White",50000);//benim bir ustumdeki classsin methodunu al demek
    }
    public Honda(String renk){
        this.renk = renk;
    }
}
