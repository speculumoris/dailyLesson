package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
/*
        // example 1:Kullanicidan bir sayi aliniz, sayi 100 den kucuk ise ekrrana kazandin yazdiriniz
        //aksi halde ekrana "kaybettin!" yazdiriniz;
        //kullanici kazandikca oyun devam etmeli.

        Scanner scan=new Scanner(System.in);
        int sayi =0;
        do {
            System.out.println("bir sayi giriniz");
            sayi= scan.nextInt();

            if (sayi<100){
                System.out.println("kazandiniz");
            }
        }while (sayi<100);
        System.out.println("kaybettiniz");

        //example 2: Kullanicidan ismini aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz.

        do {
            System.out.println("lutfen isminizi giriniz...");
            char  ilkHarf = scan.next().charAt(0);

            if (ilkHarf>='A' && ilkHarf<='Z'){
                System.out.println("ismi basariyla girdiniz");
            }else{
                System.out.println("ismi yanlis girdiniz isleminiz iptal edilmisitr");
                break;
            }
        }while(true);


        //Infinite Loop: Sonsuz dongu

        //artirma azaltma kisminda hata yaparsaniz "infinite loop sorunsali olusur
        for (int i =1;i<4;i--){
            System.out.println("hi!");
        }
        //artirma azaltma kismini yazmazsaniz "infinite loop" sorunsali olusur
        for (int i =1;i<4;){
            System.out.println("hi!");
        }

 */
        //artirma azaltma kismini yazmazsaniz "infinite loop" sorunsali olusur
        int i =12;
        while (i <15){
            System.out.println("hi!");
        }
        
    }
}
