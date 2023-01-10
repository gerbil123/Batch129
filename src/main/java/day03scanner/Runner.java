package day03scanner;

public class Runner {

    public static void main(String[] args) {

        Student tomHanks = new Student ();
        System.out.println(tomHanks.name);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.address);

        tomHanks.study();

        tomHanks.feed();

    }
}

        //Student class'ından bilgileri alıp da çalıştırıyo.