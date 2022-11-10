package slayt;

public class C01 {

/*
variable :Variable bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
1) acces modifier 2)data type 3)Variable ismi 4) =  5) deger 6);
Data types:
 1) int:Integer'in kısaltmasidir. Integer tam sayi demektir. 32 bit kullanir

 2)byte:Tamsayilar icin kullanilir. 8 bit kullanır

 3)short:Tamsayilar icin.16 bit kullanır

 4)long:Tamsayilar icindir. 64 bit kullanır

 5)float=ondalıklı sayılar içindir. 32 bit kullanır

 6)double:ondalıklı sayılar icindir. 64 bit kullanilir

 7)boolean:true veya false degerleri için kullanılır. 1 bit kullanır

 8)char: tek karakterler için kullanılır 16 bit kullanır
public char ch='a';
 note: numeric data types:byte < short < int < long < float < double

   numeric olmayan data types: boolean - char

  String= Isim.adres,kimlik numarası gibi bir veya birden fazla karakter iceren degerlerde kullanılır.
  Primitive data type'lari Java tarafindan olusturulmustur
  non-Primtive data type'larinde degerin yaninda methodlar vardir
  Non-Primitive data type isimleri buyuk harfle baslar.
  Non-Primitive'lerin hepsi memory'de ayni buyuklukte yer kullanirla


  Method olusturma
   public           int                myFirstMethod        ( )                 { }
      1             2 (void)                3                4                   5
 acces modifier     data types(return) method ismi        method parantezi      method body

 acces modifiers:methoda’a kimlerin erisebilecegini belirler
 Public:Herkes tarafindan ulasilabilir
protected : Sadece icinde bulundugu package ve child class’lardan kullanilir
default : Sadece icinde oldugu package
private: Sadece bulundugu class’da kullanilabilir

 data types:Eger method bir sey uretirse bize ne urettigini ve dondurdugunu belirtmek icin kullanilir

 method parantez: isimden sonra kullanilir ve gerektiginde icine parametre yazilir

 void: Bu method yeni bir data uretmiyor demektir.


 main method:Java nin calısmaya basladigi giristir(entry point)

 public static void main(String[ ] args) { } syntax ı bu sekildedir degismez
 (String [] args javanin calismasi icin parametreleri barindirir.olmasi sarttir


 Memory kulanimi:
 1)Javada iki turlu memory vardir:
 Stack(kucuk) memory
 primitive ve non-primitivlerin reference icerir
 heap (buyuk) memory
 sadece non-primitiveleri ve olusturdugumuz classları  icerir.


//Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demeketir.

Kucuk data type'ini buyuk data type'ine cevirmeye "auto widening" denir.
buyuk data type'ini kucuk data type'ine cevirmeye "explicit narrowing" denir.

int a=860;
long b=730
int c=(int)b;



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



Scanner kullanicidan data almaya yarar, Scanner kullanici ile etkilesim kurmamizi sağlar
Scanner bir Java class'idir, Bu Class'i kullanabilmek icin "import" etkmek gerekir.
Scanner Class'i Java'nin util kutuphanesidir.

 Scanner       scan       =        new           Scanner(System.in); yazarak Scanner objesini olusturabiliriz

class ismi     obje ismi  assign  new          constructor(dısaridan aldıgimiz bilgiye sisteme yerlestirmek icin)

System.out.println() yazarak ilk oncelikle kullaniciya bilgi veririz ardindan

obje ismiyle scanner i cagirir bir variable a atayarak kullaniriz ve dataya uygun next methouyla kullaniriz


 If statement: Belli kodlari belli sartlara göre yazabilmek icin kullanilir.Boolean gecerlidir.

 if( boolean sart){sart olunca calısacak kod}else{o durum saglanmazsa caisacak diger kod}
 veya yeni bir sart ekleyecek olursak :

 if(boolean sart){sart olunca calısacak kod}else if{o durum saglanmazsa girilecek diger sart}else{son durum}

  Switch statement:
  ıf else kullanacagimiz durumlarda eger elimizdeki sart sayisi cok fazla ise Switch statement kullaniriz

   switch(sayi){
        case 1:(sartlar)
            System.out.println("")(istenen sonucu verir)
            break;(islem tamamlaninca sona gitmemizi saglar eger break komutu olmazsa java tum caseleri calistirir.

            default:eger hicbir case calismazsa calismasini istedigimiz komutlar calisir

            Switch statement da long,double,float,boolean kullanilmaz.


   ternary operator:If statement ile yapacagimiz tum islmeleri basit olarak yapabilmemizi saglar

   condition ? code 1 : code 2 seklinde calisir

   bize sonuc dondurecegi icin bir variable a atanmasi sarttır.


   String Manipulations :


indexOf()

aranan char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.

lastIndexOf()
 String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
 indexOf un sondan olan hali fakat index numaraları değişmez.

charAt()
 İstenen noktadaki karakteri verir,
 karakterlerin sırası 0 dan başlar, buna index denir.

substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
str.substring(2);
 trim()
 Metnin basinda ve sonunda bulunan bosluklardan kurtulmayi saglar, aralardaki bosluklara dokunmaz. Sonuc String dir.

 replace()
 Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini saglar. Sonuc String'dir..

  contains()
  Metin icerisinde arama yapmamizi saglar.

  bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.

  Sonuc boolean dir.

  equals()
  2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.

  equalsIgnorecase()
  equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.

   startsWith()
    Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.

   endsWith()
   Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.

   Length()
   length() method'u girilen String'in uzunlugunu verir
   butun karakterlerin adedi (bosluklar da birer karakterdir)

   equals() methodu sadece String'lerin degerlerini karsilastirir

   str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
   str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir

   StringIsEmpty()
  String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false


 isBlank()


  Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
  Stringlerle matematiksel islemler yapabilmemizi sagla

  valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
  olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

  concat() method'u iki tane String'i birbirine yapistirmaya yarar.

  trim() methodu bir String'in baştaki ve sondaki space karakterlerini siler.

  replaceFirst("a","*") kod String deki ilk "a" yi "*" e cevirir.

 h.compareTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.

 a.repeat(); kodu a string'ini yan yana 5 kere yapistirir.


 */







}
