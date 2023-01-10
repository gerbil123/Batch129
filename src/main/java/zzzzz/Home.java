package zzzzz;

public class Home {

    String name ;
    int alan ;
    String renk;
    int kat;
    String adres;

   public Home(String name, int alan, String renk, int kat, String adres) {
      this.name = name;
      this.alan = alan;
      this.renk = renk;
      this.kat = kat;
      this.adres = adres;

   }

    @Override
    public String toString() {
        return "Home{" +
                "name='" + name + '\'' +
                ", alan=" + alan +
                ", renk='" + renk + '\'' +
                ", kat=" + kat +
                ", adres='" + adres + '\'' +
                '}';
    }

    public static void aidat(int ucret){
       int aidat = 200;

    }
}




