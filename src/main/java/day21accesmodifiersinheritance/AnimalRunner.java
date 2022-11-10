package day21accesmodifiersinheritance;

public class AnimalRunner {

    /*
    1)"Inheritance" sayesinde
            i)Code tekrarlarindan kurtuluruz
            ii)Code tamiri(maintanence) kolay olur
            iii)Child Class'lari daha atomik yapmiş oluruz

    2)Bir Class'i baska bir Class'in Child Class'i yapmak icin
        "Extend" keyword kullanilir. Ilk yazilan Class Child, ikinci yazilan Class parent olur.

    3)Child Class object'leri Parent Class'tan Method ve variable'lari
      kullanabilirler.

    4)Parent Class Object'leri Child Class'dan Method ve variable'lari
      kullanamazlar.

    5)Object Class her Class'ın Parent'ıdır.
        Java'da Object Class hariç her class'ın parent'ı vardır
        Java'da parent'ı olmayan tek class Object Class'dır.

    6)"private" method ve variable'lar Child Class'lar tarafindan kullanilamaz.
      "protected" method ve variable'lar Child Class'lar tarafindan kullanilabilir.
      "default" method ve variable'lar Child Class'lar tarafindan kullanilabilir.
      "public" method ve variable'lar Child Class'lar tarafindan kullanilabilir.

      Note:"Child Class'lar tarafindan kullanilabilir" olarak "inherit edilebilir" demektir.

    7) 4 tip inheritance vardir
        i)Multilevel Inheritance: Java bunu kabul eder
        ii)Hierarchical Inheritance: Bir parent icin coklu Child,Java bunu kabul eder
        iii)Multiple Inheritance: Bir Child'a coklu Parent,Java bunu desteklemez.
        iv)Single Inheritance: Bir child Class icin bir parent Class demektir,Java bunu destekler.
     */
    public static void main(String[] args) {
        Cat c1= new Cat();

        c1.eat();
        c1.drink();
        c1.meow();


        Dog d1=new Dog();

        d1.bark();
        d1.drink();
        d1.eat();

        Animal a1= new Animal();


    }
}
