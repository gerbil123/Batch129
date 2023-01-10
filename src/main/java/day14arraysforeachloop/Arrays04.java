package day14arraysforeachloop;

public class Arrays04 {
    public static void main(String[] args) {

        //Example 1: String bir array oluşturunuz, 6 eleman ekleyiniz. Yellow'dan önceki elemanları yazdırınız.
        String colors[]= new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        for(String w: colors){
            if(w.equals("Yellow")){
                break;
            }
            System.out.println(w);//Red, Orange, Blue.
        }

        //Example 2: String bir array oluşturunuz. Yellow'dan sonraki elemanları yazdırınız.
        //For-each-loop her zaman baştan başlar burda sondan başlanması gerektiği içim for loop kullandık.
        String color[]= new String[6];
        color[0] = "Red";
        color[1] = "Orange";
        color[2] = "Blue";
        color[3] = "Yellow"; //İndeks'i 3
        color[4] = "Green";
        color[5] = "Brown";
        //1.YOL

        for (int i= color.length-1;i>=0; i--){
            if (color[i].equals("Yellow")){
                break;
            }
            System.out.println(color[i]);//Brown, Green
        }

        //2.YOL
        //Yellow elemanının indeksini bul ve o indeksten daha büyük indekse sahip olan elemanları yazdır.

        int counter = 0;

        for(String w : color){

            if(w.equals("Yellow")){
                break;
            }
            counter++;
        }
        for (int i = counter+1; i<color.length; i++ ){
            System.out.println(color[i]);//Green Brown
        }

    }
}
