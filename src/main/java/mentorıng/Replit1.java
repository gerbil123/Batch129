package mentorıng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Replit1 {
    public static void main(String[] args) {


        for (int i = 1; i <=8 ; i++) {
            for (int j = 7; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j =1; j <2*i ; j++) {
                System.out.print("*");
            }System.out.println();
        }
        for (int i = 7; i >=1; i--) {
            for (int j = 8; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <2*i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

/*
            /*
            Şekli Yazdırınız:

              1 2 3 4 5 6
               2 3 4 5 6
                3 4 5 6
                 4 5 6
                  5 6
                   6
            */


            for (int i = 1; i <= 6; i++) {

                for (int bosluk = 1; bosluk < i; bosluk++) {//Boşluk Kontrolü
                    System.out.print(" ");
                }

                for (int j = i; j <= 6; j++) {//Sütun Kontrolü
                    System.out.print(j + " ");
                }

                System.out.println();//Satır Kontrolü
            }
        }
    }























