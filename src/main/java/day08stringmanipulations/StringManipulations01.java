package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        //example 1: Kullanicidan aldiginiz isimin ilk ve son harfini ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);
        //System.out.println("lutfen isminizi giriniz");
        //String isim =scan.next();

        //1. yol
       //char ilkHarf = isim.charAt(0);

       //char sonHarf=isim.charAt(isim.length()-1);//yazdiginiz kod sadece bazi durumlar icin calisirsa o koda hard coding denir.-"hard coding" code degildir
       //                                          //Yazdiginiz code her durum icin calisirsa o code'a "dynamic code"denir
       //System.out.println(""+ilkHarf+sonHarf);

        //2.yol
      //String il = isim.substring(0,1);

      //String son =isim.substring(isim.length()-1);

      // System.out.println(il+son);

        //example 2 :verilen string'deki sadece hayvan isimlerini ekrana yazdiriniz
        //          "Ben kedi esim tavuk oglum inek sever"

        String str="Ben kedi, esim tavuk, oglum sever inek";
        //substring() in iki kullanimi vardir.
        //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
        //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar
        String hayvanIsimleri=str.substring(4,8)+" "+str.substring(15,20)+" "+str.substring(34);
        System.out.println(hayvanIsimleri);


        //example 3: Ilk ismi ve soy ismi iceren isimlerden ilk ve soyisimlerin basharflerini ekrana yazdiriniz
        //          Ali Can ==>  AC             Tahsin Yurdakul ==> TY

        System.out.println("ilk ve soy isminizi giriniz...");
        String tamIsim = scan.nextLine();
        String a = tamIsim.substring(0,1);
        String b =  tamIsim.split(" ")[1].substring(0,1);
        System.out.println(a+b);

    }
}
