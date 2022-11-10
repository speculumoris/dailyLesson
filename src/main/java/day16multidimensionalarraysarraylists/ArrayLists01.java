package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    /*
    ArraLists'ler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir.
    Array ile Arraylists'in farki nedir?
    1)Array olustururken array in icine kac tane eleman koymamiz ggerektigini söylemeliyiz,söyledigimiz eleman sayisindan fazla eleman koyamayiz
     Array'ler eleman sayisinda "fixed" dirler.

     Arraylist'leri olustururken eleman sayisi soylemeye gerek yok,cunku arraylist'ler eleman sayisinda"flexible"(esnek)dirler
     2)Array'lerin icine primitive ve non-prmitive "reference'lar konabilir.
     Arraylist'lerin icine sadece "non-primitive" ler konulur.
     3)Array'ler super fast,cok hizlidir. Arrayler memory'i cok az kullanir.
     //uzunlugundan emin oldugunuz islerde Array kullanin mutlaka ama eleman sayisi belli egilse Arraylist.



         */
    public static void main(String[] args) {

        //ArrayList nasil olusturulur?
        //1.yol
        ArrayList<Integer> age=new ArrayList<Integer>();
        //2.yol
        ArrayList<Integer> heights=new ArrayList<>();
        //3.yol
        List<Integer>nums=new ArrayList<>();

        //ArrayList'ler nasil yazdirilir?

        System.out.println(nums);// []

        //ArrayList'lere nasil eleman eklenir
        //add() her zaman elemani sona ekler.(insertion order)
        nums.add(21);//add methodu boolean return eder.
        nums.add(18);
        nums.add(20);

        System.out.println(nums);//[21, 18, 20]
        nums.add(1,50);
        System.out.println(nums);// [21, 50, 18, 20]

        List<Integer>prices=new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);//[21, 50, 18, 20, 23, 185]

        nums.addAll(2,prices);
        System.out.println(nums);//[21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayList'lerin eleman sayisi nasil bulunur.
        int elemanSyisi=nums.size();
        System.out.println(elemanSyisi);//8

        //ArrayList'lerde herhangi bir eleman nasil secilir?
        //get() methodu istenen bir indexteki elemani verir
       int el1= nums.get(3);
        System.out.println(el1);

        //ArrayList'in bos olup olmadigini nasil anlariz
        boolean bos1=nums.isEmpty();
        System.out.println(bos1);//false

        boolean bos2=age.isEmpty();
        System.out.println(bos2);//true

        //ArrayList'te bir elemamn nasil degistirilir?
       nums.set(3,200);
        System.out.println(nums);//[21, 50, 23, 200, 18, 20, 23, 185]

        //example 1: nums Arraylist'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz

        for (int w:nums){

            if (w%2==1){
                nums.set(nums.indexOf(w),w+11);
            }
        }
        System.out.println(nums);

        //remove() methodunun icine tam sayi koyarsaniz .java onu index olarak kabul eder.

        //example 2:Arraylist'ten 34 elemaninin ilk görünümünü siliniz
        //Note: Tum tam sayilar aksi soylenmedikce primitive yani "int"tir.
        //note2: Primitive ler Arraylist'lerin elemani olamazlar cunku listler sadece non-primitive depolar.
        //Note 3:" primitive "i Wrapper class a cevirirseniz non-primitive olur ve non-primitive ler Arraylist'lerin elemani olur index olamaz.
        Integer sayi= 34;
        System.out.println(nums.remove(1));



    }
}
