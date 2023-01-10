package sulehocadaytime11loops;

public class C04_ForLoop {
    public static void main(String[] args) {

        //Example: 1'den 100 e kadar 6 ile bölünenler hariç tum tamsayıları
        //ekrana yazdırınız.

        for (int i = 1; i <101 ; i++) {
            if (i%6==0){
              continue;
            }
            System.out.println(i + " ");
        }

        //INTERWİEW
        //Size verilen bir String'i ters çeviren kodu yazınız.

        String str = "Mustafa";
        String ters = "";//yeni bir konteyner oluşturdum
        for (int i = str.length()-1; i >-1 ; i--) {
            char harf= str.charAt(i);
            //ters=ters+harf;   böyle de olabilir
            ters+=harf; //tercih edilen yazım şekli

        }
        System.out.println(ters);
            //ÖDEV KENDİ İSMİNİ TERSTEN YAZDIR




















    }
}
