package practice.practiceDTNT03;

import java.util.Arrays;

public class C03_KelimeleriTersSıralıArray {

     /*
        Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
        Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
        tersine çevirmek için kod yazınız.
        Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
                */
    // O    D   E   V  \\
     public static void main(String[] args) {


    String str = "Kemal Can Kuzu";
    String arr[] = str.split(" ");
    System.out.println(Arrays.toString(arr));

    int idx = 0;
    String [] brr = new String[arr.length];
    for (int i = arr.length-1; i >=0 ; i--) {
        brr [i] = arr [idx];
        idx++;
    }
    System.out.println(Arrays.toString(brr));


    //2.YOL

         String str1= "       Kemal Can Kuzu         ";
         String crr[] =str.split(" ");
         String tersstr= "";

         for (int i = arr.length - 1; i >= 0;                 i--) {
             tersstr+=arr[i]+" ";

         }

         System.out.print("trim basta ise yaradimi");
         System.out.print(tersstr);
         System.out.println("trim sonda ise yaradimi");

         System.out.print("trim basta ise yaradimi");
         System.out.print(tersstr.trim());
         System.out.println("trim sonda ise yaradimi");









     }

}

