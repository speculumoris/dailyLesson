package day24statickeywordencapsulation;

public class CarRunner {
    public static void main(String[] args) {
        Car car1= new Car();
        Car car2= new Car();
        Car car3= new Car();
        Car car4= new Car();

        /*
         Static keyword classa baglanmıs class elemanlaridir
         Static class elemanlari butun objelerin ortak elemanidir(Gokteki ay gibi)
         Staticler uzerinde yapilan her degisiklik butun obeleri etkiler, butun objeler tarafindan gorulur.
         Static class elemanlarina class uzerinden ulasilir. Objeler staticlere ulasmak icin kullanilmaz.
        */

        //static variable'lara objeleri kullanarak mumkun ama tavsiye edilmez.
        System.out.println(car1.counter);
        //static variable'lara Class'i kullanarak ulaşmak daha iyidir.
        System.out.println(Car.counter);
        System.out.println(car1.price);

        System.out.println(car2.counter);
        System.out.println(car2.price);

        System.out.println(car3.counter);//3
        System.out.println(car3.price);//1

        System.out.println(car4.counter);//4
        System.out.println(car4.price);//1


    }
}
