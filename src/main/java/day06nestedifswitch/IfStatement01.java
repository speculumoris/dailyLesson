package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)

        //boundary Value analyze Test: SINIR DEGERLERİNİ ANALİZ EDEREK TEST ETME,
        // uygulamadaki istenen sinirlar uzerinden degerlendirme yapilir

        Scanner scan = new Scanner(System.in);
        System.out.println(" lutfen yasinizi giriniz");
        byte yas = scan.nextByte();

        if (yas<0){
            System.out.println("Gecerli yas giriniz");
        }else if (yas <5){
            System.out.println("Bebek");
        }else if (yas<13){
            System.out.println("Cocuk");
        }else if (yas <21){
            System.out.println("genc");
        }else if (yas <31){
            System.out.println("Yetiskin");
        }else {
            System.out.println("Tanimlanmamis");
        }




    }
}
