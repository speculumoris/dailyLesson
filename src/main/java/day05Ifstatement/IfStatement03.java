package day05Ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    /*
    Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
     Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
    i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
    ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.


     */
    public static void main(String[] args) {
        //example1: Kullanicidan gun isimlerini aliniz,o günü haftasonu mu haftaici mi oldugunu kullaniciya söyleyniz


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gün ismini giriniz");
        String day = scan.next();

        if (day.equalsIgnoreCase("Pazartesi")) {
            System.out.println("haftaicidir");
        } else if (day.equalsIgnoreCase("Sali")) {
            System.out.println("haftaicidir");
        } else if (day.equalsIgnoreCase("Carsamba")) {
            System.out.println("haftaicidir");
        } else if (day.equalsIgnoreCase("Persembe")) {
            System.out.println("haftaicidir");
        } else if (day.equalsIgnoreCase("Cuma")) {
            System.out.println("haftaicidir");
        } else if (day.equalsIgnoreCase("Cumartesi")) {
            System.out.println("haftasonudur");
        } else if (day.equalsIgnoreCase("Pazar")) {
            System.out.println("haftasonudur");
        } else System.out.println("yanlıs giris yaptiniz");

        //2.yol
        if (day.equalsIgnoreCase("cumartesi") || day.equalsIgnoreCase("pazar")) {
            System.out.println("haftasonudur");
        } else if (day.equalsIgnoreCase("Pazartesi") || day.equalsIgnoreCase("Sali") ||
                day.equalsIgnoreCase("Carsamba") ||
                day.equalsIgnoreCase("Persembe") ||
                day.equalsIgnoreCase("Cuma")) {
            System.out.println("haftaicidir");
        } else {
            System.out.println("gecerli bir gun giriniz");
        }

        //3.yol
        boolean haftaSonu = day.equalsIgnoreCase("cumartesi") || day.equalsIgnoreCase("pazar");
        boolean haftaIci = day.equalsIgnoreCase("Pazartesi") || day.equalsIgnoreCase("Sali") ||
                day.equalsIgnoreCase("Carsamba") ||
                day.equalsIgnoreCase("Persembe") ||
                day.equalsIgnoreCase("Cuma");
        if (haftaSonu) {
            System.out.println("haftasonudur");
        } else if (haftaIci) {
            System.out.println("Hafta ici ...");
        }else {
            System.out.println("gecerli bir gun giriniz");
        }





}
}