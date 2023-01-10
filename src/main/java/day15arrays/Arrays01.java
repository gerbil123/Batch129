package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {

        //Example 1: Kullanıcı ile beraber bir array oluşturunuz.

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç öğrenci ismi gireceksiniz.");
        int numOfElement = input.nextInt();

        String stdNames[] = new String[numOfElement];


        for (int i = 1; i <=numOfElement ; i++) {

            System.out.println("Lütfen " + i + " . ögrencinin adını giriniz.");
            String stdName = input.next();
            if (stdName.equalsIgnoreCase("Q")){
                break;
            }

            stdNames[i-1] = stdName;
        }
        System.out.println(Arrays.toString(stdNames));

    }
}
