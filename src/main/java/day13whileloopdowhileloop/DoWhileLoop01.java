package day13whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //While-loop
        int i = 1;

        while (i < 1) {
            System.out.println("Sen bir while loopsun...");
            i++;
        }
        //2) do-while loop
        int k = 1;
        do {
            System.out.println("Sen bir do-while-loop'sun..");
            k++;
        } while (k < 1);

        //do while 'da zero executıon mümkün değildir.
        //do while kullandıgınızda loop body en az bir kere çalışır.
        //while loop önce düşünür sonra hareket eder, do- while loop önce hareket eder sonra düşünür.
    }
}
