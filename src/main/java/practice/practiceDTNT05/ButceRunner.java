package practice.practiceDTNT05;

public class ButceRunner {
    public static void main(String[] args) {

        Butce baba = new Butce();
        System.out.println("Maas öncesi bütce " +  Butce.butce);

        baba.maasAl(3000);
        System.out.println("Maas sonrası butce "  + Butce.butce);
        baba.harclıkAl(100);
        baba.harclıkHarca(20);
        baba.butcedenHarca(500);
        System.out.println(baba.harclik);//80
        System.out.println(Butce.butce);//2400


        Butce anne = new Butce();
        anne.maasAl(5000);
        anne.harclıkAl(500);
        anne.harclıkHarca(450);
        System.out.println(Butce.butce);//6900
        System.out.println(anne.harclik);//50


        Butce erkekCocuk = new Butce();
        erkekCocuk.harclıkAl(200);
        erkekCocuk.harclıkHarca(200);
        System.out.println(erkekCocuk.harclik);//0
        System.out.println(Butce.butce);//6700
    }
}
