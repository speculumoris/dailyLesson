package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //for loop kullanarak her elemanin sonuna "!" ekleyiniz
        ListIterator<String> itr= myList.listIterator();
       while (itr.hasNext()){
           String el=itr.next();
           itr.set(el+"!");
       }
        System.out.println(myList);
    }
}
