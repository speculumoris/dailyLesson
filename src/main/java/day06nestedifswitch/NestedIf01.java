package day06nestedifswitch;

import java.util.Scanner;

public class NestedIf01 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Password'un ilk harfi buyuk harf ise
        'A' olursa gecerli password aksi halde gecersiz password
        Password'un ilk harfi kucuk harf ise
        'z' olursa gecerli pasword aksi halde gecersiz password
         */

        System.out.println("lutfen sifrenizi giriniz");
        String sifre = scan.nextLine();
        char firstLetter = sifre.charAt(0);
        if (firstLetter >= 'A' && firstLetter <= 'Z') {

            if (firstLetter == 'A') {
                System.out.println("sifre gecerli");
            } else System.out.println("sifre gecersiz");

        } else if (firstLetter >= 'a' && firstLetter <= 'z') {

            if (firstLetter == 'z') {
                System.out.println("sifre gecerlidir");
            } else System.out.println("sifre gecersizdir");

        } else System.out.println("lutfen baslangıcı harf olan gecerli bir sifre giresiniz");

    }
}
