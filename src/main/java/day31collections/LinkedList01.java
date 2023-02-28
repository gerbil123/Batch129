package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    /*
    1)interface'lerden object olusturulamaz cunku interface'lerın constructor'i yoktur.
    2)Abstract Class'lardan object olusturulamaz, constructor'ları vardır ama constructor object olusturmada kullanılamaz.
    3)interface'lerin constructor'ları olmadıgından collection olusturuken interface isimleri "new" keyword'unden sonra kullanılamaz.
    4)class--> class==> extends
      class--> interface ==>implement
      interface --> interface ==> extends
      interface --> class ==> Bu mumkun degıldir.
     5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
        yapilacaksa ArrayList kullanmak tavsiye edilmez.
        LINKEDLIST ==> Eleman silme-ekleme cok basarilidir. Index kullanmaz.
     6)LinkList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkList
        leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
        durumlarda LinkedList kullanmak tavsiye edilir.
     7)LinkedList'lerde eleman yerine "Node" kelimesi kullanilir. En bastaki Node'a "Head", en sondaki Node'a "Tail" denir.
     8)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
     9)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
        bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.
     */

    public static void main(String[] args) {

        List<String>cityNames = new LinkedList<>();

        LinkedList<String> names = new LinkedList();
        names.add("Steve");
        names.add("Ajda");
        names.add("Rej");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names);//[Steve, Ajda, Rej, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names);//[Cuneyt, Steve, Ajda, Rej, Megan, Brandon]

        names.addLast("Ajda");//addLast  add method'uyla aynı işi yapar.
        System.out.println(names);//[Cuneyt, Steve, Ajda, Rej, Megan, Brandon, Ajda]

        names.add(3,"Suleyman");//3. index'e süleymanı ekledi.
        System.out.println(names);//[Cuneyt, Steve, Ajda, Suleyman, Rej, Megan, Brandon, Ajda]

        names.remove("Ajda");//ilk gördüğü ajdayı siler sonuncuya dokunmaz.
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Rej, Megan, Brandon, Ajda]

        names.remove(4);//4. index'te olan megan gitti.
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Rej, Brandon, Ajda]

        names.add("Suleyman");//en sona süleyman ekler.
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Rej, Brandon, Ajda, Suleyman]

        String r1 = names.remove();
        System.out.println(r1);//silmiş oldugu elemanı verir. Cuneyt
        System.out.println(names);//ilk elemanı siler.[Steve, Suleyman, Rej, Brandon, Ajda, Suleyman]

        //names.removeLast(); //son elemanı siler.
        names.removeFirstOccurrence("Suleyman");
        System.out.println(names );//suleymanın ilk görünümü gidicek en sondaki süleyman durur [Steve, Rej, Brandon, Ajda, Suleyman]

        //remove() ile peek() arasındaki fark ==> remove() ->remove siler ve gosterir   peek()-> gosterir silmez
        String r2 = names.peek();
        System.out.println(r2);//Steve
        System.out.println(names);//[Steve, Rej, Brandon, Ajda, Suleyman]

        //names.peekLast();//son elemanı silmeden size verir

        //names.poll();//siler verir cut paste yapar.
        //remove() bos LinkedList'te kullanılırsa hata verir, poll() bos LinkedList'te kullanılırsa null verir

        //Pop removes and returns the first element of this list.(Cut + Paste)
        //This method is equivalent to removeFirst().
        String a =names.pop();
        System.out.println(a);//Steve
        System.out.println(names);//[Rej, Brandon, Ajda, Suleyman]
    }
}
