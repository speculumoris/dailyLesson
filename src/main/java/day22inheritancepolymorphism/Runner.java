package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {


        //Inheritance' da variable'lar secilirken Java object'in data type'ine bakar.
        //Oncelikli istediginiz variable'i Ogjectİn datatype'i olan Class'da arar.
        //O CLass'da bulamazsa Parent Class'lara bakar.
        //Hicbir Parent Class'da bulamazsa hata verir.

        Cat cat1= new Cat();
        System.out.println(cat1.a);
        System.out.println(cat1.b);

        Mammal cat2 = new Cat();
        System.out.println(cat2.a);
        System.out.println(cat2.b);
        System.out.println(cat2.c);

        Animal cat3= new Cat();
        System.out.println(cat3.a);
        System.out.println(cat3.c);

        Mammal cat4 =new Cat();
        cat4.eat();
        cat4.drink();

        Mammal cat5 =new Mammal();
        cat5.eat();

        Animal cat6 =new Animal();
        cat6.eat();
    }
}
