package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {
        //Example 1: 21'den 180' e kadar hem dört hemde 6 ile bölünebilen tam sayıları ekrana yazdıran kodu yazınız.
        for(int i=21 ; i<181 ; i++){
            if(i%6==0 && i%4==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Example 2: Size verilen küçük harfle yazılmış String'in indeks'i çift sayı olan karakterlerini büyük harf yapınız.
        //          ankara ==> AnKaRa (örnek)
        //Yazdıgınız code belli senaryolar için çalışıyor, tüm senaryolar için çalışmıyorsa bu code'a "Hard Code" denir
        //Hard Code yanlış yazılmış bir koddur. Mutlaka düzeltilmelidir.
        //Note:Bir String'de son indeks= lenght() -1 dir

        String s = "ankara";
        String t = "";

        for(int i =0 ; i<s.length(); i++ ){

            String ch = s.substring(i,i+1);
            t=t+ch;

            if (i%2==0){
                System.out.println(ch.toUpperCase());


            }
        }













    }
}
