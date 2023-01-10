package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a = 12; //Bu yapının içinde sadece bir tane data depolanabilir.
        //Ama biz code yazarken bir yapının içinde coklu data depolama ihtiyacı hissederiz.
        //Bir yapının içide coklu data depolayabilme için Java "Array" yapısını oluşturmuştur.
        /*
            IT'de yeni bir sey ogrenirken;
            i) "Ne? Nedir?" oldugunu ogren
            ii) "Neden var? Nicin var?" oldugunu ogren
             iii) "Simple Implementation - Basit Uygulama"
            "Mid-Level Implementation - Orta Duzey Uygulama"
            "Advance-Level Implementation - Ileri Duzey Uygulama"
            "Project-Level Implementation - Proje Duzeyinde Uygulama"
            yapmak lazim.

            Piyasadakiler simple'da takilir. Siz simple-mid arasi levelde takilirsaniz ise girersiniz, dedi
            */
        //Array nasıl oluşturulur?
        //Array oluşturmak için "Array elemanlarının "data type"i ve "eleman sayısı" mutlaka yazılmalıdır.
        String stdNames [] = new String[5]; //Köşeli parantez koymamız lazım array olması için


        //Array console'a nasıl yazdırılır.
        //toString() method'unu kullanmadan sadece array ismi ile yazdırırsanız Java o Array'in adresini yazdırır.
        System.out.println(Arrays.toString(stdNames)); //[null, null, null, null, null]

       //Array'e eleman ekleme nası yapılır.
       stdNames[2]= "Ajda";
        System.out.println(Arrays.toString(stdNames)); //[null, null, Ajda, null, null] (Stringler indeks kullanır 0,1,2,3,4,5)

        stdNames[0]="Cuneyt";

        stdNames[3]="Ezel";

        stdNames[4]="Beşir";

        stdNames[1]="Kemal";
        System.out.println(Arrays.toString(stdNames));//[Cuneyt, Kemal, Ajda, Ezel, Beşir]

        //Array'dan spesifik bir elemanı almak
        System.out.println(stdNames[2]); //Ajda

        //Example 1: Array'deki her elemanı sonuna ünlem işareti koyarak ekrana yazdırınız.
        for (int i=0; i<stdNames.length; i++){
            System.out.println(stdNames[i] + "!");
        }

    }
}
