package sulehocadaytime11loops;

import java.util.Scanner;

public class C07_NestedLoop {
    public static void main(String[] args) {
        /*
        Type code to print the following image on the console
        Aşağıda gordüğünüz sekli console'da yazdıran kodu oluşturunuz
        X X X X X
        X X X X X
        X X X X X
                */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satır ve  sutun bilgisini giriniz.");
        int satır = input.nextInt();
        int sütun = input.nextInt();

        for (int i = 1; i <= satır ; i++) {
            String str = "";
            for (int j = 1; j <=sütun ; j++) {
            str = str + "X ";
            }
            System.out.println(str);

        }








    }
}
