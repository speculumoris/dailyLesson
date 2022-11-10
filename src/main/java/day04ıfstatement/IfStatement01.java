package day04ıfstatement;

public class IfStatement01 {
    public static void main(String[] args) {


        //ıf it rains I will cancel the picnic
        //if statement belli kodlari belli sartlara baglı olarak calisitrmaya yarar.

        //example 1: Sayi pozitif ise ekrana pozitif yazdirin.
        int s = 12;
        if (s>0) {
            System.out.println("positive");
        }

        //example 2:verilen karakter buyuk harf ise ekrana buyuk harf yazdirin

        char harf='V';
        if (harf>='A' &&harf<('Z')) {
            System.out.println("harf buyuk harftir");
        }

        /*
        && islemi sadece boolean ile kullanilir

         */

        //example 3: verilen bir sayi 3 basamakli ise ekrana uc basamakli yazdiriniz

        int input = 123;
        Math.abs(input);

        if (input>99 && input <=999){
            System.out.println("sayi uc basamaklidir");
        }
        //example 4:verilen bir sayi çift sayi ise ekrana çift sayi yazdiriniz

        int sayi1=-124;

        sayi1=Math.abs(sayi1);

        if (sayi1%2==0){
            System.out.println("sayi cifttir");
        }
        //example 5:verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana harika sayi yazdiri

        int kral =1453;
        if (kral<300 || kral>1200){
            System.out.println("harika sayi");
            /*
              || islemi sadece boolean ile kullanilir.
            true || true = true
            true || false= true
            false || true= true
            false || false= false
            Not: || isleminde false alabilmek icin herseyin false olmasi gerekir.
                 || isleminde sadece bir tane true sonucu true yapmaya yeter
                    */

        }
    }
}
