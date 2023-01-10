package day15arrays;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Ztekrar {
    public static void main(String[] args) {

        //Example 1: String Array elemanlarini character sayisina gore kucukten buyuge siralayiniz.
        //          ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Tom", "Ajda", "Thomas", "Michael"]

        String arr[] = {"Michael" , "Ajda" , "Thomas" ,"Tom"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,Comparator.comparingInt(String::length).reversed());



    }
}
