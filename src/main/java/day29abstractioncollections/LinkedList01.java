package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {
    //ArrayList’ler index kullanir ama index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybettirir.
    // Cunku bircok elemanin re-index edilmesi gerekir.
    //Java cozum icin yeni bir yapi olusturdu ===>>                      LinkedList

    /*
        - Arraylist ler index kullanir. Ancak index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybetirir.
        - Cunku bir cok elemanin re-index edilmesi gerekir. Java bu problemi LinkedList olusturarak cozmustur.
        - LinkedListte ki her eleman iki bolumden olusur. Bu elemanlarin ilk bolumunde deger(data) olur, ikinci bolumunde ise pointer vardir.
        - Iki bolumden olusan farkli bir yapi oldugu icin buna "Node" denilmektedir. Dolayisiyla LinkedList ler hakkinda konusurken List kelimesi
        yerine "Node" kelimesini kullanmak yerinde olacaktir.
        - Bu yapinin en son elemaninin pointer kismi, kendisinden sonra eleman olmadigi icin "null" gosterir. Son elemana ise "Tail" denilmektedir.
        - Her pointer bir elemani gostermeketdir. Ilk bastaki elemani gosteren yapiya "Head" denilir.

        -LinkedList eleman ekleme ve eleman silmede cok basarilidir.
        -Bu yuzden eleman ekleme ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.

 */
    /*Class oluştururken ismine Sadece LİnkedList yazarsak java hata verir çünkü bu java'nın Class'ıdır.
 Arraylist:
 >index kullanır
    i)dezavantajı:
       bir elemanı silmek istediğinizde silinen elemandan sonraki tüm elemanlar için Reındex yapmanız gerekir.
       bir eleman eklemek istediğinizde eklenen elemandan sonraki tüm elemanlar için Reındex yapmanız gerekir.
    ii)avantajı:ındex kullanmak adres gibidir java direk adrese gider.
       --Search(Eleman bulma) işlemlerinde çok başarılıdır,
        Ör:sözlük yapacaksak ArrayList kullanmalıyız
 >>Bu dezavantajları gidermek için Java LinkedList oluşturmuş.
   LinkedList eleman ekleme ve çıkarma işlemlerinde başarılı.
   linked listte her Nod iki bölümden oluşur:
      ilk bölüme data konulduğu için bunlara data bölümü derler.
      ikinci bölümler ise pointer bölümleri, tüm pointerler bir sonraki bölümü gösterir.
      vagon gibi bir yapı oluştu hepsi bir sonrakine(linked) bağlı.
      iki bölümden oluşan bu yapının ismi: Nod.
      bu yapının en son Nod'un pointer kısmı null gösterir.
      en son Nod'un özel ismi: Tail.
      ilk Nod'un ismi: Head, içinde sadece pointer kısmı var data kısmı yok.
      --Biz LinkedListte bir elemanı silince(elemanı silmek için elemanın sağ ve solundaki okları sileriz)
        Javanın çöp toplayıcısı garbage collector pointer ile işaret edilmeyen Nod'u imha eder.
        Sonra Java silinen Nod'un iki tarafını birbirine bağlamak için yeni bir pointer oluşturur.
      --Eleman ekleme: iki nod arasındaki pointer'ı silip, eklemek istediğimiz Null'u diğer iki
        Nod'a bağlayan iki yeni pointer oluştururuz.
      +Ne zaman çokça ekleme ve çıkarma yaparız Ör: müzeye giren çıkan insanlar.
      +Arraylist kullanınca çokça ekleme ve çıkarma yaptığımız zaman application donar bu yüzden az gelişmiş ülkelerin applicationları donar detayları düşünmeden application yazarlar.
    i) dezavantajı: ındex olmadığı için adres yok.Bir elemanı bulurken sırayla o elemana kadar olan tüm elemanlara
       senden sonrakı şu mu? diye sorar ve o elmanı bulana kadar eleman eleman ilerler.
       --Search(Eleman bulma) işlemlerinde başarısızdır.
        Ör:

        1)LinkedList'deki her eleman iki bölümden oluşur. i)Data ii)Pointer
2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
6)ArrayList'ler index kullanır LinkedList'ler index kullanmaz.
7)index kullanmak eleman bulma işlemlerinde çok başarılıdır, bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.
 */
    public static void main(String[] args) {
        LinkedList<String> visitors=new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2,"Angelina Julie");//normalde bu kod index kullanmiyor. Java developer'lar rahat etsinler diye
                                                       // "buraya yazilan index'de nereye koymasini gerektigini gosteriyor.
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");

        System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]
        
        //LinkedList'ler ekleme ve silme islemlerinde cok basarili olduklarindan ekleme ve silme ile alakali cok fazla method icerir
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        System.out.println(visitors);//[Cuneyt Arkin, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks, Ajda Pekkan]

        visitors.removeLast();
        System.out.println(visitors);//[Cuneyt Arkin, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirst();
        System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirstOccurrence("Tom Hanks");//[Tom, Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]
        System.out.println(visitors);

        visitors.removeLastOccurrence("Brad Pitt");//[Tom, Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks]
        System.out.println(visitors);


        /*


         */
        String firstEl=visitors.pop();//Cut + Paste ==> ctrl+X
        System.out.println(firstEl);
        System.out.println(visitors);

        LinkedList<String> myList=new LinkedList<>();

        //myList.pop();//NoSuchElementException ==> cunku LinkedList bostur.





































    }

}
