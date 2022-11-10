package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.print("lutfen 1.sayiyi giriniz :");
        double sayi1= scan.nextDouble();
        System.out.print("lutfen 2.sayiyi giriniz :");
        double sayi2=scan.nextDouble();
        double toplama=sayi1+sayi2;
        System.out.println(toplama);
    }
}
