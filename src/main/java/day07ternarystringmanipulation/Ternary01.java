package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {
        //example 1 :Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz.

        //1.way=if-else
        int a =0;
        if (a>0){
            System.out.println("pozitif");
        }else {
            System.out.println("Pozitif degil");
        }

        //2.way:Ternary
                     //condition        ?    condition dogru ise uygulanacak kod   : Condition yanlis ise uygulanacak kod
        String sonu =     a>0           ?        "pozitif "                        : "pozitif degil";
        System.out.println(sonu);


        // iki farkli sayidan kucuk olani secen kodu yaziniz
        int b =23;
        int c =23;

        int min = b<c ? b : c ;

        System.out.println(min);

        //example3:Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //         pozitif sayilarin ve sifirin mutlak degeri kendileridir
            //     negatif sayilarin mutlak degeri -1 ile carpilmis kendileridir
        int d = -45;

        int abs =d<0 ?-1*d : d;

        System.out.println(abs);

        //example 4: iki tane sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise " islem yapmam" mesaji veriniz.
        int e = -12;
        int f = 10;

        //Ternary farkli data tiplerinde sonuc return ederse sonucun data tipini "object" yapiniz
       Object carpma=(e>0 &&f>0 ) || (e<0 && f<0) ? e*f : "islem yapmam";
        System.out.println(carpma);

        //note= Java'da her class'in en az bir tane "parent" class'i vardir.
        //      Sadece "Object" class'in "paren" class'i yoktur.

    }
}
