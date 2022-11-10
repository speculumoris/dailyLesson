package day20stringbuilderstringbuffer;

public class StringBuilder01 {

    /*
    1)StringBuilder Java'da bir class'tir
    2)StringBuilder, String olusturmaya yarar.
    3)"String" Class varken nicin StringBuilder'a ihtiyac duyariz?
      Cunku "String" Class "Immutable Class"tir. ama biz bazen "Mutable" String'lere ihtiyac duyariz
      StringBuilder bize "Mutable" String verir.
    4)"Immutable Class"larda var olan deger degistirelemez. Siz var olan bir degeri degistirmek istediginizde
        i)Memory'de yeni bir variable yeni degerle olsuturulur.
        ii)Eski variable'in pointer'i yeni variable'a dondurulur.
        iii)Eger br variable'i hicbir pointer gostermiyorsa o variable "Garbage collector" tarafindan silinir.

        "Mutable Class" larda var olan deger degistirilebilir. ORİJİNAL DEGER KORUNMAZ.

    5) "String Class" larin "immutable" yapisi "security" icin onemlidir.
    Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni deger sahip String'lerin bu container'i
    kullanmasini temin eder. Bu memeory'i korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin
    etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java, String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variablee'in
    degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu
    yeni variable'a yonlendirir. Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.

          */
    public static void main(String[] args) {

        String str="Java";
        str="Super Java";

        System.out.println(str);


        //StringBuilder nasil olusturulur?
        //1.yol
        StringBuilder strb1=new StringBuilder("Java");
        System.out.println(strb1);

        //2.yol
        StringBuilder strb2=new StringBuilder();
        //yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append(" !!!");
        System.out.println(strb2);

        //yol b:
        strb2.append(" learn").append(" Java earn").append(" money");
        System.out.println(strb2);

        //StringBuilder'larda karakter sayisi nasil bulunur?

        StringBuilder strb3=new StringBuilder();
        strb3.append("cat");
        strb3.append("xxxxxxxxxxxxxxxxxxxxxxxx");

        int numOfChar=strb3.length();
        System.out.println(numOfChar);

        int capacity=strb3.capacity();
        System.out.println(capacity);

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int capacity2=strb3.capacity();
        System.out.println(capacity2);//70 ==> 34*2 +2

        //setCharAt(2,'r'); ==> index 2'deki karakteri "r" ye cevirir.
        strb3.setCharAt(2,'r');
        System.out.println(strb3);//carxxxxxxxxxxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm


        //delete(3,27) index 3 dahil,index 27 haric uzere arada ki characterleri siler(subString gibi)
        strb3.delete(3,27);
        System.out.println(strb3);//carmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //deleteCharAt(2); index 2 deki harfi siler
        strb3.deleteCharAt(2);
        System.out.println(strb3);//cammmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //reverse() methodu StringBuilder'i ters cevirir. Ali ==> ilA

        //"mutable" larda sadece method kullanmak orijinal degeri degistirmek icin yeterlidir.

        strb3.reverse();
        System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmac


        //"Immutable" larda orijinal degeri degistirmek icin methodu kullanmak yeterli olmaz bir de "atama islemi" yapmalisiniz

        String abc="Java";
        abc.replace("a","i");
        System.out.println(abc);

        //toString() methodu StringBuilder'lari String'e cevirir
        String stringStrb3=strb3.toString();
        System.out.println(stringStrb3);

        //String'den de StringBuilder'a asagidaki gibi geri donulur
        StringBuilder strb4= new StringBuilder(stringStrb3);
        System.out.println(strb4);

        //insert(3,"XXXX"); 3. karakterden sonra "XXXX" leri koyar
        strb4.insert(3,"XXXX");
        System.out.println(strb4);//mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmac

        //insert(3,"KLMNOPQRSTU",5,8); ;==> 3.charachter'den sonra, "KLMNOPQRSTU" String'inin index 5,6,7 deki character'lerini yerlestirir.
        strb4.insert(3,"KLMNOPQRSTU",5,8);
        System.out.println(strb4);

        StringBuilder a =new StringBuilder("Iava");
        StringBuilder b =new StringBuilder("Java");

        //a.compareTo(b); methodu i) StringBuilder'lar tamamiyla ayni ise 0 verir.
        //                        ii)a alfabetik sirada b'den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        //                        iii)a alfabetik sirada b'den once gelirse negatif olarak aradaki alfabetik siralama farkini gösterir
        int sonuc=a.compareTo(b);
        System.out.println(sonuc);



    }
}
