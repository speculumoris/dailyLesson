package day02methodcreation;

public class MethodCreation {
    public static void main(String[] args) {
       /*
     void: Bu method yeni bir data uretmiyor demektir.
     Ornegin; ekrana bir sey yazdirma methodu, bit tusa tiklama methodu gibi…
        */
        //main method icinde kullanacaginiz her sey static olmalidir.


        System.out.println(toplamaYap(1.2, 5));

        System.out.println(ucSayiyiCarp(2, 1.5, 6));
        System.out.println(ilkIkıtoplaUcuncuIleCarp(1, 2.8, 4));

        //sout yazip "Enter" a basiniz System.out.println() otomatik olarak yazilir.
         //Ekrana bir sey yazdirmak icin iki tane kod var i)System.out.println() ==> Satirbasi yapar      ii)System.out.print() ==> Satirbasi yapmaz


    }

    //example 1:toplama islemi yapan bir method olusturunuz.
    public static double toplamaYap(double a, double b) {
        return a + b;

    }

    //example 2:uc sayiyi birbiri ile carpan  bir method olusturunuz.
    public static double ucSayiyiCarp(double a, double b, double c) {

        return a * b * c;
    }

    //Example 3: Us sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup, sonucu ekrana yazdirirniz
    public static double ilkIkıtoplaUcuncuIleCarp(double d, double e, double f) {
        return (d+e)*f;
    }
}
