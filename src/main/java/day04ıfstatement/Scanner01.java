package day04ıfstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //kullanicidan ilk ,orta ve soyismini aliniz ve kimlik numarasini aliniz asagidaki formatta ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);

       System.out.println("ilk isminizi giriniz...");
       String ilkIsim = scan.next();//next() methodu kullanicidan string datasi olmak icin kullanilir
       System.out.println("orta isminizi giriniz...");
       String ortaIsim = scan.next();
       System.out.println("soy isminizi giriniz...");
       String soyIsim = scan.next();
       System.out.println("kimlik numarasini giriniz");
       String kimlikNo= scan.next();
       System.out.println(ilkIsim+" "+ortaIsim+" "+soyIsim);
       System.out.println(kimlikNo);
       //2.yol:
        System.out.println("Ilk, orta ve soy isminizi giriniz...");
        String ilk= scan.next();
        String orta= scan.next();
        String soy= scan.next();
        String kimlik= scan.next();
        System.out.println(ilk+" "+orta+" "+soy);
        System.out.println(kimlik);

        /*
        next() ile nextline() farki nedir?
        next() methodu kullanicidan gelen String'in sadece ilk kelimesini alir
        nextLine() methodu kullanicidan gelen String'in tamamini alir.
                         */

        //3.yol
        System.out.println("Ilk, orta ,soy isminizi giriniz...");
        String tamIsim=scan.nextLine();

        System.out.println(tamIsim);
        System.out.println("Kimlik no giriniz");
        String kimlikNumarasi = scan.next();
        System.out.println(kimlikNumarasi);


    }
}
