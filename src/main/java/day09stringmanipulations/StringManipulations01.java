package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {
        String str= "Kara kara dusunme Ankara";

        //indexof() method'u verilen character veya characterlerin "ilk gorunumunun" index'ini verir.
        int idxA1=str.indexOf("kara");
        System.out.println(idxA1);

        //lastIndexOf() methodu'u verilen character veya characterlerin "son gorunumunun" indexini verir
        int idxA2 =str.lastIndexOf("kara");
        System.out.println(idxA2);

        String s = "Mississippi";

       int idxi= s.indexOf('i');//indexOf() hem string hem de char ile kullanilabilir
        System.out.println(idxi);

       int idxIss1= s.indexOf("iss");//ilk görünümünün ilk karakterini verir
        System.out.println(idxIss1);

        int idxIss2 =s.lastIndexOf("iss");//son görünümünün son karakterini verir.
        System.out.println(idxIss2);

        //Example 1: Bir String'deki bir character'in tekrarli veya tekrarszi olup olmadigini gosteren kodu yaziniz
        //           "Helloooo" ==> H->Tekrarsiz  e--> tekrarsiz l-->tekrarli o-->tekrarli

        String t="Helloooo";
        char c ='H';

        if (t.indexOf(c) == t.lastIndexOf(c)) {
            System.out.println("tekrarsiz");
        }else {
            System.out.println("tekrarli");
        }
        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar character'i gectikten sonra istenen character'in
        //ilk gorunumunun indexini return eder
        String u ="Learn Java earn money";

        int sonuc =u.indexOf("a",5);
        System.out.println(sonuc);

        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabule edip en bastan
        // bu indexe kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf() method'unu sadece bu kutu icindeki String icin kullaniniz.
        String m = "Hello everyone!";
        int e = m.lastIndexOf("e", 10);
        System.out.println(e);//8


        String v="";
       boolean bosMu=  v.isEmpty();
        System.out.println(bosMu);

        String x ="";

        boolean blankMi=x.isBlank();
        System.out.println(blankMi);


        //example 2: Kullanicidan alinan isim mutlaka spaceden farkli en az bir karakter icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ilk isminizi giriniz");
        String ilk=input.nextLine();
        if (ilk.isBlank()){
            System.out.println("sana ismini gir dedim");
        }else System.out.println(ilk);



    }
}
