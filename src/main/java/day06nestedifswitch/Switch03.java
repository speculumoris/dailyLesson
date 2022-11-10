package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        //note:Switch'de sadece int ,byte,short ,char ve String kullanilabilir

        //kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran basit bir hesap makinesi yapiniz
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen girmek istediginiz islemi giriniz:+,-,/,*,%");
        char islem= scan.next().charAt(0);
        System.out.println(" lutfen 1. sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println(" lutfen 2. sayiyi giriniz");
        int sayi2=scan.nextInt();
        switch (islem){
            case '+' :
                System.out.println("islemin sonucu :"+sayi1+sayi2);
                break;
            case '-':
                System.out.println("islemin sonucu :"+(sayi1-sayi2));
                break;
            case '/':
                System.out.println("islemin sonucu :"+sayi1/sayi2);
                break;
            case '*':
                System.out.println("islemin sonucu :"+sayi1*sayi2);
                break;
            case '%':
                System.out.println("islemin sonucu :"+sayi1*sayi2/100);
                break;
            default:
                System.out.println("gecerli bir islem giriniz");

        }
    }
}
