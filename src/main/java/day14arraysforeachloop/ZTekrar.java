package day14arraysforeachloop;

import java.util.Arrays;

public class ZTekrar {
    public static void main(String[] args) {

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        for (String w : colors) {
            if (w.equals("Yellow")) {
               break;
            }
            System.out.println(w);


        }
    }
}