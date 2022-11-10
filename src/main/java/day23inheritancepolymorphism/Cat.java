package day23inheritancepolymorphism;

public class Cat extends Mammal{
    public void meow(){
        System.out.println("Cats meow");
    }

    @Override// @Override annotation'ını kullanarak, Java'nın yaptığımız Override işlemini kontrol etmesini sağlarız.
    //@ varsa annatation denir

    public void eat() {
        System.out.println("Cat eat");
    }
    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }
    //Asagidaki method "Overriding Method"
    @Override
    public Animal create() {
        return new Mammal();
    }

    /*
    1)Override yaparken method'un body'si degistirilir.
    2)Override yaparken ASLA method signature (isim ve parametre) degistirilmez
    3)Override yaparken "Inheritance" olmak zorundadir.
    4)Override yaparken "acces modifier" lar belli kurallara gore farklilastirabilirler
        i)"Private" methodlar override edilemezler
        ii)Child Class'daki "override edilen" method'un access modifier'i Parent Class'daki
        method'un acces modifier'i ile ayni veya genis olmalidir
          Note:Child Class'daki methodun acces modifier'i daha dar olamaz.
        iii)Default method'lar ayni package icindeyse override edilebilirler.
    5)Parent Class'daki methodun "return type'i" "void" ise "return type" degistirilmez
    6)Parent Class'daki methodun "return type'i" "primitive" ise  ise "return type" degistirilmez
    7)Parent Class'daki methodun "return type'i" "Wrapper Class" ise  ise "return type" degistirilmez
    8)Parent Class'daki methodun "return type'i" "Child Class" ise  ise "return type" child'lardan biri olabili
        Note:Child Class'daki return type Parent Class'dakinden genis olamaz
        Note:Aralarinda "Parent Child" iliskisi olmayan Class'lar Overriding'de Return type degisiminde
            kullanilamazlar.Mesela "Short","Integer"dan kucuktur, fakat aralarinda ",Parent Child iliskisi
            olmadigindan "Integer" yerine "Short" kullanamazsiniz.
        Note:Child daki method'un Return Type'indan Parent'daki method'un REturn Type'ina gidiste
            "IS-A" RElationship olmali.
        Note:Aralarinda "IS-A" Relationship olan DAta Type'lara "Covariant" denir.
    9) Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
     HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.

   10)"final" method'lar Override edilemezler, cunku "Overriding" de method body degistirilir fakat
    "final" method body degistirilmesine musaade etmez.
    11) Polymorphism = Overloading + Overriding11. ===> Polymorphism(Çoklu yapı) = Overloading(add methodu gibi çoklu forma sahip) +
                                                        Overriding(aynı method faklı şekillerde kullanılabiliyor.)

     */


}
