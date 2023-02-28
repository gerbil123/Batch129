package sulehocadaytime28exceptions;

public class C02_Exceptions {

    /*
    2)StringOutOfBoundExceptions
     */
    //Bir String'in istediğimiz indexdeki datasını bize veren kodu yazınız.

    public static void main(String[] args) {
        char ch = getCharFromString("Hakan",5);// 5 yazdıgımızda hata alıyoruz nerde hata aldıgımızı da söylüyo
        System.out.println("ch = " + ch);               //3 yazsaydık sadece 3. indeks'dekini yazdıracaktı.
    }

    private static char getCharFromString(String str, int i) {
        char c = ' ';
        try {
            c = str.charAt(i);
        }catch (Exception e){
            System.out.println("kendi eklediğim e.getMessage() calıştı " + e.getMessage());
        }
        return c;

    }

}
