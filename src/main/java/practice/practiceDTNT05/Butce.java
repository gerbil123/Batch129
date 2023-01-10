package practice.practiceDTNT05;

public class Butce {


        // Tum aile uyelerinin birikiminin bulundugu ortak ihtiyaclar icin
        // kullanildigi bir butce ile kisisel harcamalarin yapildigi
        // harclik'larin oldugu basit bir ev bütçesi kodu yazınız.


        public static int butce;

        public int  harclik;



        public void harclıkAl(int alınanHarçlık){
                butce-=alınanHarçlık; //ortak hesaptan harcanıyo
                harclik+=alınanHarçlık;
        }

        public void butcedenHarca(int harcanacakPara){
                butce-=harcanacakPara;
        }

        public void harclıkHarca(int harclikHarcaması){
                harclik-=harclikHarcaması;
        }
        public void maasAl(int alınanMaas){
                butce+=alınanMaas;
        }



}
