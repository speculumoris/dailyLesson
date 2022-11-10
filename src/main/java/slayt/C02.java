package slayt;

public class C02 {
    public static void main(String[] args) {
        /*
        For Loop:
        Belirli kosullaer saglandigi muddetce tekrarlanmasi istenen isler icin kullanilan kod bloklarina "LOOP" denir
         For loop u biz tekrar sayisi belli oldugu durumlarda tercih ederiz

         for(int i=0  ;                  i < sayi             ; i++)
         for(Baslangc degeri ;         bitis durumu ;       artırma veya azaltma)

         * Bitis durumu hep true olursa loop sonduz döngüye girer veya hic true olmazsa loop devreye girmez
          artis durumunu kendini karar verebilirsiniz

          bazi kosullarda tek loop isimizi gormez bu yüzden ek loopları kullaniriz
          loop un icinde loop
          for(int i =0; i < sayi;i++) {

                for (int j = 1; j < i; j++){
                }


          while loop:

          int i=0;
         while(condition){

         code yazilir      ==> condition true oldugu muddetce while loop calisir
                i++;
          }
          * baslangic ve arttirmayi manuel olarak yazariz
          * tekrar sayisi belli olmayan durumlarda genellikle While Loop kullanilir

          do-While Loop:
          * Bazi durumlarda baslangic kosulu tutmayinca Do while loop u kullaniriz
          ilk önce istedigimiz code u yazariz arttirma ve bitis degerine sonradan ulasiriz
          arttirma ve azalma ile baslangici biz kontrol ediyoruz

          int i =1;
        while (i < 1) {

            System.out.println("while loop");
        i++;
        }

        int k=1;
        do {
            System.out.println("do-while yazdir");
            k++;
        }while (k<1);


          Farklar=
          While Loop dongunun baslangicinde kosulu kontrol eder kosul saglanirsa kodlari calistirir
          Do-while loop’ta ise , kosul body icerisindeki kodlar 1 kere calistiktan sonra kontrol edilir.

          Bir while loop’daki kosul yanlıssa, loop hic calismaz
          ‘do-while' loop’ta ise , kosul yanlissa kodlar 1 kere calisir


            foreach loop:
             kullanilan kodun daha okunabilir olmasini sağlar.Hata yapma ihtimalini azaltir

            for(int w:arr){

            }



Array:

          1)Ayni data tipinde coklu datayi depolamak icin java nin olusturdugu yapilar vardir.
        bu yapilardan birisi de "Array"lerdir.

        * Arrays’de sadece primitive datalar veya non-primitive datalara ait referans’lar depolanabilir

        * Arrays'lerin icinde string yoktur String in adresi vardir ==> adrese gidip stringi yazdirir.

        * Arrays icindeki tum variable’lar ayni data type’inde olmalidir

        * Array’ler object (non-primitive) ’tir. Bu yuzden Heap Memory’de depolanirlar.

        * Value ile birlikte method’lara da sahiptirler


        2) Bir Array nasil declare edilir?
        int myArray[ ]  ; // Bu daha cok kullanilir -
        int [ ] myArray ;

        3)Bir Array nasil olusturulur?
        int stdAges[ ] = new int[6];
        * Array'in elemanlarini belirtiriz sag taraftaki int[]'in icine sayiyi yazarak eleman sayisini belirtiriz
        * eger belirtmezsek array olusmaz,compile time error verir.
        * elemanlari su sekilde ekleriz:

        stdAges[1] =11;
        stdAges[0] =12;
        stdAges[2] =13;
        stdAges[3] =14;
        stdAges[4] =10;
        stdAges[5] =12;

        Bir Array'de olmayan indexi kullanamazsiniz

        uzunlugunu int uzunluk =stdAges.length ile buluruz ancak yaninda parantez bulunmaz

        4) Bir Array’in tum elemanlarini nasil yazdirilir?

        System.out.println(Arrays.toString(stdAges))

        direkt Array'in ismini yazarsak bize refereans degerini gösterir ===>         [I@75bd9247


        5)Elemanlari kucukten buyuge siralamak icin sort methodu kullanilir.

        Arrays.sort(stdAges)

BinarySearch():

           Method: Bu methodu'u kullanarak bir elemanin Array de olup olmadigini anlariz.

        i)binarySearch Method'unu kullanmadan once mutlaka Arrays.sort() kullanilmalidir.

        ii)binarySearch Method'u aradiginiz eleman Array'de varsa o elemanin indexini return eder.

        int sayi=5;
        int arr[] = {2, 1, 2, -3, 2};

         Arrays.sort(arr)

         int idx=Arrays.binarySearch(arr ,sayi)

         -5 dondurur veya sayi -1 olsun mesela bize -2 dondurur


        iii)binarySearch Method'u aradiginiz eleman Array'de yoksa "-a" seklinde bir negatif sayi alirsiniz

        vi)bu sayinin "-" negatif isaretinin anlami bu eleman Array de yok demektir."a" nin anlami olsaydi kacinci sirada olurdu demektir.
                                                                            (indexe bakilmaz kacinci eleman olduguna bakilir

        //binarySearch methodu tekrarlayan elemanlar icin kullanilmaz.



            Multidimensional Arrays:

            //Bir Array'in elemanlari Array ise bu Array'ler "Multidimensional Array" 'dir
            //Multidimensional Array nasil olusturulur?

            Array'i tanimlarken her katman icin bir "[]" olusturulur.

        int arr[][]=new int[3][2];

    console'da bu sekilde yazdirilir ==>  System.out.println(Arrays.deepToString(arr));


   //Multidimensional Array'lere eleman ekleme nasil yapilir?
        arr[1][0]=6;
        arr[1][1]=18;

        arr[0][0]=3;
        arr[0][1]=-4;

        arr[2][0]=-7;
        arr[2][1]=0;

    //Multidimensional Array'lerde Array elemanlardan biri nasil yazdirilir?
        System.out.println(Arrays.toString(arr[1]));//[6,18]

    //Multidimensional Array'lerde ic Array'lerdeki elemanlar nasil yazdirilir?
        System.out.println(arr[1][0]);

        ArrayLists:

        ArraLists'ler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir.
        * Lenght i esnek olan bir Arraydir
        * Array olsuturmak icin eleman sayisini yazmamiz gerek(fixed) fakat
        * Arraylist icin öyle bir zorunluluk yok o yuzden (flexible dir)
        * Array'lerin icine primitive ve non-prmitive "reference'lar konabilir.
        * Arraylist'lerin icine sadece "non-primitive" ler konulur.
        * Array'ler super fast,cok hizlidir. Arrayler memory'i cok az kullanir.


        Arraylist'i 3 sekilde olusturabiliriz

        ArrayList<Integer> yas=new ArrayList <Integer>()
        ArrayList<Integer> yas1=new ArrayList <>()
        List<Integer> yas2=new ArrayList <>() ==> Genellikle bu kullanilir.


        ArrayList sout'a adini yazinca yazdirabiliriz ==> System.out.println(yas2)

        1) add() ==> ArrayListe eleman eklemek icin kullanilir.
           add() her zaman elemani sona ekler.(insertion order)

        List<String> b = new ArrayList<>( );
        b.add(2)                                    b.add(2,2)
        b.add(4)    ===>  [2,4,6]                  b.add(0,4)      ==> indexini yazip istediginiz indexe birakabiliriz
        b.add(6)                                    b.add(1,6)

        2)size( ) method ArrayList’de kac eleman oldugunu gosterir.

        System.out.println(b.size())==> cevap 3'tur.

        3)get() methodu istenen bir indexteki elemani verir

        List<String> takim= new ArrayList <>();

        takim.add(1,"Fener")
        takim.add(1,"Cimbom")
                                        System.out.println(takim.size())==>4 ["Fener","Cimbom","Kartal","Firtina"]
        takim.add(1,"Kartal")
        takim.add(1,"Firtina")

        System.out.println(takim.get(3))  ==>   bize 3.indexteki elemani verir ==> "Firtina"

        4)isEmpty( ) method’u ArrayList bos ise true, bos degilse false dondurur

        5)set( ) methodu ArrayList’de var olan bir elemani degistirmeye yarar

        System.out.println(takim)   ==>       ["Fener","Cimbom","Kartal","Firtina"]

        takim.set(1,"Gs")           ==>       ["Fener","Gs","Kartal","Firtina"]

        6)remove( ) method’u ArrayList’den belli bir elemani silmek icin kullanilir.

        i)remove(index) yazarak o indexteki elemani List'ten siler.

        takim.remove(1) ==> ["Fener","Kartal","Firtina"]

         * Note : Eger System.out.println(takim.remove(1) yazdirirsak silinen elemani döndürür yani Cimbom'u.

        ii)remove(eleman) yazarak o elemanin ilk kullanildigi yeri List'ten siler.

        takim.remove("Fener") ==> ["Kartal","Firtina"]

        * Note : Eger System.out.println(takim.remove("Fener") yazdirirsak bize true dondurur
        cunku eleman olarak vardi fakat silindi manasinda
        mesela ("alanya") yazarsak false verir cunku eleman olmadigi icin silemedi

        7)contains( ) methodu ArrayList’de bir elemanin var olup olmadigini kontrol eder.
        Eleman varsa true, yoksa false return eder.

         8) Collections.sort( ) : sort() methodu ArrayList’deki elemanlari kucukten buyuge
         veya alfabetik siraya gore dizer.

         9)equals( ) methodu iki listteki ayni indexteki elemanlarin ayni olup olmadigini kontrol eder.
           Ayni indexteki tum elemanlar ayni ise true return eder, farkli ise false return eder

           Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
            toplamını bulan code create ediniz.

             Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

             Kullanıcıdan alacağınız 6 elemanlı bir dizinin
            sadece tek elemanlarını ayrı diziye bir metodda atayarak
             yazdırınız.


         */

    }
}
