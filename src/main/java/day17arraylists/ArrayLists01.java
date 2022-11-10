package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);//[Tom, Thomas, Tahsin, Trump, Taceddin]
        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");


        names.removeAll(cities);//removeAll kullandiginizda sadece ilk list degisir parantein icindeki list degismez
        System.out.println(names);
        System.out.println(cities);

        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames);//Bir list in icinde coklu elemanlarin var olup olmadigini kontrol eder
        //hepsi varsa true en az biri yoksa false verir.
        System.out.println(sonuc1);

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        //Example 1:"a" listinde "Shoes" elemaninda ilk gorunumunu siliniz
        a.remove("Shoes");
        System.out.println(a);

        //Example 2:"a" listinde "Shoes" elemaninda tum gorunumunu siliniz
        List<String> shoes = new ArrayList<>();
        shoes.add("Shoes");

        a.removeAll(shoes);
        System.out.println(a);

        //Example 3= Bir tane salary list'i olusturun,eger Salar 10000 den az ise %20 10000 den cok ise %10 zam yapiniz
        List<Double> ssalary = new ArrayList<>();
        ssalary.add(12345.00);
        ssalary.add(8674.00);
        ssalary.add(15000.00);
        ssalary.add(9500.00);
        ssalary.add(20500.00);
        System.out.println(ssalary);

        for (Double w:ssalary) {
            if (w < 10000) {
                ssalary.set(ssalary.indexOf(w), w * 1.2);

            } else {
                ssalary.set(ssalary.indexOf(w), w * 1.1);
            }

        }
        System.out.println(ssalary);

        //example 4: Iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('a');
        n.add('z');

        //1.way
        int counter= 0;
        for (int i = 0; i < m.size(); i++) {
           if (m.size()!=n.size()){
               counter++;
               System.out.println("Listler esit degil");
               break;
           }
           else if (m.get(i)!=n.get(i)){
               counter++;
               System.out.println("listler esit degildir");
               break;
           }
        }
        if (counter==0){
            System.out.println("Listler esittir");
        }


       boolean esitMi= m.equals(n);
        if (esitMi){
            System.out.println("listler esittir");
        }else System.out.println("listler esit degildir");


    }
}
