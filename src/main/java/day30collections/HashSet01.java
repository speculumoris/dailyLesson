package day30collections;

import java.util.HashSet;

public class HashSet01 {
    /*
    Hash bir tekniktir,birbirine benzemeyen code'lar üretir bu code'lar data'yı unique yapar.
    Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)


    Hash bir tekniktir,birbirine benzemeyen code'lar üretir bu code'lar data'yı unique yapar.
    Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)

    HashSet'ler eklenen elemanların sıralaması ile uğraşmaz. Sıralama ile alakalı zaman harcamaz bu yüzden çok hızlı çalışır.
    HashSetler:
    1)tekrarsiz elemanlarda
    2)sırlama onemli degilse
    3)hız cok önemliyse
    4)İndeks kullanmazlar

 */
    public static void main(String[] args) {
        HashSet<String> emails=new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        //var olan elemani eklerseniz hata vermezson ekleneni var olan datanin ustune yazar. (Overwrite)
        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);

    }
}
