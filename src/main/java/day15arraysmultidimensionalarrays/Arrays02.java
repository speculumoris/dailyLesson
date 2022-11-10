package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 1: Szie verilen pozitif ve negatif sayilar iceren bir integer Arraydeki "en buyuk negatif" ve "en kucuk pozitif" elemani bulunuz.

        int arr[]={ -12,180,-5,23,-2,0};

        Arrays.sort(arr);

        int maxNegative=arr[0];
        int minPositive=arr[arr.length-1];

        for (int w:arr){


            if (w<0){
                maxNegative=Math.max(maxNegative,w);
            }


            if (w>0){
                minPositive=Math.min(minPositive,w);
            }

        }
        System.out.println("en buyuk negatif sayi :"+ maxNegative);
        System.out.println("en kucuk pozitif sayi :"+ minPositive);

    }
}
