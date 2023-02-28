package practice.daytime08;

public class Browser {
    public static void main(String[] args) {

        String adresCubugu = "Her Browser'in adres cubugu vardır.";
    Edge edge = new Edge();
    edge.search();
    edge.sifreKaydetme();
    edge.get();

    Edge edge2 = new Edge(adresCubugu);
    System.out.println(edge2.adresCubugu);

    }

    public void get(){
        System.out.println("Browserler Web sayfasına gider.");
    }
    public void search(){
        System.out.println("Browserler aratma yapar.");
    }
    public void sifreKaydetme(){
        System.out.println("Browserler istenildiğinde sifre kaydeder.");
    }
}
