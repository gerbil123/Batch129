package practice.practiceDTNT05;

public class OverloadingHacim {

    public int hacimHesapla(int a){
        return a*a*a;//küpün formülü
    }

    public int hacimHesapla(int a, int b){
        return a*a*b;//küp formülü
    }

    public int hacimHesapla(int a, int b, int c){
        return a*a*c;//dikdörtgenprizma

    }
}
