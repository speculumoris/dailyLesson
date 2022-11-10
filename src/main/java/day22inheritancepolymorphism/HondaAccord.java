package day22inheritancepolymorphism;

public class HondaAccord extends Honda {

    /*
    1)Siz Class olsuturdugunuzda Java otomatik olarak size gorunmez bir Constructor verir,
        cunku Java Class'in bir kalip oldugunu ve Object olsuturmak iin yaratildigini ve Object olusturmak icin
        constructor'in sart oldugunu bilir.
    2)Java'nin otomatik olarak olusturdugu bu grounmez constructor'a "default constructor" denir.
    3)Siz kendiniz icin herhangi bir constructor olusturdugunda Java "default constructor" i siler.
    4)Bir CLass'ta birden fazla constructor olabilir.
    5)"this" keyword "Bu Class" anlamındadır. "this.price" demek bu Class'daki "price" isimli variable demektir.
      "this.price" syntax'i constructor'ların içinde kullanılır.
    &)Constructor'lar kullanarak variable'lar uzerinde yaptiginiz degisimler sadece Object uzerindeki variable'larin degerlerini degistirir
       Class daki variable degerlerini degistiremez...

     */
    public int price;
    public int year;

    public String make;
    public String model;

    public HondaAccord(){

    }
    public HondaAccord(int price){
        this.price=price;

    }
    public HondaAccord(int price,int year){

        this.price=price;
        this.year=year;
        System.out.println("Honda Accord Constructor");
    }
    public HondaAccord(int price,int year,String Make,String Mode){
        this.price=price;
        this.year=year;
        this.make=make;
        this.model=model;

    }
}
