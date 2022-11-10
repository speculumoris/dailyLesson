package day05Ifstatement;

import java.util.Scanner;

public class IfStatement01 {


    public static void main(String[] args) {

        //: Kullanicidan alinan sayinnin tek mi cift mi oldugunu ekrana yazan kodu yaziniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sayiyi giriniz");
       // int s= scan.nextInt();

      // //1.yol
      // if (s%2==0){
      //      System.out.println("sayi cift sayidir");
      //  }


      // if (s%2!=0){
      //      System.out.println("sayi tektir");

      //  }
      // //2.yol
      // if (s%2==0){
      //     System.out.println("sayi cift sayidir");
      // }else {
      //     System.out.println("tek sayi...");
      // }
      //
        //example 2:bir sayinin negatif ,pozitif veya nötr oldugunu söyleyen kodu yaziniz.


        double d=scan.nextDouble();
        if (d>0){
            System.out.println("pozitiftir");
        }else if (d<0){
            System.out.println("sayi negatiftir");
        }else System.out.println("sayi notrdir");

    }
}
