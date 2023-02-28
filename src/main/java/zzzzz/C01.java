package zzzzz;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class C01  {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("AB");
        list.add("CD");
        list.add("EF");
        ListIterator<String>it = list.listIterator();
        if(it.nextIndex()==-1) {
            while(it.hasNext()) {
                System.out.print(it.next() + " ");
            }
        }else {
            System.out.print("Good Morn!ng!");
        }



    }
}









