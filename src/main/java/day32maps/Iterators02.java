package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");
        //Example 1:Iterators kullanara List elemanlarini tersten console'a yazdiriniz

        ListIterator<String> itr= myList.listIterator();
        // hasPrevious() methodu, pointer'dan önce eleman varsa true, yoksa false return eder.
        // previous ()methodu, pointer'ı bir önceki elemanın sonuna koyar ve üstünden atladığı elemanı return eder.
        while(itr.hasNext()){
            itr.next();
        }
        while(itr.hasPrevious()){
           String el= itr.previous();
            System.out.print(el+" ");
        }

        //Example 2:Listteki tum elemanlari siliniz
        while(itr.hasNext()){
            itr.next();
            itr.remove();
        }
        System.out.println(myList);

        /*
    1) ListIterator da i)hasNext() ii)next() iii)set() iv)hasPrevious() v)previous() vi)remove() method'ları vardır.

    2) Iterator'da i)hasNext() ii)next() iii)remove() method'ları vardır.
 */
        //Eger iki tarafli haraket etmek istemiyorsan Iterator
        //Eger list elemanlarinin degistirilmesini istemiyorsak Iter
        //Eger sadece silmek istemiyorsani Iterator

        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");
        Iterator<String> iterator=yourList.iterator();

        while(iterator.hasNext()){
            String el=iterator.next();
            System.out.print(el);
        }


    }
}
