package sulehocadaytıme31lambda;

public class Universite {
    private String unıversity;
    private String bolum;
    private int ogrenciSayısı;
    private int notOrtalaması;

    public Universite() {//parametresiz constructor
    }


    public Universite(String unıversity, String bolum, int ogrenciSayısı, int notOrtalaması) {
        this.unıversity = unıversity;
        this.bolum = bolum;
        this.ogrenciSayısı = ogrenciSayısı;
        this.notOrtalaması = notOrtalaması;
    }

    public String getUnıversity() {
        return unıversity;
    }

    public void setUnıversity(String unıversity) {
        this.unıversity = unıversity;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrenciSayısı() {
        return ogrenciSayısı;
    }

    public void setOgrenciSayısı(int ogrenciSayısı) {
        this.ogrenciSayısı = ogrenciSayısı;
    }

    public int getNotOrtalaması() {
        return notOrtalaması;
    }

    public void setNotOrtalaması(int notOrtalaması) {
        this.notOrtalaması = notOrtalaması;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "unıversity='" + unıversity + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrenciSayısı=" + ogrenciSayısı +
                ", notOrtalaması=" + notOrtalaması +
                '}';
    }
}
