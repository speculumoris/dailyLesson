package day04ıfstatement;

import java.util.Scanner;
import java.util.SortedMap;

public class Scanner02 {

    /*
   Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
     Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
Note: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi ii)Birlestirme Islemi(Concatenation)
      Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.
     */


    public static void main(String[] args) {
        //kullanicidan ilk ve soy ismini aliniz, ilk ve soyisminin ilk harflerini ekrana yazdiriniz
        //   Ali Can

        //1.yol
        Scanner scan = new Scanner(System.in);
       // System.out.println("lütfen isminizi giriniz...");
       // char ilk = scan.next().charAt(0);
       // System.out.println("lutfen soyisminizi giriniz");
       // char son = scan.next().charAt(0);
       // System.out.println("" + ilk + son);

        //2.yol:
        System.out.println("tam isminizi giriniz...");
        String tamIsim = scan.nextLine();//Ali Can

        char ilkharf = tamIsim.charAt(0);

        System.out.println(ilkharf);

        char soyIsminIlkHarfi =tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);
    }
}
