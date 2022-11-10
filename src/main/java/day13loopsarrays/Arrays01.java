package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        1)Ayni data tipinde coklu datayi depolamak icin java nin olusturdugu yapilar vardir.
        bu yapilardan birisi de "Array"lerdir.
         */

        //Array nasil olusturulur?
        int stdAges[]=new int[7];//[0, 0, 0, 0, 0, 0, 0]

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));

        //Array'lere elemanlar nasil eklenir?
        stdAges[1] =11;
        stdAges[0] =12;
        stdAges[2] =13;
        stdAges[3] =14;
        stdAges[4] =10;
        stdAges[5] =12;
        stdAges[6] =12;
        System.out.println(Arrays.toString(stdAges));

        //Array'deki herhangi bir elemani nasil yazdiravbiliriz?
        System.out.println(stdAges[4]);

        //Example 1:Array deki en kücük ve en büyük elemaninin toplamini yazdiriniz
        Arrays.sort(stdAges);//*********************
        System.out.println(Arrays.toString(stdAges));

        int ilk=stdAges[0];
        //Note:"length()" Stringlerde kullanilir,"lenght" Array'lerde kullanilir
        int son=stdAges[stdAges.length-1];
        System.out.println(ilk+son);

        //Example 2:stdAges Array', icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.
        //1.yol
        int sum=0;
        for (int i = 0; i < stdAges.length; i++) {
            sum=sum +stdAges[i];

        }
        System.out.println(sum);

        int sum1=0;
        int i=0;
        while (i<stdAges.length){
           sum1+=stdAges[i];
            i++;
        }
        System.out.println(sum1);
        System.out.println("*******");
        int a=0;
        int j=0;
        do {
            a+=stdAges[j];
            j++;
        }while (j<stdAges.length);
        System.out.println(a);
        System.out.println("*****");
        //4.yol:for each loop Arraylerde ve collectionslarda kullanillir
        int t=0;

        for (int w : stdAges ){
            t=t+w;

        }
        System.out.println(t);

        //Example 3:String bir ARRAY OLSUTURUNUZ
        //         bu Array a 5 tane isim yerlestiriniz
        //         Bu isimlerdeki karakter sayilarinin toplamini yazdiriniz

        String ards[]=new String[5];
        ards[0]="Ali";
        ards[1]="Tom";
        ards[2]="Veli";
        ards[3]="Kemal";
        ards[4]="Cem";
        int karakterSayilariToplami=0;
        for (String w:ards){

            karakterSayilariToplami=karakterSayilariToplami+w.length();
        }
        System.out.println(karakterSayilariToplami);

        //Example 4:char bir ARRAY OLSUTURUNUZ SONRA BU ARRAY E BES ELEMAN EKLEYİNİZ
        // bu Array deki sadece buyuk harfleri yazdiriniz

        char[]ch={'A','c','D','k','M'};

        for (char w:ch){
            if (w>='A'&&w<='Z'){
                System.out.println(w);
            }
        }
    }
}
