package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
    1)HashTable bir map'tir.
    2)HashTable entrySet'leri herhangi bir siralamaya tabii tutmaz.
    3)HashTable,HashMap'lerden daha yavastir. Cunku HashTable'lar thread safe ve synchronized'dir
    (aynı andan birden fazla iş yapabilme becerisi) ve synhronize'dir(çoklu işlerin zaman kazandıracak şekilde sıralanabilmesidir.)
    4)HashTable'larda key null olamaz.Key'i null yaparsaniz NullPointerException atar
    5)HashTable'larda value null olamaz.Value'i null yaparsaniz NullPointerException atar
    6)Javanin classlari gibi kendi klaslarinizi da kullanabilirsiniz.
      toString varsa objenin detaylarini istediginiz gibi konsolda gorursunuz.
      toString olmazsa objenin adresini gorursunuz.
     */

    public static void main(String[] args) {
        Hashtable<String,Integer> countryPopulations=new Hashtable<>();
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany",83000000);
        countryPopulations.put("Turkey",90000000);

        System.out.println(countryPopulations);
        //countryPopulations.put(null,90000000);//HashTable'larda key null olamaz.NullPointerException atar
        //countryPopulations.put("TFrance",null);//HashTable'larda value null olamaz.NullPointerException atar

        Hashtable<String,Students> myStudents=new Hashtable<>();
        myStudents.put("Math",new Students("Tom hanks","th@gmail.com",21,true));
        System.out.println(myStudents);

        String name=myStudents.get("Math").name;
        System.out.println(name);

        int age = myStudents.get("Math").age;
        System.out.println(age);

    }
}

























