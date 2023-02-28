package practice.daytime08;

public abstract class TSE {

    String malzeme="Undan yapılır.";
    abstract void gramaj500();//child'ler uymak zorunda
    abstract void hijyenikOlma();

    void odunAtesindePiser(){
        System.out.println("TSE ekmekler odun atesinde piser.");
    }
    void fiyat(){
        System.out.println(15 + "TL");
    }




}
