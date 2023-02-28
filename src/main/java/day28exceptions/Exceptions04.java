package day28exceptions;

public class Exceptions04 {
    public static void main(String[] args) {
        String arr[]={"A", "G", "M","L"};
        getElementFromArray(arr,1);
        getElementFromArray(arr,5);
        System.out.println("Hİ");
    }
    //Array'lerde olmayan bir index kullanildiginida java "ArrayIndexOutOfBoundsException" atar.
    public static void getElementFromArray(String []s, int idx){
        try {
            String el = s[idx];
            System.out.println(el);//G
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());//Index 5 out of bounds for length 4
            System.out.println(e.getCause());//null
        }
    }
}
