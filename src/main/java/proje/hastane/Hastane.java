package proje.hastane;

public class Hastane extends VeriBankası{
    private Doktor doktor;
    private Hasta hasta;

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }
    public Hastane() {
    }

    public Hastane(Doktor doktor, Hasta hasta) {
        this.doktor = doktor;
        this.hasta = hasta;
    }
}//class

