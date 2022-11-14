package day31maps;

import java.util.*;

public class HashMap01 {
    /*
    1)Map'ler key-value structure kullanır.
    2)Key'ler unique'dir.
    3)Value'ler tekrarlı data içerebilir.
    4)Map'lerde eleman değil EntrySet kullanırız.
    5)Key'lerde null tekrarsız olarak kullanılır.
    6)Value'lar null kabul eder.
    7)HashMap'ler EntrySet'leri herhangi bir sıralamaya tabi tutmaz, rastgele sıralar.
    8)Sıralama ile vakit kaybetmediği için HashMap'ler çok hızlı(Super Fast) çalışırlar.
*/
    public static void main(String[] args) {
        HashMap<String,Integer> studentAges=new HashMap<>();
        studentAges.put("Ali",13);
        studentAges.put("Tom",21);
        studentAges.put("Brad",12);
        studentAges.put("Ajda",76);
        studentAges.put("Cuneyt",75);
        studentAges.put("Ali",88);//Ayni key degerini tekrar kullanirsaniz hata vermez "Override" yapar
        studentAges.put(null,55);
        studentAges.put(null,66);
        studentAges.put("Ayhan Isik",null);
        studentAges.put("Sadri Alisik",null);

        System.out.println(studentAges);


        //Map'ten key'ler nasil ögrenilir ?
        Set<String>keys= studentAges.keySet();
        System.out.println(keys);

        //Map'den sadece value'lar nasil alinir
        Collection<Integer> values=studentAges.values();
        System.out.println(values);

        //Belli bir key'e ait value nasil alinir
        Integer cuneytAge= studentAges.get("Cuneyt");
        System.out.println(cuneytAge);

        //Example 1: Tum Integer yaslarin ortalamasini hesaplayan kodu yaziniz.
        int sum=0;
        int count=0;
        for (Integer w:studentAges.values()) {

            if (w!=null){
                sum+=w;
                count++;
            }
        }
        Integer avarage=sum/count;
        System.out.println(avarage);

        //Eaxmple 2:
        Set<String> names=studentAges.keySet();
        int sum1=0;
        for (String w:names) {

            if (w!=null &&!w.startsWith("A")){

                sum1+=w.length();
            }

        }
        System.out.println(sum1);
        boolean result =studentAges.remove("Ajda",76);
        System.out.println(result);

        Integer result1=  studentAges.remove(null);
        System.out.println(result1);//null

        //Key varsa value'u ver,key yoska bir mesaj ver
        Integer result2=studentAges.getOrDefault("Sadriye",0);
        System.out.println(result2);

        //Value null ise ekleme yapar,Value null degilse  ekleme yapmaz
        Integer result3=studentAges.putIfAbsent("Brad",100);
        System.out.println(studentAges);
        System.out.println(result3);

        Integer result4=studentAges.putIfAbsent("Ayhan Isik",100);
        System.out.println(studentAges);
        System.out.println(result4);

        //Key yoksa ekleme yapar
        Integer result5=studentAges.putIfAbsent("Acun Ilicali",200);
        System.out.println(studentAges);
        System.out.println(result5);

        //replace() method'u calue'lari degistirmek icin kullanilir
        studentAges.replace("Acun Ilicali",49);
        System.out.println("studentAges = " + studentAges);

        studentAges.replace("Acun Ilicali",47,53);
        System.out.println(studentAges);

        //Example 3:Map deki her bir entry'i ekrana farkli bir satirda olacak sekilde yazdiriniz.
        //          {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=88}

        //EntrySet() method'u Map'deki elemanlari bir set'in icine koyarak size verir.
        Set<Map.Entry<String,Integer>> entries=studentAges.entrySet();
        for (Map.Entry<String,Integer> w:entries) {
            System.out.println(w);
        }
    }
}
