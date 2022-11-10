package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //binarySearch() Method: Bu methodu'u kullanarak bir elemanin Array de olup olmadigini anlariz.
        //                          binarySearch Method'unu kullanmadan once mutlaka Arrays.sort() kullanilmalidir.
        //                          binarySearch Method'u aradiginiz eleman Array'de varsa o elemanin indexini return eder.
        //                          binarySearch Method'u aradiginiz eleman Array'de yoksa "-a" seklinde bir negatif sayi alirsiniz
        //                          bu sayinin "-" negatif isaretinin anlami bu eleman Array de yok demektir."a" nin anlami olsaydi kacinci sirada olurdu demektir.

        //                          binarySearch methodu tekrarlayan elemanlar icin kullanilmaz.


        int arr[]={12,31,43,14};

        int sayi=12;

        Arrays.sort(arr);
        int idx1= Arrays.binarySearch(arr ,sayi );
        System.out.println(idx1);
        int sayi2=17;

        int sonuc =Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc);//-5==> "-" anlami o eleman yok demektir ==> sayi(5) ise olsaydi hangi sirada olurdu onu demek istiyor





    }
}
