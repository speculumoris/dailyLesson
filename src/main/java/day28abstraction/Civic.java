package day28abstraction;

public class Civic implements Engine,Ac,Hood {//Bir cClass'i nbir interface'in child'i yapmak icin "implement" kullaniriz.
    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi technology");
    }


    @Override
    public void digital() {
        System.out.println("Uses digital ac");
    }

    @Override
    public void climate() {
        System.out.println("Uses climate technology");
    }

    @Override
    public void steel() {
        System.out.println("Uses steel hood");
    }
}