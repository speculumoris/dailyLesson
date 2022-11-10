package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demeketir.
    //                    byte< short < int < long < long < float < double

    //Note: Kucuk data type'ini buyuk data type'ine cevirmeye "auto widening" denir.
    //Note: buyuk data type'ini buyuk data type'ine cevirmeye "explicit narrowing" denir.

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234;

        int newPopulation = (int) population;

        // example 1: Short u double'a ceviren kodu yaziniz
        //            float'i byte yapan kodu yaziniz.

        short cevirSayi = 23;
        double newCevirSayi = cevirSayi;

        float yeniNarrow = 28f;
        byte newYeniNarrow = (byte) yeniNarrow;//auto widening

        // Example 2: float2i byte yapan kodu giriniz.

        float price = 12.99F;
        byte newPrice = (byte) price;//explicit narrowing
        System.out.println(newPrice);//12 ==> Java ondalikli sayiyi , tam sayiya cevirirken yuvarlama islemi yapmaz
        //       java ondalik sayiyi, tam sayiya cevirirken ondalik kismini siler.


        int number = 515;

        byte newNumber = (byte) number;
        System.out.println(newNumber);//3 ==> Java 515'İ 256(byte'daki sayilarin sayisi)'ya boldu kalani return etti.

        int num = 510;
        byte newNum = (byte) num;

        System.out.println(newNum);


    }
}