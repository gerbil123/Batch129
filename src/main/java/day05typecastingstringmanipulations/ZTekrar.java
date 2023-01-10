package day05typecastingstringmanipulations;


import java.util.Scanner;

public class ZTekrar {
    public static void main(String[] args) {
       /*
       String Manipulations
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu giriniz...");
        String pwd = input.nextLine();
        //En az 8 karakter olsun.
        boolean first = pwd.length()>7;
        System.out.println(first);

        //Space karakteri olmasın
        boolean second = !pwd.contains(" ");
        System.out.println(second);

        //En az bir tane büyük harf olsun
        boolean thırd = pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println(thırd);

        //En az bir tane küçük harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println(fourth);

        //En az bir tane sembol harf olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);

        //En az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);


        System.out.println("Password geçerli mi?"+ (first && second && thırd && fourth && fifth && sixth));










    }
}
