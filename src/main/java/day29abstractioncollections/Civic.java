package day29abstractioncollections;

/*
    "abstract method"lar sadece NE yapılacağını(WHAT TO DO) söyler
    "concrete method"lar ne yapılacağı ile birlikte NASIL yapılacağını(HOW TO DO) da söyler

    "interface"ler bir yapılacak işler listesidir.(TO DO LIST)

    "multiple parent interface" kullandığınızda aynı method ismi ile birden fazla method oluşturursanız bu method'ların
    return type'ları aynı olmalıdır. Aksi takdirde hata verir.

    "interface" lerde constructor olmadığı için interface'lerden object oluşturulamaz.
    "abstract class" lar class oldukları için constructor vardır. Ama constructor'lar abstract class'larda object oluşturamazlar.

    *Interview Question* "Abstract Class" ile "Interface" in farkları nelerdir?**
      1)Method
            "Abstract Class" hem abstract hem de concrete method'lar içerebillir.
            "Interface" ler ise sadece abstract method'lar içerir.
            Ama istersek interface'ler içinde de "default" ver "static" keyword'ler kullanarak concrete method'lar oluşturabiliriz.

      2)Variable
            "Abstract Class" larda normal Class'lardaki gibi her türlü variable oluşturulabilir.
            "Interface" ler de ise variable'lar public static ve final olmak zorundadır.

      3)Inheritance
            "Abstract Class" lar class oldukları için "multiple inheritance" a müsaade etmezler.
            "Interface" ler ise "multiple inheritance" ı desteklerler.

      4)Object Creation
             "Abstract Class" larda constructor vardır ama object oluşturmada kullanılmazlar.
             "Interface" ler de ise constructor olmadığından object oluşturulamaz.

       Soru: Object Oriented Programming Language prensipleri(principles) nelerdir?
       i)Inheritance   ii)Polymorphism   iii)Encapsulation   iv)Abstraction
 */

public class Civic implements Engine,Ac{
    @Override
    public void run() {
        System.out.println("Civic runs well");
    }


}
