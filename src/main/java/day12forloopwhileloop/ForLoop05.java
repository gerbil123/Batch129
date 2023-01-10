package day12forloopwhileloop;

public class ForLoop05 {
    public static void main(String[] args) {

        //Example 1:Hiç sayı kullanmadan 1'den 100 ' kadar olan sayıları console'a yazdırınız.

        for (int i='d'/'d' ;i<='d';i++){  //Charlar matematiksel işlemlerde kullanılırsa Java onların ascıı değerlerini hesaba katar.
            System.out.print(i +" ");        //'d' ascii değeri 100dür
        }
        //Note1: Bazı loop'lar hiç çalışmayabilir.
        for(int i=1; i<0 ;i--){ //1<0 dediği için loop çalışmaz bu duruma ZERO EXECUTION denir.
            System.out.println("Hi!");
        }

        //Note 2: Bazı Loop'lar sonsuz defa çalışabilir. Bu tarz loop'lara "İNFİNİTE LOOP" denir.
        /*
        "Infınıte(Sonsuz) Loop genellikle increment/decrement kısmında yapılan hatadan kaynaklanır.
        for(int i=1 ;i<10; i--){
            System.out.println("Java is money...");

         */
        //Note 3: Başka bir "İnfinite (Sonsuz) Loop"
        //Note: Loop oluşturdugunuzda ikinci kısmı yazmazsanız infinite loop olur.
        //for(int i=1;     ;     ){




    }
}
