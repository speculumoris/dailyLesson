package day02methodcreation;

public class Car {
    public String marka = "Honda";
    public int fiyat = 20000;
    /*
    note:Class ==> Variable ==>Object ==> Kullanacagız
                   Method
     */

    public static void main(String[] args) {
        //Object nasıl olusuturulur?
        //1)Class ismini yaziniz   2)Objeye bir isim veriniz     3)=   4)new keyword'unu kullan   5)Class ismi parantezle beraber(Constructor)
        Car myHonda = new Car();
        System.out.println(myHonda.fiyat);//20000
        System.out.println(myHonda.marka);//Honda

        myHonda.hareketEt();//tekara yazılmaz cunku zaten method ekrana yazi yazdiriyor
        myHonda.dur();

        //20.satirdaki kod yazilinca bu classin objecti oluşturur
        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3, 5));

    }


    public void hareketEt() {
        System.out.println("Honda guzel hareket eder...");
        System.out.println("kubra bayindir");
    }



    public void dur(){
        System.out.println("Honda guvenli durur...");
    }

}
