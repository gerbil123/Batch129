package sulehocadaytime11loops;

public class C03_ForLoop {
    //INTERWİEW QUESTIONS
    public static void main(String[] args) {

        //String karakterleri teker teker yazdıran;
        //Eğer 'a' karakterini görürse yazdırmayı durduran kodu yazınız.
        
        String cumle = "Öğrenmek yasamın tek kanıtıdır.";

        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.charAt(i)=='a'){
                break;
            }
            System.out.print(cumle.charAt(i)+" ");
        }















    }
}
