package sulehocadaytime28exceptions;




public class C05_Exceptions {
    /*
    4)AritmeticExceptions
     */


    public static void main(String[] args) {
        divide(6,2);
        divide(6,0);
        divide2(12,0);

    }

    private static void divide2(int a ,int b) {
     try{
         System.out.println(a/b);
         System.out.println("Try kısmı calıstı");
     }catch (ArithmeticException yunus){
         yunus.printStackTrace();
         System.out.println("Bir sayı sıfıra bolunemez. " + yunus.getMessage());
         System.err.println("Bolmede bir hata oluştu");//serr
     }
    }

    private static void divide(int a, int b) {
        if (b==0){
            System.out.println("Bir sayı sıfır ile bölünemez.");
        }else
        System.out.println(a/b);
    }
}
