package day12forloopwhileloop;


import java.util.Scanner;

public class ZTekrar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz.");
        String word= input.next();
        String newWord = "";

        int k= 0;
        while(k<word.length()){
            newWord = newWord + word.charAt(k) + "*";
            k++;
        }
        System.out.println(newWord);
    }

}





