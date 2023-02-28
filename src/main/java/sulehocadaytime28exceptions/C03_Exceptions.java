package sulehocadaytime28exceptions;

public class C03_Exceptions {


    /*
    3)ArrayIndexOutOfBoundExceptions
     */
    //Bir String Array'den verilen index'deki datayı döndüren method olusturun.
    public static void main(String[] args) {

        String arr[]={"Ali","Can","Tarık","Ayse"};

        getElementFromArray(arr,2);//pozitive scenario
        getElementFromArray(arr,0);//pozitive scenario
        getElementFromArray(arr,4);//negative scenario
    }//main


    private static void getElementFromArray(String[] arr, int i) {
        try {
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array'in index'inde olmayan data istendi " + e.getMessage());
            e.printStackTrace();
            System.err.println("burası renkli");
        }


    }//method

}//class
