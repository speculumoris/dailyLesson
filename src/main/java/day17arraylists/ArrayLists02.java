package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {
    public static void main(String[] args) {

        //Example 1: Verilen bir listteki elemanlari tekrarsiz olarak yaziniz
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        List<Integer> yeni = new ArrayList<>();

        for (int w : a) {
            if (!yeni.contains(w)) {
                yeni.add(w);
            }
        }
        System.out.println(yeni);

        //Example 2: Kullanicidan bir harf aliniz, harf sizdeki List'in icinde varsa o harfi "Bulundu" ya ceviriniz yoksa o harfi List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]
        Scanner scan = new Scanner(System.in);
        String harf="";
        List<String> k = new ArrayList<>();
        k.add("A");
        k.add("K");
        k.add("R");
        k.add("S");
        do {
            System.out.println("lutfen bir harf giriniz");
        harf = scan.next().substring(0, 1);

            if (k.contains(harf)) {
                k.set(k.indexOf(harf), "bulundu");
            } else if (!harf.equals("Q")){
                k.add(harf);
            }
            System.out.println(k);

        }while (!harf.equals("Q"));



    }
}
