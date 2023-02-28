package day32collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    /*
    "Queue'larda ilk giren ilk isleme girer.(First in First Out ==> Fıfo)
    Bazen de son gelen ilk isleme girer(Last in first out ==>Lifo)
    "Deque" ==>Double Ended Queue demek. İki uclu demek hem fifo çalısır hem lifo calısır.

    "Queue" bir interface'dir bu yüzden constructor'u yoktur bu yüzden object olustururken new keyword'unden sonra kullanılamaz.
     Data type'i "Queue" olan bir object olusturmak ıcın "new" keyword'unden sonra
     i)LinkedList veya ii) PriotrityQueue class'ları kullanılır.

     "Queue" olustururken constructor olarak "PriorityQueue" kullanırsanız elemanları kendi beliryeceğiniz kurala göre sıralama
     hakkınız olur.
     */

    public static void main(String[] args) {

    Queue <String>myQueue = new LinkedList();//queue ınterface oldugu için LinkedList yazdık
    myQueue.add("Milk");
    myQueue.add("Butter");
    myQueue.add("Jam");
    myQueue.add("Egg");
    myQueue.add("Luxury water");

        System.out.println(myQueue);//[Milk, Butter, Jam, Egg, Luxury water] LinkedList kullandıgım icin verdiğim sıraya göre yazdı.

        //Retrieves and removes the head of this queue,or returns null if this queue is empty.
        myQueue.poll();

        //İlk elemanı siler.Eğer boşsa exception atar.
        myQueue.remove();

        //İlk elemanı verir ama silmez. Queue bossa exception atar.
        myQueue.element();

        //İlk elemanı verir , silmez. Eğer boşsa null verir.
        myQueue.peek();

        /*
        poll() ile remove() ikiside ilk elemanı siler size verir.
        poll() bos queue'lar icin null verir, remove() ise bos queue'lar icin exception atar.
         */
        /*
        element() ile peek() ikiside ilk elemani silmeden size verir.
        peek() bos "Queue" lar icin "null" verir, element() ise bos "Queue" ler icin Exception atar.
        */

        //Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
        //When using a capacity-restricted queue, this method is generally preferable to add,
        // which can fail to insert an element only by throwing an exception.
        //Returns:true if the element was added to this queue, else false
        //Throws:
        //ClassCastException – if the class of the specified element prevents it from being added to this queue
        //NullPointerException – if the specified element is null and this queue does not permit null elements
        //IllegalArgumentException – if some property of this element prevents it from being added to this queue
        boolean r = myQueue.offer("Avocado");

        System.out.println(r);//true
        System.out.println(myQueue);//[Jam, Egg, Luxury water, Avocado]

        Queue<String> yourQueue = new PriorityQueue<>();
        yourQueue.add("Milk");
        yourQueue.add("Butter");
        yourQueue.add("Jam");
        yourQueue.add("Egg");
        yourQueue.add("Luxury water");

        System.out.println(yourQueue);//[Butter, Egg, Jam, Milk, Luxury water]
    }
}
