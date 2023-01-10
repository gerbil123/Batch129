package day19listsvarargs;

public class Varargs01 {
    public static void main(String[] args) {
        /*
        Varargslar method oluştururken parametre sayısında bize esneklik sağlar.
        Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
        Method'un parantezleri icine yazilanlara "parametre" denir
        Method'u cagirirken kullanilan sayilara da "argument" denir.
        Bir methodda birden fazla varargs parametre kullanılamaz çünkü ikincisi "UNREACHABLE CODE " olur
        Note: Varargs, varargs dışındaki parametlerle kullanılabilir ama varargs her zaman son parametre olmalıdır.

         */

        addTwoNumbers(3,5);
        addThreeNumbers(4,7,2);
        add(4,5,6,7,8,9,11);//istediğin kadar sayıyı yazabilirsin hepsini toplar.
    }
    //İki sayıyı toplayan method oluşturunuz.
    public static void addTwoNumbers(int a ,int b ){
        System.out.println(a+b);
    }
        // Uc sayıyı toplayan method oluşturunuz.
     public static void addThreeNumbers(int a, int b , int c){
         System.out.println(a+b+c);
     }

     //İstediğiniz sayıda sayıyı toplamak için bir method oluşturunuz.
    public static void add(int...a){ // "..." varargs demektir.
        int sum =0;
        for (int w: a ){
            sum = sum+w;
        }
        System.out.println(sum);
    }

    public static void add (String s, int...a){//2 tane varargs kullanılamaz ama böylr bi kullanım vardır.
                                                //kullanıcı 's' ye ne değer atarsa 'a' nın içine gider.
    }                                              //ama int ... a 'yı başa yazamayız, her zaman son parametre olmalıdır.

}
