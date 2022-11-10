package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
        /*
        //Asagidaki sekli ekrana yazdiran kodu yazinin
        // ****
        // ****
        // ****

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen satir sayisini giriniz");
        int satir=scan.nextInt();
        System.out.println("sutun sayisini giriniz");
        int sutun=scan.nextInt();

        System.out.println("karakter seciniz");
        char ch=scan.next().charAt(0);
        for (int i = 1; i <=satir; i++) {//dış "*" icin
            for (int j = 1; j <=sutun; j++) {//ic "*" icin
                System.out.print(ch);
             }
            System.out.println();
        }

        /*
        example 2:Asagidaki sekli cizen kodu yaziniz
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5


        for (int i = 0; i <=satir; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }

         */


        //        Example 3: Asagidaki sekil cizen kodu yaziniz
        //
        //                    * * * *
        //                    * * *
        //                    * *
        //                    *

        for (int i = 1; i <5 ; i++) {
            for (int j = 4; j >= i ; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }


        //Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A A A A A A A A
        //A X X X X X X A
        //A X X X X X X A
        //A X X X X X X A
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 9; j++) {
                if (i==1){
                    System.out.print("A ");
                }else
                    System.out.println(i=='A');

            }
            System.out.println();
        }


    }
}
