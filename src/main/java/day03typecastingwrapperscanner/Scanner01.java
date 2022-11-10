package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {
    //Scanner kullanicidan data almaya yarar, Scanner kullanici ile etkilesim kurmamizi sağlar
    //Scanner bir Java class'idir, Bu Class'i kullanabilmek icin "import" etkmek gerekir.
    //Scanner Class'i Java'nin util kutuphanesidir.
    public static void main(String[] args) {

        //kullanicidan data almak icin yapilmasi gerekenler
        //1.adim: Scanner classından object olusturun.
        Scanner input=new Scanner(System.in);

        //2.adim:Kullaniciya ne yapacagini soyle
        System.out.println("Hey kullanici yasini gir...");

        //3.adim:Kullanicidan aldiginiz datayi bir variable'in icine koyun
        byte age= input.nextByte();

        System.out.println("Hey kullanici senin yasin :"+age);

    }

}
