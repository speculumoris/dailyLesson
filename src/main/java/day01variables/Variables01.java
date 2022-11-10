package day01variables;

public class Variables01 {
    //variable nasıl oluşturulur?
    //1) acces modifier 2)data type 3)Variable ismi 4) =  5) deger 6);

    //Java'da ";" Ingilizcedeki "." gibidir
    // Ingilizce'de "cumle" deriz, Java'da "statement" deriz

    // "=" sembolu "Assignment operator" olarak adlandırılır
    //"Assignment(atama) operator" sagdaki degeri alır soldaki variable'ın icine koyar

    public int age = 13;
    public int height = 183;

    //Java'da data Type'lari
    /*
    1) int:Integer'in kısaltmasidir. Integer tam sayi demektir. 32 bit kullanir
           Matematikte tam sayilarin basi ve sonu yoktur
           En kucuk int = -2,147,483,648
           En Buyuk int =  2,147,483,647

     2)byte:Tamsayilar icin kullanilir. 8 bit kullanır
            en kucuk byte=-128
            en buyuk byte=127

     3)short:Tamsayilar icin.16 bit kullanır
           En kucuk short = -32768
           En Buyuk short = 32767

      4)long:Tamsayilar icindir. 64 bit kullanır
           en kucuk long=-9,223,372,036,854,755,808
            en buyuk long=9,223,372,036,854,755,807

      5)float=ondalıklı sayılar içindir. 32 bit kullanır
            "float" virgulden sonra 7 basamak icerebilir
            float degerlerinde sona kucuk f veya buyuk f koymanız gerekir.

      6)double:ondalıklı sayılar icindir
           "double" virgulden sonra 16 bsamak icerebilir.

       7)boolean:true veya false degerleri için kullanılır. 1 bit kullanır

       8)char: tek karakterler için kullanılır 16 bit kullanır
       A,c,2,?,_,=
       charlara deger verirlen, degeri tek tırnak arasına koyunuz.yoksa hata verir.
       java kucuk ve buyuk harflere duyarlidir.
            Java icin TRUE ile true tamamen farkldır

       note: numeric data types:byte < short < int < long < float < double
             numeric olmayan data types: boolean - char

                            Non-Primitive Data types
       String= Isim.adres,kimlik numarası gibi bir veya birden fazla karakter iceren degerlerde kullanılır.
                string degerleri mutlaka cift tırnak arasına konulmalıdır
                String non-primitive dir. Yani bir string olusturdugumuzda Java size birsuru method verir.

                primitive ile non-primitive arasındaki farklar?
               1)non-Primtive data type'larinde degerin yaninda methodlar vardir
                 Primitive data type'larında ise sadece deger vardir,method yoktur.
               2)Primitive data type'lari Java tarafindan olusturulmustur ve toplam 8 tanedir, biz Primitive data olusturamayiz.
               Non-Primitive data type'lari Java tarafindan da olusturulmustur, biz de olusturabiliriz.
               Non-primitiveler sayilamayacak kadar coktur, cunku her developer Non-Primitive data type olusturabilir.
               3)Primitive data type'lari isimlendirilirken kucuk harflerle baslar.
               Non-Primitive data type isimleri buyuk harfle baslar.
               (non-Primitive'lar aynı zamanda class oldugu icin buyuk harflerle isilendirilirler.
               4)Primitive data type'lar memory'de farkli buyuklukte yerler kullanir.
               Non-Primitive'lerin hepsi memory'de ayni buyuklukte yer kullanirlar.
                



     */
    public byte price = 12;
    public byte kubra=15;

    public short populationOfVillage= 23000;

    public float priceofshirt = 13.99F;
    public double weightofCell =0.000012045;

    //siz "long" demenize rağmen java verilen sayıyı "int" kabul eder
    //bu yüzden, long bir variable'a "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "L" veya "l" koyunuz
    public long populationOfWorld=7000000000L;

    public long x =1234;

    public boolean isOld=true;
    public boolean isRich=true;

    public char initial ='A';

    public String name="tom hanks";

    //note: "main method" arabanin motoru gibidir.
    //      "main method" calismadan hicbir şey calismaz.
    public static void main(String[] args) {



    }


}
