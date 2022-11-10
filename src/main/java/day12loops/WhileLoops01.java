package day12loops;

public class WhileLoops01 {
    public static void main(String[] args) {
//Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //2.yol
        int i = 3;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //example 2:17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
        int sayi = 17;
        while (sayi > 3) {
            if (sayi % 2 == 0) {
                System.out.print(sayi + " ");
            }

            sayi--;
        }
        System.out.println();
        //example 3:12 den 14 ye kadar sayilarin toplamini veren kodu yaziniz
        int tplm = 12;
        int sum = 0;

        while (tplm < 15) {
            sum = sum + tplm;

            tplm++;
        }
        System.out.println(sum);

        System.out.println();
        //Example 4: Size verilen bir tamsayini rakamlari toplamini ekrana yazdiran kodu yaziniz

        int sayi1 = 356;
        int sayi2 = 0;
        while (sayi1 > 0) {
            sayi2 = sayi2 + sayi1 % 10;
            System.out.println(sayi2);
            sayi1 = sayi1 / 10;
        }

        //example 5:Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        int s = 12;
        int n = 1;
        while (n < 11) {
            System.out.println(n + "x" + s + "=" + n * s);
            n++;
        }
        System.out.println();
    }
}
