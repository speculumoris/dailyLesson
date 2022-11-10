package day03typecastingwrapperscanner;

public class WrapperClass01 {
    public static void main(String[] args) {
        /*
        Java primitive lere method'lar ekleyerek yenir bir (yapi) structure olusturdu,
        bu yapiya "wrapper class" denir.

        Primitive           Wrapper
             byte    ==>    Byte
             short   ==>    Short
             int     ==>    Integer
             long    ==>    Long
             float   ==>    Float
             double  ==>    Double
            boolean  ==>    Boolean
             char    ==>    Character
         */

        byte primitiveByte=12;// primitiveByte yazip nokta koydugunuzda hic method goremezsiniz, cunku primitive'ler method icermez sadece deger icerir
        Byte wrapperByte=12;// "warapperByte" yazip nokta koydugunuzda bir cok method gorursunuz, cunku "wrapper"lar method icerir.

        //byte data type'nin en kucuk ve en buyuk degerlerini ekrana yazdiriniz


        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127

        //example 2: Short,int,long data type2larinin en buyuk ve en kucuk degerlerini ekrana yazdiriniz

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);


        // " primitive"ler nasıl "wrapper"lara cevrilir.(autoboxing)
        float f1= 13.99F;

        Float wrapperF1=f1;

        //"wrapper"lar nasil "primitive"lere  cevrilir(unboxing)

        Character w1='s';
        char primitiveW1=w1;

        //note: Autoboxing and unboxing Java tarafindan otomatik olarak yapilir.

    }
}
