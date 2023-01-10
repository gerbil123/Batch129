package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*
        Example 1:Asağıdaki kurallara göre kullanıcının girdiği password'u kontrol ediniz.
                i)En az 8 karakter olsun
                ii)Space karakteri password'de olmasın
                iii)En az bir tane büyük harf olsun.
                iiii)En az bir tane  küçük harf olsun.
                iiiii)En az bir tane sembol olsun.
               iiiiiii)En az bir tane rakam olsun.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu giriniz.");
        String pwd = input.nextLine();

        //i) En az 8 karakter olsun
        boolean first= pwd.length()>7;
        System.out.println(first);

        //i)Space karakteri password'de olmasın
        boolean second = !pwd.contains(" ");
        System.out.println(second);

        //i)En az bir tane büyük harf olsun.
        //Note: Buyuk harf olmayanları sil, kalan karakter sayısına bak, karakter sayısı sıfır ise buyuk harf yok demektir
        //Sıfırdan büyük ise buyuk harf var demektir.
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;//Hiç büyük harf olmayan şifre girerseniz sonuç sıfır çıkar
        System.out.println(third);                                             //0 0 ' dan büyük olamaz o yüzden false çıkar
                                                                                // methodları aynı satırda yan yana kullanmaya method chain denir

       //i)En az bir tane küçük harf olsun.
       boolean fourth= pwd.replaceAll("[^a-z]","").length()>0;//Ac123?Sd yazınca 2>0 oluyo ve true çıkıyo cevap.
       System.out.println(fourth);

       //i)En az bir tane sembol(harf ve rakam haric her şey) olsun.
        boolean fifth = pwd.replaceAll("[^a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);//Ac123?Sd olarak şifre girince ? işaretinden dolayı 1>0 durumuna geliyo ve true yazıyo

        //i)En az bir tane rakam olsun.
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);

        System.out.println("Password geçerli mi? "+(first && second && third && fourth && fifth && sixth));


    }
}
