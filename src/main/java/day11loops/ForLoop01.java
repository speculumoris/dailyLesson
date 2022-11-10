package day11loops;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
        //example 1:3 den 6 ya kadar tamsayilarin toplamini bulan kodu yaziniz
        int toplam=0;
        for (int i = 3; i <7 ; i++) {
           toplam=toplam+i;

        }
        //note=system.out.println(toplam) look un disina yazilirsa toplam'in sadece son degerini ekrana yazdirir
        //loop un icine yazilirsa her bir loop icin toplam'in hangi degerleri aldigini yazdirir.
        System.out.println(toplam);

        //esxample 2 = 6 dan 3 e kadar tamsayilarin carpii olan kodu yaziniz

        int carpim=1;
        for (int i=6; i>2;i--){
            carpim=carpim*i;
            System.out.println(carpim);
        }
        System.out.println(carpim);
        
        
        //example 3: size verilen bir tam sayinin rakamlari toplamini bulunuz

        int num= -385;
        int sonuc=0;
        for (int i = num; i >0 ; i=i/10) {
            sonuc=sonuc+i%10;
        }
        System.out.println(sonuc);
        //example 4: size verilen bir stringi ekrana ters ceviren kodu yaziniz;

        String str="kaba";

        String tersStr="";

        for (int i = str.length()-1; i >-1 ; i--) {

            String c=str.substring(i,i+1);

            tersStr=tersStr+c;
            System.out.println(tersStr);

        }
        System.out.println(tersStr);
        
    }
}
