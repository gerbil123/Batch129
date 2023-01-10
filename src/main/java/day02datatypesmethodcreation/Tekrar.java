package day02datatypesmethodcreation;

public class Tekrar {
    public static void main(String[] args) {
        //Dikdörtgenim alanını hesaplayan methodu oluşturunuz.

        double dAlan = dikDortgenAlan(5,10);
        System.out.println(dAlan);

        long dCevresi = dikDortgenCevresi(5,10);
        System.out.println(dCevresi);

        double daCevresi = daireCevresi(10,3.14);
        System.out.println(daCevresi);

        double daAlanı = daireAlanı(20,3.14);
        System.out.println(daAlanı);

        long mProblems = mathProblem(5,10, 15, 20);
        System.out.println(mProblems);
    }




    public static double dikDortgenAlan(double a, double b){
        return a*b;
    }

    private static long dikDortgenCevresi(int a, int b){
        return 2*(a+b);
    }

    protected static double daireCevresi(double r, double π){
        return 2*π*r;
    }

    static double daireAlanı(double r, double π){
        return π*r*r;





        }

    private static long mathProblem(int a, int x, int z, int y){
        return (x*a)/2+(y+z);
    }






}
