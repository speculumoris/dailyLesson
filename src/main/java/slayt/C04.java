package slayt;

public class C04 {
    /*
    Varargs ==> Varargs tek method’a istediğimiz kadar parametre yollayarak sonuç almamizi sağlar.

    Yani parametre sayımiz değişken ancak method’un yapacağı iş sabitse
    Varargs kullanarak tek method’la kodumuzu yazabiliriz

    Varargs ozellik olarak list gibi calisir (uzunlugu esnektir) fakat varargs’in arka planinda Java Array ile calisir

    Varargs’i declare etmek icin data type’dan sonra ... kullaniriz. (int... sayi vb..)

    public static void name(int...sayi){}

    Bir method’da varargs disinda parametre varsa varargs parametre
     olarak en sona yazilmalidir. (aksi durumda varargs nerede duracagini bilemez)

     Bir method'da sadece varargs kullanilabilir.

     Mutable <===> Immutable

    "Immutable Class"larda var olan deger degistirelemez. Siz var olan bir degeri degistirmek istediginizde
        i)Memory'de yeni bir variable yeni degerle olsuturulur.
        ii)Eski variable'in pointer'i yeni variable'a dondurulur.
        iii)Eger br variable'i hicbir pointer gostermiyorsa o variable "Garbage collector" tarafindan silinir.

        "Mutable Class" larda var olan deger degistirilebilir. ORİJİNAL DEGER KORUNMAZ.

         Immutable class’dan olusturulan objeler de immutable olurlar.
        Bu tur bir object’i oluşturabiliriz, fakat onları değiştiremeyiz.
        Immutable bir objeyi değiştirmek istersek, Java o objeyi klonlar ve yapilan degisiklikleri klonlanmis yeni obje uzerinde gerceklestirir.
        Peki böyle bir duruma niçin ihtiyacımız olur diye bir soru sorarsak, cevabı thread safe (guvenli es zamanli calisma) konusudur.
        Immutable nesnelerin değerleri değişmeyeceği için üzerinde kaç tane thread çalışırsa çalışsın hep aynı değerler üzerinden işlem yapılacaktır.



        String Builders

        Append() ==>  StringBuilder’a ekleme yapar

         StringBuilder sb=new StringBuilder();
            sb.append("Mehmet");

        length( ) ==> StringBuilder’in uzunlugunu verir

        StringBuilder sb = new StringBuilder();
        sb.append(“Mehmet”);

        System.out.println(sb.length()); // 6

       capacity( );StringBuilder’un kapasitesini verir;
       String builderlerde kapasite ilk basta 16 dir karakter sayisi 16 gectiginde 2 katina 2 ekleyerek 34 olur ve
        her karakter asiminda mevcut kapasitenin 2 katinin 2 fazlasi kapasite arttirilir.


      charAt( ) ==> StringBuilder’da istenen index’deki karakteri verir

      delete(4,7) ==> StringBuilder’da istenen index’ler arasindaki karakterleri siler. Substring methodu gibi sagdaki index dahil edilmez

      deleteCharAt(7) ==>  StringBuilder’da istenen index’deki tek karakteri siler /:indexteki karakter silinir.

      equals( ) ==> Iki StringBuilder’in degerlerinin karsilastirir.
      NOT 1: equals( ) method’unda parantez icine String yazarsak hata vermez ama false doner.
      NOT 2: equals( ) method’u == gibi calisir

      indexOf( ) ==> StringBuilder’da istenen karakterin index’ini verir.

      insert(3, "Java ") ==> StringBuilder’da istenen indexden baslayarak istenen karakteri ekler.

      insert(3, "Java ",1,2) ==> StringBuilder’da istenen indexden baslayarak verilen String’in istenen parcasini ekler.

      replace(3, 8, " Ali ") ==> StringBuilder’da istenen index’ler arasindaki bolumun yerine verilen String’i ekler.

      reverse( ) ==> StringBuilder’i tersine cevirir. ==> interwievde sorulursa ilk bunu söyle

      setCharAt(3, ‘k’) ==> StringBuilder’da istenen index’deki karakteri istedigimiz karakter yapar. ==== Set methodu her sekilde degistirmek icin calisir

      subSequence(3,7) ==> StringBuilder’da istenen indexler arasindaki karakterleri dondurur.

      toString( ) ==> StringBuilder’i String’e cevirir.toString( )’den sonra nokta koyup String method’lari kullanilabilir.
      geri StringBuilder a cevirmek icin ise

      StringBuilder sb = new StringBuilder();
        sb.append(“Mehmet”);
        sb.toString yapilinca String olur

        StringBuilder sa= new StringBuilder(sb) yaparsak tekrar StringBuilder olur...

      a.compareTo(b) ==>StringBuilder'lar tamamiyla ayni ise 0 verir.2 StringBuilder’in tum karakterlerinin esitligini kontrol eder.
                       i)a alfabetik sirada b'den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
                      ii)a alfabetik sirada b'den once gelirse negatif olarak aradaki alfabetik siralama farkini gösterir














     */
}
